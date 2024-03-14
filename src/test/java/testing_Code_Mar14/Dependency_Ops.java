package testing_Code_Mar14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Ops {
	
	// dependsOnMethod
	// Using ‘dependsOnMethod’ attribute within @Test annotation, we can specify the name of the parent test 
	// method on which the test should be dependent. Some points to remember about dependsOnMethod-
	// On execution of the whole test class or test suite, the parentTest method will run before the 
	// dependentTest. If we run the dependentTest alone even then the parentTest method will also run that too 
	// before the dependentTest. In case, the parentTest method gets failed then the dependentTest method will
	// not run and will be marked as skipped.
	
	@Test () // Depends on no other method. 
	public void tc1() {
		
		System.out.println("Test Case 1 depends on no other method.");
		
		Assert.fail("Delibrately failing the test."); 
		// Deliberately failed the test and code terminates.
		// Skips all other test cases. 
		// Test Cases = Suppose to run 5, Failed 1 (the first one) then Skipped 4
	}
	
	@Test (dependsOnMethods = "tc1", alwaysRun = true) // Depends on test case 1. Must run test case.
	public void tc2() {
		
		// alwaysRun = Ensures that this test case is run as a must case scenario.
		// Outcome: Test cases Total 5, 1 Failed, 1 Passed, 3 Skipped.
		
		System.out.println("Test Case 2 depends on test case 1.");
	}
	
	@Test (dependsOnMethods = {"tc1", "tc2"}) // Depends on test case 1 & 2.
	public void tc3() {
		
		System.out.println("Test Case 3 depends on test case 1 & 2.");
	}
	
	@Test (dependsOnMethods = {"tc1", "tc2", "tc3"}) // Depends on test cases 1, 2 & 3.
	public void tc4() {
		
		System.out.println("Test Case 4 depends on test case 1, 2 & 3.");
	}
	
	@Test (dependsOnMethods = {"tc1", "tc2", "tc3", "tc4"}) // Depends on test cases 1,2,3 & 4.
	public void tc5() {
		
		System.out.println("Test Case 5 depends on test case 1, 2, 3 & 4.");
	}

}
