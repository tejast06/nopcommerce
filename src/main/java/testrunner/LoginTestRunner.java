package testrunner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "F:\\eclipse\\Guru99BDD\\src\\main\\java\\features\\logins.feature",
        glue = "stepdefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:test-output"}
)
public class LoginTestRunner {
}
