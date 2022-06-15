package oopsconcept;

import java.util.Scanner;

/**
 * This program is for
 * get the value of multiplication and division
 * @author macbook
 */
class Number {

	int firstNumber;
	int secondNumber;

	// This method is for get value of variable
	public void getValue() {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter the value of first variable: ");
			firstNumber = scanner.nextInt(); // This is for get value for firstNumber

			System.out.println("Enter the value of second variable: ");
			secondNumber = scanner.nextInt(); // This is for get value for secondNumber
		} finally {
			scanner.close();
		}
	}

}

// Extends a Number class
class Multiplication extends Number {

	// This method is for multiplication of two number
	public void calculate() {
		int result = firstNumber * secondNumber;
		System.out.println("Multiplication of both number: " + result);
	}

}

// Extends a Number class
class Division extends Number {

	// This method is for division of two number
	public float calculate() {
		return ((float) firstNumber / secondNumber);
	}

}

// Extends a Division class
class Display extends Division {

	// This method is for display the result of division
	public void display() {
		System.out.println("Division of both number: " + calculate());
	}

}

public class Calculator {

	// This method is for use of Number, Multiplication, Division and Display classes
	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();
		multiplication.getValue();
		multiplication.calculate();
		Display display = new Display();
		display.getValue();
		display.calculate();
		display.display();
	}

}
