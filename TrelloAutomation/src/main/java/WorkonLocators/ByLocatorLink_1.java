package WorkonLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLink_1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// FIND THE FORGOTTEN PASSWORD?
		WebElement linktext = driver.findElement(By.linkText("Forgotten password?"));
		linktext.click();
		driver.manage().window().minimize();
		driver.quit();
	}
}
