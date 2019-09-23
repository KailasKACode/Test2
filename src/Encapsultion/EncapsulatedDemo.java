package Encapsultion;

public class EncapsulatedDemo {
	public static void main(String[] args) {
		Encapsulate obj=new Encapsulate();
		obj.setA(10);
		obj.setB(20);
		
		System.out.println("First value  "+obj.getA());
		System.out.println("Second value  "+obj.getB());
	}

}
