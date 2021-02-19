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

	public String toString(String info){
		info = "\nOffice Hours: " + officeHours +
			"\nRank: " + rank;
		return info;
	}
}
