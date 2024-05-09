package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingAltenativeTextToDiffTextfeilds {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Venu%20Gopal%20Reddy/Downloads/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		Thread.sleep(3000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(3000);
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f); // Controller is pointing to T2 with WebElement reference
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("d");
		driver.manage().window().minimize();
		driver.quit();
	}
}
