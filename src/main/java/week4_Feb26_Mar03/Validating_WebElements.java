package week4_Feb26_Mar03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Validating_WebElements {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // Open the required URL before validations
		
		WebElement UserNameTextBox = driver.findElement(By.id("login1"));
		
		System.out.println(UserNameTextBox.isDisplayed());
		
		// By definition isDisplayed() is a method, that return Boolean value - True if the element is visible
		// in the UI and False if it is not 
		
		System.out.println(UserNameTextBox.isEnabled());
		
		// This method verifies if an element is enabled. If the element is enabled, it returns a true value. 
		// If not, it returns a false value
		System.out.println(UserNameTextBox.isSelected());	
		
		// isSelected() This method is often used on radio buttons, checkboxes or options in a menu. It is used 
		// to determine if an element is selected. If the specified element is selected, the value returned is 
		// true. If not, the value returned is false.
		
		System.out.println(UserNameTextBox);
		
		driver.quit();
	}

}
