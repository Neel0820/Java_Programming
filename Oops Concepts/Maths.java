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
		int val1, val2;
		
		//this block will contain statements that may raise exceptions
		try {
			val1 = 0;
			val2 = 25 / val1;
			System.out.println(val2);
		}
		//handler for ArithmeticException
		catch (ArithmeticException e) { 
			System.out.println("ArithmeticException ::Can't divide by Zero!!");
		}
	}

}
