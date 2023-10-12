package Drop_Down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_Drop_down {

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
		//address of drop down
		WebElement dD = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//handling drop down
		Select s=new Select(dD);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("search-alias=stripbooks-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Luggage");
		
		//to check whether it is single or multiple drop down *if is Multiple-true *if is single-False
		System.out.println((s.isMultiple()));
		
		List<WebElement> value = s.getOptions();  //to get all the drop down list values
		System.out.println(value.size());  // to get the list size
		for(WebElement b:value)        //to print the list
		{
			System.out.println(b.getText());
		}
		
		
		
	}

}
