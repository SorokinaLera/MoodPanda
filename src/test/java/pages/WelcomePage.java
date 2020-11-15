package pages;

import io.qameta.allure.Description;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class WelcomePage {

    @Description("Сheck that registration was successful")
    public void validateSuccessfulLogin() {
        $(byText(" Welcome! How did you feel this time last week?")).isDisplayed();

    }
}