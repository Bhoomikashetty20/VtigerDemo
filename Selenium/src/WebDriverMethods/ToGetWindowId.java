package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		Set<String> id=driver.getWindowHandles();
		for(String sid:id) {
			System.out.println(sid);
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
