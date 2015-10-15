
public class PerfectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		int a=8128;
		/*int j;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum == i)
			{
				System.out.println(i + " is Perfect Number");
			}
			else
			{
				System.out.println(i + " is not Perfect Number");
			}
			sum=0;
		}*/
		
		/*for(i=1;i<a;i++)
		{
			
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum == i)
			{
				System.out.println(i);
			}
			sum=0;
		}*/
		
		for(i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum == a)
		{
			System.out.println(a + " is perfect number.");
		}
		else
		{
			System.out.println(a + " is not perfect number.");
		}
	}

}
