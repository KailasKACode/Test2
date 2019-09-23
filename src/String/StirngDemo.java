package String;

public class StirngDemo {
	public static void main(String[] args) {
		String a = "Testing";
		String b = "Testing";
		System.out.println(a.length());// to find the length of string.
		if (a.charAt(02) == 'S') {//to find the position & whether check position is correct or not
			System.out.println("Correct position");
		} else {
			System.out.println("Incorrect position");
		}
		System.out.println("Index position: "+a.indexOf('s'));
		if(a.equals(b))
		{
			System.out.println("Both String are equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		if(a.equalsIgnoreCase("Testinl"));
		{
			System.out.println("They are equals");
		}
		System.out.println("To upper case: "+a.toUpperCase());
		System.out.println("To lower case: "+a.toLowerCase());
	
	
	}
}
