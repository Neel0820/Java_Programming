package corejava;

/**
 * This program implement an application
 * to find the age
 * using if / else
 * @author macbook
 */
public class FindAge {

	/*
	 * This method is for find the age
	 * Here one @param for define age
	 */
	public void findAge(int age) {
		int ageLimit = 50;

		if (age > ageLimit) { // If for (age > ageLimit)
			System.out.println("Your are older");
		} else { // Else for main if
			System.out.println("Your are younger");
		}
	}

	// This is the main method uses of findAge(int) method.
	public static void main(String[] args) {
		FindAge findage = new FindAge();
		findage.findAge(23);
	}

}
