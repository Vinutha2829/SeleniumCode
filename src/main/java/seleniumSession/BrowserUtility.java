package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
	
	WebDriver driver;
	 public WebDriver initDriver(String browserName)
	{
	  switch(browserName.toLowerCase())
	{
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();
		break;
		default:
			System.out.println("Provide me valid browser name");
			break;
			
	}
	  return driver;
}
	 public void launchUrl(String url)
	 {
		 driver.get(url);
	 }
	 public String getCurrentUrl()
	 {
		 String url=driver.getCurrentUrl();
		 return url;
	 }
	 public String getTitle()
	 {
		 String title=driver.getTitle();
		 return title;
	 }
	 public void getCloseBrowser() {
		 driver.close();
	 }
	
	 
	 
	 
	 
	 
	 
	 
}

