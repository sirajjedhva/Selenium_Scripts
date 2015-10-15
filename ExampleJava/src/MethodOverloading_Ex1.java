
	class A4{
		int i,j,k;
		void sum(int m,int n){
		i=m;
		j=n;
		System.out.println("Sum="+(i+j));
		}
	}
	
	class B4 extends A4{
		void sum(int m,int n,int o){
	     i=m;
	     j=n;
		 k=o;	
    	System.out.println("sum :"+(i+j+k));
		}
	}
	
public class MethodOverloading_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A4 a=new A4();
     a.sum(6, 7);
     
     B4 b=new B4();
     b.sum(5,8,7);
	}

}
