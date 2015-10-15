import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.io.*;


public class ReverseStringEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter String : ");
		/*Scanner scn = new Scanner(System.in);
		//String s = scn.next();*/
		String temp="";
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int len,i;
		len=s.length();
		for(i=len-1;i>=0;i--)
		{
			temp=temp + s.charAt(i);
			
		}
		System.out.println(temp);
	}

}
