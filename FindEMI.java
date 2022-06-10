package corejava;

import java.util.Scanner;

/**
 * This program for
 * find the EMI
 * @author macbook
 */
public class FindEMI {

	/*
	 * This method is for
	 * calculate EMI
	 */
	public static void main(String[] args) {

		double principalAmount;
		float rate;
		int time;

		Scanner scanner = new Scanner(System.in);

		try { // This try block is for handle exception
			System.out.println("Enter principal amount : ");
			principalAmount = scanner.nextInt(); // Get input for principalAmount

			System.out.println("Enter rate of intrest : ");
			rate = scanner.nextFloat(); // Get input for rate

			System.out.println("Enter number of monthly instalments : ");
			time = scanner.nextInt(); // Get input for time
		} finally { // This finally block Handle finally clause
			scanner.close();
		}

		rate = rate / (12 * 100); // For find rate of interest per annum

		time = time * 12; // For find time in year

		// For EMI calculation
		double emi = (double) (principalAmount * rate * Math.pow (1 + rate, time) ) / (Math.pow (1 + rate, time) - 1);

		System.out.println("EMI is : " + emi);
	}

}
