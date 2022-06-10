package corejava;

/**
 * This program is for
 * addition of two numbers 
 * @author macbook
 */
public class Addition {

	int firstNumber;
	int secondNumber;

	/*
	 * This method is for
	 * addition of two numbers
	 * using this or super
	 */
	public void addition(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;

		int addition = firstNumber + secondNumber;
		System.out.println("Addition of this numbers : " + addition);
	}

	// This main method is for uses of constructor
	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.addition(12, 15);
	}

}
