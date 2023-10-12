package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_traversing 
{

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		
		//to open the Browser
		driver.get("https://www.amazon.com/s?k=phones&crid=3DFSAFL6BBFJM&sprefix=phones%2Caps%2C672&ref=nb_sb_ss_ts-doa-p_2_6");
		
		WebElement values = driver.findElement(By.xpath("https://www.amazon.com/s?k=phones&crid=3DFSAFL6BBFJM&sprefix=phones%2Caps%2C672&ref=nb_sb_ss_ts-doa-p_2_6"));

		System.out.println(values.getText());
	}

}
