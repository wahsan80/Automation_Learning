package week5_Mar04_Mar10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		// What is a Locator? Ways to identify one or more specific elements in the DOM. A locator is a way to 
		// identify elements on a page. It is the argument passed to the Finding element methods.
		
		//Locators in Selenium 4. 
		// 1. id, 2. className, 3. name, 4. xpath, 5. cssSelector, 6. tagname, 7. linkText, 8. partiallinkText
		// 9. ByAll, 10. ByIdorName, 11. ByChained, 12. above, 13. below, 14. near, 15. toRightof, 16. toLeftof
		
		// tagName as a locator is mostly used to identify multiple web elements
		
		// The following code determines all the web elements with html div.
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		List<WebElement> allDivTags = driver.findElements(By.tagName("Div")); // Saves the WebElement
		System.out.println(allDivTags.size()); // Displays the html tag of the WebElement
		
		WebElement usernameTextBox = driver.findElement(By.id("login1")); // Saves the WebElement
		System.out.println(usernameTextBox.getTagName()); // Displays the html tag of the WebElement
		
		driver.findElement(By.linkText("Create a new account")).click(); //Using linkText
		
		//driver.quit();
	}

}
