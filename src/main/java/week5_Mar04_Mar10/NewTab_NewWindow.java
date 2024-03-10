package week5_Mar04_Mar10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab_NewWindow {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		
		driver.switchTo().newWindow(WindowType.TAB);	
		driver.navigate().to("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.costco.com");
		
		OpenWindow();
		
		driver.quit();
	}
	
	static void OpenWindow() {
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.aldoshoes.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW); //You can also open TAB here as well. Sequence doesn't matter
		driver.navigate().to("https://www.gap.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.sephora.com");
	}

}
