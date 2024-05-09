package ParentAndChildWindowsHadling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheSpecifiedBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String wid = driver.getWindowHandle();
		System.out.println(wid);
		Set<String> allWids = driver.getWindowHandles();
		for (String wh : allWids) {
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			if (wid.equals(wh)) {
				System.out.println(wh);
			} else {
				driver.close();
			}
		}

	}
}
