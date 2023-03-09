package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dominos {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dominos.co.in/");
		Thread.sleep(3000);

		driver.findElement(By.id("bannerImage")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[text()=\"Don't Allow\"]")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.cssSelector("input[placeholder=\"Enter your delivery address\"]")).sendKeys("vijaya bank layout");
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//span[text()='Locate Me']")).click();
		//Thread.sleep(6000);
	}

}
