package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.linkedin.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.id("session_key")).sendKeys("bhoomikashetty20@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("session_password")).sendKeys("Bhoomi@567");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Sign in")).click();

	}

}
