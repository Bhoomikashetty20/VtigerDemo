package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_96612yg6jw_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486453138860&hvpos=&hvnetw=g&hvrand=15705165116312144397&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062013&hvtargid=kwd-296458795081&hydadcr=14452_2154371&gclid=CjwKCAiAuOieBhAIEiwAgjCvcnTSab80nwxciqnxLGl87cw0pX7m9-7WgtkLqwIfrDCYOrLYXG-B5xoCxm0QAvD_BwE");
		Thread.sleep(5000);
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("airdopes");
		//Thread.sleep(5000);
		
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.linkText("Sell")).click();
		Thread.sleep(5000);
		

	}

}
