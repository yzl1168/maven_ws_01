package com.atguigu.ws.util;
//使用本地线程保证key不被其他程序影响
public class MyDataSourceKey {
	private static ThreadLocal<String> key = new ThreadLocal<String>();

	public static String getKey() {
		return key.get();
	}

	public static void setKey(String key_in) {
		key.set(key_in);;
	}
	
	
}
