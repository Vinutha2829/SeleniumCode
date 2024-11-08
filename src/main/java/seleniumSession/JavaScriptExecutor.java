package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		String value=js.executeScript("return document.title").toString();
//		System.out.println(value);
		//JavaScriptUtil js=new JavaScriptUtil(driver);
//		String title=js.getTitleByJS();
//		System.out.println(title);
//		js.generateAlert("Hello");
//		Thread.sleep(1500);
//		WebElement element=driver.findElement(By.xpath("//span[@class='input-group-btn']"));
//		js.drawBorder(element);
		
		



	}

}
