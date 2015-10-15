// This program demonstrates the difference between public and private.

import java.io.*;
import java.util.Scanner;

public class ClassEx_AccessControl_Privat_Public {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AccessControl ac = new AccessControl();
		
		System.out.print("Enter value of a : ");
		int a=sc.nextInt();
		
		System.out.print("Enter value of b : ");
		int b=sc.nextInt();
		
		System.out.print("Enter value of c : ");
		int c=sc.nextInt();
		
		System.out.print("Enter value of d : ");
		int d=sc.nextInt();

		ac.a=a;
		ac.b=b;
		
		ac.setc(c);
		ac.setd(d);
		
		System.out.println("Value of A : " + ac.a + "\nValue of B : " + ac.b + "\nValue of C : " + ac.getc() + "\nValue of D : " + ac.getd());
		
		ac.oddeven();
		
	}

}

class AccessControl {
	int a; // default access
	public int b; // public access
	private int c;  // private access
	protected int d;
	
	void setc(int i) {
		c=i;
	}
	
	void setd(int i) {
		d=i;
	}
	
	int getc() {
		return c;
	}
	
	int getd() {
		return d;
	}
	
	void oddeven() {
		if(a%2==0) {
			System.out.println(a + " is even number");
		}
		else {
			System.out.println(a + " is odd number");
		}
		
		if(b%2==0) {
			System.out.println( b + " is even number");
		}
		else {
			System.out.println(b + " is odd number");
		}
		
		if(c%2==0) {
			System.out.println(c + " is even number");
		}
		else {
			System.out.println(c + " is odd number");
		}
		
		if(d%2==0) {
			System.out.println(d + " is even number");
		}
		else {
			System.out.println(d + " is odd number");
		}
	}
}