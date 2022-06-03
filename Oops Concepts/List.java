package oopsconcept;

import java.util.ArrayList;

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

		// for add data in list
		list.add("Hello");
		list.add("world");
		list.add("Neel");

		System.out.println("List element : " + list);
	}

}
