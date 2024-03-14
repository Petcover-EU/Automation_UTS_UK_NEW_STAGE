package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Common;

public class LogOutPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    //1.Create a class constructor
    public LogOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Login Form Elements
    @FindBy(css = "ul[id='side-menu']>li:nth-child(12)")
    private WebElement logOutIcon;
    @FindBy(xpath = "//div[@class='middle-box text-center loginscreen']/header/h4")
    private WebElement logInMessage;

    //Methods
    public void clickOnLogOutButton() {
        common.pause(2);
        logOutIcon.click();
    }

    public String verifyLogInPage() {
        common.pause(2);
        return logInMessage.getText();
    }


}
