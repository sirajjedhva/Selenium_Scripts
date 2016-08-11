package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class objectload {

  Properties p=new Properties();
  public Properties getObjectRepository() throws IOException{
	String path=System.getProperty("user.dir");
	System.out.println(path);  
	 
	  InputStream stream=new FileInputStream(new File(System.getProperty("user.dir")+"/src/object/object.properties"));
	  p.load(stream);
	  return p;
	  
  }
}
