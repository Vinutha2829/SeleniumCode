package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
		Select select =new Select(driver.findElement(By.id("country")));
		select.selectByIndex(1);
		select.selectByValue("AX");
		select.selectByVisibleText("Albania");

	}

}
