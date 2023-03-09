package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandMouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		
		driver.get("https://www.kalkifashion.com/");
		WebElement salwarKameezOption = driver.findElement(By.partialLinkText("SALWAR KAMEEZ"));
		actions.moveToElement(salwarKameezOption).perform();
		driver.findElement(By.partialLinkText("Haldi Salwar Kameez")).click();
		

	}

}
