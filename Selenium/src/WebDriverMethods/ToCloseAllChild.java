package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhoomika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Bhoomika/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		
		String parentWindowid = driver.getWindowHandle();
		Set<String> allwindowId=driver.getWindowHandles();
		allwindowId.remove(parentWindowid);
		
		System.out.println(allwindowId.size());
		for(String windowId: allwindowId) {
			driver.switchTo().window(windowId);
			driver.close();
		}

	}

}
