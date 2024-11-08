package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethod {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		By locator =By.cssSelector("#country");
		ElementUtil ele=new ElementUtil(driver);
		//List<String> list=getAllDropDownOptions(locator);
		List<String> list =ele.getAllDropDownOptions(locator);
		System.out.println(list);
		System.out.println(ele.getDropDownValueCount(locator));
		ele.doSelectDropDownValue( locator,"Bangladesh");
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static List<String> getAllDropDownOptions(By locator)
	{
		Select select=new Select(getElement(locator));
		List<WebElement> dropDownList=select.getOptions();
		List<String> list=new ArrayList<String>();
		for(WebElement e:dropDownList)
		{
			list.add(e.getText());
		}
		return list;
	}
	public static int getDropDownCount( By locator)
	{
		return getAllDropDownOptions(locator).size();
	}
	public static void doSelectDropDownValue(By locator,String suggestion)
	{
		Select select=new Select(getElement(locator));
		List<WebElement> dropDownList=select.getOptions();
		for(WebElement e:dropDownList)
		{
			String text =e.getText();
			if(text.equals(suggestion))
			{
				e.click();
			}
		}
	}

}
