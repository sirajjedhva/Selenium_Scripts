package Streams_and_Files;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Create_Textfile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		//attach keyboard to DataInputStream
		DataInputStream ds=new DataInputStream(System.in);
		
		//attach output file
		FileOutputStream fos=new FileOutputStream("myfile");
		
		//read data from DataInputStream and write into FileOutputStream
		char ch;
		System.out.println("Enter @end :");
        		while((ch=(char) ds.read())!= '@');
        		fos.write(ch);
        		fos.close();
	}

}
