package ParentAndChildWindowsHadling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitilesOfAllWindows {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allWids = driver.getWindowHandles();
	for(String wids:allWids)
	{
		driver.switchTo().window(wids);
		String title = driver.getTitle();
		System.out.println(title);
	}
	System.out.println(allWids);
	driver.quit();
}
}
