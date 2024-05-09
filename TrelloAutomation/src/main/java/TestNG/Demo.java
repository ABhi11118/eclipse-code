package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void demoTest() {
		Reporter.log("welcome to TestNG", true);
	}

}
