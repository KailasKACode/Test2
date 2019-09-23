package Overriding;
public class OverridingDemo1 extends OverridingDemo {
	
	 String showGit() {
		super.showGit();
		System.out.println("this is child class");
	return null;
	}
	public static void main(String[] args) {
		
		OverridingDemo1 br2=new OverridingDemo1();
		br2.showGit();
	}

}
