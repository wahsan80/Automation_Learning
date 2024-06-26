package week10_Jun24_Jun30;

public class Encapsulation_Concept {
	
	// Encapsulation: It's a mechanism to store variables and methods of a Class together
	// Objective: It is done in a secure environment where the members are accessible by the members of same
	// Class
	
	// Declare the instance variables as Private
	// Setter and Getter methods in Java - Encapsulation
	
	private String name;
	private int age;
	
	public int getAge() {
		
		return age;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void SetName(String newName) {
		
		name = newName;
	}
	
	public void setAge(int newAge) {
		
		age = newAge;
	}

}
