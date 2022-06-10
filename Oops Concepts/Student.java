package oopsconcept;

/**
 * This class is for get the data of student
 * @author macbook
 */
class GetData {

	private int rollNumber;
	private String name;
	private int age;

	// get method for rollNumber
	public int getRollNumber() {
		return rollNumber;
	}

	// set method for rollNumber
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	// get method for name
	public String getName() {
		return name;
	}

	// set method for name
	public void setName(String name) {
		this.name = name;
	}

	// get method for age
	public int getAge() {
		return age;
	}

	// set method for age
	public void setAge(int age) {
		this.age = age;
	}

}

public class Student {

	// This method is of uses for class GetData
	public static void main(String[] args) {

		GetData data = new GetData();

		// For set data
		data.setRollNumber(1);
		data.setName("Neel");
		data.setAge(21);

		System.out.println("Student name : " + data.getName());
		System.out.println("Student roll number: " + data.getRollNumber());
		System.out.println("Student age : " + data.getAge());
	}

}
