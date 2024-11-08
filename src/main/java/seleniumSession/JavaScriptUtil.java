package seleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	private WebDriver driver;
	private JavascriptExecutor js;
	public JavaScriptUtil(WebDriver driver)
	{
		this.driver=driver;
		 js=(JavascriptExecutor)this.driver;
	}
	public String getTitleByJS() {
		return js.executeScript("return document.title").toString();
	}
	public void generateAlert(String message)
	{
		js.executeScript("alert('"+message+"')");
	}
	public void generateConfirmPopUp(String message) {
		js.executeScript("confirm('" + message + "')");
	}
	public void goBackByJS() {
		js.executeScript("history.go(-1)");
	}
	
	public void goForwardByJS() {
		js.executeScript("history.go(1)");
	}
	
	public void refreshBrowserByJS() {
		js.executeScript("history.go(0);");
	}
	
	public void scrollPageUp() {
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	public void scrollPageDown(String height) {
		js.executeScript("window.scrollTo(0, '" + height + "')");
	}
	public void scrollPageDownMiddlepage() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
	}
	/**
	 * example: "document.body.style.zoom = '400.0%'"
	 * @param zoomPercentage
	 */
	public void zoomChromeEdge(String zoomPercentage) {
		String zoom = "document.body.style.zoom = '"+zoomPercentage+"%'";
		js.executeScript(zoom);
	}
	public void drawBorder(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public void sendKeysUsingWithId(String id, String value) {
		js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
						  //document.getElementById('input-email').value ='tom@gmail.com'
	}
	public void clickElementByJS(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}

}
