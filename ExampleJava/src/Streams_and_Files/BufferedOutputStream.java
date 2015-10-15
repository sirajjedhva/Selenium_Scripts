package Streams_and_Files;

import java.io.*;

//Creating a text file using byte stream classes


public class BufferedOutputStream {

	public BufferedOutputStream(FileOutputStream fs, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream ds=new DataInputStream(System.in);
		//attach file to FileOutputStream, if we use true then it will open in append mode
		FileOutputStream fs=new FileOutputStream("File_2",true);
		BufferedOutputStream bs=new BufferedOutputStream(fs,1024);
		
		char ch;
		System.out.println("Enter @ at end");
		while((ch=(char)ds.read()) != '@')
		       	bs.write(ch);
				bs.close();
				fs.close();
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private void write(char ch) {
		// TODO Auto-generated method stub
		
	}

}

	
	
