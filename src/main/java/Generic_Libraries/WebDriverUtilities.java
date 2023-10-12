package Generic_Libraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities 
{
	private static final TimeUnit TimeUnit = null;
	private static final String SECONDS = null;

	//1 handling alter pop-ups clicking on ok
	public void alter(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}
	
	//2 handling alter pop-up clicking on cancel
	public void alterCancel(WebDriver driver)
		{
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		}
	
	//3 mouse over action
	public void mouseOver(WebDriver driver,WebElement ele)
		{
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
		}
	
	// 4 Double clicking 
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//5 Right click
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//6 Drag and Drop
	public void mouseOver(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	
	//7 child Browser
	public void childBroswer(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
			
	}
	
	//8 Parent browser
	public void parentBroswer(WebDriver driver)
	{
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
	
	//Multiple_Drop_Down 
	public void MultipleDropDown(WebDriver driver)
	{
		Select s=(Select) driver;
		s.selectByIndex(0);
		s.selectByValue("199");
	}
	//Explicit Wait
	public void explicitWait(WebDriver driver,int t,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,t);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	//right click
	public void rightClick1(WebDriver driver ,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//Implicit Wait
	public void implicitWait(WebDriver driver ,int n)
	{
		driver.manage().timeouts().implicitlyWait(n,TimeUnit);
	}
	
	
	
	
}
