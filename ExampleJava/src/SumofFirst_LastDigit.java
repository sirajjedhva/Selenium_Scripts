import java.io.*;

public class SumofFirst_LastDigit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int i= Integer.parseInt(br.readLine());*/
		int i=1230;
		int sum=0;
		sum+=i%10;
		while(i>9)
		{
			i/=10;
		}
		sum+=i;
		System.out.println(sum);
	}

}
