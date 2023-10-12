package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get("https://www.amazon.in/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy S22 Ultra 5G (Burgundy, 12GB, 256GB Storage) with No Cost EMI/Additional Exchange Offers']")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		WebElement value = driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']/../../../../..//span[@class='a-price a-text-price']"));
		System.out.println(value.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
	}

}
	