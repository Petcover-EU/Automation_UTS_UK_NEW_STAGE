package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Common;

import java.util.List;

public class AccountPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(8)")
    private WebElement accountIcon;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[1]/a")
    private WebElement bankAccountIcon;
    @FindBy(xpath = "//div[@class='ibox-content padding-right7']/div/div/div/div/div")
    private WebElement displayedMessageAtViewBankAccountPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addBankAccountIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageAtAddBankAccountPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[2]/a")
    private WebElement manageReceiptIcon;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addReceiptIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageAtAddReceiptPage;
    @FindBy(css = "input[id='AccountNumber']")
    private WebElement accountNumberInput;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;
    @FindBy(css = "input[id='Name']")
    private WebElement clientNameInput;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[10]/a")
    private WebElement manageBreachRegisterIcon;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addBreachRegisterIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageAtAddBreachRegisterPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[7]/a")
    private WebElement policyReviewIcon;
    @FindBy(xpath = "//div[@id='search']/div[1]/div/span/span/input")
    private WebElement policyEndDate;
    @FindBy(xpath = "//div[@id='search']/div[2]/div/span/span/input")
    private WebElement policyToDate;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnPolicyReview;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[14]/a")
    private WebElement processCreditCardPaymentIcon;
    @FindBy(xpath = "//div[@id='search']/div/div[1]/div/span/span/input")
    private WebElement paymentDueDate;
    @FindBy(xpath = "//div[@id='search']/div/div[2]/div/span/span/input")
    private WebElement receiptDate;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnProcessCreditCardPayment;

    public void clickOnAccountIcon() {
        accountIcon.click();
        common.pause(1);
    }

    public void traversingThroughPages() {
        common.pause(1);
        for (int i = 1; i <= 17; i++) {
            common.pause(2);
            if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[" + i + "]/a")).isEnabled()) {
                driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[" + i + "]/a")).click();
            } else {
                common.pause(2);
                driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[" + i + "]/a")).click();
            }
            common.pause(1);
            System.out.println(driver.getCurrentUrl());
            common.pause(1);
            accountIcon.click();
        }
    }

    public void clickOnBankIcon() {
        bankAccountIcon.click();
        common.pause(2);
    }

    public void enterAccountNumber() {
        accountNumberInput.sendKeys("55771199");
    }

    public void clickOnSearchButton() {
        searchButton.click();
        common.pause(2);
    }

    public String verifyAccountNumber() {
        List<WebElement> accountNumber = common.waitUntilPresenceOfAllElement("//div[@id='gridBankList']/table/tbody/tr/td[4]");
        StringBuilder account = new StringBuilder();
        for (WebElement cLE : accountNumber) {
            account.append(cLE.getText()).append("\n");
        }
        return account.toString();
    }

    public void enterClientName() {
        clientNameInput.sendKeys("PetPlan Claims CUL");
    }

    public String verifyClientName() {
        List<WebElement> clientName = common.waitUntilPresenceOfAllElement("//div[@id='gridBankList']/table/tbody/tr/td[3]");
        StringBuilder name = new StringBuilder();
        for (WebElement cLE : clientName) {
            name.append(cLE.getText()).append("\n");
        }
        return name.toString();
    }

    //Bank Information page displays with details after clicking on bank code link on manage bank details

    public void clickOnBankCode() {
        List<WebElement> bankCode = common.waitUntilPresenceOfAllElement("//div[@id='gridBankList']/table/tbody/tr/td[2]");
        for (WebElement cLE : bankCode) {
            cLE.click();
            common.pause(2);
            break;
        }
    }

    public String verifyBankDetails() {
        return displayedMessageAtViewBankAccountPage.getText();
    }

    //Add Bank page  displays will all details when user clicks on add bank icon on manage bank page

    public void clickOnAddBankIcon() {
        addBankAccountIcon.click();
        common.pause(2);
    }

    public String verifyAddBankPage() {
        return displayedMessageAtAddBankAccountPage.getText();
    }

    //Add receipt page  displays will all details when user clicks on add receipt icon on manage receipt page

    public void clickOnManageReceiptIcon() {
        manageReceiptIcon.click();
        common.pause(2);
    }

    public void clickOnAddReceiptIcon() {
        addReceiptIcon.click();
        common.pause(2);
    }

    public String verifyAddReceiptPage() {
        return displayedMessageAtAddReceiptPage.getText();
    }

    //Add breach register page  displays will all details when user clicks on add breach register icon on manage breach register page

    public void clickOnManageBreachRegisterIcon() {
        manageBreachRegisterIcon.click();
        common.pause(2);
    }

    public void clickOnAddBreachRegisterIcon() {
        addBreachRegisterIcon.click();
        common.pause(2);
    }

    public String verifyAddBreachRegisterPage() {
        return displayedMessageAtAddBreachRegisterPage.getText();
    }

    //Filter Policy review information upon policy end date and to date

    public void clickOnPolicyReviewIcon() {
        policyReviewIcon.click();
        common.pause(2);
    }

    public void enterPolicyFromAndToDate() {
        policyEndDate.clear();
        policyEndDate.sendKeys("12.04.2022");
        common.pause(1);
        policyToDate.clear();
        common.pause(1);
        policyToDate.sendKeys("12.08.2024");
    }

    public void clickSearchIconOnPolicyReview() {
        searchButtonOnPolicyReview.click();
        common.pause(2);
    }

    public String verifyPolicyReviewData() {
        List<WebElement> PolicyReviewDetails = common.waitUntilPresenceOfAllElement("//div[@id='divLoadRenewalList']/div/table/tbody/tr");
        StringBuilder details = new StringBuilder(" ");
        for (WebElement cLE : PolicyReviewDetails) {
            details.append(cLE.getText()).append("\n");
        }
        return details.toString();
    }

    //Filter Process Credit Card Payment information upon payment due date and receipt date

    public void clickOnProcessCreditCardPaymentIcon() {
        processCreditCardPaymentIcon.click();
        common.pause(2);
    }

    public void enterFromAndToDate() {
        paymentDueDate.clear();
        paymentDueDate.sendKeys("12.02.2022");
        common.pause(1);
        receiptDate.clear();
        common.pause(1);
        receiptDate.sendKeys("12.08.2024");
    }

    public void clickSearchIconOnPolicyHistory() {
        searchButtonOnProcessCreditCardPayment.click();
        common.pause(2);
    }

    public String verifyPolicyCreditCardPaymentData() {
        List<WebElement> PolicyCreditCardPaymentDetails = common.waitUntilPresenceOfAllElement("//div[@id='gridPolicyDueInvoiceGrid']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : PolicyCreditCardPaymentDetails) {
            details.append(cLE.getText()).append("\n");
        }
        return details.toString();
    }
}