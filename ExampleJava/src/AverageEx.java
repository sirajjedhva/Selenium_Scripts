import java.io.*;
public class AverageEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int i,sum=0,avg=0,a = Integer.parseInt(br.readLine());
		for(i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println("Summation of given number is : " + sum);
		avg=(sum/a);
		System.out.println("Average of given number is : " + avg);
		
	}

}
