package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateToStringUrl {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		// pass the main URL of the app
		driver.get("https://www.dassault-aviation.com/en/");
		// go to passion page - pass the sub URL
		Thread.sleep(6000);
		// URL of the same application but different webpages
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		// get back to the previous page
		Thread.sleep(2000);
		driver.navigate().back();
		// move forward to the passion page
		Thread.sleep(2000);
		driver.navigate().forward();

	}
}
