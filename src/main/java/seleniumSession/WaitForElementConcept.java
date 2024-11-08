package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementConcept {
			static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By locator=By.name("username");
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		/*An expectation for checking that an element is present on the DOM of a page. 
		 * This does not necessarily mean that the element is visible.
			Parameters:locator used to find the elementReturns:
			return : WebElement 
		 * */
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys("Testing");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys("Testing");
		waitForElementPresence(5,locator).sendKeys("Testing");
	}
	public static WebElement waitForElementPresence(int timeOut,By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		WebElement element =wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}

}
