package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByID {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		// find the keepLoggedInCheckBox
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		// select the checkBox
		keepLoggedInCheckBox.click();
		driver.quit();
	}
}
