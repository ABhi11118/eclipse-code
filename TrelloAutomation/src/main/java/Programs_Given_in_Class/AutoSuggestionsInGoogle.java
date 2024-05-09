package Programs_Given_in_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsInGoogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("AB D");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(.,'AB de Villiers')]"));
		Thread.sleep(9000);
		for (WebElement e : suggestions) {
			System.out.println(e.getText());

		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
