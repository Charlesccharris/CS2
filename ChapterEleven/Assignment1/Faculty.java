class Faculty extends Employee{
/*	--------------------------------------------
			    Faculty
	--------------------------------------------
	-officeHours: String
	-rank: String
	--------------------------------------------
	Employee(name: String, address: String,
		phone: String, email: String,
		office: int, salary: double,
		newHours: String, newRank: String)
	+setHours(newHours: String): void
	+setRank(newRank: String): void
	+getHours(): String
	+getRank(): String
	+toString(): String
	--------------------------------------------
*/

	private String officeHours;
	private String rank;

	Faculty(String name, String nameOfClass, String address, String phone,
		String email, int office, double salary,
		String newHours, String newRank){
		super(name, nameOfClass, address, phone, email, office, salary);
		this.officeHours = newHours;
		this.rank = newRank;
	}
	public void setHours(String newHours){
		this.officeHours = newHours;
	}

	public void setRank(String newRank){
		this.rank = newRank;
	}

	public String getHours(){
		return officeHours;
	}

	public String getRank(){
		return rank;
	}

	@Override
	public String toString(){
		return super.toString() + "\nOffice Hours: " + officeHours +
			"\nRank: " + rank;
	}
}
