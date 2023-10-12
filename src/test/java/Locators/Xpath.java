package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) 
	{
		 WebDriverManager.edgedriver().setup();
			
			//opens the empty browser
			WebDriver driver = new EdgeDriver();
			
			//for maximizing
			driver.manage().window().maximize();
			
			//to open the Browser
			driver.get("https://www.facebook.com/");
			
			//address of email text field using xpath method
			driver.findElement(By.xpath("//input[@name='email'])")).sendKeys("aagj");
			
			//address of password text field using xpath contains attribute
			driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("aaaa");
			
			//address of forgotten password using xpath text
			driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
			
			//address of forgotten password using xpath contains attribute
		//	driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
			

	}

}
