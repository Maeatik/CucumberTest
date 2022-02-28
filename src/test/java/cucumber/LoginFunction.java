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

import static com.codeborne.selenide.Selenide.*;

public class LoginFunction {
    MainPage mainPage = new MainPage();

    @When("click login button")
    public void clickButton() {
        mainPage.clickPersonalCabinetButton();
    }

    @And("enter a login in login input field")
    public void enterALoginInLoginInputField()
    {
        mainPage.insertLogin(ConfigReader.getProperty("login"));
    }

    @And("enter a password in password input field")
    public void enterAPasswordInPasswordInputField()
    {
        mainPage.insertPassword(ConfigReader.getProperty("password"));
    }


}
