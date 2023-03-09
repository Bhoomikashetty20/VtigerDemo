package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Epfo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.epfindia.gov.in/");
		Thread.sleep(8000);
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("a[title=\"Our Services\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("For Employees")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Member UAN/Online Service (OCS/OTCP)")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindow);
		
		for(String windowId : allWindowId) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("userName")).sendKeys("10241585642566");
		
	}

}
