package week4_Feb26_Mar03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Using_Contains {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.practicesoftwaretesting.com");	
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(), 'Register your account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'first_name')]")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'last_name')]")).sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[(contains(@id, 'dob'))]")).sendKeys("1990-01-01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'address')]")).sendKeys("Virginia Campus");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'postcode')]")).sendKeys("21117");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'city')]")).sendKeys("Vienna");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'state')]")).sendKeys("Virginia");
		Thread.sleep(1000);
		
		//https://www.guru99.com/select-option-dropdown-selenium-webdriver.html
		Select DropDownCountry = new Select(driver.findElement(By.xpath("//select[contains(@id, 'country')]")));
		DropDownCountry.selectByVisibleText("United States of America (the)");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'phone')]")).sendKeys("123-456-789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys("helloworld232@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");	
	}

}
