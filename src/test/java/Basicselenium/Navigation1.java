package Basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation1 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.quit();

	}

}
