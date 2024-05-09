package HandlingDisabledElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisabledTextElement {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/Venu%20Gopal%20Reddy/Downloads/DisabledButton.html");
Thread.sleep(3000);
driver.findElement(By.id("d1")).sendKeys("admin");
//RemoteWebDriver r=(RemoteWebDriver) driver; //used for Entire code
JavascriptExecutor j=(JavascriptExecutor) driver;
Thread.sleep(3000);
j.executeScript("document.getElementById('d2').value='manager'");
driver.quit();
	}
}
