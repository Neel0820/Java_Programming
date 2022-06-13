package oopsconcept;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * This program is for
 * remove duplicate value from list
 * @author macbook
 */
public class RemoveDuplicate {

	/*
	 * This method is for
	 * remove duplicate value from list type of ArrayList
	 * and print list after shorting
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// For add value in list
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("E");

		System.out.println("All value in list: " + list);

		// For remove duplicate value
		list = (ArrayList<String>) list.stream().distinct().collect(Collectors.toList());

		System.out.println("List after duplicate value removal: " + list);
	}

}
