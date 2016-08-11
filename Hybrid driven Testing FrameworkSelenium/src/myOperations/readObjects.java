package myOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class readObjects {

	 Properties p= new Properties();
	 
	 public Properties getObjectRepository() throws IOException 
	 {
		 
		InputStream stream = new FileInputStream(new File("/home/aarti/workspace/keyword Driven Testing Framework Selenium/src/objects/objects.properties"));
		
		p.load(stream); //load all objects in properties file 
		
		return p;
		 
	 }
	
		

	}


