package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.partialLinkText("Jewelry")).click();
		Thread.sleep(3000); 
		
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		Thread.sleep(3000);
		
		 String msg1 = driver.findElement(By.xpath("//div[@class=\"short-description\"]")).getText();
		 String msg2 = driver.findElement(By.xpath("//div[@itemprop=\"description\"]")).getText();
		 
		 System.out.println(msg1);
		 System.out.println(msg2);
	}

}
