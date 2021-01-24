class Rectangle{
/*	-----------------------------
		  Rectangle
	-----------------------------
	width:double
	height:double
	-----------------------------
	Rectangle()
	Rectangle(newWidth: double,
	newHeight: double);
	getArea(): double
	getPerimeter() double
	-----------------------------
*/

	double width;
	double height;

	//No-arg constructor
	Rectangle(){
		width = 1;
		height = 1;
	}

	//Constructor with specific width and height
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}

	//Returns area
	double getArea(){
		double area;
		area = width*height;
		return area;
	}

	//Returns perimeter
	double getPerimeter(){
		double perimeter;
		perimeter = width+width+height+height;
		return perimeter;
	}
}
