package JavaScriptMethos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		WebElement image = driver.findElement(By.xpath("//p[contains(text(),'10 Trending Restaurants ')]/../.."));
		js.executeScript("arguments[0].scrollIntoView(false)", image);
	}

}
