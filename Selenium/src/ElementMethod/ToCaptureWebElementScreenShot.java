package ElementMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureWebElementScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		 WebElement webelement = driver.findElement(By.xpath("//p[contains(text(),'Order Online')]	"));
		 Thread.sleep(6000);
		 File webelementScreenshot = webelement.getScreenshotAs(OutputType.FILE);
		System.out.println(webelementScreenshot);
		
		FileHandler.copy(webelementScreenshot, new File("./errorshots/image2.jpeg"));

	}

}
