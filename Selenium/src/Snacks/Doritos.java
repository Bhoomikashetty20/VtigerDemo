package Snacks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Doritos {

	@Test(enabled = false)
	public void ToLaunchDoritos(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.doritos.com/");
		Reporter.log("Doritos website launched", true);
		driver.quit();

	}

}
