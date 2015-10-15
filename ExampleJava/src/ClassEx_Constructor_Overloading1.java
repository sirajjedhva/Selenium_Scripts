// Constructor Overloading

import java.io.*;
import java.util.Scanner;

public class ClassEx_Constructor_Overloading1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double h,a,b,c;
		
		System.out.print("Enter value of h : ");
		h=sc.nextDouble();
		
		System.out.print("Enter value of a : ");
		a=sc.nextDouble();
		
		System.out.print("Enter value of b : ");
		b=sc.nextDouble();
		
		System.out.print("Enter value of c : ");
		c=sc.nextDouble();
		
		MyConstructor mycons1 = new MyConstructor();
		MyConstructor mycons2 = new MyConstructor(h);
		MyConstructor mycons3 = new MyConstructor(a, b, c);
		
	}

}

class MyConstructor {
	
	double height,width,length;
	
	MyConstructor () {
		System.out.println("No value with print in this First Constructor.");
	}
	
	MyConstructor(double h) {
		System.out.println("Value of h is : " + h);
	}
	MyConstructor(double a, double b, double c) {
		height = a;
		width = b;
		length = c;
		
		System.out.println(height + " : " + width +  " : " + length);
		
		double vol = a*b*c;
		System.out.println("Result of volume is : " + vol);
	}
	
}
