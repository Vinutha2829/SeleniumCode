package seleniumSession;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String string=driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(string);
		By locator =By.name("firstname");
		ElementUtil ele=new ElementUtil(driver);
		System.out.println(ele.doGetAtrributeValue(locator,"placeholder"));
		}
//		public static String doGetAtrributeValue(By locator,String attrName)
//		{
//			String string =getElement(locator).getAttribute(attrName);
//			return string;
//		}
//		public static WebElement  getElement(By locator)
//		{
//			 WebElement element=driver.findElement(locator);
//			 return element;
//		}

}
