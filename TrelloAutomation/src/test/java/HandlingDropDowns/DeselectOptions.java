package HandlingDropDowns;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DeselectOptions {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Venu%20Gopal%20Reddy/Downloads/daydropddown.html");
		WebElement dayDropDown = driver.findElement(By.tagName("select"));
		Select daySelect = new Select(dayDropDown);
		daySelect.selectByIndex(0);
		daySelect.selectByIndex(5);
		daySelect.selectByIndex(1);
		daySelect.selectByIndex(2);
		Thread.sleep(5000);
//		deselect Jan month in the given list box by index
		daySelect.deselectByIndex(0);
		//deselect Jan month in the given list box by value
		daySelect.deselectByValue("1");
		//deselect Jan month in the given list box by visible text
		daySelect.deselectByVisibleText("Jan");
		//get all the selected option in the multi - select dropdown list box
		List<WebElement> allSelectedOptions = daySelect.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());
		for (WebElement selectedOption : allSelectedOptions) {
			System.out.println(selectedOption.getText());
		}
		//de-select all selected option
		daySelect.deselectAll();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
