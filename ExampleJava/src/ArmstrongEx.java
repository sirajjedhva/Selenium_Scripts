
public class ArmstrongEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5000, j = 0, sum = 0, temp = 0;
		
		for (int a = 1; a < i; a++)
		{
			j=a;
			while (j > 0) {
				temp = j % 10;
				sum += temp * temp * temp;
				j = j / 10;
			}
			if (sum == a) {
				System.out.println(a + "  No is Armstrong.");
			}
			sum = temp = 0;
		}
	}

}
