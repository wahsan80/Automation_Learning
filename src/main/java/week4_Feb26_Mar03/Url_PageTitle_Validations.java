package week4_Feb26_Mar03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url_PageTitle_Validations {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		
		String ActualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String ExpectedTitle = driver.getTitle();
		
		System.out.println("Expected Title is " + ExpectedTitle);
		
		if (ActualTitle.equals(ExpectedTitle))
			driver.get("https://www.hotmail.com");
		else
			driver.get("https://www.google.com");
	}

}
