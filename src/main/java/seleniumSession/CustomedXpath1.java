package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomedXpath1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//text() and @attribute
		//htmltag[text(),'value' and @attr='value']
		driver.findElement(By.xpath("//span[text()='All' and @class='hm-icon-label']")).click();
		//htmltag[contains(argu,argu)]
		//a[contains(@class,'nav-a' ) and text()='Sell']
		
		
		
	}

}
