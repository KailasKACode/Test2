package ThrowsDemo;

import java.io.IOException;

public class Test2 {
	public void m2() throws IOException {
		Test1 t=new Test1();
		t.m1();
		System.out.println("This is second m2 methods");
	}

}
