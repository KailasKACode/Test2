package String;
import java.util.*;
public class ConcateWithoutFun {
public static void main(String[] args) {
	System.out.println("Enter the 1st String: ");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	System.out.println("Enter the 2nd String: ");
	String str1=sc.next();
	System.out.println("concate the string using function: "+str.concat(str1));
	System.out.println("Without using the function: "+str+""+str1);
	
}
}
