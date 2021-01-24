package com.amazon.bestSeller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAmazonTitle {

	public static void main(String[] args) {
		//this is how we open chrome browser
		WebDriverManager.chromedriver().setup();// driver exe 
		
		WebDriver driver = new ChromeDriver(); // browser
		//this is how we open an application
		driver.get("https://www.amazon.com/");
		
		//this is how we open Fire fox browser
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver1= new FirefoxDriver();
		//driver1.get("https://www.amazon.com/");
		
		 //this is how we open edge browser
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver2= new EdgeDriver();
		//driver2.get("https://www.amazon.com/");
		
		//WebDriverManager.iedriver().setup();
		//WebDriver sajid=new InternetExplorerDriver(); 
		
		// sajid is the variable name for driver interface that means we can name anything.
		//driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	
		String amazonTitle=driver.getTitle();
		
		//String is a data type
		// amazonTitle is the variable name
		// = is an operator
		// driver.getTitle();is a selenium WebDriver interface method. also variable value.
	
		System.out.println("this is amazon title: "+amazonTitle);
		// we are printing the title.
		
		String amazonURL=driver.getCurrentUrl();
		System.out.println("this amazon URL"+amazonURL);
		
		
		
		
		List<WebElement> links=driver.findElements(By.xpath("//*[@id='nav-xshop']/a"));
		System.out.println(links.size());
		for (int i = 0; i <links.size(); i++) {
			System.out.println(links.get(i).getText());
			
		}
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
	    
	    driver.quit();
		// this is how to kill a browser.
		
		
		
		
		

	}

}
