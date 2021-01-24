public class AssignmentOne{
	public static void main(String[] args){
		//Design a class named Rectangle to represent a rectangle.
		Rectangle RectOne = new Rectangle();
		Rectangle RectTwo = new Rectangle(4, 40);
		Rectangle RectThree = new Rectangle(3.5, 35.9);

		System.out.println("For Rectangle One");
		System.out.println("Width: " + RectOne.width +"\n"+
		"Height: " + RectOne.height + "\n" + "Area: " + RectOne.getArea() + "\n" +
		"Perimeter: " + RectOne.getPerimeter() + "\n");

		System.out.println("For Rectangle Two");
		System.out.println("Width: " + RectTwo.width +"\n"+
		"Height: " + RectTwo.height + "\n" + "Area: " + RectTwo.getArea() + "\n" +
		"Perimeter: " + RectTwo.getPerimeter() + "\n");

		System.out.println("For Rectangle Three");
		System.out.println("Width: " + RectThree.width +"\n"+
		"Height: " + RectThree.height + "\n" + "Area: " + RectThree.getArea() + "\n" +
		"Perimeter: " + RectThree.getPerimeter());
	}
}
