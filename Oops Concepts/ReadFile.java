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
	public static void main(String[] args) {
		try { // This try block is for handle FileNotFoundException 
			File Obj = new File("myTestFile.text");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		} catch (FileNotFoundException e) { // This catch is for handle exception throw by try block
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

}
