package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?");
		Actions act=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//input[@id='login-username']"));
//		act.sendKeys(target, "v")
//		.pause(1500)
//		.sendKeys("i")
//		.pause(1500)
//		.sendKeys("n")
//		.pause(1500)
//		.sendKeys("u")
//		.build().perform();
		String s="vinutha@123";
		char[] c=s.toCharArray();
		for(char e:c)
		{
			act.sendKeys(target, String.valueOf(e)).pause(1500).build().perform();
		}
		
		
		
		

	}

}
