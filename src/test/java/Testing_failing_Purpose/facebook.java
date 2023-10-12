package Testing_failing_Purpose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook 
{
	WebDriver driver;
	@Test
	public void FB()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		//for maximizing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.id("email")).sendKeys("gshsj");
	}
}
