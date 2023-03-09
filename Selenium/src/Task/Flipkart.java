package Task;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://www.flipkart.com/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement product1 = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		action.moveToElement(product1).perform();
		driver.findElement(By.linkText("Bluetooth Headphones")).click();
		driver.findElement(By.xpath("//a[contains(text(),'realme Techlife Buds')]")).click();
		
		Set<String> allWindowId1 = driver.getWindowHandles();
		allWindowId1.remove(parentWindow);
		for(String windowId1: allWindowId1) {
			driver.switchTo().window(windowId1);
		}
		Thread.sleep(3000);
		String product1Price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		int product1FinalPrice = priceOfProduct(product1Price);
		System.out.println(product1FinalPrice);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		
		WebElement product2 = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		action.moveToElement(product2).perform();
		driver.findElement(By.linkText("Paintings")).click();
		driver.findElement(By.xpath("//a[@title='Indianara Set of 3 Arabic Quotes MDF Wall Hanging Digital Reprint 18 inch x 11 inch Painting']")).click();
		
		Set<String> allWindowId2 = driver.getWindowHandles();
		allWindowId2.remove(parentWindow);
		for(String windowId2: allWindowId2) {
			driver.switchTo().window(windowId2);
		}
		Thread.sleep(3000);
		String product2Price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		int product2FinalPrice = priceOfProduct(product2Price);
		System.out.println(product2FinalPrice);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		
		WebElement product3 = driver.findElement(By.xpath("//span[text()='Sports, Books & More']"));
		action.moveToElement(product3).perform();
		driver.findElement(By.xpath("//a[@title='Musical Instruments']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Acoustic Guitars')]")).click();
		driver.findElement(By.xpath("//a[@title=\"REVEL RVL-38C-LGP-BK Acoustic Guitar Linden Wood Ebony Right Hand Orientation\"]")).click();
		
		Set<String> allWindowId3 = driver.getWindowHandles();
		allWindowId3.remove(parentWindow);
		for(String windowId3: allWindowId3) {
			driver.switchTo().window(windowId3);
		}
		Thread.sleep(3000);
		String product3Price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		int product3FinalPrice = priceOfProduct(product3Price);
		System.out.println(product3FinalPrice);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();
		if(product1FinalPrice<product2FinalPrice && product1FinalPrice<product3FinalPrice) {
			WebElement p1 = driver.findElement(By.xpath("//a[contains(text(),'realme Techlife')]/../../../../..//div[text()='Remove']"));
			js.executeScript("arguments[0].scrollIntoView(true)", p1);
			p1.click();
			driver.findElement(By.xpath("//div[@class=\"td-FUv WDiNrH\"]/div[2]")).click();
		}
		else if(product2FinalPrice<product3FinalPrice) {
			WebElement p2 = driver.findElement(By.xpath("//a[contains(text(),'Indianara Set of')]/../../../..//div[text()='Remove']"));
			js.executeScript("arguments[0].scrollIntoView(true)", p2);
			p2.click();
			driver.findElement(By.xpath("//div[@class=\"td-FUv WDiNrH\"]/div[2]")).click();
		}else {
			WebElement p3 = driver.findElement(By.xpath("//a[contains(text(),'REVEL RVL-38C-LGP-BK Acoustic')]/../../../..//div[text()='Remove']"));
			js.executeScript("arguments[0].scrollIntoView(true)", p3);
			p3.click();
			driver.findElement(By.xpath("//div[@class=\"td-FUv WDiNrH\"]/div[2]")).click();
		}
	}
	public static int priceOfProduct(String price) {
		String[] productPrice=price.split("₹");
		//for(int i=0;i<productPrice.length;i++) {
			price=productPrice[1].replace(" ", "").replace(",", "");
		//}
		int finalPrice=Integer.parseInt(price);
		return finalPrice;
	}

}
