import java.util.Scanner;

class A1{
	int i,j;
	void sum(int n,int m){
		i=n;
		j=m;
		System.out.println("i = " + i +  " j = " + j  );
	}
}
class B1 extends A1{
	int k;
	void sum(int n,int m,int z){
		k=z;
		System.out.println("k="+k);
		System.out.println("Sum =" +(i+j+k));
	}
}
public class MethodOverloading_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A1 a1=new A1();
    B1 b1=new B1();
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Please Enter i value :");
    int o=sc.nextInt();
    System.out.print("Please Enter j value :");
    int p=sc.nextInt();
	System.out.print("Please Enter k value :");
	int r=sc.nextInt();
    
	a1.i=o;
	a1.j=p;
	a1.sum(o, p);
	
	b1.i=o;
	b1.j=p;
	b1.k=r;
	b1.sum(o,p,r);
	}

}
