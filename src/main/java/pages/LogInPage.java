package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Common;

public class LogInPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    //1.Create a class constructor
    public LogInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Login Form Elements
    @FindBy(xpath = "//input[@id='UserName']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@id='login']")
    private WebElement accountLoginButton;
    @FindBy(css = "h2[class='main-title']")
    private WebElement dashBoardTitle;
    @FindBy(xpath = "//span[@class='welcome-message']/label/small")
    private WebElement roleText;

    //Action Methods

    public String verifyUrl() {
        common.pause(1);
        return driver.getCurrentUrl();

    }

    public void enterUserName(String userN) {
//        emailField.sendKeys(userN);
        common.sendKeys(emailField,userN);

    }

    public void enterPassword(String Password) {
//        passwordField.sendKeys(Password);
        common.sendKeys(passwordField,Password);

    }

    public void clickSubmit() {
        common.click(accountLoginButton);
    }

    public String verifyDashBoardTitle() {
        common.pause(3);
        return dashBoardTitle.getText();
    }

    public String verifyRoleText() {
        return roleText.getText();
    }


}
