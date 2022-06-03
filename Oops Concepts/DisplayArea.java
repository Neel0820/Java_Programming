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
	abstract void findarea(double radius);
}

// extends the Area class
class FindArea extends Area{

	/*
	 * This method is for find the area of circle
	 * It's implement by extended class
	 */
	@Override
	public void findarea(double radius) {
		final double pi = 3.14;

		double area = (pi * radius * radius);
		System.out.println("Area of circle : " + area);
	}

	/*
	 * This method is for find the area of rectangle
	 */
	public void findarea(double length, double width) {
		double area = (length * width);
		System.out.println("Area of rectangle : " + area);
	}

}

public class DisplayArea {

	/*
	 * This is main method uses for findarea()
	 */
	public static void main(String[] args) {
		FindArea area = new FindArea();
		area.findarea(5);
		area.findarea(5, 7);
	}

}
