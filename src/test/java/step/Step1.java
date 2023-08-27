package step;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step1 
{

	@When("user enters url")
	public void user_enters_url() {
	    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.edgedriver().setup();
		
		RemoteWebDriver driver = new EdgeDriver();
		
		driver.get("https://gmail.com");
	   
	}

	@Then("gamil page display")
	public void gamil_page_display() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("done");
	
	}
	
}
