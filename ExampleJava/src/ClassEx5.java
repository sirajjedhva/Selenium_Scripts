// Adding a Method That Takes Parameters

public class ClassEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		box5 mybox1 = new box5();
		box5 mybox2 = new box5();
		double vol;
		
		mybox1.setdata(1, 2, 3);
		vol=mybox1.vol();
		System.out.println("Volume of Mybox1 is : " + vol);
		
		mybox2.setdata(4, 5, 6);
		vol=mybox2.vol();
		System.out.println("Volume of Mybox2 is : " + vol);

	}

}

class box5 {
	double height;
	double width;
	double depth;
	
	double vol() {
		return height*width*depth;
	}
	
	void setdata(double h, double w, double d) {
		height=h;
		width=w;
		depth=d;
	}
}
