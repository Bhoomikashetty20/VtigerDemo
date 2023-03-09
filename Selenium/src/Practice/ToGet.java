package Practice;

import org.openqa.selenium.edge.EdgeDriver;

public class ToGet {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.zomato.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getWindowHandle());
		//driver.get("https://www.swiggy.com/");
		//driver.get("https://www.dunzo.com/bangalore");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		driver.navigate().to("https://www.dunzo.com/bangalore");
		//driver.navigate().to("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
	}
	

}
