import org.apache.log4j.Logger;


public class LoggerExample {
	
	static Logger logger=Logger.getLogger(LoggerExample.class);
	
	    public void testLoggerDebug() {
	    	logger.debug("Hi...I am in testMethod");
	    }
	    
	    public void testLoggerFatal(){
	    	logger.fatal("Hi...I am in createmethod");
	    }
	    
	    public void testLoggerError(){
	    	logger.error("Hi...I am in infoTest");
	    }
	    
	    public void testLoggerWarn(){
	    	logger.warn("Hi...I am in deletMethod");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LoggerExample example=new LoggerExample();
       
          example.testLoggerDebug();
          example.testLoggerError();
          example.testLoggerFatal();
          example.testLoggerWarn();
	}

}
