package seleniumSession;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By link=By.xpath("//a[contains(@href,'youtube')]");
//		driver.findElement(By.linkText("twitter")).click();
//		driver.findElement(By.linkText("facebook")).click();
//		driver.findElement(By.linkText("linkedin")).click();
		String parent=driver.getWindowHandle();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(link));
		ele.click();
		boolean flag= wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		if(flag==true)
		{
			System.out.println(driver.getCurrentUrl());
		}
		Set<String> list=driver.getWindowHandles();
		Iterator it=list.iterator();
		it.next();
		String child=it.next().toString();
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		
		
		

	}

}
