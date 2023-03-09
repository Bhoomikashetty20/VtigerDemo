package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/11");
		Thread.sleep(9000);
		
		driver.findElement(By.id("fl_compare")).click();
		Thread.sleep(9000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String windowId: allWindowId) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("ebay")) {
				driver.close();
				break;
			}
		}
	}

}
