
public class FactorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		for(i=5;i>=1; i--)
		{
			fact=(i*fact);
		}
		System.out.println("Answer of Factorial is :" + fact);
	}

}
