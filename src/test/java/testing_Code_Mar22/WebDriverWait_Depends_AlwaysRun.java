package testing_Code_Mar22;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWait_Depends_AlwaysRun {
	
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	WebDriverWait wait;
	
	@BeforeTest
	public void browserSetup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	
	@Test (priority = 1)
	public void openBrowser() {
		
		driver.get("https://www.rediff.com");
	}
	
	@Test (priority = 2, dependsOnMethods = "openBrowser", alwaysRun = true)
	public void signIn() {
		
		WebElement signinLink = driver.findElement(By.className("signin"));
		softassert.assertTrue(signinLink.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signinLink)).click();
		softassert.assertAll();
	}
	
	@Test (priority = 3, dependsOnMethods = {"openBrowser", "signIn"}, alwaysRun = true)
	public void login() {
		
		WebElement userNameTextbox = driver.findElement(By.id("login1"));
		softassert.assertTrue(userNameTextbox.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(userNameTextbox)).sendKeys("seleniumpanda@rediffmail.com");
		
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		softassert.assertTrue(passwordTextbox.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(passwordTextbox)).sendKeys("Selenium@123");
		
		WebElement signInButton = driver.findElement(By.className("signinbtn"));
		softassert.assertTrue(signInButton.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
		
		softassert.assertAll();
	}
	
	@AfterTest
	public void closeUrl() {
		
		driver.quit();
	}

}
