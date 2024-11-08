package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//div[@class='comboTreeInputWrapper']/button/span)[position()=2]
				driver=new ChromeDriver();
				driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
				Thread.sleep(5000);
				driver.findElement
				(By.xpath("(//span[@class='comboTreeArrowBtnImg'])[position()=2]")).click();
				Thread.sleep(3000);
				List<WebElement> list=driver.findElements(By.xpath
						("(//div[@class='comboTreeDropDownContainer'])[last()]//li/span[@class='comboTreeItemTitle']"));
				for(WebElement e:list)
				{
//					System.out.println(e.getText());
					if(e.getText().equals("choice 2"))
					{
						e.click();
						break;
					}
				}

	}

}
