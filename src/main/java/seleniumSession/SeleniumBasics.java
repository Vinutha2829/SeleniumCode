package seleniumSession;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumBasics {

	public static void main(String[] args) {
		Dimension dim=new Dimension(200,400);
		WebDriver driver=new ChromeDriver();//lauch browser
		//driver.manage().window().fullscreen();
		//driver.manage().window().maximize();// to launch browser on maximize screen
		driver.manage().window().setSize(dim);
		driver.get("https://www.google.com");//enter url
		String s=driver.getTitle();//to get title for page
		System.out.println(s);
		driver.navigate().to("https://www.Amazon.com");
//		driver.navigate().back();//to move back
//		System.out.println (driver.getCurrentUrl());//to get current page url
//		driver.navigate().forward();//to move forward
//		System.out.println (driver.getCurrentUrl());
//		driver.navigate().refresh();//to reload the page
//		driver.navigate().back();
//		driver.navigate().to("https://www.flipkart.com");//to enter url
//		driver.get(driver.getCurrentUrl());//to reload the page
//		System.out.println(driver.getPageSource());
		driver.quit();//to close browser
		

	}

}
