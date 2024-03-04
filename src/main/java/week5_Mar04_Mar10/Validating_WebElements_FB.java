package week5_Mar04_Mar10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validating_WebElements_FB {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		
		WebElement forgotPassword = driver.findElement(By.xpath("//a[contains(text(), 'Forgot password')]"));
		System.out.println(forgotPassword.isDisplayed());
		System.out.println(forgotPassword.isEnabled());
		System.out.println(forgotPassword.isSelected());
		
		driver.quit();
	}

}
