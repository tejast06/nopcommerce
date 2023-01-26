package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(css="#Email")
	WebElement email;
	
	@FindBy(css="#Password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logOut;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterCredentials(String userName,String pwd) {
		email.clear();
		email.sendKeys(userName);
		password.clear();
		password.sendKeys(pwd);
		
		
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	
	public void clickOnLogout() {
		logOut.click();	
	}

}
