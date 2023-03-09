package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		driver.get("https://trello.com/b/VlvqHTVL/train-the-trainers");
		Actions actions=new Actions(driver);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("boomikashetty20@gmail.com");
		driver.findElement(By.id("login")).click();
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Log in']"));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("bhoomideepu");
		loginButton.click();
		WebElement souceElement1 = driver.findElement(By.xpath("//span[text()='java']"));
		WebElement tagetElement1 = driver.findElement(By.xpath("//textarea[text()='Doing']/../..//span[text()='Add a card']"));
		actions.dragAndDrop(souceElement1, tagetElement1).build().perform();
		Thread.sleep(2000);
		
		WebElement sourceElement2 = driver.findElement(By.xpath("//span[text()='manual']"));
		WebElement targetElement2 = driver.findElement(By.xpath("//textarea[text()='Done']/../..//span[text()='Add a card']"));
		actions.moveToElement(sourceElement2).clickAndHold().release(targetElement2).perform();

	}

}
