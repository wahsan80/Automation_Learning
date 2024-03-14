package testing_Code_Mar14;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tri_Combo {
	
	@BeforeMethod
	public void beforeMethod() { 
		
		//This gets executed 'before' any test case gets executed. Multiple execution. 2 test cases in the program
		//so 2 executions.
		
		System.out.println("This is Before Method annotation.");
	}
	
	@Test
	public void testCase1() { // Only gets executed once in this program. 
		
		System.out.println("This is test case 1.");
	}
	
	@Test
	public void testCase2() { // Only gets executed once in this program.
		
		System.out.println("This is test case 2.");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		//This gets executed 'after' any test case gets executed. Multiple execution. 2 test cases in the program
		//so 2 executions.
		
		System.out.println("This is After Method annotation.");
	}

}
