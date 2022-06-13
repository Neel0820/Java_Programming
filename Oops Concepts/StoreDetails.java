package oopsconcept;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * This program is for
 * store details in text file
 * @author macbook
 */
public class StoreDetails {

	/*
	 * This method is for
	 * create text file and
	 * add details
	 */
	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter("myTestFile.text");

		try {
			writer.println("Name: Neel Bhanderi");
			writer.println("Date Of Birth: 09 Aug, 2000");
			writer.println("Contact Number: +91 9081223547 / +91 9106827909");
			writer.println("Address: Surat");
		} finally {
			writer.close();
		}

		System.out.println ("File is created successfully with the content.");
	}

}
