package com.hello.test;

import net.sf.json.JSONObject;

public class JsonUtils {
	TestDemo td= new TestDemo();
	public void test() {
		
		td.setId(1);
		td.setName("����");
		td.setPwd("123456");
	    JSONObject jso=   JSONObject.fromObject(td);
	    String    json=    jso.toString();
	
	  System.out.println(json);
		
	}

}
