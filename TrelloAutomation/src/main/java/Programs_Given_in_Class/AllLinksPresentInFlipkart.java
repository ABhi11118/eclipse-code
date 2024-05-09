package Programs_Given_in_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksPresentInFlipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement e : allLinks) {
			System.out.println(e.getText());

		}
	}
}
