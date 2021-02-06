class Assignment10_14{
	public static void main(String[] args){
		MyDate date = new MyDate();
		MyDate dateTwo = new MyDate(34355555133101L);
		MyDate dateThree = new MyDate(561555550000L);

		int year;
		int month;
		int day;
		String monthName;

		int yearTwo;
		int monthTwo;
		int dayTwo;
		String monthNameTwo;

		int yearThree;
		int monthThree;
		int dayThree;
		String monthNameThree;

		year = date.getYear();
		month = date.getMonth();
		day = date.getDay();
		monthName = getMonthName(month);
		System.out.println(monthName + " " + day + ", " + year);

		yearTwo = dateTwo.getYear();
		monthTwo = dateTwo.getMonth();
		dayTwo = dateTwo.getDay();
		monthNameTwo = getMonthName(monthTwo);
		System.out.println(monthNameTwo + " " + dayTwo + ", " + yearTwo);

		yearThree = dateThree.getYear();
		monthThree = dateThree.getMonth();
		dayThree = dateThree.getDay();
		monthNameThree = getMonthName(monthThree);
		System.out.println(monthNameThree + " " + dayThree + ", " + yearThree);

	}

	public static String getMonthName(int month){
		String monthName = "";
		switch(month){
			case 0: monthName = "January"; break;
			case 1: monthName = "February"; break;
			case 2: monthName = "March"; break;
			case 3:	monthName = "April"; break;
			case 4: monthName = "May"; break;
			case 5: monthName = "June"; break;
			case 6: monthName = "July"; break;
			case 7: monthName = "August"; break;
			case 8: monthName = "September"; break;
			case 9: monthName = "October"; break;
			case 10: monthName = "November"; break;
			case 11: monthName = "December"; break;
		}
		return monthName;
	}
}
