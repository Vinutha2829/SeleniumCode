package seleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		String parentWindowId=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Set<String> handles=driver.getWindowHandles();
		List<String> listHandle=new ArrayList<String>(handles);
		for(int i=1;i<listHandle.size();i++)
		{
		String handleWindow=listHandle.get(i);
		driver.switchTo().window(handleWindow);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		Thread.sleep(1500);
		}
		driver.switchTo().window(parentWindowId);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
