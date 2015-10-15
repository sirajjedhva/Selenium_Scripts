import java.io.*;

public class ArrayRemoveDuplicateValue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i,j,k,a[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j] == a[i])
				{
					for(k=j;k<n-1;k++)
					{
						a[k]=a[k+1];
					}
					n--;
				}
				else
				{
					continue;
				}
			}
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
