import java.io.*;

public class ArrayLeadpYearEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i,a[]=new int[n];
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Year : ");
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			if(a[i]%4==0 && (a[i]%100!=0 || a[i]%400==0))
			{
				System.out.println(a[i] + " is Leap Year");
			}
			else
			{
				System.out.println(a[i] + " is not Leap Year");
			}
		}
	}

}
