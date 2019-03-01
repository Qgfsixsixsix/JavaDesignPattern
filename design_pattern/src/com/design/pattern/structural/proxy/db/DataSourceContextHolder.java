package com.design.pattern.structural.proxy.db;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-7
 * @version 1.0.0
 * The package is com.design.pattern.structural.proxy.db
 */
public class DataSourceContextHolder {
	
	private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>(); 
	
	public static void setDBType(String dbType){
		CONTEXT_HOLDER.set(dbType);
	}
	
	public static String getDBType(){
		return (String)CONTEXT_HOLDER.get();
	}
	
	public static void clearDBType(){
		CONTEXT_HOLDER.remove();
	}
}
