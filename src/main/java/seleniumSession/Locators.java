package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("vinutha");
		driver.findElement(By.name("lastname")).sendKeys("T");
		driver.findElement(By.xpath("//input[@class='form-control' and @type='email']")).sendKeys("dsvgg@gmail.com");
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("32578987654");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.close();
		

	}

}
