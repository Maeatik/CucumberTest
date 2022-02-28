package cucumber;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import helper.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;

public class GoPagesFunctions
{


    String urlDoc = ConfigReader.getProperty("document_url");
    String urlStud = ConfigReader.getProperty("stud_anketa_url");
    String urlMain = ConfigReader.getProperty("main_url");


    @Given("an open browser with main_url")
    public void anOpenBrowserWith() {
        open(urlMain);
    }

    @Given("site link is document_url")
    public void openDocumentLink()
    {
        Assert.assertEquals(WebDriverRunner.url(), urlDoc);
    }
    @Given("site link is stud_anketa_url")
    public void openAnketaLink()
    {
        Assert.assertEquals(WebDriverRunner.url(), urlStud);
    }
    @Then("site link must starts with shelly_url")
    public void mustStartShelly() {}

    @Given("site link starts with document_url")
    public void mustStartDocUrl() {

    }

    @Then("site link must starts with document_url")
    public void mustStartDoc() {

    }

}
