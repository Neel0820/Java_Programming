package oopsconcept;

import java.util.Scanner;

/**
 * This is program is for find the index of given element
 * @author macbook
 */
public class FindIndex {

	// This method is for find the index of element
	public static void main(String[] args) {
		int[] list = new int[10];

		System.out.println("Enetr the element of array: ");
		Scanner scanner = new Scanner(System.in);

		int element;

		try {
			for (int i = 0; i < 10; i++) {
				list[i] = scanner.nextInt(); // For get the value of list element
			}

			System.out.println("Enter element which index find: ");
			element = scanner.nextInt(); // For get the value of variable element
		} finally {
			scanner.close();
		}

		int flag = -1;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == element) {
				flag = i;
			}
		}
		if (flag >= 0 && flag < 10) {
			System.out.println("enterd element's index is " + flag);
		} else {
			System.out.println("enterd element is not contain in array.");
		}
	}

}
