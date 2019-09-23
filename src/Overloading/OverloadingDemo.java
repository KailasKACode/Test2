package Overloading;
public class OverloadingDemo {
	
private void showData() {
System.out.println("This is first method");
}

public void showData(int a) {
System.out.println("Interger value: "+a);
}
protected void showData(String b) {
	System.out.println("String parameterized : "+b);
}

public static void main(String[] args) {

OverloadingDemo od=new OverloadingDemo();
od.showData();
od.showData('j');
od.showData("Testing Shashtra");

}

}

