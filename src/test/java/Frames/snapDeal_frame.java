package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapDeal_frame {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//Implicit exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.snapdeal.com/");
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//creating an object for actions class
		Actions a=new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);
		//address of register
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		
		//handling frame
		driver.switchTo().frame("loginIframe");
		//driver.switchTo().frame(0);
		
		//address of mobile number text field of register frame
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("abhgl");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click(); //to close register page
		
		//shifting from frame to normal web page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("hgff");
		
		
		
		
	}

}
