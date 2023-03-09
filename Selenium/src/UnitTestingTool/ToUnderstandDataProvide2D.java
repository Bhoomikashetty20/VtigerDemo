package UnitTestingTool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandDataProvide2D {
	
	    String registerPageTitle="xxxxxxxxx";
		String registerResultPage="https://demowebshop.tricentis.com/registerresult/1";
		
		@DataProvider
		public String[][] sendData(){
			String[][] arr= {{"male","Purushottham","Bhat","bhatle345@gmail.com","hello@123","hello@123"}
					         //{"male","Dinesh","Patil","dineshpatil@gmail.com","helloo@123","helloo@123"}
					         /*{"female","Bhoomika","xyz","abcde123@gmail.com","hii@123","hii@123"},
					         {"female","Bhoomika","def","xyz123@gmail.com","hi@123","hi@123"},
					         {"female","Bhoomika","pqr","pqr123@gmail.com","hello@456","hello@456"},
					         {"female","Bhoomika","lmn","lmn123@gmail.com","hello@lmn","hello@lmn"},
					         {"female","Bhoomika","stu","stu123@gmail.com","hello@stu","hello@stu"},
					         {"female","Bhoomika","mno","mno123@gmail.com","hello@mno","hello@mno"},
					         {"female","Bhoomika","rst","rst123@gmail.com","hello@rst","hello@rst"},
					         {"female","Bhoomika","std","std123@gmail.com","hello@std","hello@std"}*/};
			return arr;
		}
		
		@Test(dataProvider="sendData")
		public void register(String[] credentials) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			Reporter.log("Browser launched successfully...!!",true);			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Reporter.log("Browser is maximized",true);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			SoftAssert softAssert=new SoftAssert();
			
			driver.get("https://demowebshop.tricentis.com/register");
			softAssert.assertEquals( driver.getTitle(), registerPageTitle, "Register page is not displayed");
			Reporter.log("Register page is displayed",true);
			
			WebElement genderRadioButton = driver.findElement(By.id("gender-"+credentials[0]+""));
			genderRadioButton.click();
			softAssert.assertEquals( genderRadioButton.isSelected(), true, "Gender "+credentials[0]+" radio button is not selected");
			Reporter.log("Gender "+credentials[0]+" radio button is selected",true);
			
			WebElement firstNameTextField = driver.findElement(By.id("FirstName"));
			firstNameTextField.clear();
			firstNameTextField.sendKeys(credentials[1]);
			softAssert.assertEquals( firstNameTextField.getAttribute("value"), credentials[1], "First name is not entered");
			Reporter.log("First name entered successfully",true);

			WebElement lastNameTextfield = driver.findElement(By.id("LastName"));
			lastNameTextfield.clear();
			lastNameTextfield.sendKeys(credentials[2]);
			softAssert.assertEquals( lastNameTextfield.getAttribute("value"),credentials[2], "Last name is not entered");
			Reporter.log("Last name entered successfully",true);
			
			WebElement emailTextField = driver.findElement(By.id("Email"));
			emailTextField.clear();
			emailTextField.sendKeys(credentials[3]);
			softAssert.assertEquals( emailTextField.getAttribute("value"),credentials[3], "Email is not entered");
			Reporter.log("Email entered successfully",true);
			
			WebElement passwordTextField = driver.findElement(By.id("Password"));
			passwordTextField.clear();
			passwordTextField.sendKeys(credentials[4]);
			softAssert.assertEquals( passwordTextField.getAttribute("value"),credentials[4], "Password is not entered");
			Reporter.log("Password entered successfully",true);
			
			WebElement confirmPasswordTextField = driver.findElement(By.id("ConfirmPassword"));
			confirmPasswordTextField.clear();
			confirmPasswordTextField.sendKeys(credentials[5]);
			softAssert.assertEquals( confirmPasswordTextField.getAttribute("value"),credentials[5], "Confirm Password is not entered");
			Reporter.log("Confirm Password entered successfully",true);
			
			//Step 4: Click on Register button
			WebElement registerButton = driver.findElement(By.id("register-button"));
			registerButton.click();
			softAssert.assertEquals(driver.getCurrentUrl(),registerResultPage,"Failed to navigate to home page");
			Reporter.log("Navigated to register result page", true);
			
			softAssert.assertAll();
			driver.quit();
		}


}
