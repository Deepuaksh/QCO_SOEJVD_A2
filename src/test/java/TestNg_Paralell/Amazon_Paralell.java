package TestNg_Paralell;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Paralell 
{
	@Test
	public void az()
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.amazon.com/");
	}
}
