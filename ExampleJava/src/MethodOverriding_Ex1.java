import java.util.Scanner;

class A2{
	int i,j;
	void sum(){
		System.out.println("i=" + i +  " j " + j);
	}
}
class B2 extends A2{
	int k;
	void sum(){
		System.out.println("k = " +k);
	    System.out.println("Sum = " +(i+j+k));
	}
}
public class MethodOverriding_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Please Enter i value:");
    int m=sc.nextInt();
    System.out.print("Please Enter j value :");
    int n=sc.nextInt();
    System.out.print("Please Enter k value :");
    int o=sc.nextInt();
    
    A2 a=new A2();
    B2 b=new B2();
    
    a.i=m;
    a.j=n;
    a.sum();
    
    b.i=m;
    b.j=n;
    b.k=o;
    b.sum();
    //System.out.println("Sum = "+(m+n+o));
	}

}
