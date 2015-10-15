// Array with constructor

import java.util.Scanner;

public class ClassEx_Constructor_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int i,n = sc.nextInt();
		System.out.println();
		
		int a [] = new int[n];
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter value of " + i + " index array : " );
			a[i] = sc.nextInt();
		}
		System.out.println();
		
		for(i=0;i<n;i++)
		{
			System.out.println(i + " spot value is : " + a[i]);
		}
		consarray con=new consarray(a, n);
		
		System.out.println("Sum is : " +con.sumFunction(a, n));
			//consarray con1 = new consarray(a[i]);
		
		System.out.println("Sum was : " +sumFunction(a, n));
	}
	static int sumFunction (int a[], int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum= sum + a[i];
		}
			
		return sum;
	}
}

class consarray {
	 
	public consarray() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	consarray(int a[], int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum= sum + a[i];
		}
		System.out.println("Sum will : " +sum);
	}

	int sumFunction (int a[], int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum= sum + a[i];
		}
			
		return sum;
	}
}
