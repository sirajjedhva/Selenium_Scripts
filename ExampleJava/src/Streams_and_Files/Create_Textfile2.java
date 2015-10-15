package Streams_and_Files;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Create_Textfile2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream dis=new DataInputStream(System.in);
		
		FileOutputStream fs=new FileOutputStream("File");
		
		 char ch;
		 System.out.println("Enter #end :");
		 while((ch=(char) dis.read())!= '#')
			 fs.write(ch);
			 fs.close();
		 
	}

}
