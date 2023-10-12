package Web_Action_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getter_method_Dimensions 
{
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.facebook.com/login.php");
		 WebElement email = driver.findElement(By.id("email"));
		 Dimension size = email.getSize();
		 int h = size.getHeight();
		 int w = size.getWidth();
		 System.out.println(h);
		 System.out.println(w);


	}

}
