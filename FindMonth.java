package corejava;

import java.util.Scanner;

/**
 * This program implement an application
 * to find the Month
 * @author macbook
 */
public class FindMonth {

	/*
	 * This method is for find Month
	 * depend on entered number
	 * using Switch case
	 */
	public static void main(String[] args) {
		System.out.println("For January press 1,\nFor February press 2,\nFor March press 3,"
				+ "\nFor April press 4,\nFor May press 5,\nFor June press 6,\nFor July press 7,"
				+ "\nFor August press 8,\nFor September press 9,\nFor October press 10,"
				+ "\nFor November press 11,\nFor December press 12.\n");

		int choise;
		Scanner scanner = new Scanner(System.in);
		try { // This try block is for handle exception
			System.out.println("Enter your choose : ");
			choise = scanner.nextInt();// This variable is for switch case
		} finally { // This finally block Handle finally clause
			scanner.close();
		}

		switch (choise) {
			case 1: {
				System.out.println("Current month is January.");
				break;
			} // End of case 1
			case 2: {
				System.out.println("Current month is February.");
				break;
			} // End of case 2
			case 3: {
				System.out.println("Current month is March.");
				break;
			} // End of case 3
			case 4: {
				System.out.println("Current month is April.");
				break;
			} // End of case 4
			case 5: {
				System.out.println("Current month is May.");
				break;
			} // End of case 5
			case 6: {
				System.out.println("Current month is June.");
				break;
			} // End of case 6
			case 7: {
				System.out.println("Current month is July.");
				break;
			} // End of case 7
			case 8: {
				System.out.println("Current month is August.");
				break;
			} // End of case 8
			case 9: {
				System.out.println("Current month is September.");
				break;
			} // End of case 9
			case 10: {
				System.out.println("Current month is October.");
				break;
			} // End of case 10
			case 11: {
				System.out.println("Current month is November.");
				break;
			} // End of case 11
			case 12: {
				System.out.println("Current month is December.");
				break;
			} // End of case 12
			default:
				System.out.println("Entered choise " + choise + " is not valid.");
		}
	}

}
