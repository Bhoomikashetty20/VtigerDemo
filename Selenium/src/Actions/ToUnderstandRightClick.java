package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandRightClick {

	public static void main(String[] args) {
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
		WebElement textField = driver.findElement(By.xpath("//a[@class=\"list-card js-member-droppable ui-droppable\"]"));
		actions.contextClick(textField).perform();
		WebElement listOfOption = driver.findElement(By.xpath("//div[@class='quick-card-editor-buttons fade-in']"));
		System.out.println(listOfOption.getText());
	}

}
