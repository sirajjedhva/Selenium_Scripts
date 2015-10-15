
public class CalculatorIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=5.0,b=10.0,sum=0;
		//char c = '*';
		String s = "Div";
		if(s == "Add")
		{
			sum=a+b;System.out.println(sum);
		}
		else if(s == "Sub")
		{
			sum=a-b;System.out.println(sum);
		}
		else if(s == "Mul")
		{
			sum=a*b;System.out.println(sum);
		}
		else if(s == "Div")
		{
			sum=a/b;System.out.println(sum);
		}
		else
		{
			System.out.println("UnExpected Result");
		}
	}

}
