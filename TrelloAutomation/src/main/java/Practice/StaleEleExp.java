package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleEleExp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernametxbx = driver.findElement(By.id("username"));
		driver.navigate().refresh();
		usernametxbx.sendKeys("admin");
		driver.quit();

	}
}
