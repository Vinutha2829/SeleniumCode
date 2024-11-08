package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTablePaginationHandle1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/tagged/selenium");
		By locator=By.linkText("How to Login to linkedin using cookies in Python selenium");
		Thread.sleep(4000);
		while(true)
		{
		//1.if element present on page
		if(driver.findElements(locator).size()>0)
		{
			Thread.sleep(1500);
			driver.findElement(locator).click();
			break;
			}
		else
		{
			Thread.sleep(1500);
			driver.findElement(By.xpath("//a[@rel='next']")).click();
		}
		}
	}
	}


