package Array;
import java.util.Scanner;
public class FindmaxNum {
	public static void main(String[] args) {
		System.out.println("Enter the array index: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>a[i+1])
			{
				System.out.println("");
			}
			temp++;
			
		}
		
for(int i=0;i<n;i++)
{
	System.out.println(temp);
}
		
	}

}
