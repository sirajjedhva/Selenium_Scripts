import java.io.*;

public class SumofQubeforgivenNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int i,sum=0;
		for(i=1;i<=a;i++)
		{
			sum=sum+(i*i*i);
		}
		System.out.println("Summation of Qube for entered given number : " + sum);
	}

}
