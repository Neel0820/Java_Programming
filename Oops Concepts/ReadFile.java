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

		try {
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
			}
		} finally {
			System.out.println("An error has occurred.");
			scanner.close();
		}
	}

}
