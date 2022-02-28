package cucumber;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import helper.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AcademicPerformancePage;

import static com.codeborne.selenide.Selenide.open;

public class AcademicPerformanceFunction
{
    AcademicPerformancePage academicPerformancePage = new AcademicPerformancePage();

    String urlShelly = ConfigReader.getProperty("shelly_url");
    @Given("site link is shelly_url")
    public void openShellyLink()
    {
    }

    @When("click academic performance button")
    public void clickAcademicPerformanceButton() {
        academicPerformancePage.clickPerformanceButton();
    }


    String urlAcadem = ConfigReader.getProperty("academic_performance_url");
    @Then("site link is academic_performance_url")
    public void checkPersonalPerformancePage() {
    }
}
