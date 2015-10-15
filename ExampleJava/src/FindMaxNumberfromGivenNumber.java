//7405135685
public class FindMaxNumberfromGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10562,temp=0,max=0;
		while(i>0)
		{
			temp=i%10;
			if(temp>max)
			{
				max=temp;
			}
			i=i/10;
		}
		System.out.println("Greatest Number from the given value is : " + max);
	}

}
