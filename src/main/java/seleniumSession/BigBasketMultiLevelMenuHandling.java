package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {
		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ElementUtil ele=new ElementUtil(driver);
		ele.launchBrowser("https://www.bigbasket.com/");
//		driver =new ChromeDriver();
//		driver.get("https://www.bigbasket.com/");
		//driver.findElement(By.xpath("(//div[contains(@class,'grid')]/span[text()='Shop by'])[2]")).click();
		By locator=By.xpath("(//div[contains(@class,'grid')]/span[text()='Shop by'])[2]");
		ele.getElement(locator).click();
		By parentMenu=By.linkText("Beverages");
		By childMenu =By.linkText("Tea");
		By click=By.linkText("Green Tea");
		Thread.sleep(1500);
//		//multiLevelMenuChildMenuHandle(parentMenu,childMenu,click);
//		
		ele.multiLevelMenuChildMenuHandle(parentMenu, childMenu, click);
		Thread.sleep(1500);
		
	}
	public static void multiLevelMenuChildMenuHandle(By parentMenu,By childMenu,By click) throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(parentMenu)).build().perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(childMenu)).build().perform();
		Thread.sleep(1000);
		driver.findElement(click).click();
	}
	 

}
