package seleniumSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementsConcept {
		static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By footer=By.xpath("//div[text()='Support & Success']/parent::div/child::ul/li/a");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		/*An expectation for checking that there is at least one element present on a web page.
        Parameters:locator used to find the elementReturns:
        the list of WebElements once they are located
	 * */
		//List<WebElement> element=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
		
		/*
		 * An expectation for checking that all elements present on the web page that match the locatorare visible. Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
                 Parameters:locator used to find the elementReturns:
                 the list of WebElements once they are located*/
		List<WebElement> element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
	
		System.out.println(element.size());
		

	}
	
}
