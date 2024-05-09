package methodsOfWebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToUrltoUrl {
	public static void main(String[] args) throws MalformedURLException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
		URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
		// build the groups page URL
		URL groupsPageUrl = new URL(mainUrl, "group/");
		// build the defense page URL
		URL defensePageUrl = new URL(mainUrl, "defense/");
		// build the civil page URL
		URL civilPageUrl = new URL(mainUrl, "civil/");
		// build the Space page URL
		URL spacePageUrl = new URL(mainUrl, "space/");
		// build passion page URL
		URL passionPageUrl = new URL(mainUrl, "passion/");
		// -------------------------------------------------------------
		Thread.sleep(3000);

		driver.navigate().to(defensePageUrl);
		Thread.sleep(3000);

		driver.navigate().to(passionPageUrl);
		Thread.sleep(3000);

		driver.navigate().to(spacePageUrl);
		Thread.sleep(3000);

		driver.navigate().to(civilPageUrl);
		Thread.sleep(3000);

		driver.navigate().to(groupsPageUrl);
		// post condition
		driver.manage().window().minimize();
		// terminate the session
		driver.quit();
	}
}
