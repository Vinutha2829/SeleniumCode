package seleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogetherAssignment {
			static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId=driver.getWindowHandle();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Set<String> handles=driver.getWindowHandles();
		List<String>handlesList=new ArrayList<String>(handles);
		for(int i=1;i<handlesList.size();i++)
		{
			twoBrowserHandle(parentWindowId,handlesList.get(i));
		}

	}
	public static void twoBrowserHandle(String parentWindowHandle,String childWindowHandle)
	{
		driver.switchTo().window(childWindowHandle);
		doGetCurrentUrl();
		doCloseBrowser();
		driver.switchTo().window(parentWindowHandle);
		doGetCurrentUrl();
		
	}
	public static void doGetCurrentUrl()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	public static void doCloseBrowser()
	{
		driver.close();
	}

}
