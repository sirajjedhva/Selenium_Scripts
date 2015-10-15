import java.io.*;

public class Sumof_1_2_4_8_n___Ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int i,sum=0,temp=1;
		for(i=1;i<=a;i++)
		{
			sum=sum+temp;
			temp*=2;
		}
		System.out.println("Summation of entered number is : " + sum);
	}

}
