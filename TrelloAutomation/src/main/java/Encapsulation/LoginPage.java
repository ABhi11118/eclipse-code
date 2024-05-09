package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement usernametxb;
	private WebElement pswdtxb;
	private WebElement loginbtn;

	public LoginPage(WebDriver driver) {
		usernametxb = driver.findElement(By.id("username"));
		pswdtxb = driver.findElement(By.name("pwd"));
		loginbtn = driver.findElement(By.xpath("//div[text()='Login ']"));
	}

	public void SetLogin(String un, String pswd) {
		usernametxb.sendKeys(un);
		pswdtxb.sendKeys(pswd);
		loginbtn.click();
	}

}
