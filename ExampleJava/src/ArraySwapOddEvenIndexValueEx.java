import java.io.*;

public class ArraySwapOddEvenIndexValueEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i,temp=0,a[] =new int [n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		for(i=0;i<n;i=i+2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;

		}
		
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
