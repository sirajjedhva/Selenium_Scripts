// Constructor with create method with return value.

import java.io.*;

public class ClassEx_Constructor2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Constructor2 myconstruct2 = new Constructor2();
		double vol = myconstruct2.vol();
		
		System.out.println("Volume of MyConstruct2 is : " + vol);
	}

}

class Constructor2 {
	double height,width,length;
	
	Constructor2 () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter height : ");
		height = Double.parseDouble(br.readLine());
		
		System.out.print("Enter width : ");
		width = Double.parseDouble(br.readLine());
		
		System.out.print("Enter length : ");
		length = Double.parseDouble(br.readLine());
		 
	}
	double vol() {
		return height*width*length;
	}
	
}
