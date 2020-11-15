package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    private static final String Your_First_Name_field_locator = "[id=ContentPlaceHolderContent_TextBoxFirstName]";
    private static final String Your_Surname_Initial_field_locator = "[id=ContentPlaceHolderContent_TextBoxSurname]";
    private static final String Gender_field_locator = "[id=ContentPlaceHolderContent_DropDownListGender]";
    private static final String Year_of_Birth_field_locator = "[id=ContentPlaceHolderContent_DropDownListYearOfBirth]";
    private static final String Email_for_Registration = "moodpanda2020@mailinator.com";
    private static final String Email_field_locator = "[id=ContentPlaceHolderContent_TextBoxEmail]";
    private static final String Password_field_locator = "[id=ContentPlaceHolderContent_TextBoxPassword]";
    private static final String Confirm_Password_field_locator = "[id=ContentPlaceHolderContent_TextBoxPasswordConfirm]";
    private static final String Password = "moodpanda2020";
    private static final String Login_Button_locator = "[id=ContentPlaceHolderContent_ButtonLogin]";

    public RegisterPage reRegistration() {
        $(Your_First_Name_field_locator).sendKeys("Name");
        $(Your_Surname_Initial_field_locator).sendKeys("S.");
        $(Gender_field_locator).selectOption("Other");
        $(Year_of_Birth_field_locator).selectOption("2000");
        $(Email_field_locator).sendKeys(Email_for_Registration);
        $(Password_field_locator).sendKeys(Password);
        $(Confirm_Password_field_locator).sendKeys(Password);
        $(Login_Button_locator).click();
        return new RegisterPage();
    }

    public RegisterPage errorMessageExpected() {
        $(byText(" This email is already registed with MoodPanda")).isDisplayed();
        return new RegisterPage();
    }
}
