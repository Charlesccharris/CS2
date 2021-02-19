class Staff extends Employee{
//	Title
/*	-------------
		Staff
	-------------------
	title
	------------------
	setTitle
	toString()
	------------------
*/

	private String title;

	public void setTitle(String newTitle){
		this.title = newTitle;
	}

	public String toString(String info){
		info += "\nTitle: " + title;
		return info;
	}
}
