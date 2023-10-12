	package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {

	public static void main(String[] args) 
	{
WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//to print all links in web page.
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//To print all the links
		for(WebElement b: allLinks)
		{
			System.out.println(b.getText());
		}

	}
	

}
