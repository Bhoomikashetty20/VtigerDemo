package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Bhoomika
 *
 */

public class ActiTimeLogin { //same as test case ID

	public static void main(String[] args) throws InterruptedException {
		//Expected data
		String usernameData="admin";
		String passwordData="manager";
		String expectedLoginPageTitle="actiTIME - Login";
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		
		//Step 1: Open the browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		//Step 2: Enter the Test URL to click on 'Enter' button
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		String actualLoginPageTitle=driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login page is displayed successfully");
		}else {
			System.out.println("Login page is not displayed");
		}
		
		//Step 3: Click on 'Username' text field and provide the input
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(usernameData);
		Thread.sleep(2000);
		String actualDataEnteredInUserNameTextField = usernameTextField.getAttribute("value");
		if(actualDataEnteredInUserNameTextField.equals(usernameData)) {
			System.out.println("Username text field accepted the test data");
		}else {
			System.out.println("Username text field failed to accept the test data");
		}
		
		//Step 4: Click	 on 'Password' text field and provide the input
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(passwordData);
		Thread.sleep(3000);
		String actualDataEnteredInPasswordTextField = passwordTextField.getAttribute("value");
		if(actualDataEnteredInPasswordTextField.equals(passwordData)) {
			System.out.println("Password text field accepted the test data");
		}else {
			System.out.println("Password text field failed to accept the test data");
		}
		
		//Step 5: Click on 'Login' button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("Home page is displayed successfully");
		}else {
			System.out.println("Home page is not displayed");
		}

	}

}
