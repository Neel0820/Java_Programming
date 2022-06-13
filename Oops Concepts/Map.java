package oopsconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * This program for
 * view data stored in map
 * @author macbook
 */
public class Map {

	/*
	 * This method is for
	 * print all data stored in map type of HashMap
	 * using iterator
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// For add data in map type of HashMap
		map.put(1, "Hello");
		map.put(2, "world");
		map.put(3, "Neel");

		// Use iterator method
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) { // While loop for print map
			Entry<Integer, String> entry = iterator.next();
			System.out.println("Map element: Key- " + entry.getKey() + " Value- " + entry.getValue());
		}
	}

}
