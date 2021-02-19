class Person{
/*	--------------------
		Person
	-------------------
	name
	address
	phoneNumber
	emailAddress
	-------------------
	Person()
	ToString()
	-------------------
*/
	public String name;
	public String address;
	public String phoneNumber;
	public String emailAddress;

	Person(){

	}
	Person(String newName, String newAddress,
		String newPN, String newEMA){
		name = newName;
		address = newAddress;
		phoneNumber = newPN;
		emailAddress = newEMA;
	}

	public void setName(String newName){
		name = newName;
	}

	public void setAddress(String newAddress){
		address = newAddress;
	}

	public void setPhone(String newPhone){
		phoneNumber = newPhone;
	}

	public void setEmail(String newEmail){
		emailAddress = newEmail;
	}

	public String toString(String info){
		info += name + "\n" + address + "\n" + phoneNumber + "\n" + emailAddress;
		return info;
	}
}
