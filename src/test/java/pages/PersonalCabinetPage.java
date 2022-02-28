package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class PersonalCabinetPage {

    @Step("Удаляем фото")
    public void deleteImageButton(){$(By.xpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[2]/div[2]")).click();}

    @Step("Соглашаемся на удаление")
    public void deleteMenuButton(){$(By.xpath("//*[@id=\"answer\"]/a[1]\n")).click();}

    @Step("Проверяем есть ли окно соглашения удаления")
    public void checkDeleteWindow(){$(By.xpath("/html/body/div[3]/div/div")).exists();}

    @Step("Добавляем фото")
    public void clickAddImageButton() {
        $(By.xpath("//input[@value=' Добавить фото (до 5 Мб)']")).click();
    }

    @Step("Загружаем фото")
    public void uploadImage() {
        $(By.name("p_file")).uploadFile(new File("src/test/resources/img/foto.jpg"));
    }

    @Step("Находим фото")
    public SelenideElement getProfileImage() {
        return $(By.className("photo"));
    }
}
