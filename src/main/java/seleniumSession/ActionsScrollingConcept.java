package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(1500);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN)
		.sendKeys(Keys.PAGE_DOWN)
		.sendKeys(Keys.PAGE_DOWN)
		.sendKeys(Keys.PAGE_DOWN)
		.sendKeys(Keys.PAGE_DOWN)
		.sendKeys(Keys.PAGE_DOWN)
		.build().perform();
//		act.sendKeys(Keys.CONTROL)
//		.sendKeys(Keys.END).build().perform();
		act.sendKeys(Keys.CONTROL)
		.sendKeys(Keys.HOME)
		.build().perform();
		String s="Vinutha";
		StringBuffer s1 =new StringBuffer("T");
		StringBuilder s2=new StringBuilder("madhan");
		driver.findElement(By.name("firstname")).sendKeys(s+s1+s2);
		
		
		

	}

}
