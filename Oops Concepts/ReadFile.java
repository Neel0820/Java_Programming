package oopsconcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This program is for
 * read data from file
 * @author macbook
 */
public class ReadFile {

	/*
	 * This method is for
	 * read data from file
	 * using scanner class
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File Obj = new File("myTestFile.text");
		Scanner scanner = new Scanner(Obj);

		try { // This try block is for handle FileNotFoundException
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
			}
		} finally { // This catch is for handle exception throw by try block
			System.out.println("An error has occurred.");
			scanner.close();
		}
	}

}
