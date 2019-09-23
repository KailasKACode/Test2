package ExceptionHandling;

import java.sql.SQLException;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i=10;
		int j=i%5;
		int result=0;
		try
		{
			result=10/j;
		}
		catch(Exception e)
		{
			j++;//To avoid such situation need to increaments  the j.
			result=10/j;
			System.out.println(result);
		}
		
		finally {
			System.out.println("done");
		}
		
		 
		
	}
}
