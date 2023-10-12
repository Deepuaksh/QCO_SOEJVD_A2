package Scroll_bar_action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_bar_with_Coordinates {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//Implicit exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.amazon.com/");
       WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
       Point coOrdinates = career.getLocation();
       int x = coOrdinates.getX();
       int y = coOrdinates.getY();
       
       //downCasting
       JavascriptExecutor js= (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(\"+x+\",\"+y+\")");
       Thread.sleep(3000);
      js.executeScript("arguments[0].click();",career);
       //career.click();
  }

}
