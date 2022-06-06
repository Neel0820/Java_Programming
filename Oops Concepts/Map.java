package oopsconcept;

import java.util.HashMap;

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

		System.out.println("Data in map : " + map);
	}

}
