package com.jpmc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	//public static void main(String[] args) throws Exception  {
		
		@Test
		
		public void method() throws InterruptedException{
		// TODO Auto-generated method stub
		
	/*	WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://markets-uat.jpmorgan.com/legacyLogin");  */
		
		WebDriverManager.edgedriver().setup();
		
		RemoteWebDriver driver = new EdgeDriver();
		
		driver.get("https://gmail.com");
		Thread.sleep(500)	;
		System.out.println("hi rk");
		System.out.println("hi rk3");
		
		
		/*
		//driver.get("https://markets-uat.jpmorgan.com/legacyLogin");  
		driver.switchTo().alert().accept();
		Thread.sleep(500)	;
		
		driver.findElement(By.xpath("//input[@aria-label = 'Email or phone']")).sendKeys("rktesting.262");
		Thread.sleep(500)	;
		*/
		
		
		

	}

}
