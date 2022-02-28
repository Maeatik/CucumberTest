package cucumber;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import helper.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PersonalCabinetPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class DeletePhotoFunction
{
    PersonalCabinetPage personalCabinetPage = new PersonalCabinetPage();

    @And("profile has image")
    public void profileHasImage()
    {
        $(personalCabinetPage.getProfileImage().shouldBe(Condition.visible));
    }

    @When("click delete image button")
    public void profileDeleteClick()
    {
        personalCabinetPage.deleteImageButton();
    }

    @And("delete menu opened")
    public void profileCheckWindow()
    {
        personalCabinetPage.checkDeleteWindow();
    }

    @When("click yes button")
    public void profileDeleteImageClick()
    {
        personalCabinetPage.deleteMenuButton();
    }

    @Then("profile should has not image")
    public void profileShouldHasNotImage()
    {
        $(personalCabinetPage.getProfileImage().shouldNotBe(Condition.visible));
    }



}
