package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys(("Selenium Trainer"));
		Thread.sleep(5000);
		
		driver.findElement(By.name("pwd")).sendKeys("Bhoomi@908");
		Thread.sleep(5000);
		
		driver.findElement(By.id("loginButton")).click();
		
		
	}

}
