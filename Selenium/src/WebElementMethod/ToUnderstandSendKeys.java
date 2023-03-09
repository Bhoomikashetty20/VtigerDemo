package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		
		WebElement login = driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]"));
		login.sendKeys("Bhoomika");
		Thread.sleep(5000);
		login.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		login.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys(Keys.CONTROL+"v");

	}

}
