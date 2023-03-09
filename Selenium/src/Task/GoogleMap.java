package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='Maps']/..")).click();
		

	}

}
