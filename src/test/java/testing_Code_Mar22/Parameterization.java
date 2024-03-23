package testing_Code_Mar22;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	
	// Important: Parameters need to be run through testng.xml file and not through the class.
	
	public static WebDriver driver;
	String Browser;
	
	@BeforeTest
	@Parameters({"Browser"})
	public void browserSetup(String Browser) {
		
		if (Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (Browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (Browser.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
			System.out.println("No relevant Browser found.");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	
	@Test (priority = 1)
	@Parameters({"Url"})
	public void launchUrl(String Url) {
		
		driver.get(Url);
	}
	
	@Test (priority = 2)
	public void clickOnSignIn() {
		
		driver.findElement(By.className("signin")).click();
	}

	@Test (priority = 3)
	@Parameters({"username", "password"})
	public void logIn(String username, String password) throws InterruptedException {
		
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void closeUrl() {
		
		driver.quit();
	}
}
