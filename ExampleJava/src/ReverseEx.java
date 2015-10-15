
public class ReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,a, sum=0, temp;
		for(i=100;i<=200;i++)
		{
			a=i;
			while(a>0)
			{
				temp=a%10;
				sum=sum*10 + temp;
				a=a/10;
			}
			System.out.println(sum);
			sum=0;
		}
	}

}
