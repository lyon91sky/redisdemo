package com.lyon.service;

import com.lyon.common.IDUtils;
import com.lyon.common.PageQuery;
import com.lyon.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * 区域分组 - 业务服务对象
 * 开发人员: lyon
 * 修订日期: 2018-11-07 17:46:13
 */
@Service
public class UserService {

//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private RedisService redisService;

    /**
     * 创建新的区域分组。
     *
     */
    public void create(User user) {
//        user.setId(IDUtils.getId());
//        userRepository.save(user);
    }

    /**
     * 修改已有区域分组。
     *
     */
    public User modify(User user) {
        return null;
//        return userRepository.save(user);
    }

    /**
     * 根据主键删除区域分组。
     *
     * @param id 主键 - 唯一标识
     */
    public void delete(String id) {
    }

    /**
     * 根据主键查找区域分组。
     *
     * @param id 主键 - 唯一标识
     * @return 返回所匹配的区域分组对象实例
     */
    public User findItem(String id) {
        return null;
//        String userString = redisService.get(RedisContants.ENTITY_REDIS_KEY + id);
//        User user = (User) JsonUtils.toObj(userString, User.class);
//        if(user != null){
//            return user;
//        }else{
//            User dbUser = userRepository.findById(id).get();
//            redisService.set(RedisContants.ENTITY_REDIS_KEY + id,JsonUtils.toJSONString(dbUser));
//            return dbUser;
//        }
    }

    /**
     * 根据查询条件，分页查询匹配的记录。
     *
     * @param queryInfo 查询条件
     * @return 返回数据分页信息
     */
    public Page<User> findPage(PageQuery queryInfo) {
        return null;
        //return userRepository.findPage(queryInfo);
    }

}

