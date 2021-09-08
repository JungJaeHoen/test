package com.jsp.context;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
	
	private static Map<String,Object> applicationContext = new HashMap<String,Object>();
	
	private ApplicationContext() {}//생성자를 잠가버린다
	
	public static Map<String,Object> getApplicationContext(){
		return applicationContext;
	}
	
}