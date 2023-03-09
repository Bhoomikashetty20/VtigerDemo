package Basics;

import org.openqa.selenium.edge.EdgeDriver;

public class EmptyEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhoomika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();

	}

}
