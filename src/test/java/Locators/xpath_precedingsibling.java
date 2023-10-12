package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_precedingsibling 
{

	public static void main(String[] args) 
	{
		 WebDriverManager.edgedriver().setup();
			
			//opens the empty browser
			WebDriver driver = new EdgeDriver();
			
			//for maximizing
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.com/");
			driver.findElement(By.xpath("(//a[text()='Gift Cards'])/preceding-sibling::a[2]")).click();
	}

}
