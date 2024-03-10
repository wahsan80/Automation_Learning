package week5_Mar04_Mar10;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Taking_ScreenShots {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://openweathermap.org");
		
		System.out.println(System.getProperty("user.dir")); // Get the user directory for clear path
		
		WebElement owmScreenShot = driver.findElement(By.cssSelector("div.section.where-to"));
		File source = owmScreenShot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\ScreenShots\\screenshot1.png");
		
		// Be very careful about the path. "user.dir" means path towards the project name then add the folder
		// name (ScreenShots) and give the file name (screenshot1.png)
		// "user.dir" actually mean "C:\Users\w_ahs\eclipse-workspace\Auto_Learning"
		// Complete path would be "C:\Users\w_ahs\eclipse-workspace\Auto_Learning\ScreenShots\screenshot1.png"
		
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.booking.com");
		
		WebElement bookingScreenShot = driver.findElement(By.cssSelector("div.be2031501f"));
		File source1 = bookingScreenShot.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty("user.dir") + "\\ScreenShots\\screenshot2.png");
		FileHandler.copy(source1, destination1);	
		
		driver.quit();
	}

}
