package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders 
{
	@DataProvider
	public Object[][] getData()
	{
		Object[][] a=new Object[3][2];
		a[0][0]="Deepa";
		a[0][1]="Akash";
		
		a[1][0]="DeepaAkash";
		a[1][1]="Vihaan";
		
		a[2][0]="Deepaksha";
		a[2][1]="Vihu";
		
		return a;
	}
	@Test(dataProvider="getData")
	public void demo(String data,String data1)
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.id("email")).sendKeys(data);
		driver.findElement(By.id("pass")).sendKeys(data1);
	}
}
