package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessAndIncognito {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--headless");
//		WebDriver driver=new ChromeDriver(co);
//		driver.get("https://www.amazon.com");
//		System.out.println(driver.getTitle());
		co.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
