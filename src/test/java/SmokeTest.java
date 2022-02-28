import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest", "json:target/cucumber.json"},
        features = "src/test/resources/cucumber",
        glue = "cucumber")

public class SmokeTest
{
    @BeforeClass
    static public void setupTimeout()
    {
        Configuration.headless = true;
    }
}