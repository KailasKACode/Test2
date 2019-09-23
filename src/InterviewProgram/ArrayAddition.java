package InterviewProgram;

public class ArrayAddition {
	public static void main(String[] args) {
		int a[]= {5,8,6,77,36,95,75,21,1};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			System.out.print("   "+sum);
		}
		System.out.println("   "+sum);
		
	}

}
