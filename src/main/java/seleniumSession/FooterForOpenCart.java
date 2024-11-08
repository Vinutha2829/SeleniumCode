package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterForOpenCart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By locator =By.xpath("//footer//div//ul//li//a");
		ElementUtil ele=new ElementUtil(driver);
		List<String>element = ele.getOnlyStringElements(locator); //driver.findElements(By.xpath("//footer//div//ul//li//a"));
		System.out.println(ele.getElementsCount(locator));
		for(String e:element)
		{
			System.out.println(e);
		}
		
		
	}

}
