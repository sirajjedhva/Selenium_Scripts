import java.io.*;

public class SumofN_NumberFactorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Value of A : ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		//System.out.println("Enter Value of B : ");
		//int b = Integer.parseInt(br.readLine());
		
		int i,fact=1,sum=0;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println("Summation of entered value is : " + sum);
	}

}
