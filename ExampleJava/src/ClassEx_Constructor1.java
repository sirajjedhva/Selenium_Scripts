
public class ClassEx_Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 mybox1 =new Constructor1();
		
		//double vol;
		//vol=mybox1.vol();
		
	}

}

class Constructor1 {
	
	
	Constructor1() {
		double height,width,length;
		
		height=10;
		width=15;
		length=20;
		
		double vol= height*width*length;
		
		System.out.println("Volume of Mybox1 is : " + vol);
	}
	
	/*double vol() {
		return height*width*length;
	}*/
}
