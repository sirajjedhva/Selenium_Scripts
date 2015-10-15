// 'this' keyword example

import java.util.Scanner;

public class ClassEx_This_Keyword {
	double width = 100, length=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double height;
		
		System.out.print("Enter value of heigth : ");
		height=sc.nextDouble();
		
		Box_Keyword mythiskey = new Box_Keyword(height);
		
		ClassEx_This_Keyword test1 = new ClassEx_This_Keyword();
		test1.vol1();
		test1.vol2();
	}
	void vol1() {
		System.out.println(this.width);
	}
	void vol2() {
		System.out.println(this.length);
	}
	
}

class Box_Keyword {
	
	double height,width;
	
	Box_Keyword (double height) {
		this.height=height;
		height=10;
		System.out.println(this.height);
		System.out.println(height);
		
	}
}
