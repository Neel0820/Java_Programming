package oopsconcept;

/**
 * This program is for
 * calculate the area of rectangle and circle
 * @author macbook
 */
abstract class Area {

	/*
	 * This method is abstract method
	 * for override in child class
	 */
	abstract void findArea(double radius);
}

// Extends the Area class
class FindArea extends Area{

	/*
	 * This method is for find the area of circle.
	 * It's implement by extended class
	 */
	@Override
	public void findArea(double radius) {
		final double pi = 3.14;

		double area = (pi * radius * radius);
		System.out.println("Area of circle : " + area);
	}

	// This method is for find the area of rectangle
	public void findArea(double length, double width) {
		double area = (length * width);
		System.out.println("Area of rectangle : " + area);
	}

}

public class DisplayArea {

	// This is main method uses for findArea()
	public static void main(String[] args) {
		FindArea area = new FindArea();
		area.findArea(5);
		area.findArea(5, 7);
	}

}
