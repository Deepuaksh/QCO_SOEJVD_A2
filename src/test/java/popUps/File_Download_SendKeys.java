package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Download_SendKeys {

	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//Implicit exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Akash Patil\\Desktop\\\\Resume\\\\Akash Patil Resume.docx");
		

	}

}
