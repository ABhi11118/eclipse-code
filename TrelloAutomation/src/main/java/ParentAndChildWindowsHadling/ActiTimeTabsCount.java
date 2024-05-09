package ParentAndChildWindowsHadling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTabsCount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWh = driver.getWindowHandles();
		int count = allWh.size();
		System.out.println("Total no of windows present in this tab is " + count);
		for (String wh : allWh) {
			System.out.println(wh);
			driver.switchTo().window(wh);
			driver.switchTo().window(wh);
			driver.close();
		}
	}

}
