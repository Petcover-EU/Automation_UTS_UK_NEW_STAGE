package pages;

import factory.DriverFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.Common;
import utils.Log;

import java.util.List;

public class EndToEndScenariosPage {
    public WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());
    PolicyCreationScenariosPage policyCreationScenariosPage = new PolicyCreationScenariosPage(DriverFactory.getDriver());
    PolicyPage policyPage = new PolicyPage(DriverFactory.getDriver());
    ApproveClaimPage approveClaimPage = new ApproveClaimPage(DriverFactory.getDriver());
    AccountPage accountPage = new AccountPage(DriverFactory.getDriver());
    ManageClaimPage manageClaimPage = new ManageClaimPage(DriverFactory.getDriver());

    SoftAssert softAssert = new SoftAssert();

    public EndToEndScenariosPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    String authoriseCode = "C0022";

    @FindBy(css = "input[id='PolicyNumber']")
    private WebElement policyInputField;
    @FindBy(css = "ul[id='side-menu']>li:nth-child(4) a")
    private WebElement quoteIcon;
    @FindBy(css = "input[id='QuoteNumber']")
    private WebElement quoteNumberInputField;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody[1]/tr/td[2]/a")
    private WebElement firstRowQuoteNumber;

    @FindBy(xpath = "//div[@id='Div_138']/div/div/span")
    private WebElement petSpeciesDropDown;
    @FindBy(xpath = "//div[@id='Div_139']/div/div/input | //div[@id='Div_11365']/div/div/input | //div[@id='Div_11307']/div/div/input")
    private WebElement petNameInputField;
    @FindBy(xpath = "//div[@id='Div_140']//span[@class='k-select'] | //div[@id='Div_11367']//span[@class='k-select'] | //div[@id='Div_11312']//span[@class='k-select']")
    private WebElement petGenderDropDown;
    @FindBy(xpath = "//input[@id='Question_141'] | //input[@id='Question_11368'] | //input[@id='Question_11313']")
    private WebElement petBirthDate;
    @FindBy(css = ".k-formatted-value.cls_EM127V.k-input")
    private WebElement petPurchaseAmount;
    @FindBy(xpath = "//button[@id='btnCalculate']")
    private WebElement calculateButton;
    @FindBy(xpath = "//div[@id='Question_138-list']//input[@role='listbox'] | //div[@id='Question_11366-list']//input")
    private WebElement speciesDrpDownSearchInputField;
    @FindBy(xpath = "(//ul[@class='k-list k-reset']//li[contains(text(),'Male')])[2]")
    private WebElement genderMaleOption;
    @FindBy(xpath = "(//ul[@class='k-list k-reset']//li[contains(text(),'Female')])[2]")
    private WebElement genderFemaleOption;
    @FindBy(xpath = "(//input[@class='step-select chkLowPremier'])[1]")
    private WebElement premierPlanLowExcess;
    @FindBy(xpath = "(//input[@class='select-input chkLowOptionalExtra1'])[1]")
    private WebElement optionExtraDeathLow;
    @FindBy(xpath = "(//input[@class='select-input chkLowOptionalExtra2'])[1]")
    private WebElement optionExtraTheftLow;
    @FindBy(xpath = "(//input[@class='select-input chkLowOptionalExtra3'])[1]")
    private WebElement optionExtraNotReturnFlyingLow;
    @FindBy(css = "div[id='divQuoteSavebutton'] div div>button:nth-child(3)")
    private WebElement saveQuoteButton;
    @FindBy(xpath = "//label[@class='inline required']//..//div//label")
    private WebElement quoteNumberOnTheQuoteInformationPage;

    @FindBy(css = "a[id='dropdownMenu1']")
    private WebElement cogMenuOnQuoteInformationPage;
    @FindBy(css = "a[id='btnEdit']")
    private WebElement cogMenuEditOption;
    @FindBy(css = "button[title='Save Application']")
    private WebElement saveApplicationButton;
    @FindBy(css = "a[id='collapMoreDetails']")
    private WebElement collapseMoreDetailsButton;
    @FindBy(xpath = "//input[@class='cls_EMH66V k-input'] | //input[@class='cls_CAT11484 k-input'] | //input[@class='cls_DGSTCV k-input']")
    private WebElement coverStartDateInput;
    @FindBy(css = "button[id='BindButton']")
    private WebElement createPolicyButton;
    @FindBy(xpath = "//div[@class='row client-details']/div[2]//span[2]")
    private WebElement policyNumberElement;
    @FindBy(xpath = "//input[@id='Question_82_340'] | //input[@id='Question_11378_609']")
    private WebElement assumptionYesRadioButton;
    @FindBy(xpath = "//input[@id='Question_137'] | //input[@id='Question_11409_637']")
    private WebElement informationConfirmCheckbox;

    @FindBy(css = "a[id='dropdownMenu1']")
    private WebElement cogMenuOnPolicyInformationPage;
    @FindBy(css = "a[id='btnAddAllocatePayment']")
    private WebElement addAllocatePaymentOption;
    @FindBy(xpath = "//input[@name='BankId_input']//following-sibling::span[2]")
    private WebElement bankDropdown;
    @FindBy(xpath = "//ul[@id='BankId_listbox']//li[3]")
    private WebElement bankListOption3;
    @FindBy(xpath = "//input[@id='PaymentTenderId']//..//span//span[2]")
    private WebElement paymentTenderDropDown;
    @FindBy(xpath = "//ul[@id='PaymentTenderId_listbox']//li[4]")
    private WebElement paymentTenderDropDownOptionBankTransfer;
    @FindBy(xpath = "//input[@id='ClientCurrentPaymentAmount']//..//input[1]")
    private WebElement paymentAmountInputField;
    @FindBy(xpath = "//input[@id='PolicyId']//..//span//span[2]")
    private WebElement policyDropdown;
    @FindBy(xpath = "//ul[@id='PolicyId_listbox']//li[last()]")
    private WebElement lastPolicyInTheList;

    @FindBy(css = "input[id='checkbox_IslncludeallocatedAmount']")
    private WebElement includeUnallocatedBalanceCheckbox;
    @FindBy(css = "button[id='btnAddReceiptVoucher']")
    private WebElement allocateNowButton;
    @FindBy(css = "ul[id='side-menu']>li:nth-child(5) a")
    private WebElement policyIcon;
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//li[13]//a")
    private WebElement historyTabOnPolicyInformationPage;

    @FindBy(css = "a[id='btnAddEndorsement']")
    private WebElement addEndorsementOption;
    @FindBy(css = "button[class='btn btn-primary preventEnterSpacebar']")
    private WebElement endorsementSaveButton;

    @FindBy(css = "a[id='btnAddClaims']")
    private WebElement addClaimOption;
    @FindBy(xpath = "//input[@id='ClaimCoverDetailId']//..//span//span[2]")
    private WebElement claimCoverDropdown;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[2])[3]")
    private WebElement coverOptionVeterinaryFees;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Third Party Liability')][last()])[3]")
    private WebElement coverOptionThirdPartyLiability;
    @FindBy(xpath = "//ul[@id='ClaimCoverDetailId_listbox']//li[4]")
    private WebElement coverOptionAdvertisingReward;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Loss from Theft')])[3]")
    private WebElement coverOptionLossFromTheft;
    @FindBy(xpath = "//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Death from Illness')]")
    private WebElement coverOptionDeathFromIllness;


    @FindBy(css = "input[id='DateOfLoss']")
    private WebElement treatmentDateInputField;
    @FindBy(css = "input[id='NotifiedDate']")
    private WebElement dateClaimFirstAdvisedInputField;
    @FindBy(css = "input[id='FirstNotificationAcknowledgmentDate']")
    private WebElement firstNotificationAcknowledgementDateInputField;

    @FindBy(xpath = "//input[@id='NotificationMethod']//..//span//span[2]")
    private WebElement notificationMethodDropdown;
    @FindBy(xpath = "//ul[@id='NotificationMethod_listbox']//li[2]")
    private WebElement notificationMethodEmailOption;
    @FindBy(xpath = "//input[@id='PayBy']//..//span//span[2]")
    private WebElement paymentToDropdown;
    @FindBy(xpath = "//ul[@id='PayBy_listbox']//li[2]")
    private WebElement paymentToOptionInsured;
    @FindBy(css = "input[class=' chequenogenerate EFTId']")
    private WebElement etfRadioButton;
    @FindBy(xpath = "//input[@id='ConditionType']//..//span//span[2]")
    private WebElement conditionTypeDropdown;
    @FindBy(xpath = "//ul[@id='ConditionType_listbox']//li[2]")
    private WebElement conditionTypeInjuryOption;
    @FindBy(xpath = "//input[@id='ClaimAmount']//..//input[1]")
    private WebElement claimAmountInputField;
    @FindBy(xpath = "//input[@id='OtherDeductible']//..//input[1]")
    private WebElement otherDeductibleAmountInputField;
    @FindBy(xpath = "//input[@id='CauseId']//..//span//following-sibling::span[2]")
    private WebElement lossOfCauseDropdown;
    @FindBy(xpath = "(//ul[@id='CauseId_listbox']//tbody//tr//td[1])[1]")
    private WebElement lossOfCauseOptionFirst;
    @FindBy(css = "button[id='SaveButton']")
    private WebElement claimSaveButton;
    @FindBy(xpath = "//div[@class='col-lg-3']//child::div[4]//span")
    private WebElement claimStatusOnTheClaimInformationPage;
    @FindBy(xpath = "//div[@class='col-lg-3']//div//h2")
    private WebElement claimNumberOnTheClaimInformationPage;
    @FindBy(xpath = "//div[@id='loading' and @style='display: none;']")
    private WebElement loadingSpinnerInactive;
    @FindBy(xpath = "(//div[@class='divider5']//following-sibling::h3)[4]")
    private WebElement claimPaymentSummaryHeader;

    @FindBy(css = "button[id='dropdownMenu1']")
    private WebElement cogIconOnTheClaimPage;
    @FindBy(css = "a[id='btnAuthoriseDecline']")
    private WebElement declineClaimOption;
    @FindBy(css = "a[id='btnAuthorisation']")
    private WebElement claimAuthorisationOption;
    @FindBy(xpath = "//input[@id='DeclinedReasonId']//..//span//span[2]")
    private WebElement declineReasonDropdown;
    @FindBy(xpath = "//ul[@id='DeclinedReasonId_listbox']//li[3]")
    private WebElement declineClaimReason2;
    @FindBy(css = "input[id='DeclinedDate']")
    private WebElement declineDateInputField;
    @FindBy(css = "textarea[id='Comment']")
    private WebElement declineCommentInputField;
    @FindBy(css = "input[id='AuthoriseCode']")
    private WebElement declineAuthoriseCodeInputField;
    @FindBy(css = "button[id='btnSave']")
    private WebElement createButtonOfDeclineClaim;
    @FindBy(css = "input[id='AuthoriseAmount']")
    private WebElement authoriseAmountInputField;

    @FindBy(xpath = "(//table[@id='tblGrid']//tbody//tr//td[2])[last()]")
    private WebElement lastRowClaimInApproveClaim;
    @FindBy(xpath = "(//table[@id='tblGrid']//tbody//tr//td[1]//div/ins[@class='iCheck-helper'])[last()]")
    private WebElement lastRowClaimInApproveClaimCheckbox;
    @FindBy(css = "button[id='btnApproveClaims']")
    private WebElement approveClaimButton;
    @FindBy(css = "input[id='AuthoriseCode']")
    private WebElement authoriseCodeInputField;
    @FindBy(css = "button[id='btnclaimauthorisecode']")
    private WebElement authoriseCodeOkButton;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[4]/a")
    private WebElement claimPaymentEFTIconOnAccountPage;
    @FindBy(css = "button[id='btnClaimPaymentEFT']")
    private WebElement processClaimEFTPaymentButton;
    @FindBy(xpath = "(//div[@id='gridName']/table/tbody[1]/tr/td[5]/a)[1]")
    private WebElement firstClaimOnTheManageClaimPage;
    @FindBy(xpath = "(//table[@id='tblGrid']//tbody//tr//td[2])[1]")
    private WebElement firstClaimOnClaimPaymentEFT;
    @FindBy(xpath = "(//table[@id='tblGrid']//tbody//tr//td[1]//div/ins[@class='iCheck-helper'])[1]")
    private WebElement firstClaimCheckboxOnPaymentEFT;

    @FindBy(css = "a[id='btnRenewPolicy']")
    private WebElement renewPolicyOption;
    @FindBy(id = "btnAddPolicyRenew")
    private WebElement saveRenewApplicationButton;
    @FindBy(id = "btnCancelPolicy")
    private WebElement cancelPolicyOption;
    @FindBy(css = "button[class='btn btn-primary Continue']")
    private WebElement cancelContinueButton;
    @FindBy(xpath = "//input[@id='CancellationReasonId']//..//span//span[2]")
    private WebElement cancellationReasonDropdown;
    @FindBy(xpath = "//ul[@id='CancellationReasonId_listbox']//li[2]")
    private WebElement cancellationReasonBusinessClosed;
    @FindBy(xpath = "//input[@id='RefundAmount']//..//input[1]")
    private WebElement refundAmountInputField;
    @FindBy(id = "CancellationDescription")
    private WebElement cancelPolicyDescription;
    @FindBy(css = "button[title='Cancel Policy']")
    private WebElement cancelPolicyButton;

    @FindBy(css = "button[name='btnPolicyStatus']")
    private WebElement policyStatusOnThePolicyInformationPage;


    public void searchPolicyAndClick(String exoticPolicyNumber) {
        common.pause(2);
        policyPage.clickPolicyIcon();
        common.waitUntilVisibilityOfElement(policyInputField);
        policyInputField.sendKeys(exoticPolicyNumber);
        common.jsClick(searchButton);
        common.pause(3);
        driver.findElement(By.xpath("//div[@id='gridName']//tbody//tr//td[4]//a")).click();
        common.pause(2);
        common.switchToWindow(1);
    }

    public void clickOnAddQuoteButtonAndEnterClientDetails() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Exotic");
        policyCreationScenariosPage.clickOnAddQuoteButton();
        policyCreationScenariosPage.enterClientContactInformation(26, sheet);
    }

    public void selectExoticProductAndEnterPetDetails() {
        policyCreationScenariosPage.selectProduct("Exotic");

        XSSFSheet sheet = common.readDataFromExcelSheet("Exotic");
        XSSFRow row = sheet.getRow(26);

        common.waitUntilVisibilityOfElement(petSpeciesDropDown);
        common.pause(2);
        petSpeciesDropDown.click();
        common.waitUntilVisibilityOfElement(speciesDrpDownSearchInputField);

        String species = row.getCell(10).getStringCellValue();
        speciesDrpDownSearchInputField.sendKeys(species);
        common.pause(2);
        speciesDrpDownSearchInputField.sendKeys(Keys.DOWN);
        speciesDrpDownSearchInputField.sendKeys(Keys.ENTER);
        common.pause(1);
        Log.info("User selected species");

        String petName = row.getCell(11).getStringCellValue();
        petNameInputField.sendKeys(petName);
        common.pause(2);

        String gender = row.getCell(12).getStringCellValue();
        petGenderDropDown.click();
        common.pause(1);
        if (gender.equalsIgnoreCase("Male")) {
            genderMaleOption.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            genderFemaleOption.click();
        }
        Log.info("Selected pet gender");

        common.pause(1);
        String petBDate = row.getCell(13).getStringCellValue().replace("/", ".");
        petBirthDate.sendKeys(petBDate);
        Log.info("Selected pet birth date");

        common.pause(2);
        String price = row.getCell(15).getStringCellValue();
        petPurchaseAmount.sendKeys(price);
        Log.info("Entered pet purchase price");

        calculateButton.click();
        common.waitUntilVisibilityOfElement(calculateButton);
        common.jsClick(calculateButton);
        Log.info("Click on the calculate button");
        common.waitUntilVisibilityOfElement(premierPlanLowExcess);
        common.pause(1);
    }

    public String selectPlanAndSaveQuoteAndGetQuoteNumber() {
        common.jsClick(premierPlanLowExcess);
        common.jsClick(optionExtraDeathLow);
        common.jsClick(optionExtraTheftLow);
        common.jsClick(optionExtraNotReturnFlyingLow);
        Log.info("Select low excess premier plan and all optional extras");

        common.pause(1);
        common.jsClick(saveQuoteButton);
        Log.info("Click on the save quote button");

        common.waitUntilVisibilityOfElement(quoteNumberOnTheQuoteInformationPage);
        common.pause(1);

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheSameQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(String exoticQuoteNumber) {
        common.pause(5);
        common.jsClick(quoteIcon);
        common.waitUntilVisibilityOfElement(quoteNumberInputField);

        quoteNumberInputField.sendKeys(exoticQuoteNumber);
        searchButton.click();
        common.pause(2);
        firstRowQuoteNumber.click();

        common.pause(5);
        common.switchToWindow(1);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(1);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");

        common.waitUntilVisibilityOfElement(calculateButton);
        common.pause(10);
        common.jsClick(calculateButton);
        common.pause(3);
        if (!common.isElementDisplayed(coverStartDateInput)) {
            common.jsClick(collapseMoreDetailsButton);
        }

        common.waitUntilVisibilityOfElement(coverStartDateInput);
        coverStartDateInput.clear();
        String coverStartDate = common.getPastDate(360, "dd.MM.yyyy");
        coverStartDateInput.sendKeys(coverStartDate);
        Log.info("Enter the cover start date: " + coverStartDate);
        common.pause(3);
        common.jsClick(assumptionYesRadioButton);
        common.jsClick(informationConfirmCheckbox);
        Log.info("User selects underwriting questions");
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();

        common.jsClick(saveApplicationButton);
        Log.info("Click on the save application");
        common.acceptAlert();
    }

    public String createPolicyByEditingSameQuoteAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilVisibilityOfElement(calculateButton);
        common.waitUntilElementToBeClickable(calculateButton);
        common.jsClick(calculateButton);
        common.waitUntilVisibilityOfElement(createPolicyButton);
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Policy: " + policyNumber);
        return policyNumber;
    }

    public void clickOnTheCogIconAndAddAllocatePayment(String policyNum) {

        common.pause(2);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addAllocatePaymentOption);
        Log.info("Select add allocate payment from the cog dropdown");
        common.waitUntilVisibilityOfElement(bankDropdown);
        common.jsClick(bankDropdown);
        common.jsClick(bankListOption3);
        common.pause(1);
        Log.info("Select bank from the dropdown");

        common.jsClick(paymentTenderDropDown);
        common.jsClick(paymentTenderDropDownOptionBankTransfer);
        Log.info("Select payment tender from the dropdown");
        String paymentAmount = "5";
        paymentAmountInputField.sendKeys(paymentAmount);
        Log.info("Enter the payment amount");

        common.jsClick(policyDropdown);
        common.jsClick(lastPolicyInTheList);
        Log.info("Select policy from the dropdown");

        common.jsClick(includeUnallocatedBalanceCheckbox);
        common.pause(2);
        common.jsClick(allocateNowButton);
        common.pause(10);
        driver.close();
        common.switchToWindow(0);
        searchPolicyAndClick(policyNum);
        common.jsClick(historyTabOnPolicyInformationPage);

        List<WebElement> totalRows = common.waitUntilPresenceOfAllElement("//div[@id='gridPolicyHistoryList']//tbody//tr//td[2]");
        StringBuilder data = new StringBuilder();
        for (WebElement row : totalRows) {
            data.append(row.getText()).append("\n");
        }
        Log.info("Found the history of the allocated payments: " + data);
        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddEndorsement(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addEndorsementOption);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        Log.info("Select add Endorsement from the cog dropdown");
        common.waitUntilElementToBeClickable(calculateButton);
        common.jsClick(calculateButton);
        Log.info("Click on the calculate button");
        common.pause(1);
        common.jsClick(optionExtraDeathLow);
        Log.info("Removed Death from illness or injury optional extra");
        common.pause(1);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.pause(120);
//        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);
        if (common.isElementDisplayed(policyStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyStatusOnThePolicyInformationPage);
            Assert.assertEquals(policyStatus, "Endorsement", "policy status is mismatched");
            Log.info("Verified the policy status after endorsement: " + policyStatus);
            common.pause(1);
        }
        driver.close();
        common.switchToWindow(0);
    }

    public void selectClaimCoverForExotic(String cover) {
        common.waitUntilElementToBeClickable(claimCoverDropdown);
        common.pause(1);
        common.jsClick(claimCoverDropdown);
        common.pause(1);
        switch (cover) {
            case "Vet fees" -> common.jsClick(coverOptionVeterinaryFees);
            case "Liability" -> common.jsClick(coverOptionThirdPartyLiability);
            case "Death" -> common.jsClick(coverOptionDeathFromIllness);
            case "Theft" -> common.jsClick(coverOptionLossFromTheft);
        }
        Log.info("Select claim cover from the cover dropdown");
    }

    public void enterClaimDetailsAndAddClaim(String claimAmount) {
        String treatmentDate = common.getPastDate(2, "dd.MM.yyyy");
        common.sendKeys(treatmentDateInputField, treatmentDate);
        common.sendKeys(dateClaimFirstAdvisedInputField, treatmentDate);
        Log.info("Entered treatment and related dates: " + treatmentDate);
        common.pause(1);
        common.jsClick(notificationMethodDropdown);
        common.jsClick(notificationMethodEmailOption);
        common.jsClick(paymentToDropdown);
        common.jsClick(paymentToOptionInsured);
        common.jsClick(etfRadioButton);
        common.jsClick(conditionTypeDropdown);
        common.jsClick(conditionTypeInjuryOption);
        Log.info("Entered notification method, Payment method, Condition type");
        claimAmountInputField.sendKeys(claimAmount);
        common.pause(2);
        claimPaymentSummaryHeader.click();
        Log.info("Entered claim amount");
        common.waitUntilElementToBeClickable(lossOfCauseDropdown);
        common.jsClick(lossOfCauseDropdown);
        common.pause(2);
        common.waitUntilElementToBeClickable(lossOfCauseOptionFirst);
        common.jsClick(lossOfCauseOptionFirst);
        Log.info("Selected loss cause");
        common.waitUntilElementToBeClickable(claimSaveButton);
        common.jsClick(claimSaveButton);
        common.pause(2);
        Log.info("Click on the claim save button");
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclined(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addClaimOption);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);
        selectClaimCoverForExotic("Liability");
        enterClaimDetailsAndAddClaim("100");
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        softAssert.assertEquals(claimStatus, "Declined", "claim status is not declined");
        softAssert.assertAll();
        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnThePolicyAndDeclineTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addClaimOption);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);
        selectClaimCoverForExotic("Vet fees");
        enterClaimDetailsAndAddClaim("100");
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        common.pause(1);
        common.jsClick(cogIconOnTheClaimPage);
        Log.info("Click on the cog icon");
        common.jsClick(declineClaimOption);
        Log.info("Click on Decline this claim option");
        common.waitUntilVisibilityOfElement(declineReasonDropdown);
        common.jsClick(declineReasonDropdown);
        common.jsClick(declineClaimReason2);
        declineCommentInputField.sendKeys("Testing");
        declineAuthoriseCodeInputField.sendKeys(authoriseCode);
        common.waitUntilElementToBeClickable(createButtonOfDeclineClaim);
        common.jsClick(createButtonOfDeclineClaim);
        Log.info("Entered decline reason and click on create button");
        common.pause(2);
        String claimStatus1 = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus1);
        softAssert.assertEquals(claimStatus1, "Declined", "claim status is not declined");
        softAssert.assertAll();
        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnThePolicyAndSettleTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addClaimOption);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);
        selectClaimCoverForExotic("Theft");
        enterClaimDetailsAndAddClaim("200");
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        softAssert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

        String claimNum = claimNumberOnTheClaimInformationPage.getText();
        String claimNumber = claimNum.substring(8);
        Log.info("Claim is added with the claim number: " + claimNumber);


        common.jsClick(cogIconOnTheClaimPage);
        Log.info("Click on the cog icon");

        common.jsClick(claimAuthorisationOption);
        Log.info("Click on Claim Authorisation option");

        common.waitUntilVisibilityOfElement(authoriseAmountInputField);
        declineCommentInputField.sendKeys("Testing");
        declineAuthoriseCodeInputField.sendKeys(authoriseCode);
        common.waitUntilElementToBeClickable(createButtonOfDeclineClaim);
        common.jsClick(createButtonOfDeclineClaim);
        Log.info("Entered authorised amount and click on create button");

        common.pause(2);
        String claimStatusAuthorise = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusAuthorise);
        softAssert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveClaimPage.clickOnApproveClaimButton();
        common.waitUntilPresenceOfElement("(//table[@id='tblGrid']//tbody//tr//td[2])[last()]");
        String lastClaimNumber = lastRowClaimInApproveClaim.getText();

        softAssert.assertEquals(lastClaimNumber, claimNumber);
        softAssert.assertAll();

        lastRowClaimInApproveClaimCheckbox.click();
        common.jsClick(approveClaimButton);
        common.waitUntilVisibilityOfElement(authoriseCodeInputField);
        authoriseCodeInputField.sendKeys(authoriseCode);
        common.jsClick(authoriseCodeOkButton);
        common.pause(2);
        Log.info("Approve the claim from Approve claim page");

        driver.close();
        common.switchToWindow(0);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        softAssert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);

        accountPage.clickOnAccountIcon();
        common.jsClick(claimPaymentEFTIconOnAccountPage);
        Log.info("Redirected to the account menu");

        common.waitUntilPresenceOfElement("(//table[@id='tblGrid']//tbody//tr//td[2])[1]");
        String firstClaimNumberONAccountPage = firstClaimOnClaimPaymentEFT.getText();
        softAssert.assertEquals(firstClaimNumberONAccountPage, claimNumber);
        softAssert.assertAll();

        firstClaimCheckboxOnPaymentEFT.click();
        common.jsClick(processClaimEFTPaymentButton);
        common.acceptAlert();
        Log.info("Processed claim payment through the electronic fund transfer");

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusSettled = claimStatusOnTheClaimInformationPage.getText();
        Log.info("Verified the claim status is: " + claimStatusSettled);
        softAssert.assertEquals(claimStatusSettled, "Settled", "claim status is not matching");
        common.pause(1);
        driver.close();
        common.switchToWindow(0);
    }

    public void renewThePolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(renewPolicyOption);
        Log.info("Selected renew policy option from the policy information page");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);
        common.waitUntilElementToBeClickable(calculateButton);
        common.jsClick(calculateButton);
        Log.info("Click on the calculate button to select the plan");
        common.waitUntilVisibilityOfElement(optionExtraDeathLow);
        common.jsClick(optionExtraDeathLow);
        common.jsClick(saveRenewApplicationButton);
        Log.info("Saved the policy by adding Death from illness optional extra");

        common.waitUntilVisibilityOfElement(historyTabOnPolicyInformationPage);
        common.jsClick(historyTabOnPolicyInformationPage);
        List<WebElement> totalRows = common.waitUntilPresenceOfAllElement("//div[@id='gridPolicyHistoryList']//tbody//tr//td[2]");
        StringBuilder data = new StringBuilder();
        for (WebElement row : totalRows) {
            data.append(row.getText()).append("\n");
        }
        Log.info("Verified the history of the policy renewal: " + data);
        driver.close();
        common.switchToWindow(0);
    }

    public void cancelThePolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(cancelPolicyOption);
        Log.info("Selected cancel policy from the policy information page");
        common.pause(2);
        common.jsClick(cancelContinueButton);
        common.waitUntilVisibilityOfElement(cancellationReasonDropdown);
        common.jsClick(cancellationReasonDropdown);
        common.jsClick(cancellationReasonBusinessClosed);
        String refundAmount = "100";
        Log.info("Selected cancel reason and entered refund amount");
        refundAmountInputField.sendKeys(refundAmount);
        cancelPolicyDescription.sendKeys("Testing the cancel policy functionality");
        common.jsClick(cancelPolicyButton);
        Log.info("Click on the cancel policy button");
        common.pause(3);
        String policyStatus = common.getText(policyStatusOnThePolicyInformationPage);
        Assert.assertEquals(policyStatus, "Cancel", "policy status is mismatched");
        Log.info("Verified the policy status after cancellation: " + policyStatus);

        common.waitUntilVisibilityOfElement(historyTabOnPolicyInformationPage);
        common.jsClick(historyTabOnPolicyInformationPage);
        List<WebElement> totalRows = common.waitUntilPresenceOfAllElement("//div[@id='gridPolicyHistoryList']//tbody//tr//td[2]");
        StringBuilder data = new StringBuilder();
        for (WebElement row : totalRows) {
            data.append(row.getText()).append("\n");
        }
        Log.info("Verified the history of the policy cancelled: " + data);
    }
}
