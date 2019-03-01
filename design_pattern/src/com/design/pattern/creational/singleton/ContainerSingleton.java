package com.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;




/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-6
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */
public class ContainerSingleton {
	
	private ContainerSingleton(){
		
	}
	//HashMap式线程不安全的 ，HashTable是线程安全的,但是HashTable大大影响性能
	private static Map<String, Object> singletonMap = new HashMap<String, Object>();
	
	public static void putInstance(String key, Object instance){
		if(StringUtils.isNotBlank(key) && instance != null){
			if(!singletonMap.containsKey(key)){
				singletonMap.put(key, instance);		
			}
		}
	}
	
	public static Object getInstance(String key){
		return singletonMap.get(key);
	}
}
