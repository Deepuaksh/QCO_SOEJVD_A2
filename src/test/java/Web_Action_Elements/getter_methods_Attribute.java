package Web_Action_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getter_methods_Attribute 
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
		 String attribute = email.getAttribute("type");
		 System.out.println(attribute);
		 Point coOrdinates = email.getLocation();
		int x = coOrdinates.getX();
		 int y = coOrdinates.getY();
		 
		 System.out.println(x);
		 System.out.println(y);




	}

}
