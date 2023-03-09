package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select daySelect=new Select(dayDropDown);
		Select monthSelect=new Select(monthDropDown);
		Select yearSelect=new Select(yearDropDown);
		daySelect.selectByIndex(0);
		monthSelect.selectByValue("10");
		//yearSelect.selectByVisibleText("1982");
		List<WebElement> allMonthOption = monthSelect.getOptions();
		for(WebElement month:allMonthOption) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(2000);
		}
		List<WebElement> allYearOption = yearSelect.getOptions();
		yearSelect.selectByIndex(allYearOption.size()-1);
		
	}

}
