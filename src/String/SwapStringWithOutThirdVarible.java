package String;

public class SwapStringWithOutThirdVarible {
	 SwapStringWithOutThirdVarible() {
		System.out.println("Private constructor");
	}
	
	public static void main(String[] args) {
		String str1="A";
		String str2=" B";
		str1=str1+str2;
		str2=str1;
		str2=str2.substring(0,1);
		str1=str1.substring(1);
		System.out.println("Str1:  "+str1);
		System.out.println("Str2:   "+str2);
		
	}

}
