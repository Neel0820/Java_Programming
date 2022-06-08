package oopsconcept;

import java.util.HashSet;
import java.util.Iterator;

/**
 * This program for
 * view data stored in list
 * @author macbook
 */
public class Set {

	/*
	 * This method is for
	 * print all data stored in set type of HashSet
	 * using iterator
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		// For add data in set type of HashSet
		set.add("Hello");
		set.add("world");
		set.add("Neel");

		// Use iterator method for print set
		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) { // While loop for print all element of set
			System.out.println("Set element : " + iterator.next());
		}
	}

}
