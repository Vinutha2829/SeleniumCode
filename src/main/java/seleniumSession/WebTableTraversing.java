package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTraversing {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> tableList=driver.findElements(By.xpath("//table[@id='customers']//td"));
		int size=tableList.size();
		System.out.println(size);
		for(WebElement e:tableList)
		{
			System.out.println(e.getText());
		}
		for(int i=0;i>size;i++)
		{
			driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]"));
		}

	}
	

}
