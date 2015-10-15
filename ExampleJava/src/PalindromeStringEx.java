
public class PalindromeStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "SMS",reverse = "",c="";
		c=s;
		int i,len;
		len= s.length();
		for(i= len - 1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
			System.out.println(reverse);
		}
		if(c.contains(reverse))
		//if(reverse == "SMS")
		{
			
			System.out.println("Given string is palindrome : " + c);
		}
		else
		{
			System.out.println("Given string is not palindrome : " + c);
		}
	}

}
