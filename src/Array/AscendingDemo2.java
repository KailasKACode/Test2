package Array;

public class AscendingDemo2 {
	public static void main(String[] args) {
		int a[]= {4,10,5,6,9,7,-2};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				
			}
			
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
