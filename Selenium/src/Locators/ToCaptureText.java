package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
		Thread.sleep(3000);
		
		String errormsg = driver.findElement(By.xpath("//span[contains(text(),'correct')]")).getText();
		System.out.println(errormsg);
		
		String errormsg1 = driver.findElement(By.xpath("//li[contains(text(),'customer')]")).getText();
		System.out.println(errormsg1);
		
	}

}
