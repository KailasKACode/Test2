package Array;
import java.util.*;
public class SubAddition {
	public static void main(String[] args) {
		
		System.out.println("Enter the array Index: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}

		
		int temp=0;
		System.out.println("Subtraction of the preceding value: ");
		for (int i = 0; i < n-1; i++) {
			temp=temp+Math.abs(a[i]-a[i+1]);
		//	temp+=Math.abs(a[i]-a[i+1]);
			
		}
		
		System.out.println("\n After addition: "+temp);
		
	}
}