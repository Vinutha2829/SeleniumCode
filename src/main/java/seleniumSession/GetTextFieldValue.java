package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		driver.findElement(By.name("firstname")).sendKeys("vinutha");
//		String value=driver.findElement(By.name("firstname")).getAttribute("value");
//		System.out.println(value);	
		By locator =By.name("firstname");
		ElementUtil ele=new ElementUtil(driver);
		ele.doSendKeys(locator, "vinutha");
		String string =ele.getTextFieldValue(locator, "value");
		System.out.println(string);
		ele.tearDown(driver);
//		WebElement ele=doSendKeys(locator,"vinutha");
//		String string=getTextFieldValue(ele,"value");
//		System.out.println("Field value is:"+string+"  "+locator);
//	}
//	public static String getTextFieldValue(WebElement ele,String attrName)
//	{
//		String string=ele.getAttribute(attrName);
//		return string;
//	}
//	public static WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//	}
//	public static WebElement  doSendKeys(By locator,String string)
//	{
//		 WebElement ele=getElement(locator);
//		 ele.sendKeys(string);
//		 return ele;
//	}
	}
//	public static String getTextFieldValue(By locator,String attrName)
//	{
//		String string=getElement(locator).getAttribute(attrName);
//		return string;
//	}

}
