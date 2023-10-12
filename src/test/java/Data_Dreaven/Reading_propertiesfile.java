package Data_Dreaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_propertiesfile 
{

	public static void main(String[] args) throws Throwable
	{
		Properties p =new Properties();
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String urlApp = p.getProperty("url");
		 String user = p.getProperty("username");
		 String password = p.getProperty("password");
		 

         WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		
		driver.get(urlApp);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
