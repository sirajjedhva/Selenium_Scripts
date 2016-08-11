package myOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class readFacebookObjects {

	 Properties p= new Properties();
	 
	 public Properties getObjectRepository() throws IOException 
	 {
		 
		InputStream stream = new FileInputStream(new File("/home/inheritx_sales/workspace/keyword Driven Testing Framework Selenium/src/objects/facebookObjects.properties"));
		
		p.load(stream); //load all objects in properties file 
		
		return p;
		 
	 }
	
		

	}



