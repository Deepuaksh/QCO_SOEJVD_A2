package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathfollowing_sibling 
{

	public static void main(String[] args) 
	{
        WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]/following-sibling::a[2]")).click();
		

	}

}
