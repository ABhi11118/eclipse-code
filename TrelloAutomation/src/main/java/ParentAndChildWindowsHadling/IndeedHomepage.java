package ParentAndChildWindowsHadling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedHomepage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		driver.findElement(By.id("login-google-button")).click();
		String windowHandle = driver.getWindowHandle(); // to get only current window id
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles(); // to get all window id's
		int count = windowHandles.size(); // to get the no of windows present in Current page
		System.out.println("Count of child windows present in webpage is :" + count);
		for (String allWindows : windowHandles) {
			System.out.println(allWindows);

		}

	}
}
