package testing_Code_Mar22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Optional_Parameterization {
	
	// Important: Parameters need to be run through testng.xml file and not through the class.
	// As we know, we can pass parameter values to the test methods during run time from testng xml file by 
	// specifying Parameters annotation to test method.
	// To do this, we need to declare parameters tag in xml file using 'name' and 'value' attribute.Where the name 
	// attribute of the tag defines name of the parameter and the value attribute defines the value of the 
	// parameter.
	// If defined parameter is not found in your testng.xml file, The test method will receive the default value 
	// which is specified inside the @Optional annotation.
	
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
	public void logIn(@Optional("seleniumpanda@rediffmail.com") String username, String password) throws InterruptedException {
		// if no parameter provided in testng.xml file then @Optional will be used as default parameter.
		
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void closeUrl() {
		
		driver.quit();
	}
}
