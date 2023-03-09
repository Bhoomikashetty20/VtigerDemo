package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
		for(String windowId: allWindowId) {
			driver.switchTo().window(windowId);
		}
		
		driver.findElement(By.linkText("Try Free")).click();
		Thread.sleep(5000);
	}

}
