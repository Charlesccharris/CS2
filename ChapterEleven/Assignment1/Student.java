class Student extends Person{
/*	-----------------------------------------
			  Student
	-----------------------------------------
	-status: int
	classStatus: String
	-----------------------------------------
	Student(name: String, address: String,
		phone: String, email: String,
		status: int)
	+setStatus(newStatus: String): void
	+getStatus(): String
	+toString(): String
	-----------------------------------------
*/
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;

	Student(String name, String nameOfClass, String address,
		String phone, String email, int status){
		super(name, nameOfClass, address, phone, email);
		this.status = status;
	}

	public void setStatus(int newStatus){
		this.status = newStatus;
	}

	public String getStatus(int status){
		switch(status){
			case 1: return "freshman";
			case 2: return "sophomore";
			case 3: return "junior";
			case 4: return "senior";
			default: return "That's not a grade";
		}
	}

	@Override
	public String toString(){
		return super.toString() + "\nClass Status: " + getStatus(status);
	}
}

