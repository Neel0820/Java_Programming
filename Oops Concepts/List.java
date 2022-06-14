package oopsconcept;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This program is for
 * view data stored in list
 * @author macbook
 */
public class List {

	/*
	 * This method is for
	 * print all data stored in list
	 * using iterator
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// For add data in list
		list.add("Hello");
		list.add("world");
		list.add("Neel");

		// Use iterator method
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println("List element: " + iterator.next());
		}
	}

}
