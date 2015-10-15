import java.io.*;

public class ClassEx1_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		box1_3 mybox1_3 = new box1_3();
		
		System.out.print("Enter value of height : ");
		mybox1_3.height=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of width : ");
		mybox1_3.width=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of depth : ");
		mybox1_3.depth=Double.parseDouble(br.readLine());
		
		double vol = mybox1_3.vol();
		System.out.println("Volume of Mybox1 is : " + vol);
	}

}

class box1_3 {
	
	double height,width,depth;
	
	double vol() {
		return height*width*depth;
	}
}