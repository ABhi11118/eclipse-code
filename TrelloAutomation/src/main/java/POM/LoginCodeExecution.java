package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCodeExecution {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPageActtime l = new LoginPageActtime(driver);
		l.setLoginPage("admin5", "manager1"); // SeleniumStableElementExeption
		
		Thread.sleep(3000);
		l.setLoginPage("admin", "manager");

	}
}
