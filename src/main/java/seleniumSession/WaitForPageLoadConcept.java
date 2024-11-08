package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoadConcept {
			static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		//waitForPageLoad(10);
		if(isPageLoaded())
		{
			System.out.println("PAGE DOM is fully loaded now....");
		}
	}
	public static void waitForPageLoad(int timeOut)
	{
		long end=System.currentTimeMillis()+timeOut;
		while(System.currentTimeMillis()<end)
		{   
			JavascriptExecutor js= (JavascriptExecutor)driver;
			String pageState=js.executeScript("return document.readyState").toString();
			if(pageState.equals("complete")) {
				System.out.println("PAGE DOM is fully loaded now...."+pageState);
			}
			else
			{
				System.out.println("PAGE IS not loaded...." + pageState);
			}
		}
	}
	public static boolean isPageLoaded()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState =='complete'")).toString();
		return Boolean.parseBoolean(flag);
	}

}
