package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage extends BasePage {

    @FindBy(xpath = "(//input[@required])[1]")
    protected WebElement LOGIN;

    @FindBy(xpath = "(//input[@required])[2]")
    protected WebElement PASSWORD;

    @FindBy (xpath = "//*[@id=\"__PORTAL__\"]/div/div/div[3]/div[2]/div/div[2]/div[1]/div/button/div")
    protected WebElement submitButton;

    public AuthorizationPage() {
        super();
    }

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
