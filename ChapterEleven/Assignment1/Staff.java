class Staff extends Employee{
/*	--------------------------------------
			Staff
	--------------------------------------
	-title: String
	--------------------------------------
	Staff(name: String, address: String,
		phone: String, email: String,
		office: int, salary: double,
		title: String)
	+setTitle(newTitle: String): void
	+getTitle(): String
	+toString(): String
	--------------------------------------
*/

	private String title;

	Staff(String name, String nameOfClass,  String address, String phone,
		String email, int office, double salary, String title){
		super(name, nameOfClass, address, phone, email, office, salary);
		this.title = title;
	}

	public void setTitle(String newTitle){
		this.title = newTitle;
	}

	public String getTitle(){
		return title;
	}

	@Override
	public String toString(){
		return super.toString() + "\nTitle: " + title;
	}
}
