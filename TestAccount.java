package umlDiagrams;
import java.util.Scanner;
public class TestAccount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Thailand Bank");
		Account customer = new Account(1122, 20000, 4.5);
		customer.deposit(900);
		System.out.println(customer.result());
		customer.withdraw(350);
		System.out.println(customer.result());
		
		scan.close();
	}
}
