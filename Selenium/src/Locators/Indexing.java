package Locators;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indexing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(13000);
		
		driver.findElement(By.id("loginclose1")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//nav[@class=\"menu\"]/ul/li[5]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class=\"top-list\"]/a[5]")).click();
		Thread.sleep(6000);
		
		//driver.findElement(By.xpath())
		
		driver.findElement(By.xpath("//div[@class=\"load-product-item flex cattwo category-three\"]/div[9]/div[3]/a")).click();
		Thread.sleep(3000);
		
		String price = driver.findElement(By.xpath("//span[@class=\"offerprice\"]")).getText();
		String newPrice1="";
		for(int i=2;price.charAt(i)!='R';i++) {
			newPrice1+=price.charAt(i);
		}
		String newPrice=newPrice1.replace(" ", "").replace(",", "");
		int cost=Integer.parseInt(newPrice);
		if(cost<50000) {
			driver.findElement(By.id("button-cart-buy-now")).click();
		}
		else {
			System.out.println("product price is too high");
		}
	}

}
