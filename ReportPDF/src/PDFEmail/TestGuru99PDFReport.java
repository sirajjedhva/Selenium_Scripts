package PDFEmail;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import reporter.JyperionListener;


@Listeners(JyperionListener.class)
public class TestGuru99PDFReport {
	
	WebDriver driver;
	
	@Test
	public void testReportOne(){
		driver=BaseClass.getDriver();
		driver.get("http://google.com");
		Assert.assertTrue(false);
	}
    @Test
	public void testReportTwo(){
		driver=BaseClass.getDriver();
		driver.get("http://guru99.com");
		Assert.assertTrue(false);
	}
	  @Test
	  
	    public void testPDFReportThree(){
	 
	        driver = BaseClass.getDriver();
	 
	        driver.get("http://demo.guru99.com");
	 
	        Assert.assertTrue(true);
	 
	    }
	  
	  //After complete execution send pdf report by email
	  
	  public void tearDown(){
		  sendPDFReportByGMail("FROM@gmail.com","password","TO@gmail.com","PDF Reporter","");
	  }
	  
	  /**
	  
	     * Send email using java
	 
	     * @param from
	 
	     * @param pass
	 
	     * @param to
	 
	     * @param subject
	 
	     * @param body
	 
	     */
	private void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {
		
		Properties props=System.getProperties();
		String host="smtp.gmail.com";
		props.put("mail.smtp.starttls.enable", "true");
		 
		props.put("mail.smtp.host", host);
		 
		props.put("mail.smtp.user", from);
		 
		props.put("mail.smtp.password", pass);
		 
		props.put("mail.smtp.port", "587");
		 
		props.put("mail.smtp.auth", "true");
		
		//Session session = Session.getDefaultInstance(props);
		Session session=Session.getDefaultInstance(props);
		
		MimeMessage msg=new MimeMessage(session);
		
		try{
			 //Set from address
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//Set subject
			msg.setSubject(subject);
			msg.setText(body);
			
			BodyPart obj=new MimeBodyPart();
			obj.setText("Please Find The Attached Report File!");
			Multipart multi=new MimeMultipart();
			multi.addBodyPart(obj);
			obj=new MimeBodyPart();
			
			//Set path to the pdf report file
			
			String fileName=System.getProperty("user.dir")+"\\Default test.pdf";
			
			//Create data source to attach the file in mail
			DataSource source=new FileDataSource(fileName);
			
			
			obj.setDataHandler(new DataHandler(source));
			obj.setFileName(fileName);
			multi.addBodyPart(obj);
			msg.setContent(multi);
			Transport transport=session.getTransport("smtp");
			transport.connect(host,from,pass);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
		}catch(AddressException ae){
			ae.printStackTrace();
		}catch(MessagingException me){
			me.printStackTrace();
		}
	}

}
