package week10_Jun24_Jun30;

public class Student extends Human{
	
	public static void main(String[] args) {
		
		Student child = new Student();
		child.display();
	}
	
	public void essay() {
		
		System.out.println("This is Child Class essay.");
	}
	
	public void display() {
		
		essay(); // refers to Student (Child) Class essay method.  
		super.essay(); // refers to Human (Parent) Class essay method because of 'super' keyword
	}

}
