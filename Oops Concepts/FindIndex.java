package oopsconcept;

import java.util.Scanner;

/**
 * This is program is for find the index of given element
 * @author macbook
 */
public class FindIndex {

	// This main method is for uses of findIndex() method
	public static void main(String[] args) {
		int[] list = new int[10];

		System.out.println("Enetr the element of array : ");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			list[i] = scanner.nextInt();
		}

		System.out.println("Enter element which index find : ");
		int element = scanner.nextInt();

		scanner.close();

		int flag = -1;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == element) { // If part for compare the value of entered element
				flag = i;
			}
		}
		if (flag >= 0 && flag < 10) { // If for check the value of flag
			System.out.println("enterd element's index is " + flag);
		}else { // Else for main if
			System.out.println("enterd element is not contain in array.");
		}
	}

}
