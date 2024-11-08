package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
		static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains(""));//An expectation for checking that the title contains a case-sensitive substring
		//Parameters:title the fragment of title expectedReturns:true when the title matches, false otherwise
		wait.until(ExpectedConditions.titleIs(null));//An expectation for checking the title of a page.
		//Parameters:title the expected title, which must be an exact matchReturns:true when the title matches, false otherwise
		wait.until(ExpectedConditions.urlContains(null));//An expectation for the URL of the current page to contain specific text.
		//Parameters:fraction the fraction of the url that the page should be onReturns:true when the URL contains the text
	
		wait.until(ExpectedConditions.urlToBe(null));//An expectation for the URL of the current page to be a specific url.
		//Parameters:url the url that the page should be onReturns:true when the URL is what it should be
		

	}

}
