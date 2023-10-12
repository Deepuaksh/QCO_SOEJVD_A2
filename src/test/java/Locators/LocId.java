package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocId 
{

	public static void main(String[] args) 
	{
         WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		
		//to open the Browser
		driver.get("https://www.facebook.com/");
		
		//address of email id text field
		driver.findElement(By.id("email")).sendKeys("Deepa");
		
		//address of password text field
		driver.findElement(By.name("pass")).sendKeys("akashd");
		
		//address of login button
		//driver.findElement(By.name("login")).click();
		
		//address of forgotten password link
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//using partial link for forgotten password
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}

}
