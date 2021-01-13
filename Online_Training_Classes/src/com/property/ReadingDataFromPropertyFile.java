package com.property;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadingDataFromPropertyFile {
	
	
	public static String readingdata(String keyname) throws IOException{
		
		File f=new File("C:\\Users\\Lenovo\\Documents\\Online_Training_Classes\\configuration.properties");		
		FileInputStream fi=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fi);		
		return prop.getProperty(keyname);
				
		
	}

	
}
