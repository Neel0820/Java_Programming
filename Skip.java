package corejava;

/**
 * This program is for
 * print 1 to 10 number
 * and skip any one after 7
 * @author macbook
 */
public class Skip {

	/*
	 * This method is for
	 * print 1 to 10 number
	 * and skip any one after 7
	 * using continue
	 */
	public static void main(String[] args) {
		 for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				continue;
			}
			System.out.println(+ i);
		}
	}

}
