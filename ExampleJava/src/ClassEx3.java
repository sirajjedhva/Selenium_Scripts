//Adding a Method to the Box Class

public class ClassEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		box3 mybox1 = new box3();
		box3 mybox2 = new box3();
		
		mybox1.height=10;
		mybox1.width=11;
		mybox1.depth=12;
		
		mybox2.height=14;
		mybox2.width=15;
		mybox2.depth=16;
		
		mybox1.volume();
		mybox2.volume();
	}

}

class box3 {
	double height;
	double width;
	double depth;
	
	void volume() {
		System.out.println("Volume of Mybox1 is : " + height*width*depth);
	}
}
