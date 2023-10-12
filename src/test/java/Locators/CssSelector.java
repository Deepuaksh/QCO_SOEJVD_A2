package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector 
{

	public static void main(String[] args) throws Throwable 
	{
		 WebDriverManager.edgedriver().setup();
			
			//opens the empty browser
			WebDriver driver = new EdgeDriver();
			
			//for maximizing
			driver.manage().window().maximize();
			
			//to open the Browser
			driver.get("https://www.facebook.com/");
			
			//address of email text field ,password and login button
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("aagj");
			driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("gghh");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
