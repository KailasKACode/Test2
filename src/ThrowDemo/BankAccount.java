package ThrowDemo;
import java.util.*;
public class BankAccount {
	static String Uname;
	static String pass;
	int cnt=0;

	private void Authiticate(String Uname1, String pass1) {
		if (Uname1.equals(Uname) && pass1.equals(pass)) {
			System.out.println("Welcome to bank");
		} else {
			System.out.println("Password or Username incorrect");
			cnt++;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name: ");
		Uname = sc.nextLine();
		System.out.println("Enter the password: ");
		pass = sc.nextLine();

		BankAccount b = new BankAccount();
		b.Authiticate("test", "test12");

	}
}
