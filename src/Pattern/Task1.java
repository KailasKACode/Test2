package Pattern;
import java.util.Scanner;
public class Task1 {
public static void main(String[] args) {
	System.out.println("How many Astronates prints: ");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	for(int i=1;i<=no;i++)
	{
		for(int j=no;j>=i;j--)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}
