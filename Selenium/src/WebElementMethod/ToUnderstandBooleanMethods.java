package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Register")).click();
//		Thread.sleep(2000);
//		WebElement radioButton = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
//		System.out.println("Before clicking");
//		System.out.println(radioButton.isDisplayed());
//		System.out.println(radioButton.isSelected());
//		radioButton.click();
//		System.out.println("After clicking");
//		System.out.println(radioButton.isDisplayed());
//		System.out.println(radioButton.isSelected());
		
//		driver.get("https://demo.actitime.com/");
//		WebElement checkbox = driver.findElement(By.xpath("//input[@name='remember']"));
//		System.out.println(checkbox.isDisplayed());
//		System.out.println("Before clicking");
//		System.out.println(checkbox.isSelected());
//		checkbox.click();
//		System.out.println("After clicking");
//		System.out.println(checkbox.isSelected());
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(7000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(7000);
		username.sendKeys(Keys.DELETE);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		username.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(7000);
		username.sendKeys(Keys.DELETE);
		WebElement login = driver.findElement(By.xpath("//button[.='Log in']"));
		Thread.sleep(7000);
		System.out.println("Before click");
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		login.click();
		System.out.println("Before click");
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		
	}
	
	

}
