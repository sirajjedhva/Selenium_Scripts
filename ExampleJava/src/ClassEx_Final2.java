// Example of final method inherited

public class ClassEx_Final2 extends final2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassEx_Final2().call();
	}

}

class final2 {
	int a=10;
	
	final void call() {
		System.out.println("a : " + a);
	}
}
