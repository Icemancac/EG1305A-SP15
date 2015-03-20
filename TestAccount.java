import java.util.Date;

public class TestAccount {
	public static void main(String args[]) {
		Date dateCreate = new Date();
		Account Account1 = new Account(1122, 20000, .045, dateCreate);
		Account1.withdraw(2500);
		Account1.deposit(3000);
		System.out.println("Your Current Balance is \t\t$"
				+ Account1.getBalance());
		System.out.println("Monthly Interest earned is \t\t$"
				+ (Account1.getMonthlyInterestRate() * Account1.getBalance()));
		System.out.println("Date the Account was opened was \t"
				+ Account1.getDate());
	}
}