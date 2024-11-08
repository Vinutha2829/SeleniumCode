package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
   static WebDriver driver;
	public static void main(String[] args) {
		ElementUtil ele=new ElementUtil(driver);
		ele.launchBrowser("http://swisnl.github.io/jQuery-contextMenu/demo.html");
//		driver =new ChromeDriver();
//		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		By contentClcik=By.xpath("//span[text()='right click me']");
		//WebElement rightClickContent =driver.findElement(By.xpath("//span[text()='right click me']"));
//		Actions act=new Actions(driver);
//		act.contextClick(rightClickContent).build().perform();
		//doContextClick(contentClcik);
		ele.doContextClick(contentClcik);
		String value="Copy";
		By actionClick=By.xpath("//li//span[text()='"+value+"']");
		By rightClickValue=By.xpath("//li//span");
		//doActionsClick(actionClick);
//		doContentClcikSize(actionClick);
		System.out.println(ele.doContentClcikSize(contentClcik,rightClickValue));
		List<String> string =new ArrayList<String>(ele.doContentClcikValues(contentClcik,rightClickValue));
		for(String st:string)
		{
			System.out.println(st);
		}
		ele.doActionsClickAndGetTextAndAct(actionClick);
		}
	public static void doContextClick(By locator)
	{
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(locator)).build().perform();
	}
	public static void doActionsClick(By locator)
	{
		Actions act=new Actions(driver);
		act.click(driver.findElement(locator)).build().perform();
	}
	public static int doContentClcikSize(By locator)
	{
		doContextClick(locator);
		List<WebElement> link =driver.findElements(By.xpath("//li//span"));
		int size=link.size();
		return size;
	}
	public static List<String> doContentClcikValues(By locator)
	{
		doContextClick(locator);
		List<WebElement> link =driver.findElements(By.xpath("//li//span"));
		List<String> string =new ArrayList<String>();
		for(WebElement e: link)
		{
			String value=e.getText();
			string.add(value);
		}
		return string;
	}
	public static void doActionsClickAndGetTextAndAct(By locator)
	{
		Actions act=new Actions(driver);
		act.click(driver.findElement(locator)).build().perform();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
//	public static void doAlertText()
//	{
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//	}
//	public static void doAlertAccept()
//	{
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
//	}

}
