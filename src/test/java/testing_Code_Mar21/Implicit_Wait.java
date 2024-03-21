package testing_Code_Mar21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

// Implicit Wait - Smart wait
// Explicit Wait - Thread.sleep
// Fluent Wait

public class Implicit_Wait {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void openUrl(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an
		// exception. Once this time is set, WebDriver will wait for the element before the exception occurs.
		// Once the command is run, Implicit Wait remains for the entire duration for which the browser is open. 
		// It’s default setting is 0, and the specific wait time needs to be set by the following protocol.
	}
	
	@Test
	public void signIn() throws Exception {
		
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		Thread.sleep(2000);
		driver.findElement(By.className("signinbtn")).click();		
	}
	
	@AfterTest
	public void closeUrl(){
	
		driver.quit();
	}
}
