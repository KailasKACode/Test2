package Array;

public class AddMiddleNum {
public static void main(String[] args) {
	int a[]= {2,6,3,8,2,2,5};
	System.out.println("Addition of the the array middle number: ");
	for (float i = 0; i < a.length; i++) {
		if((a.length-1)/2==i)
		{
			System.out.print(a[(int) i]+a[(int) (i+1)]+" ");
		}
		else
		{
			System.out.print(a[(int) i]+" ");
		}
		
	}
}
}
