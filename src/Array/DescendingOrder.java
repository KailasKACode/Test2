package Array;

public class DescendingOrder {
	public static void main(String[] args) {
		int b[] = { 5, 62, 63, 30, 59, 95, 82 };
		int temp = 0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for (int i : b) {
			System.out.println(i);
			
		}
	}

}
