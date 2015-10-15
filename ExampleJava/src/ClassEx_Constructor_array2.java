// Array with constructor 2 example

import java.io.*;
import java.util.Scanner;

public class ClassEx_Constructor_array2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of array size : ");
		int n = sc.nextInt();
		int i,a [] = new int [n];
		
		for(i=0;i<n;i++) {
			System.out.print("Enter " + i + " index value : ");
			a[i]=sc.nextInt();
		}
		
		cons_array2 consarray2 = new cons_array2(a, n);
		consarray2.Even();
		consarray2.Odd();
	}

}

class cons_array2 {
	
	int m, b[];
	
	cons_array2 (int a[], int m) {
		this.m =m;
		//b= new int [m];
		b=a;
		
		for(int i=0;i<m;i++) {
//			b[i] = a[i];
			System.out.println("OK : " + b[i]);
		}
	}
	
	void Even() {
//		int i;
		for(int i=0;i<m;i++) {
			if(b[i]%2==0) {
				System.out.println(b[i] + " : is Even Number.");
			}
		}
	}
	
	void Odd() {
		for(int i=0;i<m;i++)
		{
			if(b[i]%2!=0) {
				System.out.print(b[i] + " : is Odd Number.");
			}
		}
	}
}
