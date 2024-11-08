package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//img[contains(@title,'Vehicle')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("tata nexon");
		//file upload
		driver.findElement(By.xpath("//input[@class='file_upload']")).sendKeys("C:\\Users\\vinut\\OneDrive\\Documents\\Resume\\Vinutha Resume.docx");

	}

}
