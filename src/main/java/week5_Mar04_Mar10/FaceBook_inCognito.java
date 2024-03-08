package week5_Mar04_Mar10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FaceBook_inCognito {
	
	public static WebDriver driver;
	public static FirefoxOptions options;
	
	public static void main(String[] args) {
		
		options = new FirefoxOptions();
		options.addArguments("--incognito");
		
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/descendant::a[1]")).isEnabled());
		driver.findElement(By.xpath("//a[contains(text(), 'Create a Page')]")).click();
		
		driver.quit();
	}

}
