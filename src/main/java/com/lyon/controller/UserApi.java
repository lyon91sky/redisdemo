package com.lyon.controller;

import com.lyon.common.LYResultVO;
import com.lyon.common.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lyon.entity.User;
import com.lyon.service.UserService;
import org.springframework.data.domain.Page;

/**
 * 区域分组接口
 * 开发人员: lyon
 * 修订日期: 2018-11-07 17:46:13
 */
@RestController
@RequestMapping("/redis")
public class UserApi {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/set/{id}")
    public LYResultVO redis(@PathVariable String id) {
        redisTemplate.opsForValue().set("key"+id,id);
        return LYResultVO.success("ok","设置成功");
    }

    @GetMapping("/get/{id}")
    public LYResultVO get(@PathVariable String id) {
        Object obj = redisTemplate.opsForValue().get("key"+id);
        return LYResultVO.success(obj,"查询成功");
    }

    @PostMapping
    public LYResultVO create(@RequestBody User user) {
        userService.create(user);
        return LYResultVO.success("新增成功");
    }

    @PutMapping
    public LYResultVO modify(@RequestBody User user) {
        userService.modify(user);
        return LYResultVO.success("修改成功");
    }

    @DeleteMapping("/{id}")
    public LYResultVO delete(@PathVariable String id) {
        userService.delete(id);
        return LYResultVO.success("删除成功");
    }

    @GetMapping("/{id}")
    public LYResultVO findItem(@PathVariable String id) {
        User result = userService.findItem(id);
        return LYResultVO.success(result,"查询成功");
    }

    @GetMapping
    public Page<User> findPage(PageQuery pageQuery) {
        return userService.findPage(pageQuery);
    }


}

