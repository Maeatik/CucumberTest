package cucumber;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import helper.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class PersonalCabinetFunction {
    MainPage mainPage = new MainPage();


    @When("click personal cabinet button")
    public void clickPersonalCabinetButton() {
        mainPage.clickProfileButton();
    }


}
