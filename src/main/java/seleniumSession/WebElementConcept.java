package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSession.ElementUtil;

public class WebElementConcept {
	 
	public static void main(String[] args) {
		WebDriver   driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//create webelement +perform action on it(sendkeys,click,dropdown)
		//1.approach:
		
//		driver.findElement(By.id("input-email")).sendKeys("vinutha2995@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("vinutha@29");
		
		//2.approach
		
//		WebElement elem=driver.findElement(By.id("input-email"));
//		WebElement ele=driver.findElement(By.id("input-password"));
//		elem.sendKeys("vinutha2995@gmail.com");
//		ele.sendKeys("vinutha@29");
		
		//3.approach:
		
//		By email=By.id("input-email");
//		By pwd=By.id("input-password");
//		WebElement elem=driver.findElement(email);
//		WebElement ele=driver.findElement(pwd);
//		elem.sendKeys("vinutha2995@gmail.com");
//		ele.sendKeys("vinutha@29");
		
		//4.approach:
		
//		By email=By.id("input-email");
//		By pwd=By.id("input-password");
//		getElement(email).sendKeys("vinutha2995@gmail.com");
//		getElement(pwd).sendKeys("vinutha2995");
//	}
//		public static WebElement getElement(By locator)
//		{
//			return driver.findElement(locator);
//		}
//
//	}
		//5.approach:
//		
//		By email=By.id("input-email");
//		By pwd=By.id("input-password");
//		doSendKeys(email,"vinutha2995@gmail.com");
//		doSendKeys(pwd,"vinutha2995");
//	}
//		public static WebElement getElement(By locator)
//		{
////			driver=null;
//			return driver.findElement(locator);
//		}
//		public static void doSendKeys(By locator,String value)
//		{
//			getElement(locator).sendKeys(value);
//		}
//	}
	

		//6.approach:
	ElementUtil ele=new ElementUtil(driver);
	By email=By.id("input-email");
	By pwd=By.id("input-password");
	ele.doSendKeys(email,"vinutha2995@gmail.com");
	ele.doSendKeys(pwd,"vinutha2995");	
}		
}
