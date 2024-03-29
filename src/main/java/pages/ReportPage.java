package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Common;

import java.time.Duration;
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
        common.pause(3);
    }

    public int fetchSections() {
        List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@class='ibox']/div/div");
        return totalColumn.size();
    }

    public void traversingThroughPages() {

        //Quote
        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        //Client
        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        //Policy

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();


//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[4]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[4]")).click();
//        } else {
//            common.pause(3);
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[4]")).click();
//        }
//       common.pause(3);
//        System.out.println(driver.getCurrentUrl());
//        common.pause(1);
//        reportIcon.click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[5]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[5]")).click();
//        } else {
//            common.pause(3);
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[5]")).click();
//        }
//       common.pause(3);
//        System.out.println(driver.getCurrentUrl());
//        common.pause(1);
//        reportIcon.click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")).isEnabled()) {
            WebElement element = driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]"));
            common.jsClick(element);
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        //Claim

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();


//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();


        //Trust Summary
        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        //From here make comment
        reportIcon.click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[5]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[5]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[5]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        //Bordereaux

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.waitUntilElementToBeClickable(reportIcon);
        reportIcon.click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).click();
        } else {
            common.pause(3);
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).click();
        }
        common.pause(3);
        System.out.println(driver.getCurrentUrl());
        common.pause(1);
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
        common.pause(3);
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
        common.pause(2);
        optionFromSortByDD.click();

        sortByDirectionDropDown.click();
        common.pause(2);
        optionFromSortByDirectionDD.click();
    }

    //Filter policy report information upon option of product drop down

    public void clickOnPolicySummaryIcon() {
        policySummaryIcon.click();
        common.pause(3);
    }


    public void selectOptionFromProductDropDownOnProductSummaryPage() {
        productDropDownOnPolicySummary.click();
        common.pause(1);
        optionFromProductDDOnPolicySummary.click();
    }

    public void clickSearchIconOnPolicySummary() {
        searchButtonOnProductSummary.click();
        common.pause(3);
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
        common.pause(3);
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
        common.pause(3);
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
        common.pause(3);
    }

    public void enterFromAndToDate() {

        fromDateOnPolicyHistoryReport.clear();
        fromDateOnPolicyHistoryReport.sendKeys("12.02.2023");
        common.pause(1);
        toDateOnPolicyHistoryReport.clear();
        common.pause(1);
        toDateOnPolicyHistoryReport.sendKeys("12.08.2024");

    }

    public void clickSearchIconOnPolicyHistory() {
        searchButtonOnPolicyHistoryReport.click();
        common.pause(3);
    }

    public String verifyPolicyHistoryReportData() {
        List<WebElement> policyHistoryDetails = common.waitUntilPresenceOfAllElement("//div[@class='ibox-grid']/div/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement cLE : policyHistoryDetails) {
            details.append(cLE.getText());
        }
        return details.toString();
    }

    //Filter policy cancellation report information upon option of insurer drop down

    public void clickOnPolicyCancellationIcon() {
        common.waitUntilVisibilityOfElement(policyCancellationIcon);
        common.jsClick(policyCancellationIcon);
        common.pause(2);
    }

    public void selectOptionFromInsurerDropDown() {
        insurerDropDown.click();
        common.pause(1);
        optionFromInsurerDropDown.click();

    }

    public void clickSearchIconOnPolicyCancellation() {
        searchButtonOnPolicyCancellation.click();
        common.pause(3);
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
        common.pause(3);
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
        common.pause(3);
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

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        common.pause(1);
        trustSummarySectionIcon.click();
        common.pause(3);
    }

    public void clickOnAdjustmentIconOnSectionPage() {
        adjustmentButton.click();
        common.pause(3);
    }

    public void verifyAddPremiumAndClaimAdjustmentWindow() {
        cancelButtonONAddClaimAndPremiumWindow.click();
    }

    //Payment window opens by clicking on payments button on section 26 and 27 report page

    public void clickOnPaymentsSectionPage() {
        paymentsButton.click();
        common.pause(3);
    }

    public void verifyPaymentsWindow() {
        cancelButtonONPaymentsWindow.click();
    }

    //Opening and Closing bank balance window opens by clicking on bank button on section 26 and 27 report page

    public void clickOnBankIconOnSectionPage() {
        bankButton.click();
        common.pause(3);
    }

    public void verifyBankBalanceWindow() {
        cancelButtonONBankBalanceWindow.click();
    }

}




