package UnitTestingTool;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	/*@Test(timeOut = 4000)
	public void zomato() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.quit();
	}*/
	
	@Test(priority=1,invocationCount = 0)
	public void kfc() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		driver.quit();
	}
	
	@Test(priority=5, invocationCount = 2, threadPoolSize = -2)
	public void swiggy() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.quit();
	}
	
	@Test(priority=2, invocationCount = -2)
	public void dominos() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		driver.quit();
	}
	
	@Test(invocationCount = 3,enabled = false)
	public void baskin() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbins.dotpe.in/");
		driver.quit();
	}
	
	
	
	

}
