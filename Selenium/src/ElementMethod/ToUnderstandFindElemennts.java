package ElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElemennts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"search-input\"]")).click();
		Thread.sleep(3000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='click-suggestions']/li/a/span"));
		
		System.out.println(suggestions.size());
		for(WebElement suggestionText: suggestions) {
			System.out.println(suggestionText.getText());
		}

	}

}
