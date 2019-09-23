package String;

public class ReverseWords {
	public static void main(String[] args) {
		String str="I am Test engineer";
		String[] a =str.split(" ");
		for (int i = a.length-1; i >=0 ; i--) {
			System.out.print(" "+a[i]);
			
		}
	}

}
