package Array;

import java.util.Scanner;

public class UserDeifneArray2 {
	public static void main(String[] args) 	
{
		System.out.println("Enter the index of the aray: ");
		Scanner sc=new Scanner(System.in);
		int a[];
		int n=sc.nextInt();
		a=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("User deine "+a[i]);
		}

		
	}

}
