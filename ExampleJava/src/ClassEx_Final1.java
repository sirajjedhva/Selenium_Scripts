
public class ClassEx_Final1 {

	final int a=10;
	
	void call() {
		final int b=100;
		System.out.println(a + " : " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx_Final1 obj = new ClassEx_Final1();
		obj.call();
	}
	
}