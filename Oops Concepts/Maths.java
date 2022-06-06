package oopsconcept;

/**
 * This method is for
 * handle exception if create
 * @author macbook
 *
 */
public class Maths {

	/*
	 * This method is trying to
	 * divide any number by zero
	 */
	public static void main(String args[]) {
		// This block will contain statements that may raise exceptions
		try {
			int value1 = 0;
			int value2 = 25 / value1;
			System.out.println(value2);
		} catch (ArithmeticException e) { // Handler for ArithmeticException
			System.out.println("ArithmeticException ::Can't divide by Zero!!");
		}
	}

}
