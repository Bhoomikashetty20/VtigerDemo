package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//creation of input stream
		FileInputStream fis=new FileInputStream("./testData/testData.properties");

		//creation of file type object
		Properties prop=new Properties();
		
		//read methods
		prop.load(fis);
		String testUrl=(String) prop.get("urlll");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(testUrl);
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
	}

}
