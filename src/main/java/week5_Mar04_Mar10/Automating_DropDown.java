package week5_Mar04_Mar10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automating_DropDown {
	
	public static WebDriver driver;
	public static Select select;

	//Apply incognito mode
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		// Webdriver wasn't able to find the Web Element. Probably due to speed. Had to slow down the speed.
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Practice");
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@123");
		
		//for drop down, you have to create the object of Select Class
		// Don't use select.selectByIndex() and select.selectByValue()
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jan");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("1");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("2000");
		
		//driver.quit();
	}

}
