package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String username="admin";
		String password="admin";
		String url="https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		driver.get(url);

	}

}
