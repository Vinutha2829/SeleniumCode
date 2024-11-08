package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		boolean flag=driver.findElement(By.xpath("//input[@name='search']")).isDisplayed();
//		System.out.println(flag);
//		driver.close();
		By search=By.xpath("//input[@name='search']");
		ElementUtil ele=new ElementUtil(driver);
		if(ele.checkElementIsDisplayed(search, driver))
			{
				ele.doSendKeys(search, "Macbook");
				System.out.println("element is  displayed"+search);
			}
			else
			{
				System.out.println("element is not displayed"+search);
			}
		ele.tearDown(driver);
	}
	// move to elementutil class
//	public static WebElement checkElementIsDisplayed(By locator,WebDriver driver)
//	{
//		ElementUtil ele=new ElementUtil(driver);
//		WebElement element=ele.getElement(locator);
//		boolean flag=element.isDisplayed();
//		if(flag==true)
//		{
//			return element;
//		}
//		else
//		{
//			return null;
//		}
//		
//		
//	}

}
