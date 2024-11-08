package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickElementWhenReady {
			static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		By click=By.xpath("//span[text()='Live video']");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Vinutha T");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Vinutha@29");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		/*
		 * An expectation for checking an element is visible and enabled such that you can click it.
			Parameters:locator used to find the elementReturns:
			the WebElement once it is located and clickable (visible and enabled)*/
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(click));
		element.click();
		
		

	}

}
