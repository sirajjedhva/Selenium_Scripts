
public class MaxnumberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=100,b=550,c=11,sum=0;
		if(a>b)
		{
			if (a>c)
			{
				System.out.println("a is greater.");
				for(i=1;i<=10;i++)
				{
					sum=a*i;
					System.out.println(a + " * " + i + " = " + sum);
				}
			}
			else
			{
				System.out.println("c is greater.");
				for(i=1;i<=10;i++)
				{
					sum=c*i;
					System.out.println(c + " * " + i + " = " + sum);
				}
			}		
		}
		else if(b>c)
		{
			System.out.println("b is greater.");
			for(i=1; i<=10;i++)
			{
				sum=b*i;
				System.out.println(b + " * " + i + " = " + sum);
			}
		}
		else
		{
			System.out.println("c is greater.");
			for(i=1;i<=10;i++)
			{
				sum=c*i;
				System.out.println(c + " * " + i + " = " + sum);
			}
		}
	}

}
