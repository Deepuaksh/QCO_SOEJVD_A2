package Screen_shots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_shot_snapDeal 
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
				
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/snapdeal.png");
		 FileUtils.copyFile(src,dest);

		

	}

}
