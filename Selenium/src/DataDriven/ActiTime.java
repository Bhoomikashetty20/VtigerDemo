package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws IOException {
		//creation of input stream
				FileInputStream fis=new FileInputStream("./testData/actiTime.properties");

				//creation of file type object
				Properties prop=new Properties();
				
				//read methods
				prop.load(fis);
				String testUrl=(String) prop.get("url");
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get(testUrl);
				String user=(String) prop.get("username");
				String pwd=(String) prop.get("password");
				driver.findElement(By.id("username")).sendKeys(user);
				driver.findElement(By.name("pwd")).sendKeys(pwd);
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				System.out.println(driver.getTitle());

	}

}
