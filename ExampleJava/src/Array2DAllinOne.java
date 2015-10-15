import java.io.*;

public class Array2DAllinOne {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int row=Integer.parseInt(br.readLine());
		
		System.out.print("Enter Column : ");
		int column=Integer.parseInt(br.readLine());
		
		int a[][]=new int[row][column];
		int i,j,max=0,min=0;
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println();
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//Find Maximum number from given array
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Maximum value from the given array : " + max);
		
		
		//Find Minimum number from given array
		min=a[0][0];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		System.out.println("Minimum value from the given array : " + min +"\n");
		
		//Find Odd Even Number from given array
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				if(a[i][j]%2==0)
				{
					System.out.print(a[i][j] + " is Even Number " + " ");
				}
				else
				{
					System.out.print(a[i][j] + " is Odd Number " + " ");
				}
				
			}System.out.println();
		}
		System.out.println();
		
		//Summation of Odd & Event Number from given array
		int odd=0,even=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				if(a[i][j]%2==0)
				{
					even+=a[i][j];
				}
				else
				{
					odd+=a[i][j];
				}
			}
		}
		System.out.println("Summation of Odd Number from given number is : " + odd);
		System.out.println("Summation of Even Number from given number is : " + even + "\n");
		
		//Find Positive and Zero number from given array
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				if(a[i][j]>0)
				{
					System.out.print(a[i][j] + " is positive number" + " ");
				}
				else if(a[i][j]<0)
				{
					System.out.print(a[i][j] + " is negetive number" + " ");
				}
				else
				{
					System.out.print(a[i][j] + " is zero" + " ");
				}
			}System.out.println();
		}
	}

}