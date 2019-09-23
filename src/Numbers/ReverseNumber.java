package Numbers;
import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
	System.out.println("Enter the number: ");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	int rev=0,rem;
	while(no!=0)
	{
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
		
	}
	System.out.println("The reverse number is "+rev);
	
}
}
