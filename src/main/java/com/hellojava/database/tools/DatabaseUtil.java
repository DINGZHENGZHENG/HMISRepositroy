package com.hellojava.database.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseUtil {
	private static Properties p=null;
	
	static {
		InputStream inStream=DatabaseUtil.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			p=new Properties();
			p.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getValue(String key) {
		return p.getProperty(key);
	}
}
