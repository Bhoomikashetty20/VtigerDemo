package SoftDrinks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fanta {

	@Test(groups="smoke")
	public void ToLaunchFanta(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.fanta.com/");
		Reporter.log("Fanta website launched", true);
		driver.quit();

	}
	
	/*@Test(groups="system")
	public void display(){
		System.out.println("Fanta......!!!!!!!!!!!!");
	}*/

}
