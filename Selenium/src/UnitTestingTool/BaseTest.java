package UnitTestingTool;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import GeneralLibrary.UtilityClass;

public class BaseTest {
	
	protected ChromeDriver driver;
	String loginPageTiltle="ShoppersStack | Login";
	
	@BeforeClass
	public void browserSetUp() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("Browser is launched....!!",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized....!!",true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void toLogin() throws EncryptedDocumentException, IOException {
		String url = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 1);
		driver.get(url);
		driver.findElement(By.id("loginBtn")).click();
		WebElement emailTextField = driver.findElement(By.id("Email"));
		String emailId = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 2);
		emailTextField.sendKeys(emailId);
		Assert.assertEquals(emailTextField.getAttribute("value"), "", "Email is not entered");
		Reporter.log("Email is entered",true);
		WebElement passwordTextField = driver.findElement(By.id("Password"));
		String password = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 3);
		passwordTextField.sendKeys(password);
		Assert.assertEquals(passwordTextField.getAttribute("value"), "", "Password is not entered");
		Reporter.log("Password is entered",true);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Assert.assertEquals(driver.getTitle(), loginPageTiltle, "Login page is not displayed");
		Reporter.log("Login page is displayed",true);
	}
	
	@AfterMethod
	public void toLogout() {
		//driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("Browser is closed");
		driver.quit();
	}

}
