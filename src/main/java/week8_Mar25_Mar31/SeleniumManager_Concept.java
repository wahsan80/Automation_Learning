package week8_Mar25_Mar31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManager_Concept {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // public static WebDriver driver; (Same?)
		// Boni Garcia - Creator of WebDriverManager
		driver.get("https://www.google.com");
		
		driver.quit();
	}

}
