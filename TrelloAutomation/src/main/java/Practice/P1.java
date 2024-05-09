package Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cricbuzz.com/");
		WebElement liveScore = driver.findElement(By.className("cb-hm-mnu-itm"));
		liveScore.click();
		driver.quit();
	}
	}

