package Snacks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Chetoos {
	
	@Test(enabled = false)
	public void ToLaunchCheetos(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cheetos.com/");
		Reporter.log("Cheetos website launched", true);
		driver.quit();

	}

}
