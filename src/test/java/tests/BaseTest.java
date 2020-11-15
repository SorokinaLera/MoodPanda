package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTest {

    MainPage mainPage;
    LoginPage loginPage;
    RegisterPage registerPage;
    WelcomePage welcomePage;


    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.startMaximized = true;
        mainPage = new MainPage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        welcomePage = new WelcomePage();
    }
}
