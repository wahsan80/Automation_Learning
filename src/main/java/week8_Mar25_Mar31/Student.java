package week8_Mar25_Mar31;

public class Student {
	
	String name;
	int student_id;
	int age;
	
	/*
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Selenium";
		s1.student_id = 100;
		s1.age = 10;
		
		Student s2 = new Student();
		s2.name = "Panda";
		s2.student_id = 101;
		s2.age = 11;
	
		Student s3 = new Student();
		s3.name = "Java";
		s3.student_id = 102;
		s3.age = 12;
	}	
	*/
	public Student() { // Need to create the corresponding Constructor as per arguments
		
		System.out.println("Testing.");
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Selenium", 100, 10);
		Student s2 = new Student("Panda", 101, 11);
		Student s3 = new Student("Java", 102, 12);
		Student s4 = new Student();
	}
	
	public Student(String name, int student_id, int age) { 
		// Need to create the corresponding Constructor as per arguments
		
		this.name = name; 
		this.student_id = student_id;
		this.age = age;
		
		//System.out.println(name);
		//System.out.println(student_id);
		//System.out.println(age);
		//System.out.println("===============");
		System.out.println(this.name);
		System.out.println(this.student_id);
		System.out.println(this.age);
		System.out.println("===============");
		
	}
}
