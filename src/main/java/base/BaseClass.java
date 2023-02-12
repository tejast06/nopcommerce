package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;
    public Logger logger;


    public void initialization(){
        System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
