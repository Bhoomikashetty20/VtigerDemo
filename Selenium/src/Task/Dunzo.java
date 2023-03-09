package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dunzo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.dunzo.com/bangalore");
		driver.findElement(By.xpath("//a[@href=\"/bangalore/fruit-and-vegetable-stores\"]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Daily Needs')]")).click();
		driver.findElement(By.xpath("//button[@value=\"BEVERAGES\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Brooke Bond 3 Roses Natural Care Tea Pack\"]/../../..//div/div/div/div")).click();
		String price1 = driver.findElement(By.xpath("//p[contains(text(),'₹ 220')]")).getText();
		int finalPrice1 = priceOfProduct(price1);
		
		driver.findElement(By.xpath("//button[text()='coke specials']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Coca-Cola Zero Can')]/../../..//div/div/div/button")).click();
		String price2 = driver.findElement(By.xpath("//p[contains(text(),'₹ 40')]")).getText();
		int finalPrice2 = priceOfProduct(price2);
		
		driver.findElement(By.xpath("//button[text()='kwality walls specials']")).click();
		driver.findElement(By.xpath("//img[@title=\"Kwality Wall's Cornetto Disc Oreo\"]/../../..//div[@class=\"sc-AxjAm ewJxAx\"]")).click();
		String price3 = driver.findElement(By.xpath("//p[contains(text(),'₹ 65')]")).getText();
		int finalPrice3 = priceOfProduct(price3);
		
		/*if(finalPrice1<finalPrice2 && finalPrice1<finalPrice3) {
			driver.findElement(By.xpath("//p[contains(text(),'Brooke Bond')]/../..//div/div/div/button")).click();
		}
		else if(finalPrice2<finalPrice3) {
			driver.findElement(By.xpath("//p[contains(text(),'Coca-Cola')]/../../..//div/div/div/button")).click();
		}*/
		
		
	}
	public static int priceOfProduct(String price) {
		String[] productPrice=price.split(" ");
		for(int i=0;i<productPrice.length;i++) {
			price=productPrice[i].replace("₹", "").replace(" ", "");
		}
		int finalPrice=Integer.parseInt(price);
		return finalPrice;
	}

}
