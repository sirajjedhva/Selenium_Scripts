
public class ClassEx_Nested_ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 ex1 = new Ex1();
		ex1.callEx1();
	}

}

class Ex1 {
	int a=100;
	
	void callEx1() {
		Ex2 ex2 = new Ex2();
		ex2.display();
	}
	
	class Ex2 {
		void display() {
			int b=15;
			System.out.println("display outer Ex1 of a & b value : " + a + " : " + b);
		}
	}
}
