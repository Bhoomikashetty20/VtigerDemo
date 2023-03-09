package Snacks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pringles {

	@Parameters("browsername")
	@Test(groups="smoke")
	public void ToLaunchPringles(@Optional("chrome") String bname){
		WebDriver driver=null;
		if(bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(bname.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://www.pringles.com/us/home.html");
		Reporter.log("Pringles website launched", true);
		driver.quit();

	}
}
