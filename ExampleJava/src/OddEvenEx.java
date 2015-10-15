
public class OddEvenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,ODD=0,Even=0;		
		for(i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i + " : is ODD Number.");
				ODD+=i;
			}
			else
			{
				System.out.println(i + " : is Even Number.");
				Even+=i;
			}
		}
		System.out.println();
		System.out.println("Sum of ODD Number is : " + ODD);
		System.out.println("Sum of Even Number is : " + Even);
	}

}
