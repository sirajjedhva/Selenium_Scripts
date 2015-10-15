import java.io.*;

public class Array2DimentionEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*int a[][]= {
				{11,22},
				{33,44},
				{55,66}
		};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows : ");
		int row =Integer.parseInt(br.readLine());
		
		System.out.print("Enter Coloums : ");
		int column=Integer.parseInt(br.readLine());
		int i,j;
		
		int a[][]=new int [row][column];
		
		System.out.println("Enter Element of Rows and Column : ");
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
	}

}
