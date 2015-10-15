import java.io.*;

public class Print_N_NumberEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int i,n = Integer.parseInt(br.readLine());
		int a[]= new int[n];
		System.out.print("Enter elements into  array : ");
		for(i=0;i<n;i++)
		{
			a[i]= Integer.parseInt(br.readLine());
		}
		System.out.print("Entered value in array is here : ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i] + "\t");
		}
	}

}
