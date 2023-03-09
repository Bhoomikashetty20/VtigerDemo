package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		driver.findElement(By.id("regUser")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us")).click();
	}

}
