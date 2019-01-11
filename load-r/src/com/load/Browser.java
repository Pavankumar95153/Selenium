package com.load;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver" ,"C:\\Users\\Pavankumar\\eclipse-workspace\\load-r\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		

	}

}
