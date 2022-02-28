package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    @Step("Открываем окно входа")
    public void clickPersonalCabinetButton()
    {
        $(By.className("lk-link")).click();
    }

    @Step("Вводим логин")
    public void insertLogin(String login)
    {
        $(By.name("p_login")).val(login).pressEnter();
    }

    @Step("Вводим пароль")
    public void insertPassword(String password)
    {
        $(By.name("p_pass")).val(password).pressEnter();
    }

    @Step("Переходим в профиль")
    public void clickProfileButton()
    {
        $(By.xpath("//div[@class='container clearfix']/descendant::a[@title='Портфолио']")).click();
    }

    @Step("Переход в интернет-приемную")
    public void clickServiceButton()
    {
        $(By.xpath("//div[@class='container clearfix']/descendant::a[@title='Интернет-приемная']")).click();
    }
}
