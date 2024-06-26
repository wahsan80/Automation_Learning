package week10_Jun24_Jun30;

public class Test_Encapsulation extends Encapsulation_Concept{
	
	public static void main(String[] args) {
		
		Encapsulation_Concept ec = new Encapsulation_Concept();
		ec.SetName("Farhan");
		ec.setAge(30);
		
		System.out.println(ec.getName());
		System.out.println(ec.getAge());
	}

}
