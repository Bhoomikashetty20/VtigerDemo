package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropDown = driver.findElement(By.id("cars"));
		Select option=new Select(dropDown);
		option.selectByIndex(3);
		option.selectByValue("90");
		option.selectByValue("500");
		option.selectByIndex(2);
		System.out.println("First selected option is: "+option.getFirstSelectedOption().getText());
		List<WebElement> allSelectedOption = option.getAllSelectedOptions();
		System.out.println("All selected options are:");
		for(WebElement selectedOption:allSelectedOption) {
			System.out.println(selectedOption.getText());
		}
		//option.deselectByIndex(0);
		//option.deselectByValue("500");
		//option.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		option.deselectAll();
		

	}

}
