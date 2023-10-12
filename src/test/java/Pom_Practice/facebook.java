package Pom_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM_Class.FacebookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		
		//to open the Browser
		driver.get("https://www.facebook.com/");
		
		FacebookLoginPage flp=new FacebookLoginPage(driver);
		flp.emailTextfield("Deepa");
		flp.passwordTextfield("hyruo");
		flp.loginButton();
	}

}
