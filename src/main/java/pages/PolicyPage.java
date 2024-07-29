package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Common;
import utils.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PolicyPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public PolicyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(5) a")
    private WebElement policyIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessage;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[12]")
    private WebElement letterIcon;
    @FindBy(xpath = "//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]")
    private WebElement downloadIcon;
    @FindBy(xpath = "//div[@class='ms-parent']")
    private WebElement statusDropDown;
    @FindBy(xpath = "//div[@class='ms-drop']/ul/li[2]/label/input")
    private WebElement optionFromStatusDropdown;
    @FindBy(xpath = "//div[@id='search']/div[6]/div/span/span/input")
    private WebElement fromDateOfPolicy;
    @FindBy(xpath = "//div[@id='search']/div[7]/div/span/span/input")
    private WebElement toDateOfPolicy;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody[1]/tr[1]")
    private WebElement policyDetailsOnDateValue;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;

    //Add claim page
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[21]/ul/li/a")
    private WebElement cogIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[21]/ul/li/ul/li[1]/a")
    private WebElement addClaimIcon;

    //Add note window
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[21]/ul/li/ul/li[2]/a")
    private WebElement addNoteIcon;
    @FindBy(css = "input[id='Title']")
    private WebElement titleOfAddNote;
    @FindBy(css = "textarea[id='Description']")
    private WebElement descriptionOfAddNote;
    @FindBy(css = "button[value='Cancel']")
    private WebElement cancelButton;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[21]/ul/li/ul/li[4]/a")
    private WebElement viewQuoteIcon;

    //Policy information page
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/a")
    private WebElement cogIconOfPolicyInformationPage;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[1]/a")
    private WebElement addClaimIconOfPolicyInformationPage;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[2]/a")
    private WebElement addNoteIconOfPolicyInformationPage;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[3]/a")
    private WebElement addEndorsementIconOfPolicyInformationPage;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[5]/a")
    private WebElement viewQuoteIconOfPolicyInformationPage;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[6]/a")
    private WebElement cancelPolicyIconOfPolicyInformationPage;
    @FindBy(css = "input[id='RefundAmount']")
    private WebElement cancelPolicyRefundAmount;
    @FindBy(css = "textarea[id='CancellationDescription']")
    private WebElement cancelPolicyDescription;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div/div/div/a[@id='btnCancel']")
    private WebElement cancelPolicyCancelButton;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[8]/a")
    private WebElement addAllocatePaymentIcon;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[11]/a")
    private WebElement addAccountMaintenanceIcon;

    //All tab on policy information page

    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[1]")
    private WebElement transactionalTab;
    @FindBy(xpath = "//div[@id='gridPolicyActivityList']/table/tbody/tr")
    private WebElement detailsOfTransactionTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[2]")
    private WebElement insurerTab;
    @FindBy(xpath = "//div[@id='gridPolicyTransactionInsurerList']/table/tbody/tr")
    private WebElement detailsOfInsurerTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[3]")
    private WebElement claimTab;
    @FindBy(xpath = "//div[@id='gridPolicyClaimList']/table/tbody/tr")
    private WebElement detailsOfClaimTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[4]")
    private WebElement reversalClaimTab;
    @FindBy(xpath = "//div[@id='gridPolicyClaimReversalInvoiceList']/table/tbody/tr")
    private WebElement detailsOfReversalClaimTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[5]")
    private WebElement creditNoteTab;
    @FindBy(xpath = "//div[@id='gridPolicyCreditNoteList']/table/tbody/tr")
    private WebElement detailsOfCreditNoteTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[6]")
    private WebElement policyInvoiceCreditNoteTab;
    @FindBy(xpath = "//div[@id='gridNamePolicyInvoiceCreditNote']/table/tbody/tr")
    private WebElement detailsOfPolicyInvoiceCreditNoteTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[7]")
    private WebElement notesTab;
    @FindBy(xpath = "//div[@id='gridNameNotes']/table/tbody/tr")
    private WebElement detailsOfNotesTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[8]")
    private WebElement installmentTab;
    @FindBy(xpath = "//div[@id='gridPolicyInstalmentList']/table/tbody/tr")
    private WebElement detailsOfInstallmentTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[10]")
    private WebElement exclusionTab;
    @FindBy(xpath = "//div[@id='gridNameExclusion']/table/tbody/tr")
    private WebElement detailsOfExclusionTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[13]")
    private WebElement historyTab;
    @FindBy(xpath = "//div[@id='gridPolicyHistoryList']/table/tbody/tr")
    private WebElement detailsOfHistoryTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[14]")
    private WebElement policyLedgerTab;
    @FindBy(xpath = "//div[@id='gridPolicyDebtorLedgerList']/table/tbody/tr")
    private WebElement detailsOfPolicyLedgerTab;

    public void clickPolicyIcon() {
        common.waitUntilElementToBeClickable(policyIcon);
        common.jsClick(policyIcon);
        Log.info("Click on the policy icon on the left toolbar");
        common.pause(2);
    }

    public String verifyManagePolicyPage() {
        String Message = displayedMessage.getText();
        Log.info("Script Redirect To Page Of====>" + Message);
        return Message;
    }

    public String fetchAndDisplayData() {
        StringBuilder array = new StringBuilder();
        Log.info("Script Now Try's To Fetch Policy Data On Manage Policy Page");
        List<WebElement> totalRow = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");

        for (WebElement rEle : totalRow) {
            array.append(rEle.getText()).append("\n");
        }
        Log.info("On Manage Policy Page Available Policy Information is ====>" + array);
        return array.toString();
    }

    public String verifyDateFormatOfStartDate() {
        Log.info("Script Now Try's To Verify Date Format Of  Start Date On Manage Policy Page");
        List<WebElement> policyDateColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[13]");
        StringBuilder dateArray = new StringBuilder();
        for (WebElement startDate : policyDateColumn) {
            dateArray.append(startDate.getText()).append("\n");
        }
        Log.info("On Manage Policy Page Start Date Displays In Format Of ====>" + dateArray);
        return dateArray.toString();
    }

    public String verifyDateFormatOfExpireDate() {
        Log.info("Script Now Try's To Verify Date Format Of  Expire Date On Manage Policy Page");
        List<WebElement> endDateColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[14]");
        StringBuilder dateArray = new StringBuilder();
        for (WebElement endDate : endDateColumn) {
            dateArray.append(endDate.getText()).append("\n");
        }
        Log.info("On Manage Policy Page Expire Date Displays In Format Of ====>" + dateArray);
        return dateArray.toString();
    }

    public String clickOnPolicyNumberLink() {
        Log.info("Script Now Try's To Open Policy Information Page By Clicking Each Policy Number Link On Manage Policy Page");
        List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr[1]/td[4]/a");
        StringBuilder displayMessage = new StringBuilder();
        for (WebElement cEle : totalColumn) {
            cEle.click();
            Log.info("Script Has Clicked On Policy Number Link On Manage Policy Page");
            common.pause(4);
            common.switchToWindow(1);
            System.out.println(driver.getCurrentUrl());
            Log.info("Script Redirects to Respected Policy Information Page Is===> " + driver.getCurrentUrl());
            displayMessage.append(displayedMessage.getText()).append("\n");
            driver.close();
            common.switchToWindow(0);
        }
        return displayMessage.toString();
    }

    public String verifyPolicyInformationPage() {
        return displayedMessage.getText();
    }

    public void clickPolicyNumberToGotToPolicyInformationPage() {
        Log.info("Script Now Try's To Open Policy Information Page By Clicking First One Policy Number Link On Manage Policy Page");
        for (int i = 1; i < 11; i++) {
            WebElement policyProductName = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[" + i + "]/td[8]"));
            String productName = policyProductName.getText();
            if (!productName.equals("BB Commercial")) {
                WebElement policy = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[" + i + "]/td[4]/a"));
                common.jsClick(policy);
                common.pause(1);
                break;
            }
        }
        Log.info("Script Has Clicked On Policy Number Link On Manage Policy Page");
        common.switchToWindow(1);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        Log.info("Script Redirects to Respected Policy Information Page Is===> " + driver.getCurrentUrl());
    }

    public void LetterIcon() {
        common.scroll_By_Pixel("0", "350");
        common.pause(3);
        Log.info("Script Has Reached To Letter Icon On Policy Information Page");
        letterIcon.click();
        Log.info("Script Has Clicked On Letter Icon On Policy Information Page");
        common.pause(3);
    }

    public void DownloadIcon() {
        common.scrollToElement(downloadIcon);
        Log.info("Script Has Reached To Letter Download Icon On Policy Information Page");
        common.pause(2);

        List<WebElement> totalDownLoadSymbol = common.waitUntilPresenceOfAllElement("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]");
        int dSize = totalDownLoadSymbol.size();

        for (WebElement element : totalDownLoadSymbol) {
            element.click();
            Log.info("Script Has Clicked On Letter Download Icon On Policy Information Page");
            common.pause(5);
            break;
        }
    }

    public String verifyDownLoadFile() {
        File myfile = new File("C:/Users/prowe/Downloads/BPIS Document - Welcome Letter.pdf");
        //FileUtils.touch(myfile);
        String re = "";
        if (myfile.exists()) {
            re = "file exist";
        } else {
            System.out.println("The file does not exist");
        }
        return re;
    }

    //Check appropriate policy data should displays against option selected from status drop down on manage policy page

    public void selectOptionFromStatusDropDown() {
        common.pause(4);
        common.moveToElement(statusDropDown);
        statusDropDown.click();
        common.pause(1);
        optionFromStatusDropdown.click();
        Log.info("Script Has Selected Any Available Options From Status Dropdown On Manage Policy Page");
        common.pause(1);
        common.jsClick(searchButton);
        Log.info("Script Has Clicked On Search Button On Manage Policy Page");
        common.pause(4);
    }

    public String verifyPolicyStatusUponDropDown() {

        List<WebElement> policyStatus = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr[1]");
        StringBuilder Status = new StringBuilder();
        for (WebElement status : policyStatus) {
            Status.append(status.getText()).append("\n");
        }
        return Status.toString();
    }

    //Filter policy details on manage policy page upon from and to date value of policy  on manage policy page

    public void enterFromAndToDateValueOfPolicy() {
        fromDateOfPolicy.sendKeys(common.getPastDate(5, "dd.MM.yyyy"));
        Log.info("Script Has Entered From Policy Date On Manage Policy Page");
        common.pause(1);
        toDateOfPolicy.sendKeys(common.getPastDate(4, "dd.MM.yyyy"));
        Log.info("Script Has Entered To Policy Date Manage On Policy Page");
    }

    public void clickOnSearchButtonOnManagePolicyPage() {
        common.waitUntilElementToBeClickable(searchButton);
        searchButton.click();
        Log.info("Script Has Clicked On Search Button To Fetch Data On Manage Policy Page");
        common.pause(4);
    }

    public void verifyPolicyDetails() {
        common.pause(1);
        List<WebElement> policyDates = driver.findElements(By.xpath("//div[@id='gridName']/table/tbody/tr/td[18]"));
        ArrayList<String> policyDate1 = new ArrayList<>();
        for (WebElement policyDate : policyDates) {
            policyDate1.add(policyDate.getText());
        }

        for (String s : policyDate1) {
            if (s.equals(common.getPastDate(5, "dd.MM.yyyy")) || s.equals(common.getPastDate(4, "dd.MM.yyyy"))) {
                System.out.println("The quote date is: " + s);
            } else {
                System.out.println("Expected date between: " + common.getPastDate(5, "dd.MM.yyyy") + " & " + common.getPastDate(4, "dd.MM.yyyy") + " But found: " + s);
                System.out.println(policyDate1);
                Assert.fail("Policies details are not displayed upon selected date");
            }
        }
    }

    //Verify that add claim page should open with all details by clicking on add claim icon of cog drop down against policy number on manage policy page

    public void clickOnAddClaimPage() {
        common.pause(1);
        for (int i = 1; i < 11; i++) {
            WebElement policyProductName = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[" + i + "]/td[8]"));
            String productName = policyProductName.getText();
            if (!productName.equals("BB Commercial")) {
                common.scrollToElement(cogIcon);
                WebElement cogIcon = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[" + i + "]/td[21]/ul/li/a"));
                Actions action = new Actions(driver);
                action.moveToElement(cogIcon).perform();
                Log.info("Script Has Clicked On Cog Icon");
                common.pause(1);
                driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[" + i + "]/td[21]/ul/li/ul/li[1]/a")).click();
                Log.info("Script Has Clicked On Add Claim Icon");
                common.pause(3);
                break;
            }
        }
    }

    public String verifyAddClaimPage() {
        String displayMessage;
        common.switchToWindow(1);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayedMessage.getText();
        Log.info("Script Redirects To Page Add Claim Page===>" + displayMessage);
        return displayMessage;
    }

    //Verify that add note window should open with all details by clicking on add note icon of cog drop down against policy number on manage policy page

    public void clickOnAddNoteIcon() {
        common.waitUntilVisibilityOfElement(cogIcon);
        common.moveToElement(cogIcon);
        Log.info("Script Has Clicked On Cog Icon To Select Add Note Option");
        common.pause(2);
        common.jsClick(addNoteIcon);
        Log.info("Script Has Clicked On Add Note Icon");
        common.pause(3);
    }

    public void verifyAddNoteWindow() {
        titleOfAddNote.sendKeys("Test");
        common.pause(1);
        descriptionOfAddNote.sendKeys("Test");
        common.pause(1);
        Log.info("Script Redirects To Add Note Window");
        cancelButton.click();
    }

    //Verify that quote information page should open with all details by clicking on view quote icon of cog drop down against policy number on manage policy page

    public void clickOnViewQuoteIcon() {
        common.waitUntilVisibilityOfElement(cogIcon);
        common.moveToElement(cogIcon);
        Log.info("Script Has Clicked On Cog Icon To Select View Quote Page");
        common.pause(2);
        common.jsClick(viewQuoteIcon);
        Log.info("Script Has Clicked On View Quote Page Icon");
        common.pause(3);
    }

    public String verifyQuoteInformationPage() {
        String displayMessage;
        common.switchToWindow(1);
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To View Quote Page is===>" + driver.getCurrentUrl());
        displayMessage = displayedMessage.getText();
        return displayMessage;
    }

    //Add claim page displays with all details by clicking add claim icon of cog drop down on policy information page

    public void clickOnAddClaimOnPolicyInformation() {
        common.moveToElement(cogIconOfPolicyInformationPage);
        Log.info("Script Has Clicked On Cog Icon To Select Policy Information Page");
        common.pause(3);
        addClaimIconOfPolicyInformationPage.click();
        Log.info("Script Has Clicked On Policy Information Page Icon");
        common.pause(4);
    }

    //Add note window displays with all details by clicking add note icon of cog drop down on policy information page

    public void clickOnAddNoteOnPolicyInformation() {
        common.moveToElement(cogIconOfPolicyInformationPage);
        common.pause(3);
        addNoteIconOfPolicyInformationPage.click();
        common.pause(4);
    }

    //Policy endorsement page displays with all details by clicking add endorsement icon of cog drop down on policy information page

    public void clickOnAddEndorsementOnPolicyInformation() {
        common.moveToElement(cogIconOfPolicyInformationPage);
        Log.info("Script Has Clicked On Cog Icon To Select Add Endorsement Page Icon");
        common.pause(3);
        addEndorsementIconOfPolicyInformationPage.click();
        Log.info("Script Has Clicked On Add Endorsement Page Icon");
        common.pause(4);
    }

    public String verifyPolicyEndorsementPage() {
        String displayMessage;
        common.switchToWindow(1);
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Add Endorsement Page Is ===>" + driver.getCurrentUrl());
        displayMessage = displayedMessage.getText();

        driver.close();
        common.switchToWindow(0);
        return displayMessage;
    }

    //Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page

    public void selectViewQuoteIcon() {
        common.moveToElement(cogIconOfPolicyInformationPage);
        common.pause(3);
        viewQuoteIconOfPolicyInformationPage.click();
        common.pause(4);
    }

    public String verifyQuoteInfoPage() {
        String displayMessage;
        common.switchToWindow(1);
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayedMessage.getText();

        driver.close();
        common.switchToWindow(0);
        return displayMessage;
    }

    // Cancel  policy window displays with all details by clicking cancel policy icon of cog drop down on policy information page

    public void selectCancelPolicyIcon() {
        common.moveToElement(cogIconOfPolicyInformationPage);
        common.pause(3);
        cancelPolicyIconOfPolicyInformationPage.click();
        common.pause(4);
    }

    public void verifyCancelPolicyWindow() {
        cancelPolicyCancelButton.click();
    }

    //Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page

    public void selectAddAllocateIcon() {
        common.moveToElement(cogIconOfPolicyInformationPage);
        Log.info("Script Has Clicked On Cog Icon To Select Add Allocate Page Icon");
        common.pause(3);
        addAllocatePaymentIcon.click();
        Log.info("Script Has Clicked On Add Allocate Page Icon");
        common.pause(4);
    }

    public String verifyAddAllocatePage() {

        String displayMessage;
        common.switchToWindow(1);
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Add Allocate Page Is===>" + driver.getCurrentUrl());
        displayMessage = displayedMessage.getText();

        driver.close();
        common.switchToWindow(0);
        return displayMessage;
    }

    //Client account maintenance displays with all details by clicking add account maintenance icon of cog drop down on policy information page
    public void selectAddAccountMaintenanceIcon() {
        common.moveToElement(cogIconOfPolicyInformationPage);
        Log.info("Script Has Clicked On Cog Icon To Select Add Account Maintenance Page Icon");
        common.pause(3);
        addAccountMaintenanceIcon.click();
        Log.info("Script Has Clicked On  Add Account Maintenance Page Icon");
        common.pause(4);
    }

    public String verifyClientAccountMaintenancePage() {
        String displayMessage;
        displayMessage = displayedMessage.getText();
        Log.info("Script Redirects To Add Account Maintenance Page Is===>" + driver.getCurrentUrl());

        driver.close();
        return displayMessage;
    }

    //Verify appropriate details should reflect by clicking on  transactions tab on policy information page

    public void clickOnTransactionTab() {
        common.scroll_By_Pixel("0", "350");
        transactionalTab.click();
        Log.info("Script Has Clicked On Transaction Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfTabsOnPolicyInformationPage() {
        String data = detailsOfTransactionTab.getText();
        Log.info("Data Display On Clicking Transaction Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on insurer tab on policy information page

    public void clickOnInsurerTab() {
        common.scroll_By_Pixel("0", "350");
        insurerTab.click();
        Log.info("Script Has Clicked On Insurer Tab On Policy Information Page");
        common.pause(3);

    }

    public String verifyDetailsOfInsurerTabOnPolicyInformationPage() {
        String data = detailsOfInsurerTab.getText();
        Log.info("Data Display On Clicking Insurer Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on claim tab on policy information page

    public void clickOnClaimTab() {
        common.scroll_By_Pixel("0", "350");
        claimTab.click();
        Log.info("Script Has Clicked On Claim Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfClaimTabOnPolicyInformationPage() {
        String data = detailsOfClaimTab.getText();
        Log.info("Data Display On Clicking Claims Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on reversal claim tab on policy information page
    public void clickOnReversalClaimTab() {
        common.scroll_By_Pixel("0", "350");
        reversalClaimTab.click();
        Log.info("Script Has Clicked On Reversal Claim Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfReversalClaimTabOnPolicyInformationPage() {
        String data = detailsOfReversalClaimTab.getText();
        Log.info("Data Display On Clicking Reversal Claim Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on credit note tab on policy information page

    public void clickOnCreditNoteTab() {
        common.scroll_By_Pixel("0", "350");
        creditNoteTab.click();
        Log.info("Script Has Clicked On Credit Note Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfCreditNoteTabOnPolicyInformationPage() {
        String data = detailsOfCreditNoteTab.getText();
        Log.info("Data Display On Clicking Credit Note Tab is==>" + data);
        return data;

    }

    //Verify appropriate details should reflect by clicking on policy invoice credit note tab on policy information page

    public void clickOnPolicyInvoiceCreditNoteTab() {
        common.scroll_By_Pixel("0", "350");
        policyInvoiceCreditNoteTab.click();
        Log.info("Script Has Clicked On Policy Invoice Credit Note Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfPolicyInvoiceCreditNoteTabOnPolicyInformationPage() {
        String data = detailsOfPolicyInvoiceCreditNoteTab.getText();
        Log.info("Data Display On Clicking Policy Invoice Note Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on policy notes tab on policy information page

    public void clickOnNotesTab() {
        common.scroll_By_Pixel("0", "350");
        notesTab.click();
        Log.info("Script Has Clicked On Notes Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfNotesTabOnPolicyInformationPage() {
        String data = detailsOfNotesTab.getText();
        Log.info("Data Display On Clicking Notes Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on policy  installment tab on policy information page

    public void clickOnInstallmentTab() {
        common.scroll_By_Pixel("0", "350");
        installmentTab.click();
        Log.info("Script Has Clicked On Installment Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfInstallmentTabOnPolicyInformationPage() {
        String data = detailsOfInstallmentTab.getText();
        Log.info("Data Display On Clicking Installment Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on policy exclusion tab on policy information page

    public void clickOnExclusionTab() {
        common.scroll_By_Pixel("0", "350");
        exclusionTab.click();
        Log.info("Script Has Clicked On Exclusion Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfExclusionTabOnPolicyInformationPage() {
        common.pause(2);
        String data = detailsOfExclusionTab.getText();
        Log.info("Data Display On Clicking Exclusion Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on history tab on policy information page

    public void clickOnHistoryTab() {
        common.scroll_By_Pixel("0", "350");
        historyTab.click();
        Log.info("Script Has Clicked On History Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfHistoryTabOnPolicyInformationPage() {
        String data = detailsOfHistoryTab.getText();
        Log.info("Data Display On Clicking History Tab is==>" + data);
        return data;
    }

    //Verify appropriate details should reflect by clicking on policy ledger tab on policy information page

    public void clickOnPolicyLedgerTab() {
        common.scroll_By_Pixel("0", "350");
        policyLedgerTab.click();
        Log.info("Script Has Clicked On Policy Ledger Tab On Policy Information Page");
        common.pause(3);
    }

    public String verifyDetailsOfPolicyLedgerTabOnPolicyInformationPage() {
        String data = detailsOfPolicyLedgerTab.getText();
        Log.info("Data Display On Clicking Policy Ledger Tab is==>" + data);
        return data;
    }
}
