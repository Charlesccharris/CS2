class Faculty extends Employee{
/*	---------------
		Faculty
	----------------
	officeHours: String
	rank: String
	--------------------
	Employee()
	toString(): String
	-------------------
*/

	private String officeHours;
	private String rank;

	public void setHours(String newHours){
		this.officeHours = newHours;
	}

	public void setRank(String newRank){
		this.rank = newRank;
	}

	@Override
	public String toString(String name){
		return super.toString() + "\nName: " + name +
			"\nOffice Hours: " + officeHours +
			"\nRank: " + rank;
	}
}
