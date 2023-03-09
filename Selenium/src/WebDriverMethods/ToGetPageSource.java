package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		
		Dimension beforeMaximize = driver.manage().window().getSize();
		System.out.println(beforeMaximize.getHeight());
		System.out.println(beforeMaximize.getWidth());
		System.out.println("===============================================");
		
		driver.manage().window().maximize();
		Dimension afterMaximize = driver.manage().window().getSize();
		System.out.println(afterMaximize.getHeight());
		System.out.println(afterMaximize.getWidth());
		
	}

}
