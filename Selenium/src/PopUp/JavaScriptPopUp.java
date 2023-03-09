package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert alertPopUp = driver.switchTo().alert();
		System.out.println(alertPopUp.getText());
		alertPopUp.accept();*/
		
		/*driver.get("https://licindia.in/");
		try {
			driver.findElement(By.linkText("Agents Portal")).click();
		}catch (Exception e) {
			Thread.sleep(2000);
			driver.findElement(By.linkText("Agents Portal")).click();
			Thread.sleep(2000);
		}
		Alert confirmationPopUp = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmationPopUp.dismiss();
		Thread.sleep(2000);
		try {
			driver.findElement(By.linkText("Agents Portal")).click();
		}catch (Exception e) {
			Thread.sleep(2000);
			driver.findElement(By.linkText("Agents Portal")).click();
			Thread.sleep(2000);
		}
		confirmationPopUp = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmationPopUp.accept();*/
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Bhoomika");
		Thread.sleep(3000);
		System.out.println(promptAlert.getText());
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
	}

}
