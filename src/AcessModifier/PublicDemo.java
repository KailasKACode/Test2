/**This is on of the highest priority access modifier we can access
* easily within the project level
 * 
 * 
 * 
 */
package AcessModifier;
public class PublicDemo {
	public int addI(int c,int a,int b) {
		System.out.println("This is public method");
		return c=a+b;
	}
	public static void main(String[] args) {
		PublicDemo pb=new PublicDemo();
		int k=pb.addI(2, 6, 0);

	}
}
