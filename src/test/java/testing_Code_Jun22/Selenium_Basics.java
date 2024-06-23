package testing_Code_Jun22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Basics {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		signInPage();
		login();	
		closeBrowser();
	}	
	
	public static void signInPage() {
		
		driver.findElement(By.className("signin")).click();
	}
	
	public static void login() {
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	}
	
	public static void closeBrowser() {
		
		driver.quit();
	}
}
