package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementSections {
		static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> element=driver.findElements(By.xpath("//a[@class='list-group-item']"));
		for(WebElement e:element)
		{
			System.out.println(e.getText());
		}
		By locator =By.xpath("//a[@class='list-group-item']");
		ElementUtil ele=new ElementUtil(driver);
//		List<String> string =ele.getElementSections(locator);//getElementSections(locator);
//		for(String e:string)
//		{
//			System.out.println(e);
//		}
		System.out.println (ele.clickElementFromPageSource(locator, "Register"));
		ele.tearDown(driver);
	}
	
	//util class
	public static List<String> getElementSections(By locator)
	{
		List<String> string =new ArrayList<String>();
		List<WebElement> element =driver.findElements(locator);
		for(WebElement e:element)
		{
			String value=e.getText();
			string.add(value);
		}
		return string;
	}
	public static void clickElementFromPageSource(By locator,String value)
	{
		List<String> string =new ArrayList<String>();
		List<WebElement> element =driver.findElements(locator);
		for(WebElement e:element)
		{
			if(e.getText().equals("My Account"))
			{
				e.click();
				break;
			}
			
		}
	}

}
