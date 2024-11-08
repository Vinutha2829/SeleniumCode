package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
       static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
		Thread.sleep(5000);
		searchList("selenium rich foods");
//		List<WebElement>searchList= driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//		for(WebElement e:searchList)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("selenium testing"))
//			{
//				e.click();
//				break;
//			}
//		}

	}
	public static void searchList(String suggestion)
	{
		List<String> list=new ArrayList<String>();
		List<WebElement>searchList= driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		for(WebElement e:searchList)
		{
			String text=e.getText();
			list.add(text);
			if(text.equals(suggestion))
			{
				e.click();
				break;
			}
		}
		System.out.println(list);
	}


}
