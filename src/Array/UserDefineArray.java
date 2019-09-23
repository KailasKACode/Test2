package Array;
import java.util.*;
public class UserDefineArray {
public static void main(String[] args) {
	System.out.println("Enter the arrayIndex: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("Array : "+a[i]);
	}
}
}
