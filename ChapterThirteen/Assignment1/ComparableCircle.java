public class ComparableCircle extends Circle
	implements Comparable<ComparableCircle>{

/*	-----------------------------------------
		    ComparableCircle
	-----------------------------------------
	+ComparableCircle()
	+ComparableCircle(radius: double)
	+ComparableCircle(radius: double,
		color: String, filled: boolean)
	-----------------------------------------
*/
	public ComparableCircle(){
	}

	public ComparableCircle(double radius){
		super(radius);
	}

	public ComparableCircle(double radius, String color, boolean filled){
		super(radius, color, filled);
	}

	@Override
	public int compareTo(ComparableCircle o){
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString(){
		return super.toString() + " Area: " + getArea();
	}
}
