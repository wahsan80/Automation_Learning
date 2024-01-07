package week1_Jan02_Jan07_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Url_Class1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		/*
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		*/
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
		
		System.out.println("Testing 1."); //User authentication is not allowing automation to move forward?
		
		//driver.findElement(By.className("rd_logout")).click();
		
		System.out.println("Testing 2.");
		
		driver.quit();
		driver1.quit();
		
	}

}
