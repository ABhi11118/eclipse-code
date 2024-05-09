package WorkonLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByPartial_LinkText {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alvas.org/");
		// Alva’s College of Medical Laboratory Technology & Post Graduate Research
		// Centre
		// Note: Partial Tag text will work for any continous sequential tag text <a>
		// <a> when it is very lengthy
		// <a> tagtext unbreakble spaces
		WebElement college = driver.findElement(By.partialLinkText("Medical Laboratory Technology"));
		new Actions(driver).scrollToElement(college).perform();
		Thread.sleep(5000);
		college.click();

	}
}
