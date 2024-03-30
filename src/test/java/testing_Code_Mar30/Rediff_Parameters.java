package testing_Code_Mar30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff_Parameters {
	
	// Notes on execution flow.
	// 1. TestNG first runs the class in sequence. 
	// 2. From class, parameters get called from TestNG.xml file. Relevant parameters then gets passed on to the 
	// class and it methods
	// 3. After 1 class finishes all it's execution then TestNG moves to the next class and it keep moving like
	// this till the last class is executed. 
	
	public static WebDriver driver;
	
	@Test (priority = 1)
	@Parameters ({"urlR"})
	public void launchUrl(String url) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test (priority = 2)
	public void signInPage() {
		
		driver.findElement(By.className("signin")).click();
	}
	
	@Test (priority = 3)
	@Parameters ({"usernameR", "passwordR"})
	public void login(String username, String password) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}

}
