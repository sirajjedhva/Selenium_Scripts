// Constructor to create method with adding parameter in constructor.

import java.io.*;

public class ClassEx_Constructor4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		double h,w,l;
		
		System.out.print("Enter value of height : ");
		h=Double.parseDouble(br.readLine());
		
		System.out.print("Enter vlaue of width : ");
		w=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of length : ");
		l=Double.parseDouble(br.readLine());
		
		//Pass value in constructor using parameterised.
		
		Constructor4 cons4 = new Constructor4(h,w,l);
		
		/*double vol = cons4.vol();
		System.out.println("Volume of parameterized constructor is : " + vol);*/
		
		cons4.vol1();
	}

}

class Constructor4 {
	double height,width,length;
	
	Constructor4 (double h, double w, double l) {
		height=h;
		width=w;
		length=l;
	}
	
	/*double vol() {
		return height*width*length;
	}*/
	
	void vol1 () {
		double vol=height*width*length;
		System.out.println(vol);
	}
}
