package testing_Code_Mar29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_Browser_Parameters {
	
	public static WebDriver driver;
	
	@Test
	@Parameters ({"Browser", "url", "username", "password"})
	public void rediffLogin(String Browser, String url, String username, String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.quit();
		
	}
}
