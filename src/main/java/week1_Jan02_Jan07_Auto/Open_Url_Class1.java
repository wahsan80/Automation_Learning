package week1_Jan02_Jan07_Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Url_Class1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		/* WebDriverManager is an open-source Java library that carries out the management (i.e., download, 
		 * setup, and maintenance) of the drivers required by Selenium WebDriver (e.g., chromedriver, 
		 * geckodriver, msedgedriver, etc.) in a fully automated manner. In addition, WebDriverManager 
		 * provides other relevant features, such as the capability to discover browsers installed in the local
		 * system, building WebDriver objects (such as ChromeDriver, FirefoxDriver, EdgeDriver, etc.), and 
		 * running browsers in Docker containers seamlessly.
		 * setup() to setup the browser in an automation script. 
		 */
		
		WebDriver driver = new ChromeDriver();
		
		//You are creating an instance of the WebDriver interface and casting it to ChromeDriver Class.
		// WebDriver (Interface) extends ChromeDriver (Class)
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}

}
