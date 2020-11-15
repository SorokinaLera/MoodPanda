package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void validateRe_RegistrationErrorMessage() {
        mainPage.openPage()
                .pressStart()
                .clickCreateAccountButton()
                .reRegistration()
                .errorMessageExpected();
    }
}
