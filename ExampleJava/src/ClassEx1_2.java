//Adding method to the Box Class using dynamic value

import java.io.*;

public class ClassEx1_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Box1_2 mybox1_2 = new Box1_2();
		
		mybox1_2.vol();
	}

}


class Box1_2 {
	
	double height,width,depth;
	
	void vol() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter value of height : ");
		height=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of width : ");
		width=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of depth : ");
		depth=Double.parseDouble(br.readLine());
		
		System.out.println("Volume of Mybox1 is : " + height*width*depth);
	}	
	
}