package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ElementUtil ele=new ElementUtil(driver);
		ele.launchBrowser("https://jqueryui.com/resources/demos/droppable/default.html");
//		driver=new ChromeDriver();
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		By drag=By.id("draggable");
		By drop =By.id("droppable");
		
//		ele.getElement(drag);
//		ele.getElement(drop);
		//ele.doDragAndDrop(ele.getElement(drag), ele.getElement(drop));
		ele.doDragAndDrop(drag, drop);
//		WebElement drag=driver.findElement(By.id("draggable"));
//		WebElement drop =driver.findElement(By.id("droppable"));
//		Actions act=new Actions(driver);
//		Thread.sleep(1500);
//		act.dragAndDrop(drag, drop).build().perform();
		//doDragAndDrop(drag,drop);
	}
	public static void doDragAndDrop(WebElement drag,WebElement drop) throws InterruptedException
	{
		Actions act=new Actions(driver);
		Thread.sleep(1500);
		//act.dragAndDrop(drag, drop).build().perform();
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	}

}
