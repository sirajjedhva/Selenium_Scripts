// Example 2 of Static Concept 


public class ClassEx_Static2 extends ClassEx_Static1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx.call();
		System.out.println("b : " + StaticEx.b);
		
		ClassEx_Static1.meth(42);
	}

}


class StaticEx {
	static int a=10;
	static int b=20;
	
	
	static void call() {
		System.out.println("a : " + a);
	}
}