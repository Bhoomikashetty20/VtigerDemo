package SoftDrinks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pepsi {

	@Test(groups= {"smoke","integration"})
	public void ToLaunchPepsi() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pepsi.com/");
		Reporter.log("Pepsi website launched", true);
		driver.quit();

	}

}
