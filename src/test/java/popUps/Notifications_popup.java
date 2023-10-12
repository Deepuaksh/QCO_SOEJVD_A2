package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications_popup {

	public static void main(String[] args) 
	{	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akash Patil\\eclipse-workspace\\QCO_SOEJVD_A2\\src\\main\\resources\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new ChromeDriver(options);
		
		//for maximizing
		driver.manage().window().maximize();
		//Implicit exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get("https://www.redbus.in/");
		

	}

}
