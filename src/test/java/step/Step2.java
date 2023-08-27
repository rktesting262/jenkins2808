package step;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step2 {
	

@When("user enters jpmcurl")
public void user_enters_jpmcurl() {
    // Write code here that turns the phrase above into concrete actions
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

	 RemoteWebDriver driver;
	
	WebDriverManager.chromedriver().setup();      
	driver = new ChromeDriver(options);
	
	driver.get("https://markets-uat.jpmorgan.com/legacyLogin");

}

@Then("jpmc page display")
public void jpmc_page_display() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("jpmcdone");

}

}
