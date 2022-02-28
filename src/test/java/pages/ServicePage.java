package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static org.apache.commons.io.FileUtils.readFileToString;

public class ServicePage {
    @Step("Переход на вкладку документы")
    public void clickDocumentButton()
    {
        $(By.xpath("//div[@class='container clearfix']/a[8]")).click();
    }

    @Step("Переходим в шаблоны документов")
    public void clickPatternsButton()
    {
        $(By.xpath("//a[@href = '#tab1']")).click();
    }

    @Step("Скачиваем файл и проверяем содержимое")
    public String clickDownloadDocument()
    {
        String result = "";
        try {
            result = readFileToString($(By.xpath("//*[@id='tab1']/p[2]/a")).download(),"windows-1251");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
