package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotPresent {
public static void main(String[] args) {
	
	
	
	try {
		
		FileInputStream fis=new FileInputStream("test.docx");
	    } 
	
	
	catch (FileNotFoundException e) 
	
	{
		e.printStackTrace();
		System.out.println("File not found");
	}
	
}
}
