package com.demoSite.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	public static Properties prop;

	/**
	 * This method will read properties file
	 * @param filePath
	 */
	static {
		try {
			// what file to read
			// read the file into java, finds the file using th
			String filePath = Constants.CONFIGURATION_FILEPATH;
			FileInputStream fis=new FileInputStream(filePath);
			// properties --> class that store properties in key / value format
			prop=new Properties();
			// the values from the file input is loaded / fed in to the properties object

			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method will return value of specified key
	 * @param String key
	 * @return String value
	 */
	public static String getProperty(String key) {
		
		return prop.getProperty(key);
	}
}