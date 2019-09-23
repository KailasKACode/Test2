package ThrowsDemo;

import java.io.IOException;

public class MainMethod {
public void MainMethod1() {
Test3 t1=new Test3();
try {
	t1.m3();
} catch (IOException e) {
	e.printStackTrace();
	System.out.println("Exception is handled");
}
}
public static void main(String[] args) {
	MainMethod mn=new MainMethod();
	mn.MainMethod1();
}
}
