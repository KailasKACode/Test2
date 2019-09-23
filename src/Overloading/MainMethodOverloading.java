package Overloading;
public class MainMethodOverloading {
public static void main(String[] args) {
	System.out.println("Main method");
	MainMethodOverloading od=new MainMethodOverloading();
	od.main(10);
	od.main(45,"me hu main");
}
public static void main(int A) {
System.out.println("This main methods: "+A);	
}

public static void main(int A, String b) {
System.out.println("This main methods: "+A+" "+b );	
}
}
