	class A3
	{
	int x;
	A3(int x){
		this.x=x;
	}
	void show(){
	System.out.println("This is A class Method :" +x);
	}
	}
	class B3 extends A3
	{
	int y;
	B3(int a,int b){
		super(a);
		y=b;
	}
	void show(){
		super.show();
		System.out.println("y="+y);
		System.out.println("super x ="+super.x);
	}
	}
	
public class Super_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B3 b=new B3(10,24);
     b.show();
	}

}
 