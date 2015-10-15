import java.io.*;

public class ClassEx1_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		box1_4 mybox1_4 = new box1_4();
		//double vol;
		
		System.out.print("Enter value of height : ");
		mybox1_4.height=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of width : ");
		mybox1_4.width=Double.parseDouble(br.readLine());
		
		System.out.print("Enter value of depth : ");
		mybox1_4.depth=Double.parseDouble(br.readLine());
		
		// Pass all value in parameterised in box1_4 class
		mybox1_4.voldata(mybox1_4.height, mybox1_4.width, mybox1_4.depth);
		
		/*vol=mybox1_4.vol1();
		
		System.out.println("Volume of Mybox1_4 is : " + vol); */
		
		mybox1_4.vol2();
	}

}

class box1_4 {
	double height,width,depth;
	
	/*double vol1() {
		return height*width*depth;
	}*/
	
	void vol2() {
		System.out.println("Volume of Mybox1_4 is :--->>> " + height*width*depth);
	}
	
	void voldata(double h, double w, double d) {
		height=h;
		width=w;
		depth=d;
	}
	
}
