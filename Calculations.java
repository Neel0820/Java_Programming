package corejava;

/**
 * This program is for
 * find sum of two numbers
 * @author macbook
 */
public class Calculations {

	int firstNumber = 32;
	int secondNumber = 12;

	/*
	 * This method is for
	 * Find subtraction of two numbers
	 * using constructor
	 */
	public Calculations() {
		// This variable is for store the value of subtraction of both number
		int subtraction = firstNumber - secondNumber;
		System.out.println("Subtraction of both number is: " + subtraction);
	}

	/*
	 * This method is for
	 * find addition of two numbers
	 * using parameterized constructor
	 */
	public Calculations(int firstNumber, int secondNumber) {
		// This variable is for store the value of sum of both numbers
		int addition = firstNumber + secondNumber;
		System.out.println("Addition of both number is: " + addition);
	}

	// This main method is for use of constructor method.
	public static void main(String[] args) {
		new Calculations(20, 12);
	}

}
