package DataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromJSON {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fr=new FileReader("./testData/testData.json");
		
		JSONParser parser=new JSONParser();
		JSONObject jsonObject =(JSONObject) parser.parse(fr);
		
		String testUrl = (String) jsonObject.get("url");
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("price"));
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(testUrl);
	}

}
