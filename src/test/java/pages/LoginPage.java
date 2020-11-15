package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final String create_account_button = "[id=ContentPlaceHolderContent_HyperLinkRegister]";
    private static final String Email = "moodpanda2020@mailinator.com";
    private static final String Password = "moodpanda2020";
    private static final String Email_field_locator = "[id=ContentPlaceHolderContent_TextBoxEmail]";
    private static final String Password_field_locator = "[id=ContentPlaceHolderContent_TextBoxPassword]";
    private static final String Login_Button_locator = "[id=ContentPlaceHolderContent_ButtonLogin]";


    public RegisterPage clickCreateAccountButton() {
        $(create_account_button).pressEnter();
        return new RegisterPage();
    }

    @Step("Logging into account")
    public RegisterPage filingAccountInformation() {
        $(byText("Login to MoodPanda")).isDisplayed();
        $(Email_field_locator).sendKeys(Email);
        $(Password_field_locator).sendKeys(Password);
        $(Login_Button_locator).pressEnter();
        return new RegisterPage();
    }
}
