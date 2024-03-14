package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    //1.Create a class constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='copyright']/small")
    private WebElement displayedText;

    public String verifyUrl() {
        return driver.getCurrentUrl();
    }

    public String verifyMessage() {
        return displayedText.getText();
    }
}
