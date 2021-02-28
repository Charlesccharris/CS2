class Employee extends Person{
/*	--------------------------------------------
			   Employee
	--------------------------------------------
	-office: int
	-salary: double
	-dateHired: MyDate
	--------------------------------------------
	Employee(name: String, address: String,
		phone: String, email: String
		newOffice: int, newSalary: double)
	+setOffice(newOffice: int): void
	+setSalary(newSalary: double): void
	+setDateHired(): void
	+getOffice(): int
	+getSalary(): double
	+getDateHired(): String
	+toString(): String
	--------------------------------------------
*/
	private int office;
	private double salary;
	private MyDate dateHired;

	Employee(String name, String nameOfClass, String address, String phone,
		String email, int newOffice, double newSalary){
		super(name, nameOfClass, address, phone, email);
		this.office = newOffice;
		this.salary = newSalary;
		this.dateHired = new MyDate();
	}

	public void setOffice(int newOffice){
		this.office = newOffice;
	}

	public void setSalary(double newSalary){
		this.salary = newSalary;
	}

	public void setDateHired(){
		dateHired = new MyDate();
	}

	public int getOffice(){
		return office;
	}

	public String getSalary(){
		return String.format("%.2f", salary);
	}

	public String getDateHired(){
		return dateHired.getMonth() + "/" +
			dateHired.getDay() + "/" +
			dateHired.getYear();
	}

	@Override
	public String toString(){
		return super.toString() + "\nOffice: " + office +
				"\nSalary: $" + getSalary() +
				"\nDate hired: " + getDateHired();
	}
}
