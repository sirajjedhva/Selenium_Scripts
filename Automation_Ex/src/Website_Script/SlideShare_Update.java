package Website_Script;

public class SlideShare_Update extends SlideShare_Login{

	@SuppressWarnings("static-access")
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	
		SlideShare_Login sl=new SlideShare_Login();
		sl.main(args);
		
		try{
			Thread.sleep(6000);
			driver.findElementByPartialLinkText("Upload").click();
		    System.out.println("upload");
			}catch(Exception e){
			System.out.println(e);
			}
	}

}
