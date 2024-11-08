package seleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cosmocode {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//strong[text()='Afghanistan']/parent::td/preceding-sibling::td/input")).click();
		//Thread.sleep(5000);
		//Thread.sleep(5000);
		//countryCheckBox("Afghanistan");
//		Thread.sleep(5000);
//
//		System.out. println(countryInfo("india"));
//		boolean flag=validation("Indian Rupee",countryInfo("India"));
//		System.out.println(flag);
	}
	
	public static void  countryCheckBox(String userName) throws InterruptedException
	{
		WebElement click=driver.findElement(By.xpath("//strong[text()='"+userName+"']/parent::td/preceding-sibling::td/input1"));
		Thread.sleep(5000);
		click.click();
		 //countryInfo(userName);
	}
	public static List<String> countryInfo(String userName)
	{
		List<WebElement> info=driver.findElements(By.xpath("//strong[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> countryInfo=new ArrayList<String>();
		for(WebElement e:info)
		{
			countryInfo.add(e.getText());
		}
		return countryInfo;
	}
	public static boolean validation(String text,List<String> countryInfo)
	{
		boolean flag=false;
		for(int i=0;i<countryInfo.size();i++)
		{
			if(text.equals(countryInfo))
			{
				flag=true;
			}
			
		}
		return flag;
	}
}
