package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetAttributes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://www.woodenstreet.com/");
//		Thread.sleep(13000);
//		String altText = driver.findElement(By.xpath("//img[@title=\"TV Units\"]")).getAttribute("alt");
//		System.out.println(altText);

		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		String tooltipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		System.out.println(tooltipText);
	}

}
