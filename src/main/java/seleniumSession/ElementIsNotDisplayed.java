package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsNotDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By locator=By.xpath("//input[@name='search1']");
		ElementUtil ele=new ElementUtil(driver);
		ele.checkElementIsDisplayed(locator, driver);
		if(ele.checkElementIsDisplayed(locator, driver))
		{
			ele.doSendKeys(locator, "Macbook");
			System.out.println("element is  displayed"+locator);
		}
		else
		{
			System.out.println("element is not displayed"+locator);
		}
	ele.tearDown(driver);
	}
		public  WebElement getElement (By locator,WebDriver driver)
		{
		 WebElement ele;
		 try
		 {
			ele= driver.findElement(locator);
		 }
		 catch(NoSuchElementException el)
		 {
			 System.out.println("Element is not found"+locator);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ele= driver.findElement(locator);
		 }
			return ele;
		}
	}


