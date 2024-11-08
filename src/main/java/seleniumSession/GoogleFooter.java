package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooter {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//div[contains(@class,'KxwPGc')]/a[@class='pHiOh']
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		System.out.println(googleFooterText());
		String url=googleFooterClick("Terms");
		System.out.println(url);
		if(url.contains("terms"))
				{
			      System.out.println("true");
				}

	}
	public static List<String> googleFooterText()
	{
		List<String> list=new ArrayList<String>();
		List<WebElement> footer=driver.findElements(By.xpath("//div[contains(@class,'KxwPGc')]/a[@class='pHiOh']"));
		for(WebElement e:footer)
		{
			list.add(e.getText());
		}
		return list;
	}
	public static String googleFooterClick(String text)
	{
		driver.findElement(By.xpath("//div[contains(@class,'KxwPGc')]//a[text()='"+text+"']")).click();
		return driver.getCurrentUrl();
		
	}

}
