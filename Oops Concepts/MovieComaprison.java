package oopsconcept;

import java.util.*;

/**
 * This program is for
 * compare movie data stored in list
 * using comparable and comparator
 * @author macbook
 *
 */
class Movie implements Comparable<Movie> {

	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie movie) {
		return this.year - movie.year;
	}

	// Constructor
	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}

}

//Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie> {

	public int compare(Movie movie1, Movie movie2) {
		if (movie1.getRating() < movie2.getRating()) {
			return -1;
		}
		if (movie1.getRating() > movie2.getRating()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}

//Class to compare Movies by name
class NameCompare implements Comparator<Movie> {

	public int compare(Movie movie1, Movie movie2) {
		return movie1.getName().compareTo(movie2.getName());
	}

}

public class MovieComaprison {

	/*
	 * This main method is for
	 * sort data using compare
	 * declare in NameCompare() and RatingCompare()
	 */
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		
		// For add data about movie in list
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		// In this section use sort method to Sort by rating
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);

		for (Movie movie: list) {
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());			
		}

		// In this section use sort method to Sort by name
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);

		for (Movie movie: list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

		// In this section use Comparable to sort by year
		System.out.println("\nSorted by year");
		Collections.sort(list);

		for (Movie movie: list) {
			System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName()+" ");
		}
	}

}
