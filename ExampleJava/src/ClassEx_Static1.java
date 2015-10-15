// Example of Static concept

import java.io.IOException;
//import java.util.Scanner;

public class ClassEx_Static1 {

	static int h = 10;
	static int i,j,sum=0;
	
	static void meth(int x) {
		System.out.println("x : " + x);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
	}
	
	static {
		i=h*10;
		for(j=1;j<=10;j++)
		{
			sum=h*j;
			System.out.println(h + "*" + j + " = " + sum);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter value of x : ");
		//int x = sc.nextInt();
		
		meth(42);
	}
	
}
