import java.io.*;
public class FindOddEvenNumberinGivenNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int a = Integer.parseInt(br.readLine());
		int i,odd=0,even=0;
		while(a>0)
		{
			i=a%10;
			if(i%2==0)
			{
				even=even+i;
				System.out.println(i + " is Even Number.");
			}
			else
			{
				odd=odd+i;
				System.out.println(i + " is Odd number");
			}
			a=a/10;
		}
		System.out.println("Summation of Even Number is : " + even);
		System.out.println("Summatino of Odd Number is : " + odd);
	}

}
