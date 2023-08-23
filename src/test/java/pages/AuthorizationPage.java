package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    public AuthorizationPage(){
        PageFactory.initElements(WebDriverFactory.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@required])[1]")
    protected WebElement LOGIN;

    @FindBy(xpath = "(//input[@required])[2]")
    protected WebElement PASSWORD;

    @FindBy (xpath = "//button[@class=\"sc-9a4spb-0 gYNtqF sc-11ptd2v-2-Component cElCrZ\"]")
    protected WebElement submitButton;

    public WebElement getLOGIN() {
        return LOGIN;
    }

    public WebElement getPASSWORD() {
        return PASSWORD;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void enterLogin(String LOGIN){
        getLOGIN().clear();
        getLOGIN().sendKeys(LOGIN);
    }

    public void enterPassword(String PASSWORD){
        getPASSWORD().clear();
        getPASSWORD().sendKeys(PASSWORD);

    }

    public void authorize() {
        getSubmitButton().click();
    }
}
