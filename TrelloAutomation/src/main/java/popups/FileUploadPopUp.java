package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjwkeqkBhAnEiwA5U-uM-I-tMDGt0-LdBY74s6QHKiWrziJcctp70SlBa29mb_PMkLCEv_BNBoCvYYQAvD_BwE&gclsrc=aw.ds");
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\Venu Gopal Reddy\\Downloads\\Java Resume.docx");
}
}
