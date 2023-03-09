package Assessment;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TakesScreenshot ts;
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fl_compare")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowId: allWindowId) {
			driver.switchTo().window(windowId);
			String title = driver.getTitle();
			if(title.contains("ebay")) {
				ts=(TakesScreenshot) driver;
				File screenshot = ts.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(screenshot, new File("./errorshots/image4.png"));
				break;
			}
		}
	}

}
