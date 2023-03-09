package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenAnApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhoomika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.get("https://www.zomato.com/");
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("www.swiggy.com/");

	}

}
