package testing_Code_Mar14;

import org.testng.annotations.Test;

public class Test_Priority {
	
	//Sets a priority among all the test cases for execution. 
	
	@Test (priority = 2)
	public void tc1() {
		
		System.out.println("Test Case 1 has priority 2.");
	}
	
	@Test (priority = 3)
	public void tc2() {
		
		System.out.println("Test Case 2 has priority 3.");
	}
	
	@Test (priority = 1) 
	public void tc3() {
		
		System.out.println("Test Case 3 has priority 1.");
	}
	
	@Test (priority = 5)
	public void tc4() {
		
		System.out.println("Test Case 4 has priority 5.");
	}
	
	@Test (priority = 5)
	public void tc5() {
		
		System.out.println("Test Case 5 has priority 4.");
	}

}
