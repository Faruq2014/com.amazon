package com.amazon.bestSeller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferenceBerweenCloseAndQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is how we open chrome browser
		WebDriverManager.chromedriver().setup();// driver exe 
		
		WebDriver driver = new ChromeDriver(); // browser
		//this is how we open an application
		driver.get("https://www.assurancewireless.com/");
		driver.findElement(By.linkText("My Account Login")).click();
		//driver.close();
		driver.quit();
		

	}

}
