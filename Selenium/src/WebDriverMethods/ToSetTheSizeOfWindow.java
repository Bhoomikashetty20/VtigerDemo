package WebDriverMethods;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheSizeOfWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.skillrary.com/");
		
		Point positionOfBrowser = driver.manage().window().getPosition();
		System.out.println(positionOfBrowser.getX());
		System.out.println(positionOfBrowser.getY());
		System.out.println("========================================");
		
		driver.manage().window().setSize(new Dimension(200,500));
		Thread.sleep(4000);
		Point positionOfBrowser1 = driver.manage().window().getPosition();
		System.out.println(positionOfBrowser1.getX());
		System.out.println(positionOfBrowser1.getY());
		System.out.println("========================================");
		
		driver.manage().window().setPosition(new Point(0,0));
		Thread.sleep(4000);
		Point positionOfBrowser2 = driver.manage().window().getPosition();
		System.out.println(positionOfBrowser2.getX());
		System.out.println(positionOfBrowser2.getY());
		System.out.println("========================================");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Point positionOfBrowser3 = driver.manage().window().getPosition();
		System.out.println(positionOfBrowser3.getX());
		System.out.println(positionOfBrowser3.getY());
		System.out.println("========================================");
		
	}

}
