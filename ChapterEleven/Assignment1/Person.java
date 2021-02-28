class Person{
/*	------------------------------------
			Person
	------------------------------------
	+name: String
	+nameOfClass: String
	+address: String
	+phoneNumber: String
	+emailAddress: String
	------------------------------------
	Person(newName: String, newAddress:
		String, newPhone: String,
		newEmail: String)
	+setName(newName: String): void
	+setAddress(newAddress:
		String): void
	+setPhone(newPhone: String): void
	+setEmail(newEmail: String): void
	+getName(): String
	+getAddress(): String
	+getPhone(): String
	+getEmail(): String
	+toString(): String
	------------------------------------
*/
	public String name;
	public String nameOfClass;
	public String address;
	public String phoneNumber;
	public String emailAddress;

	Person(String newName, String newClass,
		String newAddress, String newPhone,
		String newEmail){
		name = newName;
		address = newAddress;
		phoneNumber = newPhone;
		emailAddress = newEmail;
		nameOfClass = newClass;
	}

	public void setName(String newName){
		this.name = newName;
	}

	public void setAddress(String newAddress){
		this.address = newAddress;
	}

	public void setPhone(String newPhone){
		this.phoneNumber = newPhone;
	}

	public void setEmail(String newEmail){
		this.emailAddress = newEmail;
	}

	public String getName(){
		return this.name;
	}

	public String getAddress(){
		return this.address;
	}

	public String getPhone(){
		return this.phoneNumber;
	}

	public String getEmail(){
		return this.emailAddress;
	}

	public String toString(){
		return "\nName: " + name +
			"\nClass: " + nameOfClass +
			"\nAddress: " + address +
			"\nPhone Number: " + phoneNumber +
			"\nEmail Address: " + emailAddress;
	}
}
