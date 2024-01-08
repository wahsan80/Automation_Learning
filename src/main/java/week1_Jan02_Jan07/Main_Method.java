package week1_Jan02_Jan07;

public class Main_Method {

	public static void main (String[] args){

		System.out.println("Learning Main method.");
		
		test(); // This ensures that test method gets called and his statements gets executed. 
	}

	public static void test(){
	
		System.out.println("See if this gets printed."); 
		//Method test doesn't get called first time by the main method so not printed. 
	}

}
