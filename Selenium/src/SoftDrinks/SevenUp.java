package SoftDrinks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SevenUp {

	@Test(groups="integration",dependsOnGroups = "system")
	public void ToLaunchSevenUp(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.7up.com/en");
		Reporter.log("7Up website launched", true);
		driver.quit();

	}

}
