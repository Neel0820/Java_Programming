package corejava;

/**
 * This program is for
 * multiplication of two numbers
 * @author macbook
 */
public class SetValue {

	static int firstNumber = 12;
	static int secondNumber;

	/*
	 * This static method is for
	 * get value of firstNumber and coefficientNumber
	 */
	static void display(int thirdNumber) {
		System.out.println("First number : " + firstNumber);
		System.out.println("Second number : " + secondNumber);
		System.out.println("Thied number : " + thirdNumber);
	}

	/*
	 * This static block is for
	 * find the value of secondNumber
	 */
	static {
		secondNumber = firstNumber + 2;
	}

	/*
	 * This main method is for uses of display method
	 */
	public static void main(String[] args) {
		display(23);
	}

}
