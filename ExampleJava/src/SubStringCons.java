
public class SubStringCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* byte ascii[]={65,66,67,68,69,70,71,72};
    
    String si=new String(ascii);
    System.out.println(si);
    
    String s2=new String(ascii,2,5);
    System.out.println(s2);
    System.out.println(si.length());*/
		/*char ch;
		ch="abcd".charAt(3);
		System.out.println(ch);*/
		String s="abcdefghijkl";
		int start=5;
		int end=9;
		char dst[]=new char[end - start];
		s.getChars(start, end, dst, 0);
		System.out.println(dst);
	}

}
