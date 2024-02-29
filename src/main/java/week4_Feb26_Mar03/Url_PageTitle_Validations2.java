package week4_Feb26_Mar03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//Current URL and Current Page Title Validations. 

public class Url_PageTitle_Validations2 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //Open the website using this current URL
		
		System.out.println("Current URL = " + driver.getCurrentUrl());      // Just print the URL that we got
		System.out.println("Current Page Title is = " + driver.getTitle()); // Just print the page title that we got
		System.out.println("======================");
		
		String CurrentURL = driver.getCurrentUrl();  // Save the URL in the string for comparison later
		String CurrentPageTitle = driver.getTitle(); // Save the Page Title in the string for comparison later
		
		String ExpectedCurrentURL = "https://mail.rediff.com/cgi-bin/login.cgi"; // Save for comparison later
		String ExpectedCurrentPageTitle = "Rediffmail";                          // Save for comparison later
		
		if (CurrentURL.equals(ExpectedCurrentURL) && CurrentPageTitle.equals(ExpectedCurrentPageTitle)) {
			
			System.out.println("My URL and Page Title are correct.");
			
			driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@1234");
			
			Thread.sleep(3000);
		}
		else
			System.out.println("My URL & Page Title are not corrent.");
		
		driver.quit();
	}

}
