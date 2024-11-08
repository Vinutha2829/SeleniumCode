package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorHub {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		By locator=By.xpath("//a[text()='Garry.White']/parent::td/preceding-sibling::td/input");
//		driver.findElement(locator).click();
		selectUser("Jasmine.Morgan");
//		List<WebElement> list =driver.findElements(By.xpath("//a[text()='Garry.White']/parent::td/following-sibling::td"));
//		for(WebElement e:list)
//		{
//			System.out.println(e.getText());
//		}
		List<String> userInfo=getUserInfo("Jasmine.Morgan");
		System.out.println(userInfo);
	}
	public static void selectUser(String userName)
	{
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input")).click();
	}
	public static List<String> getUserInfo(String userName)
	{
		List<String> userInfo=new ArrayList<String>();
		List<WebElement> list =driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		for(WebElement e:list)
		{
			String text=e.getText();
			userInfo.add(text);
		}
		return userInfo;
	}

}
