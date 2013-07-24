package com.resultech.support;

import java.io.InputStream;
import java.util.Properties;

import java.util.logging.Logger;

public class Paths_Properties {
	static Logger log4j = Logger.getLogger("Paths_Properties");
	
	public Properties ReadAutoit_FilePath() throws Exception {
			Properties autoitProps = new Properties();
			InputStream is = this.getClass().getResourceAsStream(System.getProperty("autoit.file", "/AutoitPath.properties"));
			autoitProps.load(is);
			return autoitProps;
	}
	
	public Properties Read_FilePath() throws Exception {
		Properties autoitProps = new Properties();
		InputStream is = this.getClass().getResourceAsStream(System.getProperty("path.file", "/path.properties"));
		autoitProps.load(is);
		return autoitProps;
}

}
