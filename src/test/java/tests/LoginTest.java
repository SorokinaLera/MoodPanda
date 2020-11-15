package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void correctLogging() {
        mainPage.openPage()
                .pressStart()
                .filingAccountInformation();
        welcomePage.validateSuccessfulLogin();
    }
}
