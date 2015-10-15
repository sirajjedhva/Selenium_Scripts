// Constructor with create method with no return value [using void method]

import java.io.*;

public class ClassEx_Constructor3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Constructor3 mycons3 = new Constructor3();
		mycons3.vol();
	}

}

class Constructor3 {
	double height,width,length;
	double vol1;
	
	Constructor3() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter value of height : ");
		height=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of width : ");
		width=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of length : ");
		length=Double.parseDouble(br.readLine());
		
		vol1 = height*width*length;
		
	}
	
	void vol() {
		System.out.println("Volume of Mybox1 is : " + vol1);
	}
}
