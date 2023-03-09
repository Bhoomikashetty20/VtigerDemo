package SoftDrinks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Maaza {

	@Test(groups="system")
	public void ToLaunchMaaza(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.enjoymaaza.com/");
		Reporter.log("Mazaa website launched", true);
		driver.quit();

	}

}
