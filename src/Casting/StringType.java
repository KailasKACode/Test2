package Casting;

public class StringType {
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("integer data " + a);
		short c;
		c = (short) a;
		System.out.println("Integer to short: " + c);

		String k = "1256.22";
		System.out.println("String : " + k);
		float p = Float.parseFloat(k);
		System.out.println("Float typecast : " + p);
		
		
		float f = 5153.55f;
		String d = String.valueOf(f);
		System.out.println(" Convert string : "+d);
		
		String l = "1256.22";
		int i=Integer.parseInt(l);
		System.out.println(i);//number formate exception

	}



}
