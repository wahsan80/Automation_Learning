package testing_Code_Mar14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tri_Combo2 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() { 
		
		//This gets executed 'before' any test case gets executed. Multiple execution. 2 test cases in the program
		//so 2 time executions.
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("This is Before Method annotation.");
	}
	
	@Test
	public void testCase1() { // Only gets executed once in this program. 
		
		driver.get("https://www.google.com");
		System.out.println("Test Case Google.");
	}
	
	@Test
	public void testCase2() { // Only gets executed once in this program.
		
		driver.get("https://www.amazon.com");
		System.out.println("Test Case Amazon.");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		//This gets executed 'after' any test case gets executed. Multiple execution. 2 test cases in the program
		//so 2 time executions. 
		
		System.out.println("This is After Method annotation.");
		driver.quit();
	}

}
