import java.io.*;

public class ArrayPNZEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i,a[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		for(i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				System.out.println(a[i] + " is positive");
			}
			else if(a[i]<0)
			{
				System.out.println(a[i] + " is negetive");
			}
			else
			{
				System.out.println(a[i] + " is zero");
			}
				
		}
	}

}
