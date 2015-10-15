import java.io.*;
public class ArrayEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// To accept element into an array and display it //
		
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine());
		int i,n[] = new int [a];
		for(i=0;i<a;i++)
		{
			n[i]=Integer.parseInt(br.readLine());
		}
		System.out.println();
		//System.out.println(n[1]);
		for(i=0;i<a;i++)
		{
			System.out.print(n[i] + "\t");
		}
	}

}
