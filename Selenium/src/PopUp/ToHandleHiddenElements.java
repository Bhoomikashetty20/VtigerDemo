package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement hiddenElement = driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='Female'", hiddenElement);
	}

}
