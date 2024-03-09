package week5_Mar04_Mar10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_PopUp_Alerts {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		// Alerts can be application dependent or Operating System dependent
		// Types of Alerts -> Simple, Prompt, Confirmation
		// Switch focus from Main window to child (Alert) window
		
		Alert alert = driver.switchTo().alert(); 
		// Alert is an interface. It's not a class - tricky interview question
		// To switch the control from the parent window to the Alert window, the Selenium WebDriver provides
		// this command
		
		String text = alert.getText(); // Captures the alert message and saves as a String
		System.out.println("Text of the alert is: " + text);
		
		if (text.equals("Please enter a valid user name")) {
			
			Thread.sleep(2000);
			alert.accept();
		}
		else
			alert.dismiss();
		
		Thread.sleep(2000);
		// Thread.sleep causes the current thread to suspend execution for a specified period. This is an 
		// efficient means of making processor time available to the other threads of an application or other 
		// applications that might be running on a computer system.
		
		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		Thread.sleep(2000);
				
		driver.quit();
	}

}
