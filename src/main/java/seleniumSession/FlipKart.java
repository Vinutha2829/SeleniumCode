package seleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Thread.sleep(7000);
		//List<WebElement> list =getFlipKartFooterLinkElements();
//		for(WebElement e: list)
//		{
//			System.out.println(e.getText());
//		}
		clickFilpkartFooterLink("About Us");
	}
	public static List<WebElement> getFlipKartFooterLinkElements()
	{

		return driver.findElements(By.xpath("//div[@class='-qLUdm']//div[@class='_1ZMrY_']//div//a"));	
		
	}
	public static void clickFilpkartFooterLink(String FoterName)
	{
		driver.findElement(By.xpath("//div[@class='-qLUdm']/child::div/div/div//a[text()=FoterName]"));
	}

}
