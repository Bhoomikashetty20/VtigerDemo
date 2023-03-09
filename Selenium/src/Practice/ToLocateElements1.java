package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElements1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[placeholder=\"Where are you going?\"]")).sendKeys("kodachadri");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}

}
