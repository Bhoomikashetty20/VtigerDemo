package JavaScriptMethos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.google.com/doodles");
		for(;;) {
			try {
				driver.findElement(By.xpath("//a[@href='/doodles/teachers-day-2022-october-14']/img")).click();
				break;
			}catch(Exception e) {
				js.executeScript("window.scrollBy(0,500)");
			}
		}

	}

}
