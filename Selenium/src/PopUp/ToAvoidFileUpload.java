package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions action=new Actions(driver);

		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		action.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Bhoomika\\Documents\\BhoomikaSynopsis.pdf");
	}

}
