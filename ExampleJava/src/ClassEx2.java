
public class ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 mybox1= new Box1();
		Box1 mybox2= new Box1();
		double vol;
		
		mybox1.width=1.5;
		mybox1.height=2;
		mybox1.depth=3;
		
		vol=mybox1.width*mybox1.height*mybox1.depth;
		
		System.out.println("Volume of Mybox1 is : " + vol);
		
		mybox2.width=4;
		mybox2.height=5;
		mybox2.depth=6;
		
		vol=mybox2.width*mybox2.height*mybox2.depth;
		
		System.out.println("Volume of Mybox2 is : " + vol);
	}

}
