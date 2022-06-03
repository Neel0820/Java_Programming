package corejava;

import java.util.Scanner;

/**
 * This practical for
 * compare two value 
 * @author macbook
 */
public class CompareNumbers {

	/*
	 * This method is for
	 * compare two wrapper class value
	 * using wrapper classes
	 */
	public static void main(String[] args) {
		Integer firstNumber;
		Integer secondNumber;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of first number : ");
		firstNumber = sc.nextInt();// get input for firstNumber

		System.out.println("Enter value of second number : ");
		secondNumber = sc.nextInt();// get input for secondNumber

		sc.close();

		if (firstNumber.equals(secondNumber)) {
			System.out.println("Given numbers are equal ");
		}// end main if
		else {
			System.out.println("Given numbers are different");
		}// end main else
	}

}
