package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementWithInterval {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By forgotPwdLink = By.linkText("Forgot Password?111");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		//Exception in thread "main" org.openqa.selenium.TimeoutException: 
		//Expected condition failed: waiting for visibility of element located by By.linkText: Forgot Password?111 (tried for 10 second(s) with 2000 milliseconds interval)
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPwdLink)).click();
		//(tried for 10 second(s) with 500 milliseconds interval)
	}

}
