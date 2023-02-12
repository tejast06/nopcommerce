package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Hp\\Desktop\\jenkins\\nopcommerce\\src\\main\\java\\features\\amazon.feature",
        glue = "stepdefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:test-output"}
)
public class SearchTestRunner {
}
