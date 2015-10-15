import java.io.*;

public class ArraySummationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		System.out.print("Enter Number of A : ");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br1.readLine());
		int n[] = new int [a];
		
		int i,k[]=new int [3];
		
		for(i=0;i<a;i++)
		{
			n[i]=Integer.parseInt(br1.readLine());
		}
		
		System.out.print("Enter Number of B : ");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		int b= Integer.parseInt(br2.readLine());
		int m[] = new int [b];
		                                                                                                                                                                                                                                                                                                                                                                                                            
		for(i=0;i<b;i++)
		{
			m[i]=Integer.parseInt(br2.readLine());
		}
		
		for(i=0;i<3;i++)
		{
			k[i]=n[i]+m[i];
		}
		
		for(i=0;i<3;i++)
		{
			System.out.println("Summation of :" + n[i] + " + " + m[i] + " is : " + k[i]);
		}*/
		
		/*int a[] = {11,22,33};
		int b[] = {44,55,66};
		int c[] = new int[3];
		int i,n=3;
		
		for(i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println("Summation of " + a[i] + " + " + b[i] + " is : " + c[i]);
		}*/
		
		System.out.print("Enter Number : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		
		int a[] = new int [n];
		int b[] = new int [n];
		int c[] = new int [n];
		int i;
		
		System.out.print("Enter elements A : ");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.print("Enter elements B : ");
		for(i=0;i<n;i++)
		{
			b[i]=Integer.parseInt(br.readLine());
		}
		
		for(i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
	}

}
