package pages;

import factory.DriverFactory;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Common;

import java.time.Duration;
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
        Actions actions = new Actions(driver);
        actions.moveToElement(claimIcon).perform();
        approveClaimIcon.click();
        common.pause(3);
    }

    public String verifyApproveClaimPage() {
        return displayedMessage.getText();
    }

    public String fetchData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> data = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='divLoadApproveClaimsList']/div/table/tbody")));
        String array = " ";
        for (WebElement rEle : data) {
            array = array + " " + rEle.getText();
        }

        return array;

    }
}
