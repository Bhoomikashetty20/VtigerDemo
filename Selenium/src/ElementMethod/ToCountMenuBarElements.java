package ElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCountMenuBarElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.partialLinkText("SAREE")).click();
		Thread.sleep(3000);
		
		List<WebElement> resultImages = driver.findElements(By.xpath("//div[@class=\"products wrapper mode-grid products-grid\"]/div/form"));
		System.out.println(resultImages.size());
		
		List<WebElement> menubarElements = driver.findElements(By.xpath("//nav[not(@id=\"mobile-nav\")]/div/div[2]/div"));
		System.out.println(menubarElements.size());

	}

}
