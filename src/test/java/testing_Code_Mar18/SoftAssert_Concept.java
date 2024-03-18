package testing_Code_Mar18;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Concept {
	
	SoftAssert softassert;
	
	@Test
	public void test() {
		
		softassert = new SoftAssert();
		boolean b1 = 1 < 2;
		softassert.assertTrue(b1); //true condition
		boolean b2 = 1 > 2;
		softassert.assertFalse(b2); //true condition
		
		System.out.println("I have a new logic.");
		
		String s1 = "Hello World.";
		String s2 = "Bye World."; 
		
		softassert.assertEquals(s1, s2); //false condition. If s2 = "Hello World." then everything/test will pass.
		                       //s1 actual, s2 expected.
		// SoftAssert allowed the code to pass. 
		// Soft Assert collects errors during @Test is running . It does not throw an exception when an assert 
		// fails. The execution will continue with the next step after the assert statement.
		
		System.out.println("Just Testing.");
		
		softassert.assertAll();
		
		// assertAll() is a method available in TestNG, a testing framework that works with Selenium WebDriver. It
		// is used to verify that all the assertions within a test method have passed, and it can be used to
		// ensure that all the expected results are being verified.
		
		System.out.println("After Assertions."); // After failing assertion, this will not execute. 
	}

}
