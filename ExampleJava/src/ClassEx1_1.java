import java.io.*;

public class ClassEx1_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Box1_1 mybox1 = new Box1_1();
		
		System.out.print("Enter value of height : ");
		mybox1.height=Double.parseDouble(br.readLine());
				
		System.out.print("Enter value of width : ");
		mybox1.width=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of depth : ");
		mybox1.depth=Double.parseDouble(br.readLine());
				
		double vol;
		vol = mybox1.height * mybox1.width * mybox1.depth;
		System.out.println("Volume of Mybox1 is : " + vol);
	}

}

class Box1_1 {
	double height;
	double width;
	double depth;
}
