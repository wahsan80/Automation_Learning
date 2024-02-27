package week4_Feb26_Mar03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learning_Xpath {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.practicesoftwaretesting.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text() ='Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text() = 'Register your account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'first_name']")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'last_name']")).sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'dob']")).sendKeys("1990-01-01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'address']")).sendKeys("Virginia Campus");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'postcode']")).sendKeys("21117");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'city']")).sendKeys("Vienna");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'state']")).sendKeys("Virginia");
		Thread.sleep(1000);
		
		//https://www.guru99.com/select-option-dropdown-selenium-webdriver.html
		Select DropDownCountry = new Select(driver.findElement(By.xpath("//select[@id = 'country']")));
		DropDownCountry.selectByVisibleText("United States of America (the)");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'phone']")).sendKeys("123-456-789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("helloworld232@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");	
	}

}
