package Web_Action_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class is_Displayed_Condition {

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
		 if(email.isDisplayed())
		 {
			 email.sendKeys("djjj");
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail");

		 }
		 
	}

}
