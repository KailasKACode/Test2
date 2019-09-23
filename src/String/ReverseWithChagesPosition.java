package String;

public class ReverseWithChagesPosition {
public static void main(String[] args) {
	String str="I am an proud to be indian";
	StringBuffer bf = new StringBuffer(str);
	    bf.replace(0, 5, " now ");
	    System.out.println(bf.toString());
	 System.out.println(bf.reverse());
	String a[]=str.split(" ");
	String temp ="";
	 for (int i = 0; i < a.length; i++) {
		for (int j = a[i].length()-1; j >=0; j--) {
			temp += a[i].charAt(j);
		}
		temp+=" ";
	}
	 System.out.println(temp);
}
}
