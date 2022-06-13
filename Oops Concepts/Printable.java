package oopsconcept;

/**
 * This program is for
 * find the area of triangle
 * with interface
 * @author macbook
 */
interface Triangle {

	// This is abstract method define in interface
	void fingArea(double height, double base);

}

class AreaOfTriangle implements Triangle {

	/*
	 * This method is for
	 * find the area of triangle
	 */
	public void fingArea(double height, double base) {
		double area = ((height * base) / 2);
		System.out.println("Area of given triangle: " + area);
	}

}

public class Printable {

	/*
	 * This is main method for use of findArea()
	 * declare in class AreaOfTringle
	 */
	public static void main(String args[]){
		AreaOfTriangle area = new AreaOfTriangle();
		area.fingArea(5, 7);
	}

}
