package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private static final String URL_main_page = "https://moodpanda.com/";

    @Step("Go to the MoodPanda page")
    public MainPage openPage() {
        open(URL_main_page);
        return this;
    }

    public LoginPage pressStart() {
        $(byText("Start")).pressEnter();
        return new LoginPage();
    }
}

