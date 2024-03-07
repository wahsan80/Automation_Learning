package week5_Mar04_Mar10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Validating_Page_n_Web_Elements_FB_Ex2 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		String CurrentUrl = driver.getCurrentUrl();
		String CurrentTitle = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(CurrentTitle);
		
		String ExpectedUrl = "https://www.facebook.com/";
		String ExpectedTitle = "Facebook - log in or sign up";
		
		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		//Right click was not working. Use Ctrl+Shift+i to access WebElement in DOM
		
		if (CurrentUrl.equals(ExpectedUrl) && CurrentTitle.equals(ExpectedTitle)) {
			System.out.println(CreateNewAccount.isDisplayed());
			System.out.println(CreateNewAccount.isEnabled());
		}
		
		driver.quit();
	}

}
