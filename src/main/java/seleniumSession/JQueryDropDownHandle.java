package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("(//div[@class='comboTreeWrapper'])[position()=1]")).click();
		By locator=By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span");
		List<WebElement> list=driver.findElements(locator);
		String[] value= {"choice 3","choice 10"};
			System.out.println(list.size());
			boolean flag=false;
			String wrong="";
			for(WebElement e:list)
			{
				String text=e.getText();
				System.out.println(text);
				for(int i=0;i<value.length;i++)
				{
					if(e.getText().equals(value[i]))
					{
						e.click();
						flag=true;
						
					}
					else
					{
						flag=false;
						wrong=value[i];
					}
				}
			}
			if(flag==false)
			{
				System.out.println("Wrong option:"+wrong);
			}
		
		
		
	}
}
