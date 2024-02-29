package week4_Feb26_Mar03;

import org.openqa.selenium.By;

// Redo this after learning how to manage Pop ups or user authentications
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_WebElement_Negative {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@1234");
		driver.findElement(By.className("signinbtn")).click();
		
		WebElement ErrorMessage = driver.findElement(By.xpath("//div[@id = 'div_login_error']"));
		
		System.out.println(ErrorMessage.getText()); //getText - Get String text of Web Element.
		
		// driver.quit();
	}

}
