
public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 mybox = new Box1();
		double vol;
		
		mybox.width=10;
		mybox.height=20;
		mybox.depth=15;
		
		vol=mybox.width*mybox.height*mybox.depth;
		
		System.out.println("Volume is : " + vol);
	}

}

class Box1 {
	double width;
	double height;
	double depth;
}
