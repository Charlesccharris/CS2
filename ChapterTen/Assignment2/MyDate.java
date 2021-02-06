import java.util.GregorianCalendar;

class MyDate{
/*	--------------------------------
		     MyDate
	--------------------------------
	-year: int
	-month: int
	-day: int
	--------------------------------
	MyDate()
	MyDate(elapsedTime: long)
	MyDate(int year, int month,
	int day)
	getYear(): int
	getMonth: int
	getDay: int
	setDate(elapsedTime: long): void
	--------------------------------
*/
	private int year;
	private int month;
	private int day;

	MyDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}

	MyDate(long time){
		setDate(time);
	}

	MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear(){
		return this.year;
	}

	public int getMonth(){
		return this.month;
	}

	public int getDay(){
		return this.day;
	}

	public void setDate(long elapsedTime){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
}
