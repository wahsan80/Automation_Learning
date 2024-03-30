package testing_Code_Mar29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_Browser_Parameters3 {
	
	public static WebDriver driver;
	
	@Test
	@Parameters ({"Browser3", "url", "username", "password"})
	public void rediffLogin(String Browser, String url, String username, String password) {
		
		if (Browser.equals("Chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (Browser.equals("Firefox")) {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if (Browser.equals("Edge")) {
			
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else
			System.out.println(Browser + " driver doesn't exits.");
		
		driver.get(url);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.quit();
		
	}
}
