package week5_Mar04_Mar10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Selected {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement SignedInCheckbox = driver.findElement(By.xpath("//input[@id = 'remember']"));
		System.out.println(SignedInCheckbox.isSelected());
		
		driver.quit();
	}

}
