package testing_Code_Mar30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook_Parameters {
	
	public static WebDriver driver;
	
	@Test (priority = 1) // Always set the priority. Without it, there is an error.
	@Parameters ({"urlF"})
	public void launchUrl(String url) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test (priority = 2)
	public void createAccountLink() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
	}
	
	@Test (priority = 3)
	@Parameters ({"usernameF", "passwordF"})
	public void createAccount(String username, String password) throws InterruptedException {
		
		Thread.sleep(2000); // Slow it down so it can find the element.
		driver.findElement(By.name("firstname")).sendKeys(username);
		driver.findElement(By.name("lastname")).sendKeys(password);
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}

}
