package testing_Code_Mar14;

import org.testng.annotations.Test;

public class Enabled_Operations {
	
	// Sets a priority among all the test cases.
	// To enable or disable a test case in testng, an attribute called 'enabled' is passed which is a boolean 
	// attribute where when the value is: true – test case will be executed. false – test case will not be 
	// executed.
	
	@Test (priority = 2, enabled = true)
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
	
	@Test (priority = 5, enabled = false)
	public void tc4() {
		
		// Sometimes, it happens that our code is not ready and the test case written to test that method/code 
		// fails. In such cases, annotation @Test(enabled = false) helps to disable this test case. If a test 
		// method is annotated with @Test(enabled = false), then the test case that is not ready to test is 
		// bypassed.
		
		System.out.println("Test Case 4 has priority 5.");
	}
	
	@Test (priority = 4, invocationCount = 5) // Gets executed n times where n here is 5. 
	public void tc5() {
		
		// When you wish to run the same tests several times, you use invocation count. In TestNG, the
		// @Test(invocationCount=x) annotation defines the number of times a test method is performed. The 
		// annotation's x value indicates how often the test method should be called. In this case, 5 times.
		
		System.out.println("Test Case 5 has priority 4.");
	}

}
