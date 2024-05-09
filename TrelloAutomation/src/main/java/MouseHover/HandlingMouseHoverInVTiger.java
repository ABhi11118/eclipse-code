package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHoverInVTiger {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String PhNo = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/..//p[02]")).getText();
		System.out.println(PhNo);
		driver.manage().window().maximize();
		driver.quit();

	}
}
