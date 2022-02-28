package cucumber;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PersonalCabinetPage;

import static com.codeborne.selenide.Selenide.$;

public class UploadFileFunction
{
    PersonalCabinetPage personalCabinetPage = new PersonalCabinetPage();

    @And("profile has not image")
    public void profileHasNotImage()
    {
        $(personalCabinetPage.getProfileImage().shouldNotBe(Condition.visible));
    }

    @When("upload file {string}")
    public void uploadFile(String arg0)
    {
        personalCabinetPage.uploadImage();
    }

    @And("click add image button")
    public void clickAddImageButton()
    {
        personalCabinetPage.clickAddImageButton();
    }

    @Then("profile should has image")
    public void profileShouldHasImage()
    {
        $(personalCabinetPage.getProfileImage().shouldBe(Condition.visible));
    }

}
