
public class PalindromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1324231,sum=0,temp,b;
		b=a;
		while(a>0)
		{
			temp=a%10;
			sum=sum*10+temp;
			a=a/10;
		}
		if(sum==b)
		{
			System.out.println(b + " is palindrome number.");
		}
		else
		{
			System.out.println(b + " is not palindrome number.");
		}
	}

}
