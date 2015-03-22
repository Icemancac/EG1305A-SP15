//OK. O.Aktunc

import java.util.Date;

public class Account {
	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated;

	public Account(int idNumber, double startBalance, double startInterest,
			Date dateOpened) {
		id = idNumber;
		balance = startBalance;
		annualInterestRate = startInterest;
		dateCreated = dateOpened;
	}

	public Account() {
		id = 1;
		balance = 0;
		annualInterestRate = .001;
		Date dateCreated = new Date();
	}

	public void changeBalance(double newBalance) {
		balance = newBalance;
	}

	public double getBalance() {
		return balance;
	}

	public int getID() {
		return id;
	}

	public void changeId(int newID) {
		id = newID;
	}

	public void withdraw(double change) {
		balance = balance - change;
	}

	public void deposit(double change) {
		balance = balance + change;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void changeAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}

	public Date getDate() {
		return dateCreated;
	}
}
