package com.cdn.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Properties config= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		System.out.println(config.getProperty("browser"));
		
		Properties OR= new Properties();
		 fis= new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		System.out.println(OR.getProperty("bmlBtn_CSS"));
	}
}
