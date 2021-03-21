class Assignment1{
	public static void main(String[] args){
/*		(The ComparableCircle class)
		Define a class named ComparableCircle
		that extends Circle and implements Comparable.

		Draw the UML diagram and implement the compareTo
		method to compare the circles on the basis of area.

		Write a test class to find the larger of two
		instances of ComparableCircle objects.
*/

		ComparableCircle circle1 = new ComparableCircle(14.5);
		ComparableCircle circle2 = new ComparableCircle(10.7);

		System.out.println("Circle 1: " + circle1);
		System.out.println("\nCircle 2: " + circle2);

		System.out.println("\n" + (circle1.compareTo(circle2) == 1
			? "Circle 1" : "Circle 2") +
			" is the larger of the two circles.");
	}
}
