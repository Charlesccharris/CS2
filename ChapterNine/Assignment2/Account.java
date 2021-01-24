import java.util.Date;

class Account{
/*	---------------------------------------
			Account
	---------------------------------------
	-id: int
	-balance: double
	-annualInterestRate: double
	-monthlyInterestRate: double
	-dateCreated: string
	---------------------------------------
	Account()
	Account(newID: int,
	initialBalance: double)
	setID(newID: int): void
	setBalance(newBalance: double): void
	setAnnualIR(newAnnualIR: double): void
	getID(): int
	getBalance(): double
	getAnnualIR(): double
	getDateCreated(): String
	getMonthyInterestRate(): double
	getMonthlyInterest(): double
	withdraw(withdraw: double): void
	deposit(deposit: double): void
	---------------------------------------
	*/
	java.util.Date date = new java.util.Date();

	private int id;
	private double balance;
	private double annualInterestRate;
	private double monthlyInterestRate;
	private String dateCreated = date.toString();

	Account(){
	}

	Account(int newID , double initialBalance){
		this.id = newID;
		this.balance = initialBalance;
	}

	public void setID(int newID){
		this.id = newID;
	}

	public void setBalance(double newBalance){
		this.balance = newBalance;
	}

	public void setAnnualIR(double newAnnualIR){
		newAnnualIR = newAnnualIR / 100;
		this.annualInterestRate = newAnnualIR;
	}

	public int getID(){
		return this.id;
	}

	public double getBalance(){
		return this.balance;
	}

	public double getAnnualIR(){
		return this.annualInterestRate*100;
	}

	public String getDateCreated(){
		return this.dateCreated;
	}

	public double getMonthlyInterestRate(){
		this.monthlyInterestRate = this.annualInterestRate/12;
		return this.monthlyInterestRate*100;
	}

	public double getMonthlyInterest(){
		double monthlyInterest = this.monthlyInterestRate * this.balance;
		return monthlyInterest;
	}

	public void withdraw(double withdraw){
		this.balance = this.balance - withdraw;
	}

	public void deposit(double deposit){
		this.balance = this.balance + deposit;
	}
}
