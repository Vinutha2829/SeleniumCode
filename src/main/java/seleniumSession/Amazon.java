package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(15000);
		System.out.println(amazonFooterText());
		String url=amazonFooterClick("Careers");
		System.out.println(url);
		if(url.contains("jobs"))
				{
			      System.out.println("true");
				}

	}
	public static List<String> amazonFooterText()
	{
		List<String> list=new ArrayList<String>();
		List<WebElement> footer=driver.findElements(By.xpath("//div[@class='navFooterColHead']/parent::div//li/a"));
		for(WebElement e:footer)
		{
			list.add(e.getText());
		}
		return list;
	}
	public static String amazonFooterClick(String text)
	{
		driver.findElement(By.xpath("//div[@class='navFooterColHead']/parent::div//li/a[text()='"+text+"']")).click();
		return driver.getCurrentUrl();
		
	}

	}


