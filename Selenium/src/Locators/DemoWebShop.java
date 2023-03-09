package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Bhoomika");
		Thread.sleep(3000);
		
		driver.findElement(By.id("LastName")).sendKeys("Shetty");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Email")).sendKeys("bhoomikashetty@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Password")).sendKeys("Bhoomi@543");
		Thread.sleep(3000);
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Bhoomi@543");
		Thread.sleep(3000);
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("Email")).sendKeys("bhoomikashetty@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Password")).sendKeys("Bhoomi@543");
		Thread.sleep(3000);
		
		driver.findElement(By.className("button-1 login-button")).click();
		Thread.sleep(3000);
	}

}
