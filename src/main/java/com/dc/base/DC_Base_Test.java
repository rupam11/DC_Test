package com.dc.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DC_Base_Test {
	public Properties prop;
	public String baseServer;
	public int RESPONSE_SATTUS_CODE_200=200;
	public int RESPONSE_SATTUS_CODE_201=201;
	public int RESPONSE_SATTUS_CODE_300=300;
	public int RESPONSE_SATTUS_CODE_400=400;
	public int RESPONSE_SATTUS_CODE_404=404;
	public int RESPONSE_SATTUS_CODE_500=500;
	
	public DC_Base_Test(){
		
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\dc\\config\\config.properties");
			//FileInputStream ip=new FileInputStream("C:\\Users\\KumariRupam\\eclipse-workspace\\RestAPI_DC\\src\\main\\java\\com\\workbook\\config\\config.properties");
			prop.load(ip);
			baseServer=prop.getProperty("serverAddress");
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
