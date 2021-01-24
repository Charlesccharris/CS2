import java.util.Scanner;

public class AssignmentTwo{
	public static void main(String[] args){
		//Design a class named Account
		//Under Programming Exercises 9.7, follow the direction found on page 363 of your text book.

		Scanner input = new Scanner(System.in);
		int newID = 0;
		double newBalance = 0;
		double withdrawAmount = 0;
		double depositAmount = 0;

		//Account One
		Account firstAccount = new Account();
		firstAccount.setID(2211);
		firstAccount.setBalance(50_000);
		firstAccount.setAnnualIR(4.5);

		System.out.println("ID: " + firstAccount.getID() + "\n" +
		"Balance: $" + firstAccount.getBalance() + "\n" +
		"Annual Interest Rate: %" + firstAccount.getAnnualIR() + "\n" +
		"Monthly Interest Rate: %" + firstAccount.getMonthlyInterestRate() + "\n" +
		"Monthly Interest: $" + firstAccount.getMonthlyInterest() + "\n" +
		"Date Created: " + firstAccount.getDateCreated());
		firstAccount.withdraw(2_500);
		firstAccount.deposit(3_000);
		System.out.println("Balance: $" + firstAccount.getBalance() + "\n" +
		"Monthly Interest: $" + firstAccount.getMonthlyInterest() + "\n");

		//Account Two
		Account secondAccount = new Account(1122, 20_000);
		secondAccount.setAnnualIR(4.5);
		System.out.println("ID: " + secondAccount.getID() + "\n" +
		"Balance: $" + secondAccount.getBalance() + "\n" +
		"Annual Interest Rate: %" + secondAccount.getAnnualIR() + "\n" +
		"Monthly Interest Rate: %" + secondAccount.getMonthlyInterestRate() + "\n" +
		"Monthly Interest: $" + secondAccount.getMonthlyInterest() + "\n" +
		"Date Created: $" + secondAccount.getDateCreated());

		System.out.print("Enter the amount you would like to withdraw: ");
		withdrawAmount = input.nextDouble();
		secondAccount.withdraw(withdrawAmount);

		System.out.print("Enter the amount you would like to deposit: ");
		depositAmount = input.nextDouble();
		secondAccount.deposit(depositAmount);
		System.out.println("Balance: $" + secondAccount.getBalance() + "\n" +
		"Monthly Interest: $" + secondAccount.getMonthlyInterest() + "\n");
	}
}
