package StaicNonAccessModifier;

public class MultilpeStatocBlock {
	static {
		System.out.println("This is first static blocks");
	}

	public void show() {
		System.out.println("This is show mwthod");

	}

	static {
		System.out.println("This is 5nd static blocks");
	}
	public static void main(String[] args) {
	System.out.println("This is main methods");	
	}

	public static void main(char[] args) {
		System.out.println("This is main methods");	
		}
	public static void main(int[] args) {
		System.out.println("This is main methods");	
		}

	static {
		System.out.println("This is 6rd static blocks");
	}

}
