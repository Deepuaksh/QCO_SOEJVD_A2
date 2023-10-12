package Web_Action_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class is_Enabled {

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.facebook.com/login.php");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		if(login.isEnabled())
		{
			login.click();
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");

	}
		
	}
}
