package Constructor;

public class SampleJava {

	/*public SampleJava() {
		System.out.println("This is defult consructor: ");
	}

	public SampleJava(byte name) {
		System.out.println("This is sttring " + name);
	}

	public SampleJava(int a) {
		System.out.println("This is parameterrised constru ");
	}
*/
	public SampleJava(Object name) {
		System.out.println("This is Object " + name);
	}

	public static void main(String[] args) {
		SampleJava hr = new SampleJava("Shashikant");
		SampleJava hr1 = new SampleJava(150.1f);
		SampleJava hr2 = new SampleJava('g');


	}

}
