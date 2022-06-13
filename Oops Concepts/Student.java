package oopsconcept;

/**
 * This class is for get the data of student
 * @author macbook
 */
class GetData {

	private int rollNumber;
	private String name;
	private int age;

	// getter method for rollNumber
	public int getRollNumber() {
		return rollNumber;
	}

	// setter method for rollNumber
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	// getter method for name
	public String getName() {
		return name;
	}

	// setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// getter method for age
	public int getAge() {
		return age;
	}

	// setter method for age
	public void setAge(int age) {
		this.age = age;
	}

}

public class Student {

	// This method is for use of class GetData
	public static void main(String[] args) {
		GetData data = new GetData();

		// For set data
		data.setRollNumber(1);
		data.setName("Neel");
		data.setAge(21);

		System.out.println("Student name: " + data.getName());
		System.out.println("Student roll number: " + data.getRollNumber());
		System.out.println("Student age: " + data.getAge());
	}

}
