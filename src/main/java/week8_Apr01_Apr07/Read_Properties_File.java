package week8_Apr01_Apr07;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Properties_File {
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream ip;
	
	// Create a Properties File
	// File Name: config.properties
	// File Path: C:\Users\w_ahs\eclipse-workspace\Auto_Learning\src\main\java\week8_Apr01_Apr07\config.properties
	
	public static void main(String[] args) throws Exception { // Exception is for file path. 
	
		//String file_path = "C:\\\\Users\\\\w_ahs\\\\eclipse-workspace\\\\Auto_Learning\\\\src\\\\main\\\\java\\\\week8_Apr01_Apr07\\\\config.properties";
		System.out.println(System.getProperty("user.dir")); // Get User Directory path.
		String file_path = (System.getProperty("user.dir") + "\\src\\main\\java\\week8_Apr01_Apr07\\config.properties");
		// Better way of managing this. Use 'user.dir'
		System.out.println(file_path); // Check to confirm if path is correct. 
		
		prop = new Properties();
		
		// FileInputStream ip = new FileInputStream("C:\\Users\\w_ahs\\eclipse-workspace\\Auto_Learning\\src\\main\\java\\week8_Apr01_Apr07\\config.properties");
		// Good practice might be to save the path into a String variable and then use the variable as argument
		
		ip = new FileInputStream(file_path);
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("url")); // Getting the values from the properties file.
		System.out.println(prop.getProperty("usernameXpath")); // config.properties
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("passwordXpath"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("signinButtonXpath"));
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("usernameXpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("passwordXpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("signinButtonXpath"))).click();
		driver.quit();
	}
}
