package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class EmptyFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bhoomika\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

	}

}
