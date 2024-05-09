package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingOfCareinsurance {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@id='alternative_number']")).sendKeys("9845098450");
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		driver.manage().window().minimize();
		driver.quit();

	}
}
