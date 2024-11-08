package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectClass {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		By locator=By.cssSelector(".form-control");
		By dropDown=By.xpath("//select[@class='form-control']/option");
		String value="Thursday";
		boolean flag=DoSelectValueFromDropDownWithoutSelect(locator,dropDown,value);
		if(flag==true)
		{
			System.out.println(value+" is  present in the drop down" +dropDown);
		}

	}
	public static boolean DoSelectValueFromDropDownWithoutSelect(By locator,By dropDown,String suggestion)
	{
		doclickElement(locator);
		boolean flag=false;
		List<WebElement> dropEle=driver.findElements(dropDown);
		for(WebElement e:dropEle)
		{
			if(e.getText().equals(suggestion))
			{
				e.click();
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println(suggestion +"Given Element is not present"+dropDown);
		}
		return flag;
	
	}
	public static  void doclickElement(By locator)
	{
		driver.findElement(locator).click();
	}
}
