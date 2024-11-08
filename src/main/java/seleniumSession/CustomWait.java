package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		retryingElement(twitterLink,10,2000);

	}
	public static void retryingElement(By locator,int timeOut)
	{
		int attempts=0;
		while(attempts<timeOut)
		{
			try
			{
			driver.findElement(locator).click();
			System.out.println("element is found...." + locator + " in attempt : " + attempts);
			break;
			}
			catch(NoSuchElementException e)
			{
				System.out.println("element is not found..." + locator + " in attempt : " + attempts);
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempts++;
		}
	}
	public static void retryingElement(By locator,int wait,int pollingTime)
	{
		int attemps=0;
		while(attemps<wait)
		{
			try
			{
			driver.findElement(locator).click();
			System.out.println("element is found...." + locator + " in attempt : " + attemps);
			break;
			}
			catch(NoSuchElementException e)
			{
				System.out.println("element is  not found...." + locator + " in attempt : " + attemps);
				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attemps++;
			
		}
	}

}
