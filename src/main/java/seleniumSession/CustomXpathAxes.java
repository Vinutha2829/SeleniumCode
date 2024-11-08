package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathAxes {
			static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		//strong[text()='India']/parent::td/preceding-sibling::td/child::input[@type='checkbox']
		Thread.sleep(5000);
		clickCheckForUser("Taiwan");
		List<String> value=getUserInfo("Taiwan");
		System.out.println(value);
		//driver.get("https://demo.guru99.com/test/newtours/register.php");
		//normalizeSpace();
	}
	public static void clickCheckForUser(String userName)
	{
		driver.findElement(By.xpath("//strong[text()='"+userName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
	}
	public static List<String> getUserInfo(String userName)
	{
		List<String> string =new ArrayList<String>();
		List<WebElement> userInfo=driver.findElements(By.xpath("//strong[text()='"+userName+"']/parent::td/following-sibling::td"));
		for(WebElement e: userInfo)
		{
			String value=e.getText();
			string.add(value);
		}
		return string;
	}
	public static void normalizeSpace()
	{
		driver.findElement(By.xpath("//option[normalize-space()='AMERICAN SAMOA']")).click();
	}
}
