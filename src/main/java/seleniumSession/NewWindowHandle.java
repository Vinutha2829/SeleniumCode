package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);//introduced in selenium4
		driver.get("https://www.google.com/");
		

	}

}
