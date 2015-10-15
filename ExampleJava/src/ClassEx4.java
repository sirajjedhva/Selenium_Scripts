//Returning a Value

public class ClassEx4 {

	protected static void main(String[] args) {
		// TODO Auto-generated method stub
		box4 mybox1 = new box4();
		box4 myBox2 = new box4();
		double vol;
		
		mybox1.height=10;
		mybox1.width=20;
		mybox1.depth=30;
		
		vol=mybox1.volume();
		System.out.println("Volume of Mybox1 is : " + vol);
		
		myBox2.height=40;
		myBox2.width=50;
		myBox2.depth=60;
		
		vol=myBox2.volume();
		System.out.println("Volume of Mybox2 is : " + vol);
	}

}

class box4 {
	double height;
	double width;
	double depth;
	
	double volume() {
		return height*width*depth;
	}
}
