package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageMainMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l1 = new LoginPage(driver);
		l1.SetLogin("admin", "manager");
		l1.SetLogin("admin5", "manager1"); //SeleniumStableElementExeption
	}

}
