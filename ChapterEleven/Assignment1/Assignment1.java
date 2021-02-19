class Assignment1{
	public static void main(String[] args){
/*		Design a class named Pearson
		and its two sub classes named
		Student and Employee.

		Make Faculty and Staff sub classes of Employee.

		Under programming Exercises 11.2,
		follow the direction found on page 447 of your text book.
*/
		String info ="";

		Person Generic = new Person("Bob", "123 W Road", "(555)-555-5555", "Bob@hotmail.com");
		Faculty joeBob = new Faculty();
		joeBob.setName("Joe Bob");
		joeBob.setAddress("333 W East Rd.");
		joeBob.setPhone("(444)-444-4444");
		joeBob.setEmail("J0eB0b@email.net");
//		joeBob.setStatus("Freshman");
//		joeBob.setTitle("Janitor");
		joeBob.setHours("9-5");
		joeBob.setRank("Senior");
		info = joeBob.toString(info);

		System.out.println(info);

	}
}
