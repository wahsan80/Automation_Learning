package testing_Code_Jun24;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concepts_MOE {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		driver.get("https://www.cnn.com");
		
		List<WebElement> CNNScriptTags = driver.findElements(By.tagName("script")); 
		
		System.out.println("Total number of WebElements with 'script' TagNames are: " + CNNScriptTags.size());
		
		List<WebElement> CNNLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of WebElements with links are: " + CNNLinks.size());
		
		driver.quit();
		*/
		
		driver.get("https://www.rediff.com");
	
		// Total number of Links in the web page.
		List<WebElement> RediffLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in this page are: " + RediffLinks.size());
		
		// What if you want to pick the 21st Link?
		WebElement TwentyFirstLink = RediffLinks.get(21);
		System.out.println(TwentyFirstLink.getText()); // To get Text
		System.out.println(TwentyFirstLink.getAttribute("href")); // To get attribute
		System.out.println("x coordinate is: " + TwentyFirstLink.getLocation().x + " y coordinate is: " + TwentyFirstLink.getLocation().y);
		
		// TwentyFirstLink.click(); // Click on the 21st Link.
		
		// Probably gonna open all the links in the web page. 
	
		Thread.sleep(2000);
		
		// driver.navigate().back();
		
		for (int i = 0; i<RediffLinks.size(); i++) {
			
			WebElement TotalLinks = RediffLinks.get(i);
			System.out.println(TotalLinks.getText() + "-----" + TotalLinks.isDisplayed());
			// Will display all the links. Whether true or false. 
			/*
			if (TotalLinks.isDisplayed() == true) {
				
				TotalLinks.click();
			}
			*/
		}
		
		
		driver.quit();
	}

}
