import java.io.*;

public class ArrayOddEvenEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Number : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int [n];
		int i;
		
		System.out.println("Enter Element : ");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Enter element " + a[i] + " is even");
			}
			else
			{
				System.out.println("Enter element " + a[i] + " is odd");
			}
		}
	}

}
