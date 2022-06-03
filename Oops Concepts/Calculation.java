package oopsconcept;

import java.util.Scanner;

/**
 * This is abstract class for declare abstract method
 * @author macbook
 */
abstract class Method {

	int firstNumber;
	int secondNumber;

	//This is abstract method
	abstract void calculate();

	/*
	 * This method is for get value of variable
	 */
	public void getValue() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of first variable : ");
		firstNumber = scanner.nextInt();// this is for get value for firstNumber
		System.out.println("Enter the value of second variable : ");
		secondNumber = scanner.nextInt();// this is for get value for secondNumber
	}

}

// extends the Method class
class Addition extends Method {

	/*
	 * This method is implemented by parent class
	 * for addition of two number
	 */
	@Override
	void calculate() {
		int result = firstNumber + secondNumber;
		System.out.println("Addition of both number : " + result);
	}

}

class Subtraction extends Method {

	/*
	 * This method is implemented by parent class
	 * for Subtraction of two number
	 */
	@Override
	void calculate() {
		int result = firstNumber - secondNumber;
		System.out.println("Subtraction of both number : " + result);
	}

}

public class Calculation {

	/*
	 * This method is of uses for calculate 
	 */
	public static void main(String[] args) {
		Method addition = new Addition();
		addition.getValue();
		addition.calculate();
		Method subtraction = new Subtraction();
		subtraction.getValue();
		subtraction.calculate();
	}

}
