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
		try {
			System.out.println("Enter your choose: ");
			choise = scanner.nextInt(); // This variable is for switch case
		} finally {
			scanner.close();
		}

		switch (choise) {
			case 1: {
				System.out.println("Current month is January.");
				break;
			}
			case 2: {
				System.out.println("Current month is February.");
				break;
			}
			case 3: {
				System.out.println("Current month is March.");
				break;
			}
			case 4: {
				System.out.println("Current month is April.");
				break;
			}
			case 5: {
				System.out.println("Current month is May.");
				break;
			}
			case 6: {
				System.out.println("Current month is June.");
				break;
			}
			case 7: {
				System.out.println("Current month is July.");
				break;
			}
			case 8: {
				System.out.println("Current month is August.");
				break;
			}
			case 9: {
				System.out.println("Current month is September.");
				break;
			}
			case 10: {
				System.out.println("Current month is October.");
				break;
			}
			case 11: {
				System.out.println("Current month is November.");
				break;
			}
			case 12: {
				System.out.println("Current month is December.");
				break;
			}
			default:
				System.out.println("Entered choise " + choise + " is not valid.");
		}
	}

}
