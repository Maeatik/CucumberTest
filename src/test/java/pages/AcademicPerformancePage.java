package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AcademicPerformancePage
{
    @Step("Переход на вкладку документы")
    public void clickPerformanceButton()
    {
        $(By.xpath("//*[@id=\"main-blocks\"]/div[1]/div[6]/a")).click();
    }
}
