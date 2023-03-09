package WebElementMethod;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		driver.findElement(By.linkText("Shop Now")).click();
		driver.findElement(By.xpath("//div[contains(text(),'realme C33 (Sandy Gold, 32 GB)')]")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindow);
		for(String windowId: allWindowId) {
			driver.switchTo().window(windowId);
		}
		
		driver.findElement(By.xpath("//ul[@class='row']/li/button")).click();
	
		
		driver.switchTo().window(parentWindow);
		
		
		driver.findElement(By.xpath("//span[text()='TVs & Appliances']")).click();
		
		driver.findElement(By.xpath("//a[@title='Fans']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'KUHL 19000W PRIMA A 1200 mm 3 Blade Ceiling Fan')]")).click();
		
		Set<String> allWindowId1 = driver.getWindowHandles();
		allWindowId1.remove(parentWindow);
		for(String windowId1: allWindowId1) {
			driver.switchTo().window(windowId1);
		}
		driver.findElement(By.xpath("//ul[@class='row']/li/button")).click();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//span[text()='Home & Furniture']")).click();
		driver.findElement(By.xpath("//a[@title='Clocks']")).click();
		driver.findElement(By.xpath("//a[@title=\"Kadio Analog 24.5 cm X 24.5 cm Wall Clock\"]")).click();
		Set<String> allWindowId2 = driver.getWindowHandles();
		allWindowId2.remove(parentWindow);
		for(String windowId2: allWindowId2) {
			driver.switchTo().window(windowId2);
		}
		driver.findElement(By.xpath("//ul[@class='row']/li/button")).click();

	}

}

