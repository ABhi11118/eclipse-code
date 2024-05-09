package WorkonWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseRadioButton {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(4000);
		//identify the  radio button
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[@type='radio']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@type='radio']"));
		WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input[@type='radio']"));
		//Choose the male radio button
		maleRadioButton.click();
		Thread.sleep(4000);
		//female
		femaleRadioButton.click();
		Thread.sleep(4000);
		//custom
		customRadioButton.click();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();

		
	}
}
