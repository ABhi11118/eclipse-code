package Programs_Given_in_Class;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlesPresentInActiTime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[04]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.id("Read Service Agreement")).click();
		String expectedTitle = "actiTIME Online Terms of Service";
		Set<String> address = driver.getWindowHandles();
		for (String a : address) {
			driver.switchTo().window(a);
			String actualTitle = driver.getTitle();
			if (expectedTitle.equals(actualTitle)) {
				List<WebElement> headings = driver.findElements(By.tagName("h2"));
				for (WebElement h : headings) {
					System.out.println(h.getText());
				}
			}
		}

	}

}
