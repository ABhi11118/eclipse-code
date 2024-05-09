package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Browser {
	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("www.amazon.in");
	}
}
