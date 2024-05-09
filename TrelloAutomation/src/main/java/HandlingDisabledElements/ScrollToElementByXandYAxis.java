package HandlingDisabledElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementByXandYAxis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
//	j.executeScript("window.scrollBy(3000,0)"); //for Horizontal x-axis Scrolling
		j.executeScript("window.scrollBy(0,3000)"); // for Vertical y-axis Scrolling

	}
}
