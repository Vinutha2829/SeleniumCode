package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//By  firstname=By.xpath("//input[@name='firstname']");
		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(firstname), "vinutha")
//		.sendKeys(Keys.TAB)
//		.pause(1000)
//		.sendKeys("T")
//		.sendKeys(Keys.TAB)
//		.pause(1000)
//		.sendKeys("vinutha@gmail.com")
//		.sendKeys(Keys.TAB)
//		.pause(1000)
//		.sendKeys("8072039137")
//		.sendKeys(Keys.TAB)
//		.pause(1000)
//		.sendKeys("Vinutha@123")
//		.sendKeys(Keys.TAB)
//		.pause(1000)
//		.sendKeys("Vinutha@123")
//		.pause(1000)
//		.sendKeys(Keys.TAB)
//		.pause(1000)
//		.sendKeys(Keys.TAB)
//		.pause(1000)
//		.sendKeys(Keys.TAB)
//		.pause(1000)
//		.build().perform();
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://www.flipkart.com/");
		act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("Macbook")
		.sendKeys(Keys.ENTER)
		.build().perform();
		

	}

}
