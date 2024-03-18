package testing_Code_Mar18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_in_TestNG {
	
	@Test (priority = 1)
	public void test() {
		
		System.out.println("We are learning Assertion in Test NG.");
		Assert.assertTrue(true); //as long as assertion is 'true', the control/code/program will move on
		System.out.println(2 + 3);
		// Upto this point, code will run smooth. 
		//Assert.fail(); // After this code will fail. 
		Assert.assertTrue(1>2);//'false' so test terminates here and fails. If 'true' condition then runs and pass
		System.out.println("Learning Selenium.");
	}
	
	@Test (priority = 2)
	public void test2() {
		
		System.out.println("Hello World.");
	}

}
