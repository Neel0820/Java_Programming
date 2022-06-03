package corejava;

/**
 * This program is for
 * print a pattern
 * @author macbook
 */
public class Pattern {

	/*
	 * This method is for
	 * print a pattern
	 * using for loop
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}// end of sub for loop
			System.out.println("");
		}// end of main for loop
	}

}
