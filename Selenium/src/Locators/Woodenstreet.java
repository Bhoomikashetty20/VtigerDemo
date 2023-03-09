package Locators;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Woodenstreet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(8000);
		
		//to wait until pop up appears
		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}
			catch(NoSuchElementException e) {
				Thread.sleep(1000);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[title=\"Lamp and Lighting\"]")).click();
	}


}
