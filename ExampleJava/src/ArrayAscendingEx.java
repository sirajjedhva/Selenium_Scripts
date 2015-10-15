import java.io.*;

public class ArrayAscendingEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a[]={10,2,1,25,26};
		int i,j,temp;
		for(i=0;i<4;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<5;i++)
		{
			System.out.println("list :"+a[i]);
		}

	}

}
