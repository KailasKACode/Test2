package ThrowsDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {
public void m1() throws IOException {

FileInputStream ar=new FileInputStream("");
System.out.println("File not found");


}
}
