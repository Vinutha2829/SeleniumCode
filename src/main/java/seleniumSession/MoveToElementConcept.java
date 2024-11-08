package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1500);
		//By ParentMenu=By.xpath("//a[@title='Login']//span[text()='Login']");
		By ParentMenu=By.xpath("//img[@alt='Fashion']");
		By childMenu =By.linkText("Men's Top Wear");
		ElementUtil ele=new ElementUtil(driver);
		//ele.handleTwoLevelMenu(ParentMenu, childMenu);
		ele.handleTwoLevelMenu(ParentMenu, "Men's Top Wear");
		//WebElement contactMenu =driver.findElement(parentMenu);
//		Actions act=new Actions(driver);
//		act.moveToElement(contactMenu).build().perform();
		//driver.findElement(childMenu).click();
		//handleTwoLevelMenu(ParentMenu,childMenu);
		//handleTwoLevelMenu(ParentMenu,"Orders");
		Thread.sleep(1500);
		System.out.println(driver.getCurrentUrl());
		}
	public static void handleTwoLevelMenu(By parentMenu,By childMenu) throws InterruptedException
	{
		WebElement contactMenu =driver.findElement(parentMenu);
		Actions act=new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(1500);
		driver.findElement(childMenu).click();
	}
	public static void handleTwoLevelMenu(By parentMenu,String value) throws InterruptedException
	{
		WebElement contactMenu =driver.findElement(parentMenu);
		Actions act=new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(1500);
		driver.findElement(By.linkText(value)).click();
	}

}
