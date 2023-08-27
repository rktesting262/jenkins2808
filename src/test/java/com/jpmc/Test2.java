package com.jpmc;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	//public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
	@Test
	public void method2()
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		 RemoteWebDriver driver;
		
		WebDriverManager.chromedriver().setup();      
		driver = new ChromeDriver(options);
		
		driver.get("https://markets-uat.jpmorgan.com/legacyLogin");
	
		/*Duration d=driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(d.getSeconds());*/
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
	/*	driver.findElement(By.id("userName1")).sendKeys("exttest02");
		Thread.sleep(1000);	
		
		driver.findElement(By.id("password1")).click();
		Thread.sleep(500);	
		driver.findElement(By.id("password1")).sendKeys("External2023Aug@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id = 'loginButton1']")).click();
	
		 Thread.sleep(12000);
		 driver.findElement(By.xpath("//li[@id='MY_APP_trading.eXecute_html']/span")).click();
	
		 Thread.sleep(5000);
	
		 driver.switchTo().frame("html_mc");
		 Thread.sleep(1000);
		 driver.switchTo().frame("trading.eXecute_html");
		 Thread.sleep(1000);
		 //DISPLAY COOKIES
		 Set<Cookie> s =driver.manage().getCookies();
		 
		 List<Cookie> l = new ArrayList<Cookie>(s);
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy-hh-mm-ss");
		 for (Cookie c:l)
		 {
			 try
			 {
				 System.out.println(c.getName()+"expirs"+sdf.format(c.getExpiry()));
			 }
			 catch(Exception ex)
			 {
					System.out.println(c.getName());
			 }
		 }
		 
		 //BrowserLogs
		 LogEntries bl = driver.manage().logs().get("browser");
		 for(LogEntry l1:bl)
		 {
			 System.out.println(l1.getMessage());
		 }
		 */
		 

	}

}
