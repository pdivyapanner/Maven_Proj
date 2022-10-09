package com.helpers.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data_Reader {
	
	public static Properties p;
	
	public Test_Data_Reader() throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\test\\java\\com\\helpers\\file\\Test_Data.properties");
		FileInputStream fis = new FileInputStream(f);
	 p = new Properties();
	 p.load(fis);
	}
	public String get_Url() throws IOException
	{		
		String url = p.getProperty("url");
		return url;
	}
	
	

}
