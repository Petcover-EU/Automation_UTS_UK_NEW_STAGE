package pages;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Common;

import java.util.ArrayList;
import java.util.List;

public class ManageClaimPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public ManageClaimPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(6)")
    private WebElement manageClaimIcon;
    @FindBy(xpath = "//ul[@id='side-menu']/li[6]/ul/li[1]")
    private WebElement manageClaimText;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessage;

    //Add claim page
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/a[2]")
    private WebElement addClaimIcon;
    @FindBy(xpath = "//div[@class='well1']/div/div/div/div/span/span/span[@class='k-input']")
    private WebElement treatmentDropdown;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div[2]/div[1]/div/div/div[3]/div/div/div/span")
    private WebElement riskCountryDropDown;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div[2]/div[2]/div[3]/div/div[3]/div/div/div/span")
    private WebElement lostCountryDropDown;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div[3]/div/div/div[6]/div/div/div/span")
    private WebElement insuredCountryDropDown;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div[3]/div/div/div[7]/div/div/div/span")
    private WebElement coverDropDown;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div[3]/div[3]/div[3]/div/div[5]/div/div/div/span")
    private WebElement statusDropDown;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div//div[5]/div/div/div/span")
    private WebElement notifiedMethodDDown;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div//div[8]/div/div/div/span")
    private WebElement paymentToDDown;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div/div[14]/div/div/div/span")
    private WebElement conditionTypeDDown;
    @FindBy(xpath = "//div[@class='controls']/div/button")
    private WebElement treatmentStatusDropDown;
    @FindBy(xpath = "//div[@class='ms-parent']/div/ul/li[2]/label/input")
    private WebElement selectItemFromStatusDropDown;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement clickSearchButton;

    //Edit claim
    @FindBy(xpath = "//div[@id='gridName']/table/tbody[1]/tr[1]/td[22]/ul/li/a")
    private WebElement cogIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody[1]/tr[1]/td[22]/ul/li/ul/li[1]/a")
    private WebElement editPageIconInFDropDown;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody[1]/tr[1]/td[22]/ul/li/ul/li[3]/a")
    private WebElement viewPolicyPageIconOnDropDown;
    @FindBy(xpath = "//div[@id='search']/div[5]/div/span/span")
    private WebElement statusDropDownOnClaim;
    @FindBy(xpath = "//ul[@id='ClaimStatusId_listbox']/li[2]")
    private WebElement optionFromStatusDD;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr")
    private WebElement verifyDataOnClaimPage;
    @FindBy(xpath = "//div[@id='search']/div[6]/div/div/div/button")
    private WebElement treatmentStatusDropDownOnClaim;
    @FindBy(xpath = "//div[@id='search']/div[6]/div/div/div/div/ul/li[10]/label/input")
    private WebElement optionFromTreatmentStatusDD;
    @FindBy(xpath = "//div[@id='search']/div[7]/div/span/span/input")
    private WebElement claimAdvisedFromDate;
    @FindBy(xpath = "//div[@id='search']/div[8]/div/span/span/input")
    private WebElement claimAdvisedToDate;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;
    @FindBy(css = "div[class='spiner-example']")
    private WebElement loadSpinner;

    public void clickManageClaimIcon() {
        common.moveToElement(manageClaimIcon);
        manageClaimIcon.click();
        manageClaimText.click();
        common.pause(3);
    }

    public String verifyClaimPageInformation() {
        if (common.isElementDisplayed("//div[@id='gridName']/table/tbody[1]/tr")) {
            List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr");
            StringBuilder itemsDisplayed = new StringBuilder();
            for (WebElement cEle : totalColumn) {
                itemsDisplayed.append(cEle.getText()).append("\n");
            }
            return itemsDisplayed.toString();
        }
        return null;
    }

    public String verifyTreatmentDate() {
        List<WebElement> claimDateColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[14]");
        StringBuilder treatmentDate = new StringBuilder();
        for (WebElement startDate : claimDateColumn) {
            treatmentDate.append(startDate.getText()).append("\n");
        }
        return treatmentDate.toString();
    }

    public String verifyFirstAdvisedDate() {
        List<WebElement> claimDateColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[15]");
        StringBuilder fAdvisedDate = new StringBuilder();
        for (WebElement startDate : claimDateColumn) {
            fAdvisedDate.append(startDate.getText()).append("\n");
        }
        return fAdvisedDate.toString();
    }


    public String verifyAmountPayableColumn() {
        List<WebElement> monthlyPremiumColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[16]");
        StringBuilder yPremium = new StringBuilder();
        for (WebElement amountP : monthlyPremiumColumn) {
            yPremium.append(amountP.getText()).append("\n");
        }
        return yPremium.toString();
    }

    public String redirectToClaimInformationPage() {

        List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[5]/a");
        int cSize = totalColumn.size();
        StringBuilder displayMessage = new StringBuilder();

        for (WebElement cEle : totalColumn) {
            System.out.println(cEle.getText());
            cEle.click();
            common.pause(2);
            common.switchToWindow(1);
            System.out.println(driver.getCurrentUrl());
            displayMessage.append(displayedMessage.getText()).append("\n");

            driver.close();
            common.switchToWindow(0);
        }
        return displayMessage.toString();
    }

    public String verifyClaimInfoPageText() {
        common.pause(2);
        return displayedMessage.getText();
    }

    public void clickAddClaimIcon() {
        addClaimIcon.click();
        common.pause(2);
    }

    public String verifyAddClaimPage() {
        return displayedMessage.getText();
    }

    public void verifyDropDown() {
        common.waitUntilInvisibilityOfElement(loadSpinner);
        common.pause(2);
        treatmentDropdown.click();
        common.pause(2);
        riskCountryDropDown.click();
        common.pause(2);
        lostCountryDropDown.click();
        common.pause(2);
        insuredCountryDropDown.click();
        common.pause(2);
        common.scroll_By_Pixel("0", "350");
        coverDropDown.click();
        common.pause(2);
        statusDropDown.click();
        common.pause(2);
        notifiedMethodDDown.click();
        common.pause(2);
        paymentToDDown.click();
        common.pause(2);
        conditionTypeDDown.click();
        common.pause(2);
    }

    //Treatment status should reflect upon option selected from treatment status drop down on manage claim page

    public void selectItemFromStatusDropDown() {
        treatmentStatusDropDown.click();
        common.pause(1);
        selectItemFromStatusDropDown.click();
        common.pause(1);
        treatmentStatusDropDown.click();
        common.pause(1);
    }

    public ArrayList<String> verifyTreatmentStatus() {
        List<WebElement> treatmentStatus = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[21]");

        ArrayList<String> statusArray = new ArrayList<>();
        for (WebElement cEle : treatmentStatus) {
            statusArray.add(cEle.getText());
        }
        return statusArray;
    }

    //Edit client details

    public void selectEditClientDetails() {
        common.pause(2);

        common.moveToElement(cogIcon);
        editPageIconInFDropDown.click();
        common.pause(1);
    }

    public String verifyEditClaimPage() {
        return displayedMessage.getText();
    }

    //View Policy Page

    public void selectViewPolicyPage() {
        common.pause(2);
        common.moveToElement(cogIcon);
        viewPolicyPageIconOnDropDown.click();
        common.pause(1);
    }

    public String verifyViewPolicyPage() {
        return displayedMessage.getText();
    }

    //Filter Claim details on manage claim page upon option from claim status drop down

    public void selectOptionFromStatusDropDown() {
        statusDropDownOnClaim.click();
        common.pause(1);
        optionFromStatusDD.click();
    }

    public void clickOnSearchButton() {
        searchButton.click();
        common.pause(2);
    }

    public String verifyDetailsOfClaim() {
        return verifyDataOnClaimPage.getText();
    }

    public void selectOptionOfTreatmentStatusDD() {
        treatmentStatusDropDownOnClaim.click();
        common.pause(1);
        optionFromTreatmentStatusDD.click();
        common.pause(1);
        treatmentStatusDropDownOnClaim.click();
    }

    //Filter Claim details on manage claim page upon from and to date value of claim first advised on manage claim page

    public void enterValueOfFromAndToDateOfAdvised() {
        claimAdvisedFromDate.sendKeys("23.02.2023");
        common.pause(1);
        claimAdvisedToDate.sendKeys("24.06.2024");
        common.pause(1);
    }
}



