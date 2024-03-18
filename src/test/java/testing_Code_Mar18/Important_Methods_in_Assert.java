package testing_Code_Mar18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Important_Methods_in_Assert {
	
	public static WebDriver driver;
	
	@Test
	public void logic() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		
		//Use Assertion for each Web Element
		Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled()); //Should return 'true'
		
		driver.findElement(By.className("signin")).click();
		
		String currentUrl = driver.getCurrentUrl();
		String currentTitle = driver.getTitle();
		
		System.out.println(driver.getCurrentUrl()); //https://mail.rediff.com/cgi-bin/login.cgi
		System.out.println(driver.getTitle()); //Rediffmail
		
		Assert.assertEquals(currentUrl, "https://mail.rediff.com/cgi-bin/login.cgi");
		Assert.assertEquals(currentTitle, "Rediffmail");
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Assert.assertTrue(true);
		
		WebElement password = driver.findElement(By.id("password"));
		Assert.assertTrue(password.isEnabled()); //Ensures if Web Element is alive and only moves ahead if true
		password.sendKeys("Selenium@123");
		
		/* Assert Methods.
		 * Assert.assertTrue(true/false)
		 * Assert.assertEquals(false, null)
		 * Assert.assertNotEquals(null, null)
		 * Assert.assertFalse(false)
		 * Assert.fail()
		 */
		
		driver.quit();
	}

}
