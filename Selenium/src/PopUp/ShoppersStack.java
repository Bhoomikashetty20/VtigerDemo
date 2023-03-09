package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoppersStack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(5000);
		for(;;) {
			try {
				driver.findElement(By.linkText("Swagger Documentation")).click();
				break;
			}catch(Exception e) {
				action.sendKeys(Keys.PAGE_DOWN);
			}
		}
		Alert alertPopup = driver.switchTo().alert();
		System.out.println(alertPopup.getText());
		Thread.sleep(3000);
		alertPopup.accept();
		
		System.out.println(alertPopup.getText());
		Thread.sleep(3000);
		alertPopup.accept();
		System.out.println(alertPopup.getText());
		Thread.sleep(3000);
		alertPopup.accept();
	}

}
