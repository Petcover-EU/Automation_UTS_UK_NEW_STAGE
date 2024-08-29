package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Common;

import java.util.List;

public class ReportPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public ReportPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(9)")
    private WebElement reportIcon;

    //Quote report Page
    @FindBy(xpath = "//div[@class='ibox']/div[1]/div[1]/div/div[2]/a")
    private WebElement quoteReportIcon;
    @FindBy(xpath = "//div[@id='search']/div[1]/div[1]/div/span/span")
    private WebElement productDropDown;
    @FindBy(xpath = "//ul[@id='ProductId_listbox']/li[2]")
    private WebElement optionFromProductDD;
    @FindBy(xpath = "//div[@id='search']/div[1]/div[4]/div/span/span")
    private WebElement quoteFromDropDown;
    @FindBy(xpath = "//ul[@id='QuoteSaveFrom_listbox']/li[2]")
    private WebElement optionFromQuoteFromDD;
    @FindBy(xpath = "//div[@id='search']/div[1]/div[5]/div/div/div/button")
    private WebElement quoteStatusDropDown;
    @FindBy(xpath = "//div[@class='ms-parent']/div/ul/li[2]/label/input")
    private WebElement optionFromQuoteStatusDD;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@id='search']/div[2]/div[1]/div/span/span")
    private WebElement sortByDropDown;
    @FindBy(xpath = "//ul[@id='SortName_listbox']/li[2]")
    private WebElement optionFromSortByDD;
    @FindBy(xpath = "//div[@id='search']/div[2]/div[2]/div/span/span")
    private WebElement sortByDirectionDropDown;
    @FindBy(xpath = "//ul[@id='SortDirection2_listbox']/li[2]")
    private WebElement optionFromSortByDirectionDD;

    //Policy Summary report page

    @FindBy(xpath = "//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")
    private WebElement policySummaryIcon;
    @FindBy(xpath = "//div[@id='search']/div/div[5]/div/span/span")
    private WebElement productDropDownOnPolicySummary;
    @FindBy(xpath = "//ul[@id='ProductId_listbox']/li[2]")
    private WebElement optionFromProductDDOnPolicySummary;
    @FindBy(xpath = "//div[@id='search']/div/div[6]/div/div/div/button")
    private WebElement statusDropDownOnPolicySummary;
    @FindBy(xpath = "//div[@id='search']/div/div[6]/div/div/div/div/ul/li[2]/label")
    private WebElement optionFromStatusDDOnPolicySummary;
    @FindBy(xpath = "//div[@id='search']/div[2]/div[6]/div/span/span")
    private WebElement sortByDropDownOnPolicySummary;
    @FindBy(xpath = "//ul[@id='SortName_listbox']/li[2]")
    private WebElement optionFromSortByDDOnPolicySummary;
    @FindBy(xpath = "//div[@id='search']/div[2]/div[7]/div/span/span")
    private WebElement sortDirectionDropDownOnPolicySummary;
    @FindBy(xpath = "//ul[@id='SortDirection_listbox']/li[2]")
    private WebElement optionFromSortDirectionDDOnPolicySummary;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnProductSummary;

    //Outstanding renewal report page

    @FindBy(xpath = "//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")
    private WebElement outstandingRenewalReportIcon;
    @FindBy(xpath = "//div[@id='search']/div/div[1]/div/span/span/input")
    private WebElement fromDateOnOutstandingRenewalReport;
    @FindBy(xpath = "//div[@id='search']/div/div[2]/div/span/span/input")
    private WebElement toDateOnOutstandingRenewalReport;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnOutstandingRenewalReport;

    //Policy History report page

    @FindBy(xpath = "//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")
    private WebElement policyHistoryIcon;
    @FindBy(xpath = "//div[@id='search']/div/div[1]/div/span/span/input")
    private WebElement fromDateOnPolicyHistoryReport;
    @FindBy(xpath = "//div[@id='search']/div/div[2]/div/span/span/input")
    private WebElement toDateOnPolicyHistoryReport;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnPolicyHistoryReport;

    //Policy cancellation report page

    @FindBy(xpath = "//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")
    private WebElement policyCancellationIcon;
    @FindBy(xpath = "//div[@id='search']/div/div[9]/div/span/span")
    private WebElement insurerDropDown;
    @FindBy(xpath = "//ul[@id='InsurerId_listbox']/li[2]")
    private WebElement optionFromInsurerDropDown;
    @FindBy(xpath = "//div[@id='search']/div[1]/div[10]/div/span/span")
    private WebElement sortByDropDownOnPolicyCancellation;
    @FindBy(xpath = "//ul[@id='SortName_listbox']/li[2]")
    private WebElement optionFromSortByDDOnPolicyCancellation;
    @FindBy(xpath = "//div[@id='search']/div[1]/div[11]/div/span/span")
    private WebElement sortDirectionDropDownOnPolicyCancellation;
    @FindBy(xpath = "//ul[@id='SortDirection_listbox']/li[2]")
    private WebElement optionFromSortDirectionDDOnPolicyCancellation;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnPolicyCancellation;

    //Outstanding claims report page

    @FindBy(xpath = "//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")
    private WebElement outStandingClaimsIcon;
    @FindBy(xpath = "//div[@id='search']/div/div[1]/div/span/span/input")
    private WebElement fromDateOnOutStandingClaimsReport;
    @FindBy(xpath = "//div[@id='search']/div/div[2]/div/span/span/input")
    private WebElement toDateOnOutStandingClaimsReport;
    @FindBy(xpath = "//div[@id='search']/div/div[5]/div/span/span")
    private WebElement sortBYStandingDropDown;
    @FindBy(xpath = "//ul[@id='SortName_listbox']/li[3]")
    private WebElement optionFromSortBYStandingDropDown;
    @FindBy(xpath = "//div[@id='search']/div/div[6]/div/span/span")
    private WebElement sortDirectionStandingDropDown;
    @FindBy(xpath = "//ul[@id='SortDirection_listbox']/li[2]")
    private WebElement optionFromSortDirectionStandingDropDown;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnOutStandingClaimsReport;

    //Trust Summary Section report page

    @FindBy(xpath = "//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[5]")
    private WebElement trustSummarySectionIcon;
    @FindBy(xpath = "//div[@id='search']/div/div[5]/div[3]/div/a")
    private WebElement adjustmentButton;
    @FindBy(xpath = "//div[@class='ibox-content']/div[6]/div/div/div/a")
    private WebElement cancelButtonONAddClaimAndPremiumWindow;
    @FindBy(xpath = "//div[@id='search']/div/div[5]/div[2]/div/a")
    private WebElement paymentsButton;
    @FindBy(xpath = "//div[@class='ibox-content']/div[7]/div/div/div/a")
    private WebElement cancelButtonONPaymentsWindow;
    @FindBy(xpath = "//div[@id='search']/div/div[5]/div[1]/div/a")
    private WebElement bankButton;
    @FindBy(xpath = "//div[@class='ibox-content']/div[5]/div/div/div/a")
    private WebElement cancelButtonONBankBalanceWindow;

    public void clickOnReportIcon() {
        reportIcon.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public int fetchSections() {
        List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@class='ibox']/div/div");
        return totalColumn.size();
    }

    public void getCurrentUrlAndClickOnReportIcon() {
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        System.out.println(driver.getCurrentUrl());
        common.pause(1);
        driver.navigate().back();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void traversingThroughPages() {

        //Quote
        WebElement quoteReport = driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a[1]"));
        common.jsClick(quoteReport);
        getCurrentUrlAndClickOnReportIcon();

        WebElement xoomTalkCallReport = driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a[2]"));
        common.jsClick(xoomTalkCallReport);
        getCurrentUrlAndClickOnReportIcon();

        WebElement xoomTalkCallUTSUKReport = driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a[3]"));
        common.jsClick(xoomTalkCallUTSUKReport);
        getCurrentUrlAndClickOnReportIcon();

        //Client
        WebElement clientDebtors = driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]"));
        common.jsClick(clientDebtors);
        getCurrentUrlAndClickOnReportIcon();

        WebElement policyDebtors = driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]"));
        common.jsClick(policyDebtors);
        getCurrentUrlAndClickOnReportIcon();

        //Policy

        WebElement policySummary = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]"));
        common.jsClick(policySummary);
        getCurrentUrlAndClickOnReportIcon();

        WebElement policyPremium = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]"));
        common.jsClick(policyPremium);
        getCurrentUrlAndClickOnReportIcon();

        WebElement outstandingRenewalReport = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]"));
        common.jsClick(outstandingRenewalReport);
        getCurrentUrlAndClickOnReportIcon();

//        WebElement UnEarnedPremiumReport = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[4]"));
//        common.jsClick(UnEarnedPremiumReport);
//        getCurrentUrlAndClickOnReportIcon();

//        WebElement earnedPremiumReport = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[5]"));
//        common.jsClick(earnedPremiumReport);
//        getCurrentUrlAndClickOnReportIcon();

        WebElement paymentHistoryReport = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]"));
        common.jsClick(paymentHistoryReport);
        getCurrentUrlAndClickOnReportIcon();

        WebElement policyCancellationReport = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]"));
        common.jsClick(policyCancellationReport);
        getCurrentUrlAndClickOnReportIcon();

        WebElement activePolicyListing = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[8]"));
        common.jsClick(activePolicyListing);
        getCurrentUrlAndClickOnReportIcon();

        WebElement policiesRequiringELTO = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[9]"));
        common.jsClick(policiesRequiringELTO);
        getCurrentUrlAndClickOnReportIcon();

//        Claim

        WebElement outstandingClaims = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]"));
        common.jsClick(outstandingClaims);
        getCurrentUrlAndClickOnReportIcon();

//        WebElement paidClaims = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]"));
//        common.jsClick(paidClaims);
//        getCurrentUrlAndClickOnReportIcon();

//        Trust Summary

        WebElement commissionProcessed = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]"));
        common.jsClick(commissionProcessed);
        getCurrentUrlAndClickOnReportIcon();

        WebElement insurerProcessed = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]"));
        common.jsClick(insurerProcessed);
        getCurrentUrlAndClickOnReportIcon();

        WebElement adminFeeProcessed = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]"));
        common.jsClick(adminFeeProcessed);
        getCurrentUrlAndClickOnReportIcon();

        WebElement trustSummaryBatch = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]"));
        common.jsClick(trustSummaryBatch);
        getCurrentUrlAndClickOnReportIcon();

        WebElement trustSummarySection26_27 = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[5]"));
        common.jsClick(trustSummarySection26_27);
        getCurrentUrlAndClickOnReportIcon();

//        Bordereaux

        WebElement premiumBordereauxv3 = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]"));
        common.jsClick(premiumBordereauxv3);
        getCurrentUrlAndClickOnReportIcon();

        WebElement premiumBordereauxv4 = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]"));
        common.jsClick(premiumBordereauxv4);
        getCurrentUrlAndClickOnReportIcon();

        WebElement premiumBordereauxv5 = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]"));
        common.jsClick(premiumBordereauxv5);
        getCurrentUrlAndClickOnReportIcon();

        WebElement claimBordereaux = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]"));
        common.jsClick(claimBordereaux);
        getCurrentUrlAndClickOnReportIcon();

        WebElement claimBordereauxv2 = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[5]"));
        common.jsClick(claimBordereauxv2);
        getCurrentUrlAndClickOnReportIcon();

        WebElement claimBordereauxv3 = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[6]"));
        common.jsClick(claimBordereauxv3);
        getCurrentUrlAndClickOnReportIcon();

        WebElement riskBordereaux = driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[7]"));
        common.jsClick(riskBordereaux);
        getCurrentUrlAndClickOnReportIcon();

//        Commission

        WebElement agentProductCommissionReport = driver.findElement(By.xpath("//div[@class='ibox']/div[4]/div[1]/div/div[2]/a[1]"));
        common.jsClick(agentProductCommissionReport);
        getCurrentUrlAndClickOnReportIcon();

//        Datacube Bordereaux

        WebElement riskBordereauxReport = driver.findElement(By.xpath("//div[@class='ibox']/div[4]/div[2]/div/div[2]/a[1]"));
        common.jsClick(riskBordereauxReport);
        getCurrentUrlAndClickOnReportIcon();

        WebElement paidClaimReport = driver.findElement(By.xpath("//div[@class='ibox']/div[4]/div[2]/div/div[2]/a[2]"));
        common.jsClick(paidClaimReport);
        getCurrentUrlAndClickOnReportIcon();

        WebElement claimBordereauxReport = driver.findElement(By.xpath("//div[@class='ibox']/div[4]/div[2]/div/div[2]/a[3]"));
        common.jsClick(claimBordereauxReport);
        getCurrentUrlAndClickOnReportIcon();

        WebElement premiumBordereauxReport = driver.findElement(By.xpath("//div[@class='ibox']/div[4]/div[2]/div/div[2]/a[4]"));
        common.jsClick(premiumBordereauxReport);
        getCurrentUrlAndClickOnReportIcon();

        WebElement claimBordereauxReportBBCommercial = driver.findElement(By.xpath("//div[@class='ibox']/div[4]/div[2]/div/div[2]/a[5]"));
        common.jsClick(claimBordereauxReportBBCommercial);
        getCurrentUrlAndClickOnReportIcon();

        WebElement riskBordereauxReportBBCommercial = driver.findElement(By.xpath("//div[@class='ibox']/div[4]/div[2]/div/div[2]/a[6]"));
        common.jsClick(riskBordereauxReportBBCommercial);
        getCurrentUrlAndClickOnReportIcon();

        WebElement premiumBordereauxReportBBCommercial = driver.findElement(By.xpath("//div[@class='ibox']/div[4]/div[2]/div/div[2]/a[7]"));
        common.jsClick(premiumBordereauxReportBBCommercial);
        getCurrentUrlAndClickOnReportIcon();
    }

    ////Filter quote report information upon option of product drop down

    public void selectOptionFromProductDropDown() {
        productDropDown.click();
        common.pause(1);
        optionFromProductDD.click();
    }

    // Filter quote report information upon options value of quote status and quote from drop downs

    public void clickOnQuoteReportIcon() {
        WebElement quoteIcon = common.waitUntilPresenceOfElement("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a");
        quoteIcon.click();
        common.pause(3);
    }

    public void selectOptionFromDropDown() {
        quoteFromDropDown.click();
        common.pause(1);
        optionFromQuoteFromDD.click();
        quoteStatusDropDown.click();
        common.pause(1);
        optionFromQuoteStatusDD.click();
    }

    public void clickSearchIcon() {
        common.waitUntilVisibilityOfElement(searchButton);
        common.jsClick(searchButton);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public String verifyQuoteReportData() {
        List<WebElement> quoteDetails = common.waitUntilPresenceOfAllElement("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr[1]/td");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : quoteDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }

    //Sorting data on quote report page via quote number

    public void selectOptionFromSortByDropDown() {
        sortByDropDown.click();
        common.pause(1);
        optionFromSortByDD.click();

        sortByDirectionDropDown.click();
        common.pause(1);
        optionFromSortByDirectionDD.click();
    }

    //Filter policy report information upon option of product drop down

    public void clickOnPolicySummaryIcon() {
        policySummaryIcon.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }


    public void selectOptionFromProductDropDownOnProductSummaryPage() {
        productDropDownOnPolicySummary.click();
        common.pause(1);
        optionFromProductDDOnPolicySummary.click();
    }

    public void clickSearchIconOnPolicySummary() {
        searchButtonOnProductSummary.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public String verifyPolicySummaryReportData() {
        List<WebElement> policySummaryDetails = common.waitUntilPresenceOfAllElement("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : policySummaryDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }

    //Filter policy report information upon option of status drop down

    public void selectOptionFromStatusDropDownOnProductSummaryPage() {
        statusDropDownOnPolicySummary.click();
        common.pause(1);
        optionFromStatusDDOnPolicySummary.click();
    }

    public String verifyPolicySummaryReportDataUponStatusDD() {
        List<WebElement> policySummaryDetails = common.waitUntilPresenceOfAllElement("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : policySummaryDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }


    //Sorting data on policy summary report page via policy number and sort direction dropdowns options

    public void selectOptionFromSortsDropDownOnProductSummaryPage() {
        sortByDropDownOnPolicySummary.click();
        common.pause(1);
        optionFromSortByDDOnPolicySummary.click();

        sortDirectionDropDownOnPolicySummary.click();
        common.pause(1);
        optionFromSortDirectionDDOnPolicySummary.click();

    }

    public String verifyPolicySummaryReportDataUponSortBYDD() {
        List<WebElement> policySummaryDetails = common.waitUntilPresenceOfAllElement("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : policySummaryDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }

    //Filter outstanding renewal report information upon from and to date values

    public void clickOnOutstandingRenewalReportIcon() {
        outstandingRenewalReportIcon.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void enterFromAndToDateOnOutstandingRenewalReport() {
        fromDateOnOutstandingRenewalReport.clear();
        fromDateOnOutstandingRenewalReport.sendKeys("12.02.2023");
        common.pause(1);
        toDateOnOutstandingRenewalReport.clear();
        common.pause(1);
        toDateOnOutstandingRenewalReport.sendKeys("12.08.2024");

    }

    public void clickSearchIconOnOutstandingRenewalReport() {
        searchButtonOnOutstandingRenewalReport.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public String verifyOutstandingRenewalReportData() {
        List<WebElement> outStandingRenewalReportDetails = common.waitUntilPresenceOfAllElement("//div[@id='OutStandingRenewalReportGrid']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : outStandingRenewalReportDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }

    //Filter Policy Payment history report information upon from and to date

    public void clickOnPolicyHistoryIcon() {
        policyHistoryIcon.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void enterFromAndToDate() {
        fromDateOnPolicyHistoryReport.clear();
        fromDateOnPolicyHistoryReport.sendKeys(common.getPastDate(30, "dd.MM.yyyy"));
        common.pause(1);
        toDateOnPolicyHistoryReport.clear();
        common.pause(1);
        toDateOnPolicyHistoryReport.sendKeys(common.getCurrentDate("dd.MM.yyyy"));

    }

    public void clickSearchIconOnPolicyHistory() {
        searchButtonOnPolicyHistoryReport.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public String verifyPolicyHistoryReportData() {
        if (common.isElementDisplayed("//div[@class='ibox-grid']/div/table/tbody/tr")) {
            List<WebElement> policyHistoryDetails = common.waitUntilPresenceOfAllElement("//div[@class='ibox-grid']/div/table/tbody/tr");
            StringBuilder details = new StringBuilder();
            for (WebElement cLE : policyHistoryDetails) {
                details.append(cLE.getText()).append("/n");
            }
            return details.toString();
        } else return null;
    }

    //Filter policy cancellation report information upon option of insurer drop down

    public void clickOnPolicyCancellationIcon() {
        common.waitUntilVisibilityOfElement(policyCancellationIcon);
        common.jsClick(policyCancellationIcon);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void selectOptionFromInsurerDropDown() {
        insurerDropDown.click();
        common.pause(1);
        optionFromInsurerDropDown.click();

    }

    public void clickSearchIconOnPolicyCancellation() {
        searchButtonOnPolicyCancellation.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public String verifyPolicyCancellationReportData() {
        List<WebElement> policyCancellationDetails = common.waitUntilPresenceOfAllElement("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : policyCancellationDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }

    //Sorting data on policy cancellation report via sort by and sort direction dropdowns options

    public void selectOptionFromDropDownOnPolicyCancellation() {
        sortByDropDownOnPolicyCancellation.click();
        common.pause(1);
        optionFromSortByDDOnPolicyCancellation.click();
        sortDirectionDropDownOnPolicyCancellation.click();
        common.pause(1);
        optionFromSortDirectionDDOnPolicyCancellation.click();
    }

    //Filter Outstanding Claims report information upon notified from and to date

    public void clickOnOutstandingClaimIcon() {
        outStandingClaimsIcon.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void enterFromAndToDateOnOutstandingClaim() {
        fromDateOnOutStandingClaimsReport.clear();
        fromDateOnOutStandingClaimsReport.sendKeys("12.01.2023");
        common.pause(1);
        toDateOnOutStandingClaimsReport.clear();
        common.pause(1);
        toDateOnOutStandingClaimsReport.sendKeys("12.08.2024");
    }

    public void clickSearchIconOnOutstandingClaim() {
        searchButtonOnOutStandingClaimsReport.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public String verifyOutstandingClaimData() {
        List<WebElement> outstandingClaimDetails = common.waitUntilPresenceOfAllElement("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : outstandingClaimDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }

    // Sorting data on Filter Outstanding Claims report via sort by and sort direction dropdowns options

    public void selectOptionsFromSortByAndDirectionDDOnOutstandingClaim() {
        sortBYStandingDropDown.click();
        common.pause(1);
        optionFromSortBYStandingDropDown.click();
        sortDirectionStandingDropDown.click();
        common.pause(1);
        optionFromSortDirectionStandingDropDown.click();
    }

    public String verifyOutstandingClaimDataUponSorting() {
        List<WebElement> outstandingClaimDetails = common.waitUntilPresenceOfAllElement("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : outstandingClaimDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }

    //Add premium and claim adjustments window opens by clicking on adjustment button on section 26 and 27 report page

    public void clickOnTrustSummarySection() {
        common.jsClick(trustSummarySectionIcon);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void clickOnAdjustmentIconOnSectionPage() {
        adjustmentButton.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void verifyAddPremiumAndClaimAdjustmentWindow() {
        cancelButtonONAddClaimAndPremiumWindow.click();
    }

    //Payment window opens by clicking on payments button on section 26 and 27 report page

    public void clickOnPaymentsSectionPage() {
        paymentsButton.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void verifyPaymentsWindow() {
        cancelButtonONPaymentsWindow.click();
    }

    //Opening and Closing bank balance window opens by clicking on bank button on section 26 and 27 report page

    public void clickOnBankIconOnSectionPage() {
        bankButton.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
    }

    public void verifyBankBalanceWindow() {
        cancelButtonONBankBalanceWindow.click();
    }

}




