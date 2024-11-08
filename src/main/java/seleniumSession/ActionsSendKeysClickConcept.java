package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysClickConcept {
      public static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email=By.name("email");
		By pwd=By.name("password");
		By login=By.xpath("//input[@value='Login']");
//		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(email), "vinutha@gmail.com").build().perform();
//		act.sendKeys(driver.findElement(pwd), "vinutha@123").build().perform();
//		act.click(driver.findElement(login)).build().perform();
		ElementUtil ele=new ElementUtil(driver);
		ele.doActionsSendKeys(email,"vinutha@gmail.com");
		ele.doActionsSendKeys(pwd,"vinutha@123");
		ele.doActionsClick(login);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsSendKeys(By locator,String value)
	{
		Actions act=new Actions(driver);
		act.sendKeys(getElement((locator)), value).build().perform();
	}
	public static void doActionsClick(By locator)
	{
		Actions act=new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
