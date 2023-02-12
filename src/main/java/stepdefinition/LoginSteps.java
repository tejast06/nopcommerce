package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    lp = new LoginPage(driver);
	}

	@When("users open url {string}")
	public void users_open_url(String url) {
	   driver.get(url);
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String user, String pw) {
	    lp.enterCredentials(user, pw);
	}

	@When("click on login")
	public void click_on_login() {
	    lp.clickOnLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
        Assert.isTrue(driver.getTitle().contains(title),"Page title is incorrect");
	    
	}

	@Then("click on logout")
	public void click_on_logout() {
	    lp.clickOnLogout();
	}

}
