package Overriding;


 class Myclass {

	static void stud(int rollNo, String name) {
		System.out.println("Myclass StudentName: " + name + " rollNo: " + rollNo);
	}

}

class Xyz extends Myclass {

	static void stud(int rollNo, String name) {
		System.out.println("XYz Class StudentName: " + name + " rollNo: " + rollNo);
	}

}

class Data extends Xyz
{
	public static void main(String[] args) {
		Xyz d=new Data();
		d.stud(10, "Ravi");
		
	}
}

