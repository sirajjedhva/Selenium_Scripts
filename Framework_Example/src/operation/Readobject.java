package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class Readobject {
	
	Properties p=new Properties();
	public Properties getObjectRepository() throws IOException{
		
		String path=System.getProperty("user.dir");
		//System.setProperties(path+"/excelfile/TestCase.xls");
		System.out.println(path);
	//	File file=new File(System.getProperty(path+"/src/objects/object.properties"));
		
		InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"/src/objects/object.properties"));
		//InputStream stream=new FileInputStream(file);
		p.load(stream);
		return p;
	}
}
