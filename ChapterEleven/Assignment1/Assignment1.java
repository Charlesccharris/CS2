class Assignment1{
	public static void main(String[] args){
/*		Design a class named Person and its two sub classes named
			Student and Employee.

		Make Faculty and Staff sub classes of Employee.

		A person has a name, address, phone number, and email address.
		A student has a class status (freshman, sophomore, junior, senior).
		Define the status as a constant.

		An employee has an office, salary, and date hired.
		Use the MyDate class defined in Programming Exercise 10.14
			to create an object for date hired.

		A faculty member has office hours and a rank.

		A staff member has a title.

		Override the toString method in each class to display the class name and the person's name.
*/
		String info ="";

		Person Generic = new Person("Bob", "123 W Road", "(555)-555-5555", "Bob@hotmail.com");
		Student Jim = new Student("Jim Beam", "3466 Well Dr.", "(208)-555-2342", "JB@mail.eu", 1);
		Employee Suzan = new Employee("Suzan Anthony", "65432 Road Ave", "(123)-456-7890", "SuZNa@mail.gov",
				234, 3920);
		Faculty Joe = new Faculty("Joe Bob", "8939 W North Rd", "(302)-352-2446", "JoBo@umail.ru.jp",
				294, 49204, "11AM - 4PM", "Professor");
		Staff Phil = new Staff("Phill conners", "1234 Generic Rd", "(987)-654-3210", "PC@Email.net", 123,
			29303, "Assistant Principal");

		System.out.println(Generic.toString());
		System.out.println(Jim.toString());
		System.out.println(Suzan.toString());
		System.out.println(Joe.toString());
		System.out.println(Phil.toString());
	}
}
