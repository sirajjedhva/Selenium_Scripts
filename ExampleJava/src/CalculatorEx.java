
public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i=15.0,j=20.1,sum=0;
		char s =  '*';
		
		switch(s)
		{
		case '+' : sum=i+j; System.out.println("Addition of i + j is : " + sum); break;
		case '-': sum=i-j; System.out.println("Subtraction of i - j is : " + sum);break;
		case '*': sum=i*j; System.out.println("Multiplication of i * j is : " + sum);break;
		case '/': sum=i/j; System.out.println("Division of i / j is : " + sum);break;
		}
	}

}
