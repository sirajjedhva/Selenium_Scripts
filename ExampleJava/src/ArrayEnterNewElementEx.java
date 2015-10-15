import java.io.*;

public class ArrayEnterNewElementEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i,a[] = new int[n+1];
		
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Enter Array Index : ");
		int pos=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Array Element : ");
		int value=Integer.parseInt(br.readLine());
		
		for (i = n; i >pos; i--)
		{
			a[i] = a[i-1];
		}	a[pos] = value;
		//n++;
		
		System.out.println("New Array List");
		
		for(i=0;i<=n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
