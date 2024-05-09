package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActtime {
	@FindBy(id = "username")
	private WebElement usertxb;

	@FindBy(name = "pwd")
	private WebElement pswrdtxb;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBtn;

public LoginPageActtime(WebDriver driver){
	PageFactory.initElements(driver,this);
}
public void setLoginPage(String un,String pswd) {
	usertxb.sendKeys(un);
	pswrdtxb.sendKeys(pswd);
	loginBtn.click();
}
}
