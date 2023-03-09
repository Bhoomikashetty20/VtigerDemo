package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		String tooltipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		System.out.println(tooltipText);
	}

}
