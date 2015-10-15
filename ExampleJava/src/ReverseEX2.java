
public class ReverseEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12345,sum=0,temp;
		while(i>0)
		{	
			temp=i%10;
			sum=sum*10 +temp;
			i=i/10;
		}
		System.out.println(sum);
	}

}
