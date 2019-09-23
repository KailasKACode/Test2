package Overriding;

public class OverrideSecDemo extends Myclass{
	static void stud(int id,String name) {
		System.out.println("Student Id: "+id);

	}
	public static void main(String[] args) {
		Myclass dc=new Myclass();
		dc.stud(16, "Vaibhav");
		dc.stud(75, "Sharrel Barret");
	}

	
}
