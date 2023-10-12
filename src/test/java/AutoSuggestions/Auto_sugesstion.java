package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_sugesstion 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//Implicit exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("AkashDeep");
		Thread.sleep(4000);
		List<WebElement> allValues = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(4000);
		for(WebElement b:allValues)
		{
			System.out.println(b.getText());
		}
		Thread.sleep(4000);
		driver.quit();

	}
}
