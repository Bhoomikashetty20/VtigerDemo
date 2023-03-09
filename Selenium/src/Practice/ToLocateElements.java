package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(9000);
		
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(9000);
	}

}
