class Student extends Person{
/*	---------------------
		Student
	---------------------
	classStatus: String
	---------------------
	Student();
	toString(): String
	---------------------
*/
	private String status;

	public void setStatus(String newStatus){
		this.status = newStatus;
	}

	public String toString(String info){
		info += "\nClass Status: " + status;
		return info;
	}
}
