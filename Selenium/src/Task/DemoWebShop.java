package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		//expected data
		String expectedMessage="Please enter some search keyword";
		String expectedPageTitle="Demo Web Shop";
		
		//Step 1:Open the browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step 2: Enter the Test URL
		driver.get("https://demowebshop.tricentis.com/");
		if(driver.getTitle().equals(expectedPageTitle)) {
			System.out.println("Demo web shop home page is displayed");
		}else {
			System.out.println("Demo web shop home page is not displayed");
		}
		
		//Step 3: Click on search button without entering the data
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		
		//Step 4: Switch the control to alert and capture the alert message
		Alert popupText = driver.switchTo().alert();
		System.out.println(popupText.getText());
		if(popupText.getText().equals(expectedMessage)) {
			System.out.println("Proper message is displayed");
		}else {
			System.out.println("Displayed message is not proper");
		}
		popupText.accept();
	}

}
