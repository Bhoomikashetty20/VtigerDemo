package SoftDrinks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sprite {

	@Test(groups="smoke")
	public void ToLaunchSprite() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sprite.com/");
		Reporter.log("Sprite website launched", true);
		driver.quit();

	}

}
