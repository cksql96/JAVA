package com.zerock.collection_framework.map;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

import lombok.extern.log4j.Log4j;

@Log4j
public class PropertiesExample {
	
	
	public static void main(String[] args) throws Exception {
		
		//1. Map 컬렉션중 하나인  Properties객체 생성
		Properties properties = new Properties();
		
		//2. 읽은 .properties파일의 경로를 획득
		String path = 									//변수 path에 들어갈것 = 
				PropertiesExample.class.				//properties가 있는 폴더안에 있는 클래스이름.
				getResource("database.properties").		//그 위치에 있는것중, 얻을 리소스의 위치는?(파일이름).
				getPath();								//그것의 절대 경로 획득;
		
		//get Resource만 하면
		//file:/C:/app/eclipse/workspace/JSE/ex01/target/classes/com/zerock/
		//collection_framework/map/database.properties
		
		//getPath까지 넣으면
		///C:/app/eclipse/workspace/JSE/ex01/target/classes/com/zerock/
		//collection_framework/map/database.properties		
		
		log.info(path + "\n");
		
		//3. 파일의 경로명을 utf8로 인코딩(혹시나 다국어 문자같이 다른 character set이 들어가는것을 생각하여,
		//utf8로 바꾸어준다.)
		path = URLDecoder.decode(path, "utf-8");
		
		//4. 3에서 생성한 경로명대로 파일을 읽음
		properties.load(new FileReader(path));
		
		//5. 4가 제대로 수행되었다면, Properties 객체안에는 Map 성질대로, Key=value 형태로 저장.
		// 따라서 key 만 알면 Value를 획득할 수 있음. 즉 value = properties.getProperty(key)
		String driverValue 		= properties.getProperty("driver");
		String urlValue 		= properties.getProperty("url");
		String usernameValue 	= properties.getProperty("username");
		String passwordValue 	= properties.getProperty("password");
		
		log.info("driver 	: " + driverValue);
		log.info("url 	: " + urlValue);
		log.info("username 	: " + usernameValue);
		log.info("password 	: " + passwordValue);
		
	}	//end main

}	//end class
