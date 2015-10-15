// Example of Inheritance with Super Class & Sub Class

import java.util.Scanner;
import java.io.*;

public class Inhertitence_Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		A a = new A();
		B b = new B();
		
		System.out.print("Enter value of i : ");
		int n = sc.nextInt();
		
		System.out.print("Enter value of j : ");
		int m = sc.nextInt();
		
		System.out.print("Enter value of k : ");
		int l = sc.nextInt();
		
		a.i=n;
		a.j=m;
		
		b.i= n;
		b.j= m;
		b.k= l;
		
		a.show();
		
		b.show1();
		b.sum1();
	}

}

class A {
	int i,j;
	
	
	void show() {
		System.out.println("i and j = " + i + " : " + j);
	
		
	}
}

class B extends A {
	int k;
	A a = new A();
	
	
	void show1() {
		System.out.println("k : " + k);
	}
	void sum1() {
		System.out.println("sum of i : j : k : " + (i+j+k));
	
	}
}