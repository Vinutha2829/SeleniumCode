package seleniumSession;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Assigment1 {
	static WebDriver driver;
	public static void main(String[] args) {
		ElementUtil ele=new ElementUtil(driver);
		ele.launchBrowser("https://www.amazon.com/");
		By locator =By.tagName("img");
		List<String> alt=ele.getElementAttributeValue(locator, "alt");
		System.out.println("alt value are:");
		for(String e:alt)
		{
			System.out.println(e);
		}
		By locator1 =By.tagName("a");
		System.out.println("href value are:");
		List<String> href=ele.getElementAttributeValue(locator1, "href");
		System.out.println("alt value are:");
		for(String e:href)
		{
			System.out.println(e);
		}
		
		
		
	}
	

}
