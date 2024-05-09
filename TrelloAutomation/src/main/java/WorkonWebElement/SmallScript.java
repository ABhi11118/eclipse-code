package WorkonWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmallScript {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		// Enter the username as admin
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		Thread.sleep(2000);
		// Enter the password
		WebElement passwordtextField = driver.findElement(By.name("pwd"));
		passwordtextField.clear();
		passwordtextField.sendKeys("manager");
		Thread.sleep(2000);
		// click on login button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
