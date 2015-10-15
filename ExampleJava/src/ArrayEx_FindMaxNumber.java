import java.io.*;

public class ArrayEx_FindMaxNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int n[] = new int[a];
		int i,max=0;
		for(i=0;i<a;i++)
		{
			n[i]=Integer.parseInt(br.readLine());
			if(n[i]>max)
			{
				max=n[i];
			}
		}
		System.out.println();
		System.out.println("Max number from the given array element : " + max);
	}

}
