import java.io.*;

public class Array2DMatrixEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		System.out.print("Enter Row : ");
		int row=Integer.parseInt(br.readLine());
		System.out.print("Enter Column : ");
		int column=Integer.parseInt(br.readLine());
		int i,j;
		int a[][]=new int[row][column];
		int b[][]=new int[row][column];
		int c[][]=new int[row][column];
		
		
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				b[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
                for(int k=0;k<column;k++)
                {
                	c[i][j]= c[i][j] + (a[i][k] * b[k][j]);
                }
			}
		}
		
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
