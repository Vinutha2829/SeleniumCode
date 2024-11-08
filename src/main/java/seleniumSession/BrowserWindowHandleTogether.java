package seleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		/*  parent -->link-->get url and close
		 * move to another link get url and close
		 * move to another link get url and close
		 * move to another link get url and close and finally move to parent get url and close
		 * */
		String parentWindowId=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
		it.next();
		while(it.hasNext())
		{
			String windowHandle=it.next().toString();
			driver.switchTo().window(windowHandle);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			driver.close();
		}
		driver.switchTo().window(parentWindowId);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		

	}

}
