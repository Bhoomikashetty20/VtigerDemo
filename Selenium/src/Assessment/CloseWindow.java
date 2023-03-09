package Assessment;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CloseWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TakesScreenshot ts;
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("fl_compare")).click();
		Map<String, String> titleAndWindowId= new TreeMap<String,String>();
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String windowId: allWindowId) {
			driver.switchTo().window(windowId);
			titleAndWindowId.put(driver.getTitle().toLowerCase().replace("www.", ""), windowId);
		}
		Set<String> allKeys = titleAndWindowId.keySet();
		for(String keys: allKeys) {
			driver.switchTo().window(titleAndWindowId.get(keys));
			driver.close();
			Thread.sleep(3000);
		}
		
			

	}

}
