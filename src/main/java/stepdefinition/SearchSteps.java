package stepdefinition;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import pageobject.AmazonPage;

public class SearchSteps extends BaseClass {

    public AmazonPage amazonPage;
    @Given("user launches the browser")
    public void user_launches_the_browser() {
        logger = Logger.getLogger("nopCommerce"); //added logger
        PropertyConfigurator.configure("log4j.properties");

        logger.info("Launching the browser");
       initialization();
        logger.info("browser launched successfully");
       amazonPage = new AmazonPage(driver);
    }
    @When("user opens  url {string}")
    public void user_opens_url(String url) {
        logger.info("open the url "+url+"");
       driver.get(url);
        logger.info("url opened successfully");
    }
    @Then("search field should be displayed")
    public void search_field_should_be_displayed() {
        logger.info("validate the 'Search field' is display");
        Assert.assertTrue("Search field is not displayed",amazonPage.isSearchFieldDisplayed());
        logger.info("search field displayed successfully");
    }
    @When("user enters {string} in search and click on search button")
    public void user_enters_in_search_and_click_on_search_button(String value) throws InterruptedException {
        logger.info("enter "+value+" in search field and clicked on search button");
        amazonPage.enterTextOnSearchFieldAndClickOnSearchBtn(value);
        logger.info("value entered and search button clicked successfully");
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String title) {
        logger.info("validate the page title display successfully");
        Assert.assertTrue("Page Title is incorrect",driver.getTitle().contains(title));
        logger.info("page title displayed successfully");
    }
    @Then("close the browser")
    public void close_the_browser() {
        logger.info("close the browser");
        driver.close();
        logger.info("browser closed successfully");
    }
}
