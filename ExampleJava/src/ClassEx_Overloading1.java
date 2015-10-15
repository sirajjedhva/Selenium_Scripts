// Method Overloading

import java.io.*;
import java.util.Scanner;

public class ClassEx_Overloading1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OverloadDemo ob = new OverloadDemo();
		double d,result;
		int a,b,c;
				
		System.out.print("Enter value of A : ");
		a=sc.nextInt();
		
		System.out.print("Enter value of B : ");
		b=sc.nextInt();
		System.out.print("Enter value of C : ");
		c=sc.nextInt();
		
		System.out.print("Enter value of D : ");
		d=sc.nextDouble();
		
		// call all versions of test()
		ob.test();
		ob.test(a);
		ob.test(b,c);
		result = ob.test(d);
		System.out.println("Result of ob.test (" + d + ") : " + result);
	}

}

class OverloadDemo {
	void test() {
	System.out.println("No parameters");
	}

	// Overload test for one integer parameter.
	void test(int a) {
	System.out.println("a: " + a);
	}
	
	// Overload test for two integer parameters.
	void test(int b, int c) {
	System.out.println("b and c: " + b + " " + c);
	}
	// overload test for a double parameter
	double test(double d) {
	System.out.println("double d: " + d);
	return d*d;
	}
}


