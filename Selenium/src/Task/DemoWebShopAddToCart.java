package Task;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GeneralLibrary.UtilityClass;

public class DemoWebShopAddToCart {

	@Test
	public void orderProduct() throws EncryptedDocumentException, IOException, InterruptedException {
		//data
		String loginPageTiltle="Demo Web Shop";
		String giftCardPageTitle="Demo Web Shop. Gift Cards";
		//Step 1: Open the browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Reporter.log("Browser is launched....!!",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized....!!",true);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step 2: Enter the test URL
		String testUrl = UtilityClass.toReadStringDataFromExcel("DemoWebshopTestcases", "Bhoomika", 8, 5);
		driver.get(testUrl);
		
		//Step 3:Click on Login
		driver.findElement(By.linkText("Log in")).click();
		
		
		//Step 4:Enter the email
		String mail = UtilityClass.toReadStringDataFromExcel("DemoWebshopTestcases", "Bhoomika", 10, 5);
		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.sendKeys(mail);
		Assert.assertEquals(emailTextField.getAttribute("value"), mail, "Email is not entered");
		Reporter.log("Email is entered",true);
		
		//Step 5: Enter the password
		String password = UtilityClass.toReadStringDataFromExcel("DemoWebshopTestcases", "Bhoomika", 11, 5);
		 WebElement passwordTextField = driver.findElement(By.id("Password"));
		passwordTextField.sendKeys(password);
		Assert.assertEquals(passwordTextField.getAttribute("value"), password, "Password is not entered");
		Reporter.log("Password is entered",true);
		
		//Step 6:Click on login
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), loginPageTiltle, "Login page is not displayed");
		Reporter.log("Login page is displayed",true);
		
		//Step 7: Click on Gift cards
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		Assert.assertEquals(driver.getTitle(), giftCardPageTitle, "Gift card page is not displayed");
		Reporter.log("Gift card page is displayed",true);
		
		//Step 8:Select and item add to cart
		driver.findElement(By.xpath("//div[@class='product-grid']/div[2]/div/div[2]/div[3]/div/input")).click();
		
		//Step 9:Enter the recipient's name
		String recipientName = UtilityClass.toReadStringDataFromExcel("DemoWebshopTestcases", "Bhoomika", 14, 5);
		WebElement recipientNameTextField = driver.findElement(By.id("giftcard_2_RecipientName"));
		recipientNameTextField.sendKeys(recipientName);
		Assert.assertEquals(recipientNameTextField.getAttribute("value"), recipientName, "RecipientName is not entered");
		Reporter.log("RecipientName is entered",true);
		
		//Step 10: Enter the recipient mail and click to add to cart
		String recipientMail = UtilityClass.toReadStringDataFromExcel("DemoWebshopTestcases", "Bhoomika", 15, 5);
		WebElement recipientEmail = driver.findElement(By.id("giftcard_2_RecipientEmail"));
		recipientEmail.sendKeys(recipientMail);
		Assert.assertEquals(recipientEmail.getAttribute("value"), recipientMail, "Recipient Mail is not entered");
		Reporter.log("Recipient Mail is entered",true);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		
		//Step 11: Click on shopping cart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		//Step 12: CLick on terms and condition and click on checkout
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//option[text()='New Address']")).click();
		
		//Step 13: Enter country as India
		String country = UtilityClass.toReadStringDataFromExcel("DemoWebshopTestcases", "Bhoomika", 18, 5);
		WebElement dropDown = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select option=new Select(dropDown);
		//option.selectByValue("41");
		option.selectByVisibleText("India");		
		Assert.assertEquals(option.getFirstSelectedOption().getText(), country, "Country is not entered as India");
		Reporter.log("Country is entered as India",true);
		
		//Step 14: Enter city as Bangalore
		String city = UtilityClass.toReadStringDataFromExcel("DemoWebshopTestcases", "Bhoomika", 19, 5);
		WebElement cityTextField = driver.findElement(By.id("BillingNewAddress_City"));
		cityTextField.sendKeys(city);
		Assert.assertEquals(cityTextField.getAttribute("value"), city, "City is not entered as Bangalore");
		Reporter.log("City is entered as Bangalore",true);
		
		//Step 15: Enter address1 as Bangalore
		String address = UtilityClass.toReadStringDataFromExcel("DemoWebshopTestcases", "Bhoomika", 20, 5);
		WebElement address1TextField = driver.findElement(By.id("BillingNewAddress_Address1"));
		address1TextField.sendKeys(address);
		Assert.assertEquals(address1TextField.getAttribute("value"), address, "Address1 is not entered as Bangalore");
		Reporter.log("Address1 is entered as Bangalore",true);
		
		//Step  16: Enter the zipcode
		int zipcode = (int) UtilityClass.toReadIntDataFromExcel("DemoWebshopTestcases", "Bhoomika", 21, 5);
		System.out.println(zipcode);
		WebElement zipcodeField = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		zipcodeField.sendKeys(""+zipcode);
		Assert.assertEquals(zipcodeField.getAttribute("value"), ""+zipcode, "zipcode is not entered properly");
		Reporter.log("Zipcode is entered properly",true);
		
		//Step 17: Enter the phone no
		int phoneno = (int) UtilityClass.toReadIntDataFromExcel("DemoWebshopTestcases", "Bhoomika", 22, 5);
		System.out.println(phoneno);
		WebElement phonenoTextField = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		phonenoTextField.sendKeys(""+phoneno);
		Assert.assertEquals(phonenoTextField.getAttribute("value"), ""+phoneno, "PhoneNo is not entered properly");
		Reporter.log("PhoneNo is entered properly",true);
		
		//Step 18: Click on continue
		driver.findElement(By.xpath("//input[@title='Continue']")).click();
		
		//Step 19:  Select the payment method as Cash on delivery and click on continue
		driver.findElement(By.id("paymentmethod_0")).click();
		driver.findElement(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]")).click();
		driver.findElement(By.xpath("//input[@onclick=\"PaymentInfo.save()\"]")).click();
		
		//Step 20: Click on confirm capture the orderID
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		System.out.println("Order Id: "+driver.findElement(By.xpath("//ul[@class='details']/li[1]")).getText());
		
	}
		
}
