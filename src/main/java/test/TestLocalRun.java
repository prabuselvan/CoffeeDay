package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLocalRun {
	
	public static void main(String args[]) throws InterruptedException {
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		System.out.println("welcome");

		
	}

}
