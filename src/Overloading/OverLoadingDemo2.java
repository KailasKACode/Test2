package Overloading;
public class OverLoadingDemo2 {
	public void getData() {
    System.out.println("Defulat");
	}

	public static void main(String[] args) {
		OverloadingDemo odj=new OverloadingDemo();
		odj.showData("Vaibhv");
		odj.showData("Kiran");
		odj.showData(10);
		odj.showData(12);
		odj.showData(11);
		odj.showData(6);
		odj.showData(32);
		odj.showData(153);
		odj.showData(10);
		odj.showData(10);
	}
}
