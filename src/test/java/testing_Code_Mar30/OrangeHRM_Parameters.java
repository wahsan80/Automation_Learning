package testing_Code_Mar30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM_Parameters {
	
	public static WebDriver driver;
	
	@Test (priority = 1)
	@Parameters ({"urlO"})
	public void launchUrl(String url) {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test (priority = 2)
	@Parameters ({"emailO"})
	public void subscribe(String email) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.name("EmailHomePage")).sendKeys(email);
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}

}
