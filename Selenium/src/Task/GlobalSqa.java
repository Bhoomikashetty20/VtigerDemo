package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalSqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		WebElement iElement = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(iElement);
//		WebElement image1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
//		WebElement image2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
//		WebElement image3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
//		WebElement image4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement image1 = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement targetElement = driver.findElement(By.xpath("//span[text()='Trash']"));
		actions.dragAndDrop(image1, targetElement).perform();
		actions.dragAndDrop(image2, targetElement).perform();
		actions.dragAndDrop(image3, targetElement).perform();
		actions.dragAndDrop(image4, targetElement).perform();
		Thread.sleep(3000);
		
		WebElement returnTargetElement = driver.findElement(By.xpath("//ul[@id='gallery']"));
		actions.dragAndDrop(image1, returnTargetElement).perform();
		actions.dragAndDrop(image2, returnTargetElement).perform();
		actions.dragAndDrop(image3, returnTargetElement).perform();
		actions.dragAndDrop(image4, returnTargetElement).perform();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Accepted Elements")).click();
		
		driver.switchTo().frame("google_esf");
		WebElement droppable = driver.findElement(By.id("draggable-nonvalid"));
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		WebElement targetLocation = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(droppable, targetLocation).perform();
		actions.dragAndDrop(draggable, targetLocation).perform();		
	}

}
