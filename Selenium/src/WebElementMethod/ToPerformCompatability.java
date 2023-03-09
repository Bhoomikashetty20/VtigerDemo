package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformCompatability {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		 WebElement emailTextField = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		 WebElement passwordTextField = driver.findElement(By.xpath("//div[@id=\"passContainer\"]"));
		 
		 Rectangle emailRectObject = emailTextField.getRect();
		 Rectangle passwordRectObject = passwordTextField.getRect();
		 
		 if(emailRectObject.getX()==passwordRectObject.getX()) {
			 System.out.println("Both the elements are properly alligned to the left");
		 }
		 else {
			 System.out.println("Left Allignment Issue");
		 }
		 if(emailRectObject.getX()+emailRectObject.getWidth()==passwordRectObject.getX()+passwordRectObject.getWidth()) {
			 System.out.println("Both the elements are properly alligned to the Right");
		 }
		 else {
			 System.out.println("Right Allignment Issue");
		 }
		 if(emailRectObject.getY()+emailRectObject.getHeight()+3 <= passwordRectObject.getX()) {
			 System.out.println("Both the elements are not overlapping");
		 }
		 else {
			 System.out.println("Elements Overlapping Issue");
		 }
		 System.out.println(emailRectObject.getX());
		 System.out.println(passwordRectObject.getX());
	}

}
