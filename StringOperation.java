package corejava;

import java.util.Scanner;

/**
 * This program is for
 * perform all string method
 * @author macbook
 */
public class StringOperation {

	/*
	 * This method is for
	 * perform all string operation
	 * using string class
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String myString = sc.nextLine();// Get value of myString

		System.out.println("Enter string you concatenate with " + myString + " : ");
		String concatString = sc.nextLine();// Get value of concatString

		// This is for concatenate two string
		System.out.println("String after concatenate : " + myString.concat(concatString));

		// This is for compare two string
		System.out.println("After comparing Strings : " + myString.equals("Hello World"));

		// This is for check the character at particular position
		System.out.println("Enetr the position where you check the character : ");
		int position = sc.nextInt();// For get the value of position

		if (position <= myString.length() 
			&& position > 0) {
			System.out.println("Character at given " + position + " position : " + myString.charAt(position));
		}// end of main if part
		else {
			System.out.println("Entered position is out of rang");
		}// end of main else part

		//This is for check the end of string
		System.out.println("After check the of string : " + myString.endsWith("l"));
	}

}