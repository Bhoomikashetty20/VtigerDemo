package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOneWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhoomika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Bhoomika/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> allwindowId=driver.getWindowHandles();
		System.out.println(allwindowId.size());
		for(String windowId: allwindowId) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("Original")) {
				driver.close();
				break;
			}
		}

	}

}
