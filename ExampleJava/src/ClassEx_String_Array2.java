import java.io.*;
import java.util.Scanner;

public class ClassEx_String_Array2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of array length : ");
		int i,n = sc.nextInt();
		String str [] = new String[n];
		for(i=0;i<n;i++) {
			System.out.print("Enter String of [" + i + "] : ");
			str[i] = sc.next();
		}
		
		for(i=0;i<n;i++) {
			System.out.println("String of [" + i + "] :" + str[i]);
		}
		
	}

}