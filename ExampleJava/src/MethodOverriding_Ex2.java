	class A5{
		int i=8,j=9;
		void sum(){
		System.out.println("Sum = "+(i+j));	
		}
		
	}
	class B5 extends A5{
		void sum(){
		System.out.println("sum : "+(i+j));	
		}
	}
public class MethodOverriding_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A5 a=new A5();
    a.sum();
    B5 b=new B5();
    b.sum();
	}

}
