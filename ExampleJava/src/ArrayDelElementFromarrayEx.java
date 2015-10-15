import java.io.*;



public class ArrayDelElementFromarrayEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i,j,a[] = new int [n];
		
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.print("Enter element that you have to delete : ");
		int m=Integer.parseInt(br.readLine());
		
		for(i=0;i<n;i++)
		{
			if(a[i]==m)
			{
				break;
			}
		}
		for(j=i/*+1*/;j<n-1;j++)
		{
			a[j]=a[j+1];
		}
		n--;
		
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);			
		}
		
	}

}
