package WorkonWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOnDeselect_Checkbox {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		// identify the keepLoggedInCheckBox
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		// select the check box
		keepLoggedInCheckBox.click();
		Thread.sleep(5000);
		// un-check the check box
		keepLoggedInCheckBox.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
