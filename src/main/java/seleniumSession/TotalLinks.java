package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
        static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By locator=By.tagName("a");
//		List<String>string =stringLinks(locator);
//		for(String e:string)
//		{
//			System.out.println(e);
//		}
		ElementUtil ele=new ElementUtil(driver);
		List<String> linkString=ele.getOnlyStringElements(locator);
		System.out.println("count:"+ele.getOnlyStringElementsCount(locator));
		for(String e:linkString)
			{
				System.out.println(e);
			}
		ele.tearDown(driver);
//		List<WebElement> linkList=driver.findElements(By.tagName("a"));
//		int size=linkList.size();
//		System.out.println(size);
////		for(int i=0;i<size;i++)
////		{
////			String string=linkList.get(i).getText();
////			System.out.println(string);
////		}
//		for(WebElement e:linkList)
//		{
//			String string=e.getText();
//			if(string.length()>0)
//			{
//			System.out.println(string);
//			}
//		}
	}
	public static List<WebElement> getTotalLinks(By locator)
	{
		return driver.findElements(locator);
		 
	}
	public static List<String> stringLinks(By locator)
	{
		List<String> links=new ArrayList<String>();
		List<WebElement>element =getTotalLinks(locator);
		for(int i=0;i<element.size();i++)
		{
			String string =element.get(i).getText();
			if(string.length()>0)
			{
				links.add(string);
			}
		}
		return links;
	}

}
