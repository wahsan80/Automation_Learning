package testing_Code_Mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayAround {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void openBrowser() {
		
		driver.get("https://www.rediff.com");
	}
	
	@Test
	public void signIn() {
		
		driver.findElement(By.className("signin")).click();
		// Running this test alone will not pass because it doesn't know which browser to work with
		// Error - no such element: Unable to locate element
	}

	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}
}
