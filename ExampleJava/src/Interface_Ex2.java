	interface Father{
	  double property=10000;
	  double height=5.6;
	}
	interface Mother{
     double height=5.;
	 double property=30000;
	}
	class Son implements Mother,Father{
	 void show(){
		 System.out.println("Total property is :  "+(Father.property+Mother.property));
		 System.out.println("Total height is : "+((Father.height+Mother.height)/2));
	 }
	}
	public class Interface_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Son s=new Son();
     s.show();
	}

}
                                                                    