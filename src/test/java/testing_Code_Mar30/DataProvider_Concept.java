package testing_Code_Mar30;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {

	// Marks a method as supplying data for a test method.
	// The annotated method must return an Object[][] 2 D Array
	// where each Object[] can be assigned the parameter list of the test method.
	// The @Test method that wants to receive data from this DataProvider needs to
	// use a dataProvider name equals to the name of this annotation.

	// Steps to Remember: -
	// 1. it returns and 2-D Object Array
	// 2. you have to specify the data in rows and cols of this 2-D array
	// 3. There must be at least one test Case which will be represented as @Test -
	// you have to parameterize using an annotation
	// which is known as dataProvider and equate it to the name of the method which
	// holds the 2-D array
	// 4. pass the input parameters in the @Test method which should be equal to
	// number of cols of the 2-D array
	
	@Test (dataProvider = "getData")
	public void dataMatrix(String user, String pass, int id_no, String browser) {
		
	}
		
	@DataProvider
	public Object[][] getData() { // Return Object type 'Array' stored in 'data'
		
		Object[][] data = new Object[3][4];
		
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[0][2] = 123;
		data[0][3] = "Chrome";
		
		data[0][0] = "user2";
		data[0][1] = "pass2";
		data[0][2] = 456;
		data[0][3] = "Firefox";
		
		data[0][0] = "user3";
		data[0][1] = "pass3";
		data[0][2] = 789;
		data[0][3] = "Edge";
		
		return data;
	}
}
