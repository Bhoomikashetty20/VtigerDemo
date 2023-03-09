package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUderstandDisabledElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		/*driver.get("https://demoapp.skillrary.com/");
		WebElement disabledTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='Entering data in disabled box'", disabledTextField);*/
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-8u361-linux-x64.rpm")).click();
		WebElement disabledButton = driver.findElement(By.linkText("Download jdk-8u361-linux-x64.rpm"));
		js.executeScript("arguments[0].click()", disabledButton);

	}

}
