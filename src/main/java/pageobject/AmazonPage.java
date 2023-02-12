package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    public WebDriver driver;

    @FindBy(css="#twotabsearchtextbox")
    WebElement searchField;

    @FindBy(css="#nav-search-submit-button")
    WebElement searchBtn;

    public AmazonPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isSearchFieldDisplayed(){
        return  searchField.isDisplayed();
    }

    public void enterTextOnSearchFieldAndClickOnSearchBtn(String value) throws InterruptedException {
         searchField.sendKeys(value);
         Thread.sleep(1000);
         searchBtn.click();

    }
}
