import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Log4j_Example {
    
	static Logger logger=Logger.getLogger(Log4j_Example.class);
	 	public void testMethod(){
	 		logger.debug("Hello... In test method!");
	 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		logger.info("Logging started application.");
		Log4j_Example log=new Log4j_Example();
		log.testMethod();
		logger.info("Application closed");
	}

}
