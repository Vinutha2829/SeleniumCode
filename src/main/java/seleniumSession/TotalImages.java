package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
//		List<WebElement> element=driver.findElements(By.tagName("img"));
//		for(WebElement e:element)
//		{
//			String value=e.getAttribute("src");
//			System.out.println(value);
//		}
		By locator =By.tagName("img");
//		System.out.println("Count:"+getElementAttributeValueCount(locator,"src"));
//		List<String> string=getElementAttributeValue(locator,"src");
		ElementUtil ele=new ElementUtil(driver);
		System.out.println("Count:"+ele.getElementAttributeValueCount(locator, "src"));
		List<String> string=ele.getElementAttributeValue(locator,"src");
		for(String e:string)
		{
			System.out.println(e);
		}
		ele.tearDown(driver);
	}
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static List<String> getElementAttributeValue(By locator,String attrName)
	{
		List<String> value=new ArrayList<String>();
		List<WebElement> element =getElements(locator);
		for(WebElement e:element)
		{
			String src=e.getAttribute(attrName);
			value.add(src);
		}
		return value;
	}
	public static int getElementAttributeValueCount(By locator,String attrName)
	{
		return getElementAttributeValue(locator,attrName).size();
	}

}
