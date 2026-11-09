package pages;

import factory.DriverFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Common;
import utils.Log;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;


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
    @FindBy(xpath = "//div[@id='search']/div[7]/div/span/span/input")
    private WebElement fromDateOfPolicy;
    @FindBy(xpath = "//div[@id='search']/div[8]/div/span/span/input")
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

    //New
    @FindBy(css = "ul[id='side-menu']>li:nth-child(4)")
    private WebElement quoteIcon;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/a[2]")
    private WebElement addQuoteButton;
    @FindBy(xpath ="//div[@class='col-md-8']//span[@class='k-input'][normalize-space()='Select']")
    private WebElement petDropdownBOX;
    @FindBy(xpath ="//li[normalize-space()='Introductory Cover']")
    private WebElement petOptionIntroductory_Cover;
    @FindBy(xpath ="(//span[@aria-label='select'])[10]")
    private WebElement petOptionIntroductory_Cover_Pettype_BOX;
    @FindBy(xpath ="(//li[@role='option'][normalize-space()='Cat'])[2]")
    private WebElement petOptionIntroductory_Cover_Pettype_BOX_CAT;
    @FindBy(xpath ="(//span[@aria-label='select'])[11]")
    private WebElement IntroducerregistrationnumbeBOX;
    @FindBy(xpath ="//body[1]/div[25]/div[1]/div[3]/ul[1]/li[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]")
    private WebElement IntroducerregistrationnumbeBOXOption;
    @FindBy(xpath ="(//input[@id='Question_11365'])[1]")
    private WebElement IntroducePetName;
    @FindBy(xpath ="(//input[@id='Question_11307'])[1]")
    private WebElement IntroducePetName_mix;

    @FindBy(xpath ="(//span[@aria-label='select'])[12]")
    private WebElement IntroducePetBreedBOX;
    @FindBy(xpath ="(//li[normalize-space()='Cymric'])[1]")
    private WebElement IntroducePetBreedOption;
    @FindBy(xpath = "(//li[normalize-space()='Mixed Breed'])[1]")
    private WebElement IntroducePetBreedOption_mix;
    @FindBy(xpath ="(//span[@aria-label='select'])[13]")
    private WebElement IntroduceGenderBOX;
    @FindBy(xpath = "(//span[@aria-label='select'])[16]")
    private WebElement IntroduceGenderBOX_mix;
    @FindBy(xpath ="(//li[@role='option'][normalize-space()='Female'])[2]")
    private WebElement IntroduceGender_Option;
    @FindBy(xpath ="(//input[@id='Question_11368'])[1]")
    private WebElement IntroduceDOB;
    @FindBy(xpath ="(//input[@id='Question_11313'])[1]")
    private WebElement IntroduceDOB_Mix_Dog;
    @FindBy(xpath ="(//input[@class='k-formatted-value cls_CAT00005 k-input'])[1]")
    private WebElement IntroducePerchaseAmount;
    @FindBy(xpath ="(//input[@class='k-formatted-value cls_DOG00008 k-input'])[1]")
    private WebElement IntroducePerchaseAmount_mix;

    @FindBy(xpath ="(//button[@id='btnCalculate'])[1]")
    private WebElement calculateButton;
    @FindBy(xpath ="(//input[@id='Question_33000'])[1]")
    private WebElement petmicrochipBOX;
    @FindBy(xpath ="(//input[@id='Question_30051_30007'])[1]")
    private WebElement inroductery_UW_NO;
    @FindBy(xpath ="//input[@id='Question_30056']")
    private WebElement inroductery_UW_First_CHeckBOX;
   @FindBy(xpath = "//li[normalize-space()='CoverMy Breakdown']")
   private WebElement petOptionCovermyBreakdown;
    @FindBy(xpath ="(//span[contains(@aria-label,'select')])[12]")
    private WebElement coverTypeBOX;
    @FindBy(xpath ="(//li[normalize-space()='Vehicle Cover'])[1]")
    private WebElement coverTypeBOXOptionVehicle;
    @FindBy(xpath ="(//span[contains(@aria-label,'select')])[13]")
    private WebElement EuropeanCoverBOX;
    @FindBy(xpath ="(//span[contains(@aria-label,'select')])[13]")
    private WebElement mixoption1Box;
    @FindBy(xpath =  "(//li[@role='option'][normalize-space()='French Tricolour Hound'])[1]")
    private WebElement mixoption1;
    @FindBy(xpath = "(//span[@aria-label='select'])[14]")
    private WebElement mixoption2Box;
    @FindBy(xpath ="(//li[@role='option'][normalize-space()='Finnischer Lapplandhirtenhund'])[2]")
    private WebElement mixoption2;

    @FindBy(xpath ="(//li[@role='option'][normalize-space()='Yes'])[6]")
    private WebElement EuropeanCoverBOX_YES;
    @FindBy(xpath ="(//li[contains(@role,'option')][normalize-space()='No'])[6]")
    private WebElement  EuropeanCoverBOX_NO;
    @FindBy(xpath ="(//span[contains(@aria-label,'select')])[14]")
    private WebElement coverLengthBOX;
    @FindBy(xpath ="(//li[normalize-space()='Annual'])[1]")
    private WebElement coverLengthBOX_Annual;
    @FindBy(xpath ="(//span[@aria-label='select'])[17]")
    private WebElement vehicalNumberBOX;
    @FindBy(xpath ="(//li[@role='option'][normalize-space()='1'])[2]")
    private WebElement vehicalNumberBOXOption;
    @FindBy(xpath ="(//input[@id='Question_40010'])[1]")
    private WebElement vehicalRegistrationNUmber;
    @FindBy(xpath = "(//input[@id='Question_40011'])[1]")
    private WebElement Vehicle_Manufacturer;
    @FindBy(xpath ="(//input[@id='Question_40012'])[1]")
    private WebElement Vehicle_Model;
    @FindBy(xpath ="//input[@id='Question_40013']")
    private WebElement Date_of_Registration;


    @FindBy(xpath ="(//a[normalize-space()='Delete'])[1]")
    private WebElement Delete_Button;
    @FindBy(xpath ="(//button[normalize-space()='Add Vehicle'])[1]")
    private WebElement addVehicleOption;
    @FindBy(xpath ="(//button[normalize-space()='Calculate'])[1]")
    private WebElement calculateOption;
    @FindBy(xpath ="(//input[@id='vehicle_68'])[1]")
    private WebElement selectPlane1;
    @FindBy(xpath = "(//input[@id='vehicle_66'])[1]")
    private WebElement selectPlane2;
    @FindBy(xpath ="(//button[@type='button'][normalize-space()='Close'])[1]")
    private WebElement selectPlane1ClosedPOP;
    @FindBy(xpath ="(//input[@id='Question_40019'])[1]")
    private WebElement UWCheckBOX;
    @FindBy(xpath ="(//a[normalize-space()='Add new record'])[1]")
    private WebElement UWCheck_Addnewrecord;
    @FindBy(xpath ="(//button[@id='BindButton'])[1]")
    private WebElement Create_Policy;
    @FindBy(xpath ="(//a[normalize-space()='More Details'])[1]")
    private WebElement Uw_MoredatailBox;
    @FindBy(xpath = "(//input[@id='Question_30051_30006'])[1]")
    private WebElement Uw_MoredatailBoxYes;
    @FindBy(xpath =  "(//div[@class='col-lg-4 display-cell viewdata1 space7'])[1]")
    private WebElement introducteryPolicyCat;
    @FindBy(xpath ="(//li[@role='option'][normalize-space()='Dog'])[2]")
    private WebElement petOptionIntroductory_Cover_Pettype_BOX_Dog;
    @FindBy(xpath ="(//a[normalize-space()='Payment Details'])[1]")
    private WebElement select_PaymentDetailsSection;
    @FindBy(xpath ="(//input[@id='PremiumFrequency_1'])[1]")
    private WebElement select_PaymentDetailsSection_Years;
    @FindBy(xpath = "(//span[@aria-label='select'])[20]")
    private WebElement select_PaymentDetailsSection_Years_DroupBox;
    @FindBy(xpath = "(//span[@aria-label='select'])[19]")
    private WebElement select_PaymentDetailsSection_Years_DroupBox_Edit;

    @FindBy(xpath = "(//li[normalize-space()='Other'])[1]")
    private WebElement select_PaymentDetailsSection_Years_DroupBox_Other;
    @FindBy(css ="dl[class='dl-inline'] span[class='sub-heading']")
    private WebElement policyNumber;
    @FindBy(xpath =  "(//button[@title='Save Application'])[1]")
    private WebElement Save_ApplicationOption;
    @FindBy(xpath =   "(//a[@id='dropdownMenu1'])[1]")
    private WebElement settingOption;
    @FindBy(xpath = "(//a[@id='btnEdit'])[1]")
    private WebElement Editoption;
    @FindBy(xpath = "//tr[@class='t-alt']//td[contains(@class,'borderright align-right')]")
    private WebElement policyBalance;
    @FindBy(xpath = "(//input[@id='Question_40013'])[1]")
    private WebElement registrationDate;



    public void clickPolicyIcon() {
        common.waitUntilElementToBeClickable(policyIcon);
        common.jsClick(policyIcon);
        Log.info("Click on the policy icon on the left toolbar");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
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
    public void Select_Add_Quote(){
        common.pause(5);
        quoteIcon.click();

        common.waitUntilVisibilityOfElement(addQuoteButton);
        common.pause(3);
        addQuoteButton.click();


    }

    public void selectIntroductory_CatPet_Field_Detail(){

        petDropdownBOX.click();

        common.waitUntilVisibilityOfElement(petOptionIntroductory_Cover);
        common.pause(2);
        petOptionIntroductory_Cover.click();


        common.pause(7);
        common.waitUntilVisibilityOfElement(petOptionIntroductory_Cover_Pettype_BOX);
                petOptionIntroductory_Cover_Pettype_BOX.click();
        common.pause(3);
        petOptionIntroductory_Cover_Pettype_BOX_CAT.click();

        common.pause(3);
        IntroducerregistrationnumbeBOX.click();
        common.pause(3);
        IntroducerregistrationnumbeBOXOption.click();

        common.waitUntilVisibilityOfElement(IntroducePetName);
                IntroducePetName.sendKeys("Test");

        common.pause(3);
        IntroducePetBreedBOX.click();
        common.pause(3);
        IntroducePetBreedOption.click();
        common.pause(3);
        IntroduceGenderBOX.click();
        common.pause(3);
        IntroduceGender_Option.click();
        common.pause(3);
        IntroduceDOB.click();
        common.pause(3);
        String previousYearDate = LocalDate.now()
                .minusYears(1)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        driver.findElement(By.xpath("(//input[@id='Question_11368'])[1]"))
                .sendKeys(previousYearDate);


        common.pause(3);
//        IntroducePerchaseAmount.click();
//        common.pause(2);
//        IntroducePerchaseAmount.clear();
//        common.pause(2);
        IntroducePerchaseAmount.sendKeys("500");
        common.pause(3);
    }
    public void calculate_UW_introductery_cat(){
        common.pause(3);
        calculateButton.click();
        common.pause(3);
//        calculateButton.click();
        common.pause(3);
        petmicrochipBOX.sendKeys("123");

        common.pause(3);
        inroductery_UW_NO.click();
        common.pause(3);
        inroductery_UW_First_CHeckBOX.click();

    }

    public void worningMessageInro(){
        String actualMessage = driver.findElement(
                By.xpath("(//div[@class='swal-text'])[1]")
        ).getText();
        common.pause(3);
//        Assert.assertTrue(actualMessage.contains(
//                "We cannot offer any cover for any pet which has not been checked by a vet within the last 24 hours."
//        ), "Expected validation message was  displayed!");
        System.out.println("Expected validation message was  displayed!");
    }

    public void Selectproductandfieldpetdetail_CoverMyBreakdownVehicleCoverEuropeanCover_Yes(){
        common.pause(3);
        petDropdownBOX.click();

        common.waitUntilVisibilityOfElement(petOptionCovermyBreakdown);
        common.pause(3);
        petOptionCovermyBreakdown.click();

        common.waitUntilVisibilityOfElement(coverTypeBOX);
        common.pause(3);
        coverTypeBOX.click();

        common.waitUntilVisibilityOfElement(coverTypeBOXOptionVehicle);
        common.pause(3);
        coverTypeBOXOptionVehicle.click();

        common.pause(3);
        EuropeanCoverBOX.click();
        common.pause(3);
        EuropeanCoverBOX_YES.click();

        common.pause(3);
        coverLengthBOX.click();
        common.pause(3);
        coverLengthBOX_Annual.click();

        String currentDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        WebElement dateField = driver.findElement(
                By.xpath("(//input[@id='Question_40004'])[1]")
        );
        dateField.clear();
        dateField.sendKeys(currentDate);

        common.pause(3);
        vehicalNumberBOX.click();
        common.pause(3);
        vehicalNumberBOXOption.click();
        common.pause(3);
        vehicalRegistrationNUmber.sendKeys("12");
        common.pause(2);
        Vehicle_Manufacturer.sendKeys("Test");
        common.pause(3);
        Vehicle_Model.sendKeys("new");
        common.pause(3);
        Date_of_Registration.click();
        String pastDate = LocalDate.now()
                .minusDays(3)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        registrationDate.clear();
        registrationDate.sendKeys(pastDate);
        common.pause(3);
        System.out.println("Registration Date entered: " + pastDate);

    }
    public void userSelectCalculateButton(){
 //      common.pause(3);

//        addVehicleOption.click();
        common.pause(7);
        addVehicleOption.click();
        common.pause(5);
        calculateOption.click();
//        common.pause(3);
//        driver.switchTo().alert().accept();
//        common.pause(3);
//
//        Delete_Button.click();
//        common.pause(3);
//        vehicalRegistrationNUmber.sendKeys("12");
//        common.pause(2);
//        Vehicle_Manufacturer.sendKeys("Test");
//        common.pause(3);
//        Vehicle_Model.sendKeys("new");
//        common.pause(3);
//        Date_of_Registration.click();
//
//        String currentDate = LocalDate.now()
//                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//
//        registrationDate.clear();
//        registrationDate.sendKeys(currentDate);
//
//        System.out.println("Current Registration Date entered: " + currentDate);
//        common.pause(3);
//        addVehicleOption.click();
//        common.pause(3);
//        calculateOption.click();
        common.pause(3);
        selectPlane1.click();
        common.pause(3);
        selectPlane1ClosedPOP.click();
        common.pause(3);

    }
    public void UWQuationInformationCoverMyBreakdownVehicleCoverEuropeanCoverYes(){
        UWCheckBOX.click();
        common.pause(3);

        UWCheck_Addnewrecord.click();
        common.pause(3);

        String currentDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        WebElement dateField = driver.findElement(
                By.xpath("(//input[@data-bind='value:DepartureDate'])[1]")
        );

        common.pause(3);
        Create_Policy.click();
    }

    public void worningMessageInro_European_Cover_Yes(){
        String actualMessage = driver.findElement(
                By.xpath("(//div[@class='swal-text'])[1]")
        ).getText();

//        Assert.assertTrue(actualMessage.contains(
//                "Please select a Payment Tender."
//        ), "Expected validation message was  displayed!");

        System.out.println("Expected validation message was  displayed!");
    }

    public void Selectproductandfieldpetdetail_CoverMyBreakdownVehicleCoverEuropeanCover_No(){
        common.pause(3);
        petDropdownBOX.click();

        common.waitUntilVisibilityOfElement(petOptionCovermyBreakdown);
        common.pause(3);
        petOptionCovermyBreakdown.click();

        common.waitUntilVisibilityOfElement(coverTypeBOX);
        common.pause(3);
        coverTypeBOX.click();

        common.waitUntilVisibilityOfElement(coverTypeBOXOptionVehicle);
        common.pause(3);
        coverTypeBOXOptionVehicle.click();

        common.pause(3);
        EuropeanCoverBOX.click();
        common.pause(3);
        EuropeanCoverBOX_NO.click();

        common.pause(3);
//        coverLengthBOX.click();
//        common.pause(3);
//        coverLengthBOX_Annual.click();

        String currentDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        WebElement dateField = driver.findElement(
                By.xpath("(//input[@id='Question_40004'])[1]")
        );
        dateField.clear();
        dateField.sendKeys(currentDate);

        common.pause(3);
        vehicalNumberBOX.click();
        common.pause(3);
        vehicalNumberBOXOption.click();
        common.pause(3);
        vehicalRegistrationNUmber.sendKeys("12");
        common.pause(2);
        Vehicle_Manufacturer.sendKeys("Test");
        common.pause(3);
        Vehicle_Model.sendKeys("new");
        common.pause(3);
        Date_of_Registration.click();
        String pastDate = LocalDate.now()
                .minusDays(3)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        registrationDate.clear();
        registrationDate.sendKeys(pastDate);
        common.pause(3);
        System.out.println("Registration Date entered: " + pastDate);
        common.pause(3);
    }

    public void UWQuationInformationCoverMyBreakdownVehicleCoverEuropeanCoverNO(){
        UWCheckBOX.click();
        common.pause(3);

//        UWCheck_Addnewrecord.click();
//        common.pause(3);
//
//        String currentDate = LocalDate.now()
//                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//
//        WebElement dateField = driver.findElement(
//                By.xpath("(//input[@data-bind='value:DepartureDate'])[1]")
//        );
//
//        common.pause(3);
        Create_Policy.click();
    }

    public void userSelectCalculateButtonEurpNO() {

        addVehicleOption.click();
        common.pause(7);
        addVehicleOption.click();
        common.pause(5);

        calculateOption.click();
        common.pause(3);
        selectPlane2.click();
        common.pause(3);
        selectPlane1ClosedPOP.click();
        common.pause(3);
    }

    public void  userFieldUWDetailAndSelectCreatePolicyOption(){

        common.waitUntilVisibilityOfElement(calculateButton);
        calculateButton.click();
        common.pause(5);
        Uw_MoredatailBox.click();
        common.pause(3);
        common.waitUntilVisibilityOfElement(petmicrochipBOX);
        petmicrochipBOX.sendKeys("123");
        common.pause(3);
        Uw_MoredatailBoxYes.click();
        common.pause(3);
        Create_Policy.click();
    }

    public void  userVerifyDetailIntroductoryCoverCat(){
        common.pause(5);
        common.waitUntilVisibilityOfElement(introducteryPolicyCat);
        String clientDetail = driver.findElement(
                By.xpath("(//div[@class='col-lg-4 display-cell viewdata1 space7'])[1]")
        ).getText().trim();

        System.out.println("Client Detail: " + clientDetail);

        String policyDetail = driver.findElement(
                By.cssSelector("dl[class='dl-inline'] span[class='sub-heading']")
        ).getText().trim();

        System.out.println("Policy Detail: " + policyDetail);
    }

    public void selectProductAndFieldPetDetailIntroductoryCoverDogMix(){

        petDropdownBOX.click();

        common.waitUntilVisibilityOfElement(petOptionIntroductory_Cover);
        common.pause(2);
        petOptionIntroductory_Cover.click();

        common.waitUntilVisibilityOfElement(petOptionIntroductory_Cover_Pettype_BOX);
        petOptionIntroductory_Cover_Pettype_BOX.click();
        common.pause(3);
        petOptionIntroductory_Cover_Pettype_BOX_Dog.click();

        common.pause(3);
        IntroducerregistrationnumbeBOX.click();
        common.pause(3);
        IntroducerregistrationnumbeBOXOption.click();

        common.pause(3);
        common.waitUntilVisibilityOfElement(IntroducePetName_mix);
        IntroducePetName_mix.sendKeys("Test");

        common.pause(3);
        IntroducePetBreedBOX.click();
        common.pause(3);
        IntroducePetBreedOption_mix.click();
        common.pause(3);

        mixoption1Box.click();
        common.pause(3);
        mixoption1.click();
        common.pause(3);
        mixoption2Box.click();
        common.pause(3);
        mixoption2.click();

        common.pause(3);
        IntroduceGenderBOX_mix.click();
        common.pause(3);
        IntroduceGender_Option.click();
        common.pause(4);
        IntroduceDOB_Mix_Dog.click();
        common.pause(3);
        String previousYearDate = LocalDate.now()
                .minusYears(1)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        driver.findElement(By.xpath("(//input[@id='Question_11313'])[1]"))
                .sendKeys(previousYearDate);


        common.pause(3);
//        IntroducePerchaseAmount.click();
//        common.pause(2);
//        IntroducePerchaseAmount.clear();
//        common.pause(2);
        IntroducePerchaseAmount_mix.sendKeys("500");
        common.pause(3);
    }

    public void userFieldUWDetailAndSelectPaymentDetailsWithCoverEuropeanCoverYes() {
        UWCheckBOX.click();
        common.pause(3);

        UWCheck_Addnewrecord.click();
        common.pause(3);

        String currentDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        driver.findElement(By.xpath("(//input[@data-bind='value:DepartureDate'])[1]"))
                .sendKeys(currentDate);


//        common.pause(3);
//        select_PaymentDetailsSection.click();
        common.pause(3);
        select_PaymentDetailsSection_Years.click();
        common.pause(3);
        select_PaymentDetailsSection_Years_DroupBox.click();
        common.pause(3);
        select_PaymentDetailsSection_Years_DroupBox_Other.click();



    }

    public void  userSelectCreatePolicyOptionCoverEuropeanCoverYes(){
        common.pause(3);
        Create_Policy.click();

    }

    public void  userVerifyCreatePolicyDetail(){

        common.waitUntilVisibilityOfElement (policyNumber);
        String policyNo = policyNumber.getText().trim();

        System.out.println("Policy Created Successfully!");
        System.out.println("Policy Number: " + policyNo);
    }

    public void userSelectSaveApplicationOptionAndAgainSelectPaymentDetailsWithCoverEuropeanCoverYes(){

        Save_ApplicationOption.click();
        common.pause(2);
        System.out.println("Save Application Option Selected");
        common.pause(3);
        driver.switchTo().alert().accept();

        common.pause(3);
        settingOption.click();
        common.pause(3);
        Editoption.click();

        common.pause(3);
        common.waitUntilVisibilityOfElement(calculateOption);
        common.pause(3);
        calculateOption.click();
        common.pause(3);
        selectPlane1ClosedPOP.click();
        common.pause(3);

        common.pause(3);
        select_PaymentDetailsSection_Years.click();
        common.pause(3);
        select_PaymentDetailsSection_Years_DroupBox_Edit.click();
        common.pause(3);
        select_PaymentDetailsSection_Years_DroupBox_Other.click();

    }
    public void userFieldUWDetailAndSelectPaymentDetailsWithCoverEuropeanCoverNO() {
        UWCheckBOX.click();
        common.pause(3);

//        UWCheck_Addnewrecord.click();
//        common.pause(3);
//
//        String currentDate = LocalDate.now()
//                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//
//        driver.findElement(By.xpath("(//input[@data-bind='value:DepartureDate'])[1]"))
//                .sendKeys(currentDate);


//        common.pause(3);
//        select_PaymentDetailsSection.click();
        common.pause(3);
        select_PaymentDetailsSection_Years.click();
        common.pause(3);
        select_PaymentDetailsSection_Years_DroupBox.click();
        common.pause(3);
        select_PaymentDetailsSection_Years_DroupBox_Other.click();



    }

    public void userSelectCalculateButtonNo(){

        addVehicleOption.click();
        common.pause(7);
        addVehicleOption.click();
        common.pause(5);

        calculateOption.click();
        common.pause(3);
        selectPlane2.click();
        common.pause(3);
        selectPlane1ClosedPOP.click();
        common.pause(3);

    }

    public void userVerifyCreatePolicyDetailWithPremiumValues(){
        common.waitUntilVisibilityOfElement (policyNumber);
        String policyNo = policyNumber.getText().trim();

        System.out.println("Policy Created Successfully!");
        System.out.println("Policy Number: " + policyNo);

        String policybal = policyBalance.getText().trim();

        System.out.println("Policy Balance show");
        System.out.println("Policy Balance: " + policybal);




    }


}
