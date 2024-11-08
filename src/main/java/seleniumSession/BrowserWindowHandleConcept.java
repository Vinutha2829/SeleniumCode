package seleniumSession;


import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Set<String> set=driver.getWindowHandles();
		Iterator it =set.iterator();
		String parentWindowId=it.next().toString();
		String childWindowId=it.next().toString();
		System.out.println(parentWindowId);
		System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//System.out.println(driver.getCurrentUrl());  
		/* Exception:Exception in thread "main" org.openqa.selenium.NoSuchWindowException: no such window: target window already closed
from unknown error: web view not found */
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
