package pages;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Common;

import java.util.List;

public class ApproveClaimPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public ApproveClaimPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(6)")
    private WebElement claimIcon;
    @FindBy(xpath = "//ul[@id='side-menu']/li[6]/ul/li[2]")
    private WebElement approveClaimIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessage;


    public void clickOnApproveClaimButton() {
        common.moveToElement(claimIcon);
        approveClaimIcon.click();
        common.pause(2);
    }

    public String verifyApproveClaimPage() {
        return displayedMessage.getText();
    }

    public String fetchData() {
        List<WebElement> data = common.waitUntilPresenceOfAllElement("//div[@id='divLoadApproveClaimsList']/div/table/tbody");
        StringBuilder array = new StringBuilder();
        for (WebElement rEle : data) {
            array.append(rEle.getText()).append("\n");
        }
        return array.toString();
    }
}
