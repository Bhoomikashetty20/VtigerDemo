package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(10000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId.size());
		
		driver.findElement(By.linkText("Register")).click();

	}

}
