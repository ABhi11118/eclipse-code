package WorkonLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithLinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nbtindia.gov.in/");
		// When not to go link text?
		// Note: Link text will never identify the <a> element if it contains an
		// unbreakable space
//		WebElement element = driver.findElement(By.linkText("CATALOGUES"));
		WebElement e2 = driver.findElement(By.id(null));
		WebElement element = driver.findElement(By.partialLinkText("CATALOGUES"));
		element.click();
	}
}
