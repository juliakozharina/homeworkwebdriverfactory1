package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.ProfilePage;
import pages.Step;
import pages.WebDriverFactory;


public class TestHW {
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    Step step = new Step();

    String LOGIN = System.getProperty("juliako13@mail.ru");
    String PASSWORD = System.getProperty("1234Qwerty12345&");

    @BeforeClass
    public static void setupDriver(){
        WebDriverFactory.driverLoad();
    }

    @Before
    public void setWebDriverFactory(){
        webDriverFactory.create();
    }

    @After
    public void closeWebDriverFactory(){
        WebDriverFactory.quit();
    }

    @Test
    public void someTest()throws InterruptedException{
        step.openMainPage();
        step.openAuthorizationForm();
        step.fillTheAuthorizationForm(LOGIN,PASSWORD);
        step.submitAuthorizationForm();
        step.fillProfileFields()
                .enterNAME_FIELD("Юлия")
                .enterLATIN_NAME_FIELD("Julia")
                .enterLATIN_SURNAME_FIELD("Иванова")
                .enterLATIN_SURNAME_FIELD("Ivanova")
                .enterBLOG_NAME_FIELD("Julia")
                .enterDATE_OF_BIRTH_FIELD("01.01.1990")
                .selectCOUNTRYRussia()
                .selectCITYMoscow()
                .selectRemoteWork()
                .saveChangesOnTheProfilePage();

        WebDriverFactory.getDriver().quit();
        webDriverFactory.create();

        ProfilePage profilePage = new ProfilePage();

        step.openMainPage();
        step.openAuthorizationForm();
        step.fillTheAuthorizationForm(LOGIN,PASSWORD);
        step.submitAuthorizationForm();
        step.openProfilePage();
    }
}
