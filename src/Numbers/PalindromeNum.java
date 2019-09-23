package Numbers;

public class PalindromeNum {
	public static void main(String[] args) {
		int number = 121;
		String num=Integer.toString(number);
		StringBuffer sb=new StringBuffer(num);
		StringBuffer rev=sb.reverse();
		if(sb.equals(rev))
		{
			System.out.println();
		}
	}
}
