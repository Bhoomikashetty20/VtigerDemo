package UnitTestingTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToUnderstandDataProviderExcel {

	@DataProvider
	public String[][] sendData() throws EncryptedDocumentException, IOException{
		File absPath = new File("C:\\Users\\Bhoomika\\eclipse-workspace\\Selenium\\testData\\datails.xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet dataSheet = workbook.getSheet("Sheet1");
		int rownum = dataSheet.getPhysicalNumberOfRows();
		int colnum = dataSheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rownum-1][colnum];
		for(int i=0;i<rownum-1;i++) {
			for(int j=0;j<colnum;j++) {
				data[i][j]=dataSheet.getRow(i+1).getCell(j).toString();
				
			}
		}
		return data;
	}
	
	@Test(dataProvider="sendData")
	public void register(String[] credentials) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-"+credentials[0]+"")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys(credentials[1]);
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys(credentials[2]);
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(credentials[3]);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(credentials[4]);
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(credentials[5]);
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
