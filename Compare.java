package corejava;

import java.util.Scanner;

/**
 * This practical for
 * compare two value 
 * @author macbook
 */
public class Compare {

	/*
	 * This method is for
	 * compare two wrapper class value
	 * using wrapper classes
	 */
	public static void main(String[] args) {
		Integer firstNumber;
		Integer secondNumber;

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter value of first number: ");
			firstNumber = scanner.nextInt(); // Get input for firstNumber

			System.out.println("Enter value of second number: ");
			secondNumber = scanner.nextInt(); // Get input for secondNumber
		} finally {
			scanner.close();
		}

		if (firstNumber.equals(secondNumber)) {
			System.out.println("Given numbers are equal.");
		} else {
			System.out.println("Given numbers are different.");
		}
	}

}
