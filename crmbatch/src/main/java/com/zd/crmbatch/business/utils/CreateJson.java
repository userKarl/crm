package com.zd.crmbatch.business.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 将普通的文本数据返回为json
 * 
 * @author Administrator
 *
 */
public class CreateJson {

	public static String createTextJson(String data, boolean result) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		map.put("data", data);
		return JacksonUtil.objToJson(map);
	}

	public static String createObjJsonWithToken(String token, Object obj) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", true);
		map.put("token", token);
		map.put("data", obj);
		return JacksonUtil.objToJson(map);
	}
	
	public static String createObjJson(Object obj,boolean result) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		map.put("data", obj);
		return JacksonUtil.objToJson(map);
	}
}
