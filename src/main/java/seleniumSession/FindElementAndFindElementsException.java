package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsException {
			static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scores/76493/eng-vs-wi-2nd-test-west-indies-tour-of-england-2024");
		//driver.findElement(By.linkText("Scorecard1")).click();//invalid link text
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: 
		//Unable to locate element: {"method":"link text","selector":"Scorecard1"}
//		List<WebElement> list= driver.findElements(By.xpath("//a[text()=' Holder ']/parent::div[contains(@class,'cb-col-254 ')] /following-sibling::div"));
//		//invalid xpath
//		System.out.println(list.size());
		checkEleemntIsDisplayed();
	}
	public static boolean  checkEleemntIsDisplayed()
	{
		List<WebElement> list=driver.findElements(By.xpath("//a[text()=' Holder ']/parent::div[contains(@class,'cb-col-254 ')] /following-sibling::div"));
		if(list.size()>0)
		{
			System.out.println("Element present on webpage");
			return true;
		}
		else
		{
			System.out.println("Element  not present on webpage");
			return false;
		}
	}

}
