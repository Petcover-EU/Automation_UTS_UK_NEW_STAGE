package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Common;
import utils.Log;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PolicyPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public PolicyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(5)")
    private WebElement policyIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessage;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessageOnPolicyInformation;
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
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/a")
    private WebElement cogIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/ul/li[1]/a")
    private WebElement addClaimIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessageOnAddClaimPage;

    //Add note window
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/ul/li[2]/a")
    private WebElement addNoteIcon;
    @FindBy(css = "input[id='Title']")
    private WebElement titleOfAddNote;
    @FindBy(css = "textarea[id='Description']")
    private WebElement descriptionOfAddNote;
    @FindBy(css = "button[value='Cancel']")
    private WebElement cancelButton;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/ul/li[4]/a")
    private WebElement viewQuoteIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessageOnViewQuotePage;

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
    @FindBy(xpath = "//div[@class='ibox-content']/div[5]/div/div/div/a[@id='btnCancel']")
    private WebElement cancelPolicyCancelButton;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[8]/a")
    private WebElement addAllocatePaymentIcon;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[11]/a")
    private WebElement addAccountMaintenanceIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessageOnPolicyEndorsementPage;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessageOnQuoteInformationPage;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessageOnAddAllocatePage;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessageOnAddAccountMaintenancePage;

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
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[9]")
    private WebElement exclusionTab;
    @FindBy(xpath = "//div[@id='gridNameExclusion']/table/tbody/tr")
    private WebElement detailsOfExclusionTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[12]")
    private WebElement historyTab;
    @FindBy(xpath = "//div[@id='gridPolicyHistoryList']/table/tbody/tr")
    private WebElement detailsOfHistoryTab;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[13]")
    private WebElement policyLedgerTab;
    @FindBy(xpath = "//div[@id='gridPolicyDebtorLedgerList']/table/tbody/tr")
    private WebElement detailsOfPolicyLedgerTab;

    public void clickPolicyIcon() {

        policyIcon.click();
        Log.info("*******Script Clicks On Policy Icon*******");
        common.pause(7);
    }

    public String verifyManagePolicyPage() {
        String Message = displayedMessage.getText();
        Log.info("Script Redirect To Page Of====>" + Message);
        return Message;
    }

    public String fetchAndDisplayData() {
        String array = " ";
        Log.info("Script Now Try's To Fetch Policy Data On Manage Policy Page");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));

        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        Log.info("On Manage Policy Page Available Policy Information is ====>" + array);
        return array;
    }

    public String verifyDateFormatOfStartDate() {
        Log.info("Script Now Try's To Verify Date Format Of  Start Date On Manage Policy Page");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> policyDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[13]")));
        String dateArray = " ";
        for (WebElement startDate : policyDateColumn) {
            dateArray = dateArray + " " + startDate.getText();

        }
        Log.info("On Manage Policy Page Start Date Displays In Format Of ====>" + dateArray);
        return dateArray;
    }

    public String verfiyDateFormatOfExpireDate() {
        Log.info("Script Now Try's To Verify Date Format Of  Expire Date On Manage Policy Page");
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> endDateColumn = eWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[14]")));
        String dateArray = " ";
        for (WebElement endDate : endDateColumn) {
            dateArray = dateArray + " " + endDate.getText();
        }
        Log.info("On Manage Policy Page Expire Date Displays In Format Of ====>" + dateArray);
        return dateArray;

    }

    public String clickOnPolicyNumberLink() {
        Log.info("Script Now Try's To Open Policy Information Page By Clicking Each Policy Number Link On Manage Policy Page");

        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[4]/a")));

        String displayMessage = " ";
        for (WebElement cEle : totalColumn) {
            cEle.click();
            Log.info("Script Has Clicked On Policy Number Link On Manage Policy Page");
            common.pause(4);
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            System.out.println(driver.getCurrentUrl());
            Log.info("Script Redirects to Respected Policy Information Page Is===> " + driver.getCurrentUrl());
            displayMessage = displayMessage + displayedMessage.getText();
            driver.close();
            driver.switchTo().window(tabs2.get(0));
            //break;

        }
        return displayMessage;

    }

    public String verifyPolicyInformationPage() {
        return displayedMessageOnPolicyInformation.getText();

    }

    public void clickPolicyPageToDownloadFile() {
        Log.info("Script Now Try's To Open Policy Information Page By Clicking First One Policy Number Link On Manage Policy Page");

        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement totalColumn = cWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[4]/a")));
        totalColumn.click();
        Log.info("Script Has Clicked On Policy Number Link On Manage Policy Page");
        common.pause(5);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Log.info("Script Redirects to Respected Policy Information Page Is===> " + driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());

    }

    public void LetterIcon() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        common.pause(3);
        Log.info("Script Has Reached To Letter Icon On Policy Information Page");
        letterIcon.click();
        Log.info("Script Has Clicked On Letter Icon On Policy Information Page");
        common.pause(3);

    }

    public void DownloadIcon() {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]")));
        Log.info("Script Has Reached To Letter Download Icon On Policy Information Page");
        common.pause(5);

        WebDriverWait dWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalDownLoadSymbol = dWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]")));
        int dSize = totalDownLoadSymbol.size();

        for (int i = 0; i < dSize; i++) {
            totalDownLoadSymbol.get(i).click();
            Log.info("Script Has Clicked On Letter Download Icon On Policy Information Page");
            common.pause(7);
            break;
        }

        //driver.switchTo().window(tabs2.get(0));
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
        WebElement element = statusDropDown;
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        common.pause(1);
        optionFromStatusDropdown.click();
        Log.info("Script Has Selected Any Available Options From Status Dropdown On Manage Policy Page");
        common.pause(1);
        searchButton.click();
        Log.info("Script Has Clicked On Search Button On Manage Policy Page");
        common.pause(4);

    }

    public String verifyPolicyStatusUponDropDown() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> policyStatus = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr[1]")));
        String Status = " ";
        for (WebElement status : policyStatus) {
            Status = status.getText();
        }
        return Status;
    }

    //Filter policy details on manage policy page upon from and to date value of policy  on manage policy page

    public void enterFromAndToDateValueOfPolicy() {
        fromDateOfPolicy.sendKeys("23.06.2023");
        Log.info("Script Has Entered From Policy Date On Manage Policy Page");
        common.pause(1);
        toDateOfPolicy.sendKeys("20.06.2025");
        Log.info("Script Has Entered To Policy Date Manage On Policy Page");
    }

    public void clickOnSearchButtonOnManagePolicyPage() {
        searchButton.click();
        Log.info("Script Has Clicked On Search Button To Fetch Data On Manage Policy Page");
        common.pause(6);
    }

    public String verifyPolicyDetails() {
        String policyValue = policyDetailsOnDateValue.getText();
        Log.info("Available Policies Information Upon Start And To Policy Date Values===> " + policyValue);
        return policyValue;
    }

    //Verify that add claim page should open with all details by clicking on add claim icon of cog drop down against policy number on manage policy page

    public void clickOnAddClaimPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIcon).perform();
        Log.info("Script Has Clicked On Cog Icon");
        common.pause(2);
        addClaimIcon.click();
        Log.info("Script Has Clicked On Add Claim Icon");
        common.pause(3);
    }

    public String verifyAddClaimPage() {
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Page Add Claim Page===>" + driver.getCurrentUrl());
        displayMessage = displayMessage + displayedMessage.getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;
    }


    //Verify that add note window should open with all details by clicking on add note icon of cog drop down against policy number on manage policy page

    public void clickOnAddNoteIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIcon).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Note Option");
        common.pause(2);
        addNoteIcon.click();
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
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIcon).perform();
        Log.info("Script Has Clicked On Cog Icon To Select View Quote Page");
        common.pause(2);
        viewQuoteIcon.click();
        Log.info("Script Has Clicked On View Quote Page Icon");
        common.pause(3);
    }

    public String verifyQuoteInformationPage() {
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To View Quote Page is===>" + driver.getCurrentUrl());
        displayMessage = displayMessage + displayedMessageOnViewQuotePage.getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;
    }

    //Add claim page displays with all details by clicking add claim icon of cog drop down on policy information page

    public void clickOnAddClaimOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIconOfPolicyInformationPage).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Policy Information Page");
        common.pause(3);
        addClaimIconOfPolicyInformationPage.click();
        Log.info("Script Has Clicked On Policy Information Page Icon");
        common.pause(4);
    }

    //Add note window displays with all details by clicking add note icon of cog drop down on policy information page

    public void clickOnAddNoteOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIconOfPolicyInformationPage).perform();
        common.pause(3);
        addNoteIconOfPolicyInformationPage.click();
        common.pause(4);
    }

    //Policy endorsement page displays with all details by clicking add endorsement icon of cog drop down on policy information page

    public void clickOnAddEndorsementOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIconOfPolicyInformationPage).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Endorsement Page Icon");
        common.pause(3);
        addEndorsementIconOfPolicyInformationPage.click();
        Log.info("Script Has Clicked On Add Endorsement Page Icon");
        common.pause(4);
    }

    public String verifyPolicyEndorsementPage() {

        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Add Endorsement Page Is ===>" + driver.getCurrentUrl());
        displayMessage = displayMessage + displayedMessageOnPolicyEndorsementPage.getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;


    }

    //Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page

    public void selectViewQuoteIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIconOfPolicyInformationPage).perform();
        common.pause(3);
        viewQuoteIconOfPolicyInformationPage.click();
        common.pause(4);
    }

    public String verifyQuoteInfoPage() {
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + displayedMessageOnQuoteInformationPage.getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    // Cancel  policy window displays with all details by clicking cancel policy icon of cog drop down on policy information page

    public void selectCancelPolicyIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIconOfPolicyInformationPage).perform();
        common.pause(3);
        cancelPolicyIconOfPolicyInformationPage.click();
        common.pause(4);
    }

    public void verifyCancelPolicyWindow() {


      /*  driver.findElement(cancelPolicyRefundAmount).sendKeys("123.98");
        driver.findElement(cancelPolicyDescription).sendKeys("Test");
       common.pause(1);*/
        cancelPolicyCancelButton.click();

    }

    //Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page

    public void selectAddAllocateIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIconOfPolicyInformationPage).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Allocate Page Icon");
        common.pause(3);
        addAllocatePaymentIcon.click();
        Log.info("Script Has Clicked On Add Allocate Page Icon");
        common.pause(4);
    }

    public String verifyAddAllocatePage() {

        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Add Allocate Page Is===>" + driver.getCurrentUrl());
        displayMessage = displayMessage + displayedMessageOnAddAllocatePage.getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    //Client account maintenance displays with all details by clicking add account maintenance icon of cog drop down on policy information page
    public void selectAddAccountMaintenanceIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(cogIconOfPolicyInformationPage).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Account Maintenance Page Icon");
        common.pause(3);
        addAccountMaintenanceIcon.click();
        Log.info("Script Has Clicked On  Add Account Maintenance Page Icon");
        common.pause(4);
    }

    public String verifyClientAccountMaintenancePage() {
        String displayMessage = " ";
        // ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        // driver.switchTo().window(tabs2.get(1));
        //System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + displayedMessageOnAddAccountMaintenancePage.getText();
        Log.info("Script Redirects To Add Account Maintenance Page Is===>" + driver.getCurrentUrl());

        driver.close();
        // driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    //Verify appropriate details should reflect by clicking on  transactions tab on policy information page

    public void clickOnTransactionTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        exclusionTab.click();
        Log.info("Script Has Clicked On Exclusion Tab On Policy Information Page");
        common.pause(3);

    }

    public String verifyDetailsOfExclusionTabOnPolicyInformationPage() {
        String data = detailsOfExclusionTab.getText();
        Log.info("Data Display On Clicking Exclusion Tab is==>" + data);
        return data;

    }

    //Verify appropriate details should reflect by clicking on history tab on policy information page

    public void clickOnHistoryTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
