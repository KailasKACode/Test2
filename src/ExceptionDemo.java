
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Start");
		} catch (Exception e) {
			System.out.println("Programe in middle ");
		}
		finally {
			System.exit(100);
			System.out.println("program end");
		}
	}

}
