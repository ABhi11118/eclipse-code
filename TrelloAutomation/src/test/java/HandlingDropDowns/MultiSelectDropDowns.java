package HandlingDropDowns;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDowns {
	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Venu%20Gopal%20Reddy/Downloads/daydropddown.html");
		WebElement dayDropDown = driver.findElement(By.tagName("select"));
		Select daySelect = new Select(dayDropDown);
		//Multi-Select Check
		if (daySelect.isMultiple()) {
			System.out.println("Boolean True - Muti Select");
			Thread.sleep(5000);
			
		}else {
			System.out.println("Boolean False - Single Select");

		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
