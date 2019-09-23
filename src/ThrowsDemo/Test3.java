package ThrowsDemo;

import java.io.IOException;

public class Test3 {
	public void m3() throws IOException{
		Test2 t4=new Test2();
		t4.m2();
		System.out.println("This is m3 method calling to m2");
	}

}
