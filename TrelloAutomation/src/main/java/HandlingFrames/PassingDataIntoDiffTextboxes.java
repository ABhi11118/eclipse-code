package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingDataIntoDiffTextboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Venu%20Gopal%20Reddy/Downloads/page1.html");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("Kohli");
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("Virat");
		driver.manage().window().minimize();
		driver.quit();

	}

}
