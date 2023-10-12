package Drop_Down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_drop_down {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//Implicit exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement dD = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(dD);
		System.out.println((s.isMultiple()));
		//selecting options
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("199");
		Thread.sleep(3000);
		//s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		Thread.sleep(3000);
		
		//to De-select
		s.deselectByIndex(0);
		Thread.sleep(3000);
		s.deselectByValue("199");
		
		//s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		List<WebElement> value = s.getAllSelectedOptions();
		for(WebElement b : value)
		{
			System.out.println(b.getText());
		}
		
	}

}
