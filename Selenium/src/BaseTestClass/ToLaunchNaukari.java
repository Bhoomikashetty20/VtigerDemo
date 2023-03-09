package BaseTestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ToLaunchNaukari extends BaseTestClass {
	
	@Test
	public void launchNaukari() {
		driver.get("https://www.naukri.com/");
	}

}
