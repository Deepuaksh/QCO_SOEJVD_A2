package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Exception 
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
		
		//Explicit Exception
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		driver.get("https://www.facebook.com/");
		
		WebElement email= driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("gaahha");
		  
		Thread.sleep(3000);
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
}

}
