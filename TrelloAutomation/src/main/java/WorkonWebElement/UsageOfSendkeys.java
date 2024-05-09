package WorkonWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendkeys {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// identify the user name text field
		WebElement usernameTextField = driver.findElement(By.id("username"));
//		WebElement e3 = driver.findElement(By.xpath(""));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		
	}
}
