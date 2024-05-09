package actiTime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class CustomerModule {
	@Test(priority = 1, invocationCount = 2)
	public void createCustomer() {
		Reporter.log("Create a  Customer", true);
	}

	@Test(priority =2,dependsOnMethods = "CustomerModule")
	public void modifyCustomer() {
		Reporter.log("Modified Customer ", true);
	}

	@Test(priority = 3,dependsOnMethods = {"CustomerModule","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("Delete a Customer", true);
	}
}
