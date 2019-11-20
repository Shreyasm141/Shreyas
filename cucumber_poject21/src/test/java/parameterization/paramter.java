package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paramter {
	WebDriver driver=null;
	@Given("User opns the application")
	public void user_opns_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();3
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.mallikarjunaswam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	    String url="http://demowebshop.tricentis.com/";
	    driver.get(url);
	  
	}

	@When("user click on to login link")
	public void user_click_on_to_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver.findElement(By.linkText("Log in")).click();
		  System.out.println("the title of the page is "+driver.getTitle());
		
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver.findElement(By.name("Email")).sendKeys(username);
		  driver.findElement(By.name("Password")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]")).click();
		  driver.close();
	}

	@Then("Message displayed login successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
}
