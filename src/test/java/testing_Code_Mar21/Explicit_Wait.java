package testing_Code_Mar21;

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
import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait {
	
public static WebDriver driver;
	
	@BeforeTest
	public void openUrl(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// By using the Explicit Wait command, the WebDriver is directed to wait until a certain condition occurs 
		// before proceeding with executing the code.
		// Setting Explicit Wait is important in cases where there are certain elements that naturally take more
		// time to load. If one sets an implicit wait command, then the browser will wait for the same time frame
		// before loading every web element. This causes an unnecessary delay in executing the test script.
		//Explicit wait is more intelligent, but can only be applied for specified elements. However, it is an 
		// improvement on implicit wait since it allows the program to pause for dynamically loaded Ajax elements.
	}
	
	@Test
	public void signIn() {
		
		WebElement signInLink = driver.findElement(By.className("signin"));
		// Saving the GUI element reference into a "element" variable of WebElement type
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signInLink)).click();
		// Explicit wait - to wait for the 'Sign in' button to be click-able
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();		
	}
	
	@AfterTest
	public void closeUrl(){
	
		driver.quit();
	}

}
