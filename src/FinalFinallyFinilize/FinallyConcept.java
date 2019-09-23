package FinalFinallyFinilize;

public class FinallyConcept {
	public static void main(String[] args) {
		int i = 10;
		int c = 0;
		try {
			int k = i / c;
			System.out.println(k);
		} catch (ExceptionInInitializerError e) {
			c = 2;

			System.out.println("Exception handle under catch blocks: ");

		}
		finally {
			System.out.println(" This is finally blocks");
		}

	}

}
