package cucumber;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import helper.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import pages.ServicePage;

import static com.codeborne.selenide.Selenide.open;

public class DownloadFunction {
    MainPage mainPage = new MainPage();
    ServicePage servicePage = new ServicePage();
    String fileText;

    @When("click service button")
    public void clickPersonalCabinetButton() {
        mainPage.clickServiceButton();
    }

    @When("click documents button")
    public void clickDocumentsButton() {
        servicePage.clickDocumentButton();
    }

    @And("click pattern button")
    public void clickPatternButton() {
        servicePage.clickPatternsButton();
    }

    @And("download document")
    public void downloadDocument() {
        fileText = servicePage.clickDownloadDocument();
    }

    @Then("document should contains string {string}")
    public void documentShouldContainsString(String arg0) {
        Assert.assertTrue(fileText.contains(arg0));
    }


}
