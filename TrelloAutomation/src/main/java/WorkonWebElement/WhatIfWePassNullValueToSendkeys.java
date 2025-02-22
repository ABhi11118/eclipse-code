package WorkonWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWePassNullValueToSendkeys {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// We Cannot Pass the Null value with sendKeys
		// IllegalArgumentException - Java - run - unchecked
		driver.findElement(By.id("username")).sendKeys(null);
	}
}
