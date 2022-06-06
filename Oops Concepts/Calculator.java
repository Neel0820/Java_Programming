package oopsconcept;

import java.util.Scanner;

/**
 * This class is for get the value using scanner
 * @author macbook
 */
class Number {

	int firstNumber;
	int secondNumber;

	// This method is for get value of variable
	@SuppressWarnings("resource")
	public void getValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of first variable : ");
		firstNumber = scanner.nextInt();// this is for get value for firstNumber
		System.out.println("Enter the value of second variable : ");
		secondNumber = scanner.nextInt();// this is for get value for secondNumber
	}

}

// Extends the Number class
class Multipliction extends Number {

	/*
	 * This method is implemented by parent class
	 * for addition of two number
	 */
	public void calculate() {
		int result = firstNumber * secondNumber;
		System.out.println("Multipliction of both number : " + result);
	}

}

// Extends the Number class
class Division extends Number {

	/*
	 * This method is implemented by parent class
	 * for Subtraction of two number
	 */
	public float calculate() {
		return ((float) firstNumber / secondNumber);
	}

}

// Extends the Division class
class Display extends Division {

	// This method is for display the result of division
	public void display() {
		System.out.println("Division of both number : " + calculate());
	}

}

public class Calculator {

	// This method is of uses for calculate
	public static void main(String[] args) {
		Multipliction multiplication = new Multipliction();
		multiplication.getValue();
		multiplication.calculate();
		Display display = new Display();
		display.getValue();
		display.calculate();
		display.display();
	}

}
