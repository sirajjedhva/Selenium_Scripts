import java.io.*;


public class SumofDigit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int i = Integer.parseInt(br.readLine());
		//int i = 145;
		int sum=0,temp;
		while(i>0)
		{
			temp=i%10;
			sum=sum+temp;
			i=i/10;
		}
		System.out.println("Summation of entered number is : " + sum + "\n");
		for(int j=1;j<=10;j++)
		{
			int e=sum*j;
			System.out.println(sum + " * " + j + " = " + e);    
		}
	}

}
