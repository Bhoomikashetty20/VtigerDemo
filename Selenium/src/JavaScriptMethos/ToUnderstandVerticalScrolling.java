package JavaScriptMethos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandVerticalScrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.album.alexflueras.ro/galleries/urban.html");
		for(;;) {
			try {
				driver.findElement(By.xpath("//a[@id='a20']/..")).click();
				break;
			}catch(Exception e) {
				js.executeScript("window.scrollBy(500,0)");
			}
		}

	}

}
