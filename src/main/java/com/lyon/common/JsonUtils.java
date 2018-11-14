package com.lyon.common;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

public class JsonUtils {

	/***
	 * 将List对象序列化为JSON文本
	 */
	public static String toJSONString(Object obj) {
		return JSON.toJSONString(obj);
	}
	
	/***
	 * 将字符串转换为传入类型的List
     */
    public static <T> List<T> toList(String text, Class<T> clazz){
    	return JSONArray.parseArray(text, clazz);
    }
	
	/***
	 * 将字符串转换为传入类型的List
     */
    public static <T> Object toObj(String text, Class<T> clazz){
    	return JSON.parseObject(text, clazz);
    }
}
