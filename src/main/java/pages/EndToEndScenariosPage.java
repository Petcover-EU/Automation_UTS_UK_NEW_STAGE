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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

    public EndToEndScenariosPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    String authoriseCode = "C0022";
//  Exotic

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
    @FindBy(id = "Question_11385_720")
    private WebElement assumptionRadioYes;
    @FindBy(xpath = "//div[@id='gridName']//tbody//tr//td[4]//a")
    private WebElement firstPolicyNumberOnTheList;

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
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Alternative or Complementary Treatment')][last()])[3]")
    private WebElement coverOptionAlternativeTreatment;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Saying Goodbye')][last()])[3]")
    private WebElement coverOptionSayingGoodbye;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Emergency Repatriation')][last()])[3]")
    private WebElement coverOptionEmergencyRepatriation;

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
    @FindBy(xpath = "(//ul[@id='CauseId_listbox']//tbody//tr//td[2])[1]")
    private WebElement lossOfCauseOptionFirst;
    @FindBy(xpath = "(//ul[@id='CauseId_listbox']//tbody//tr//td[2])[3]")
    private WebElement lossOfCauseOptionThird;
    @FindBy(css = "button[id='SaveButton']")
    private WebElement claimSaveButton;
    @FindBy(xpath = "//div[@class='col-lg-3']//child::div[4]//span")
    private WebElement claimStatusOnTheClaimInformationPage;
    @FindBy(xpath = "//div[@class='col-lg-3']//div//h2")
    private WebElement claimNumberOnTheClaimInformationPage;
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
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[3]/a")
    private WebElement claimPaymentPrintChequeIconOnAccountPage;
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
    @FindBy(css = "button[name='btnPolicyTransactionTypeE']")
    private WebElement policyEndorsementStatusOnThePolicyInformationPage;
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//li[12]//a")
    private WebElement lettersTabInPolicyInformationPage;
    @FindBy(css = "a[data-eventname='ConfirmRenewal']")
    private WebElement confirmRenewalButton;
    @FindBy(xpath = "//div[@id='gridPolicyInstalmentList']//tbody/tr[1]//td[last()]/a")
    private WebElement payNowButtonOfFirstInstalment;
    @FindBy(xpath = "//ul[@id='PaymentTenderId_listbox']//li[2]")
    private WebElement paymentOptionCreditCard;
    @FindBy(xpath = "//div[@id='gridPolicyInstalmentList']//tbody/tr[1]//td[9]")
    private WebElement firstInstalmentStatus;
    @FindBy(xpath = "//div[@id='gridPolicyInstalmentList']//tbody/tr[1]//td[9]")
    private WebElement secondInstalmentPaymentStatus;
    @FindBy(xpath = "//div[@id='ExcessPremiumLowExcessMonthly']//..//div[5]//td[@class='tdLowPremier step-select-column']//span")
    private WebElement totalMonthlyPremiumLowExcessPremierPlan;
    @FindBy(xpath = "(//span[@calculatedetail='GrandTotalHighPremierMonthly'])[1]")
    private WebElement totalMonthlyPremiumOnQuotePage;
    @FindBy(xpath = "//tbody[@role='rowgroup']//tr//td[10]")
    private WebElement totalPremiumAmount;
    @FindBy(xpath = "//input[@id='ExcessDeductible']//..//input[1]")
    private WebElement accessDeductibleInputFieldOnClaimPage;

//    Cat

    @FindBy(xpath = "(//span[contains(text(),'Superior (Lifetime)')])[2]//..//input")
    private WebElement superiorPlanCheckbox;
    @FindBy(xpath = "//button[text()='Close']")
    private WebElement planPopupCloseButton;
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//li[8]//a")
    private WebElement instalmentTab;
    @FindBy(xpath = "//div[@id='gridPolicyInstalmentList']//tbody/tr[2]//td[last()]/a[@data-eventname='PayNow']")
    private WebElement payNowButtonOfSecondInstalment;
    @FindBy(xpath = "//input[@id='CardType']//..//span/span[2]")
    private WebElement cardTypeDropdownInPopup;
    @FindBy(xpath = "//ul[@id='CardType_listbox']//li[2]")
    private WebElement cardTypeVisa;
    @FindBy(id = "NameOnTheCard")
    private WebElement userNameOnCardInputField;
    @FindBy(id = "CreditCardNumber")
    private WebElement creditCardNumberInputField;
    @FindBy(xpath = "//input[@id='ExpiryMonths']//..//span/span[2]")
    private WebElement cardExpiryMonthDropdownInPopup;
    @FindBy(xpath = "//input[@id='ExpiryYears']//..//span/span[2]")
    private WebElement cardExpiryYearDropdownInPopup;
    @FindBy(xpath = "//ul[@id='ExpiryMonths_listbox']//li[2]")
    private WebElement cardExpiryMonthJanOption;
    @FindBy(xpath = "//ul[@id='ExpiryYears_listbox']//li[3]")
    private WebElement cardExpiryYear2025Option;
    @FindBy(id = "CVN")
    private WebElement cvvInputField;
    @FindBy(id = "Comment")
    private WebElement commentInputField;
    @FindBy(css = "button[class='btn btn-primary savebutton']")
    private WebElement saveButton;
    @FindBy(xpath = "(//span[contains(text(),'Mid Point (Lifetime)')])[2]//..//input")
    private WebElement midpointPlan;

    @FindBy(id = "FromDate")
    private WebElement fromDateInputInPrintChequePage;
    @FindBy(id = "ToDate")
    private WebElement toDateInputInPrintChequePage;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonInPrintChequePage;

    @FindBy(xpath = "(//table[@id='tblGrid']//tbody//tr//td[2])[1]")
    private WebElement firstClaimOnClaimPaymentPrintCheque;
    @FindBy(xpath = "(//table[@id='tblGrid']//tbody//tr//td[6]//input)[1]")
    private WebElement firstClaimOnClaimPaymentPrintChequeCommentInput;
    @FindBy(id = "btnClaimPayment")
    private WebElement printChequeButton;
    @FindBy(xpath = "(//span[contains(text(),'Entry (Lifetime)')])[2]//..//input")
    private WebElement entryPlan;

    //    ****
    @FindBy(xpath = "//input[@id='Policy_CardType']//..//span/span[2]")
    private WebElement cardTypeDropDown;
    @FindBy(xpath = "//ul[@id='Policy_CardType_listbox']//li[2]")
    private WebElement cardTypeVisaRenew;
    @FindBy(id = "Policy_CardHolderName")
    private WebElement cardHolderName;
    @FindBy(id = "Policy_CreditCardNumber")
    private WebElement policyCreditCardNumber;
    @FindBy(xpath = "//input[@id='Policy_CreditCardExpiryMonth']//..//span/span[2]")
    private WebElement cardExpiryMonthDropdownInRenew;
    @FindBy(xpath = "//input[@id='Policy_CreditCardExpiryYear']//..//span/span[2]")
    private WebElement cardExpiryYearDropdownInRenew;
    @FindBy(xpath = "//ul[@id='Policy_CreditCardExpiryMonth_listbox']//li[2]")
    private WebElement cardExpiryMonthJanOptionInRenew;
    @FindBy(xpath = "//ul[@id='Policy_CreditCardExpiryYear_listbox']//li[3]")
    private WebElement cardExpiryYear2025OptionInRenew;
    @FindBy(id = "Policy_CreditCardCVV")
    private WebElement policyCreditCardCVV;


//    Dog

    @FindBy(css = "input[id='Question_11319']")
    private WebElement petMicrochipNumberInput;
    @FindBy(css = "input[id='Question_11430_647']")
    private WebElement petAssumption1ForDog;
    @FindBy(css = "input[id='Question_11336_661']")
    private WebElement petAssumption2ForDog;
    @FindBy(css = "input[id='Question_11415_678']")
    private WebElement petAssumption3ForDog;
    @FindBy(xpath = "(//span[contains(text(),'Key (Lifetime)')])[2]//..//input")
    private WebElement keyPlanCheckbox;
    @FindBy(xpath = "(//input[@class='optionalextram2'])[1]")
    private WebElement optionExtraDayToDayCareForDog;
    @FindBy(xpath = "(//span[contains(text(),'Vital (Lifetime)')])[2]//..//input")
    private WebElement vitalPlanCheckbox;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Day to Day Care')][last()])[3]")
    private WebElement coverOptionDayToDayCare;

//    Horse

    @FindBy(css = "input[id='chkBaicMonthly']")
    private WebElement horseInsuranceBasicPlanCheckbox;
    @FindBy(xpath = "//input[@name='chkOptionalExtraDisposal']")
    private WebElement disposalOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraVetenaryFee']")
    private WebElement veterinaryFeeOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraLossOfUse']")
    private WebElement permanentLossOfUseOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraThirdPartyLiability']")
    private WebElement thirdPartyLiabilityOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraPersonalAccident']")
    private WebElement personalAccidentOptionalExtraCheckbox;
    @FindBy(css = "button[class='swal-button swal-button--confirm']")
    private WebElement permanentLossOfUseOkButton;
    @FindBy(xpath = "//input[@class='cls_HORSE0009 k-input']")
    private WebElement coverStartDateOfHorse;
    @FindBy(xpath = "//div[@id='Div_33427']//div//div//span//span[2]")
    private WebElement horseColourDropDown;
    @FindBy(xpath = "//div[@id='Div_33428']//div//div//span//span[2]")
    private WebElement horseSexDropDown;
    @FindBy(xpath = "//ul[@id='Question_33427_listbox']//li[2]")
    private WebElement horseColourOption;
    @FindBy(xpath = "//ul[@id='Question_33429_listbox']//li[2]")
    private WebElement horseHeightOption;
    @FindBy(xpath = "//ul[@id='Question_33428_listbox']//li[2]")
    private WebElement horseSexColtOption;
    @FindBy(xpath = "//div[@id='Div_33429']//div//div//span//span[2]")
    private WebElement horseHeightDropDown;
    @FindBy(css = "input[id='Question_33442_45577']")
    private WebElement horseStatementsTrueOrNotYesRadioButton1;
    @FindBy(css = "input[id='Question_33462_45597']")
    private WebElement horseStatementsTrueOrNotYesRadioButton2;
    @FindBy(css = "input[id='Question_33409_45593']")
    private WebElement horseStatementsTrueOrNotYesRadioButton3;
    @FindBy(xpath = "(//span[contains(text(),'Core (Lifetime)')])[2]//..//input")
    private WebElement corePlanCheckbox;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Death from Illness')])[5]")
    private WebElement coverOptionDeathFromIllnessOfHorse;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Loss by Theft or Straying')])[5]")
    private WebElement coverOptionLossFromTheftOfHorse;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Death from Injury')])[7]")
    private WebElement coverOptionDeathFromInjuryOfHorse;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Veterinary Fees')])[9]")
    private WebElement coverOptionVeterinaryOfHorse;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Third Party Liability')])[7]")
    private WebElement coverOptionThirdPartyLiabilityOfHorse;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Personal Accident')])[4]")
    private WebElement coverOptionPersonalAccidentOfHorse;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Saddlery & Tack')])[4]")
    private WebElement coverOptionSaddleryAndTackOfHorse;
    @FindBy(xpath = "(//ul[@id='ClaimCoverDetailId_listbox']//li[contains(text(),'Horse Trailer & Horse Drawn Vehicles')])[3]")
    private WebElement coverOptionHorseTrailerAndDrownVehicle;
    @FindBy(xpath = "(//input[@name='chkOptionalExtraDisposal'])[2]")
    private WebElement disposalOptionalExtraCheckboxOnRenewCoverTable;

    @FindBy(css = "input[id='chkPlanBMonthly']")
    private WebElement seniorHorseInsurancePlanBCheckbox;
    @FindBy(css = "input[id='chkOptionalHorseLiabilityMonthly']")
    private WebElement horseLiabilityCoverPlanCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraSaddleryAndTack']")
    private WebElement saddleryAndTackOptionalExtraCheckbox;
    @FindBy(xpath = "//input[@id='SaddleryandTackValue']//preceding-sibling::input")
    private WebElement saddleryAndTackValueInputField;
    @FindBy(css = "button[id='btnSaveSaddleryandTackValue1']")
    private WebElement saveButtonSaddleryAndTack;
    @FindBy(css = "input[name='chkOptionalExtraHorseTrailersNHorseDrawnVehicles']")
    private WebElement horseTrailerAndDrawnVehiclesOptionalExtraCheckbox;
    @FindBy(xpath = "//input[@id='HorseTrailersorHorseDrawnVehiclesValue']//preceding-sibling::input")
    private WebElement horseTrailersAndHorseDrawnVehicleValueInputField;
    @FindBy(css = "button[id='btnSaveHorseTrailersorHorseDrawnVehiclesValue']")
    private WebElement saveButtonHorseTrailersOrDrawnVehicles;
    @FindBy(css = "input[id='Question_33478_45623']")
    private WebElement saddleryAndTackValuedOver200NoRadio;
    @FindBy(css = "input[id='Question_33480_45625']")
    private WebElement saddleryAndTackValuedUnder200NoRadio;
    @FindBy(css = "input[id='Question_33482_45627']")
    private WebElement saddleryAndTackHaveAnyDamageNoRadio;
    @FindBy(css = "input[id='Question_33485']")
    private WebElement vehicleMakeInputField;
    @FindBy(css = "input[id='Question_33486']")
    private WebElement vehicleModelInputField;
    @FindBy(css = "input[id='Question_33487']")
    private WebElement vehicleSerialOrVINOrChassisNumberInputField;
    @FindBy(css = "input[id='Question_33488']")
    private WebElement vehicleManufacturerInputField;
    @FindBy(xpath = "//div[@id='Div_33489']//div//div//span//span//span[2]")
    private WebElement noOfHorseDropdown;
    @FindBy(xpath = "//ul[@id='Question_33489_listbox']//li[5]")
    private WebElement noOfHorseIs4Option;
    @FindBy(css = "input[id='Question_33490_45638']")
    private WebElement vehicleIsRoadWorthyYesRadio;
    @FindBy(css = "input[id='Question_33491_45641']")
    private WebElement vehicleHaveAnyDamageNoRadio;
    @FindBy(css = "input[id='Question_33493_45643']")
    private WebElement vehicleHaveAnyNonStandardModificationNoRadio;

    //Horse Liability
    @FindBy(xpath = "//div[@id='Div_33499']//div//div//span//span[2]")
    private WebElement horseColourDropDownOfLiability;
    @FindBy(xpath = "//ul[@id='Question_33499_listbox']//li[2]")
    private WebElement horseColourOptionOfLiability;
    @FindBy(xpath = "//div[@id='Div_33500']//div//div//span//span[2]")
    private WebElement horseSexDropDownOfLiability;
    @FindBy(xpath = "//ul[@id='Question_33500_listbox']//li[2]")
    private WebElement horseSexColtOptionOfLiability;
    @FindBy(xpath = "//div[@id='Div_33501']//div//div//span//span[2]")
    private WebElement horseHeightDropDownOfLiability;
    @FindBy(xpath = "//ul[@id='Question_33501_listbox']//li[2]")
    private WebElement horseHeightOptionOfLiability;
    @FindBy(css = "input[id='Question_33503_45652']")
    private WebElement horseLiabilityAssumptionRadioYesButton1;
    @FindBy(css = "input[class='HorseThirdPartyLiability2MPerMonth']")
    private WebElement horseLiabilityCover2MRadioButton;
    @FindBy(css = "input[class='HorseThirdPartyLiability1MPerMonth']")
    private WebElement horseLiabilityCover1MRadioButton;

//    Horse Saddlery and Tack

    @FindBy(css = "input[id='Question_33405_30102']")
    private WebElement horseSaddleryAndTrackRadioButton;
    @FindBy(xpath = "//input[@id='Question_33477']//..//input[1]")
    private WebElement horseSaddleryAndTrackValueInputField;
    @FindBy(css = "input[id='chkOptionalExtraSaddleryMonthly']")
    private WebElement horseSaddleryAndTackPlanCheckbox;
    @FindBy(xpath = "//input[@id='Question_33477']")
    private WebElement horseSaddleryAndTrackValueInputFieldEndorsement;

//    Horse Trailer and Drown vehicle

    @FindBy(id = "Question_33405_30103")
    private WebElement horseTrailerAndDrownVehicleRadioButton;
    @FindBy(id = "Question_33484")
    private WebElement horseTrailerValueInputField;
    @FindBy(css = "input[id='chkOptionalExtraTrailorMonthly']")
    private WebElement horseTrailerAndDrawnVehiclePlanCheckbox;
    @FindBy(xpath = "//input[@id='HorseTrailersorHorseDrawnVehiclesValue']//..//input[1]")
    private WebElement horseTrailerAndDrawnVehicleMarketValueInput;


    public void searchPolicyAndClick(String policyNumber) {
        policyPage.clickPolicyIcon();
        common.waitUntilVisibilityOfElement(policyInputField);
        policyInputField.sendKeys(policyNumber);
        common.jsClick(searchButton);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(1);
        common.jsClick(firstPolicyNumberOnTheList);
        common.pause(2);
        common.switchToWindow(1);
    }

    public void clickOnAddQuoteButtonAndEnterClientDetails(int row, String product) {
        XSSFSheet sheet = common.readDataFromExcelSheet(product);
        policyCreationScenariosPage.clickOnAddQuoteButton();
        policyCreationScenariosPage.enterClientContactInformation(row, sheet);
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
        Log.info("User selected species: " + species);

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
        Log.info("Selected pet gender: " + gender);

        common.pause(1);
        String petBDate = row.getCell(13).getStringCellValue().replace("/", ".");
        petBirthDate.sendKeys(petBDate);
        Log.info("Selected pet birth date: " + petBDate);

        common.pause(2);
        String price = row.getCell(15).getStringCellValue();
        petPurchaseAmount.sendKeys(price);
        Log.info("Entered pet purchase price: " + price);

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
        common.pause(2);

        String grandTotalMonthlyPremium = totalMonthlyPremiumLowExcessPremierPlan.getAttribute("data-originalvalue");
        Assert.assertEquals(grandTotalMonthlyPremium, "31.03", "Premium is incorrect");

        common.pause(1);
        common.jsClick(saveQuoteButton);
        Log.info("Click on the save quote button");

        common.waitUntilVisibilityOfElement(totalMonthlyPremiumOnQuotePage);
        common.pause(1);
        Assert.assertTrue(totalMonthlyPremiumOnQuotePage.getText().contains(grandTotalMonthlyPremium));

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheSameQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(String exoticQuoteNumber) {
        common.pause(2);
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
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
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
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(totalMonthlyPremiumOnQuotePage);
        common.pause(1);
        Assert.assertTrue(totalMonthlyPremiumOnQuotePage.getText().contains("31.03"));
    }

    public void verifyLettersTitleAndEmailSendStatus() {
        common.jsClick(lettersTabInPolicyInformationPage);
        common.pause(1);

        List<WebElement> letterTitles = common.waitUntilPresenceOfAllElement("//div[@id='gridPolicyLetterList']//tbody//tr//td[8]");
        Log.info("Verified the no of letters are emailed to client is: " + letterTitles.size());
        for (WebElement letterTitle : letterTitles) {
            Log.info("Letters displayed in the letters tab with title: " + letterTitle.getText());
        }

        List<WebElement> emailSendRightMarks = common.waitUntilPresenceOfAllElement("//div[@id='gridPolicyLetterList']//tbody//tr//td[10]//i");
        for (WebElement emailSend : emailSendRightMarks) {
            Assert.assertEquals(emailSend.getAttribute("class"), "fa fa-check", "Class value is not matching");
        }
        Log.info("Verified the email sent displayed with right mark");
    }

    public String createPolicyByEditingSameQuoteAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilElementToBeClickable(calculateButton);
        common.jsClick(calculateButton);
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Policy: " + policyNumber);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "372.40", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        verifyLettersTitleAndEmailSendStatus();
        return policyNumber;
    }

    public void payTheFirstInstallmentsUsingPayNowButtonInInstallmentTab() {
        common.waitUntilVisibilityOfElement(instalmentTab);
        common.jsClick(instalmentTab);
        common.waitUntilElementToBeClickable(payNowButtonOfFirstInstalment);
        common.jsClick(payNowButtonOfFirstInstalment);
        Log.info("Go to the instalment tab and click on the pay now button");
        common.waitUntilElementToBeClickable(paymentTenderDropDown);
        common.jsClick(paymentTenderDropDown);
        common.jsClick(paymentOptionCreditCard);
        Log.info("Select payment tender from the dropdown");

        common.jsClick(cardTypeDropdownInPopup);
        common.pause(1);
        common.jsClick(cardTypeVisa);
        userNameOnCardInputField.sendKeys("Test User");
        creditCardNumberInputField.sendKeys("4929421234600821");
        common.jsClick(cardExpiryMonthDropdownInPopup);
        common.jsClick(cardExpiryMonthJanOption);
        common.jsClick(cardExpiryYearDropdownInPopup);
        common.jsClick(cardExpiryYear2025Option);
        cvvInputField.sendKeys("356");
        commentInputField.sendKeys("Testing");
        common.jsClick(saveButton);
        Log.info("Entered credit card details and click on the pay now button");
        common.pause(5);
        String firstInstalmentPaymentStatus = firstInstalmentStatus.getText();
        Assert.assertEquals(firstInstalmentPaymentStatus, "Paid", "Payment status is not matching");
        Log.info("Verified the payment status as paid");
        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(String policyNumber) {
        searchPolicyAndClick(policyNumber);
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
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.jsClick(includeUnallocatedBalanceCheckbox);
        common.pause(2);
        common.jsClick(allocateNowButton);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        driver.close();
        common.switchToWindow(0);
        searchPolicyAndClick(policyNumber);
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

    public void selectPolicyEndorsementAndClickOnCalculateButton() {
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addEndorsementOption);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        Log.info("Select add Endorsement from the cog dropdown");
        common.waitUntilElementToBeClickable(calculateButton);
        common.jsClick(calculateButton);
        Log.info("Click on the calculate button");
        common.pause(1);
    }

    public void clickOnTheCogIconAndAddEndorsement(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectPolicyEndorsementAndClickOnCalculateButton();
        common.jsClick(optionExtraDeathLow);
        Log.info("Removed Death from illness or injury optional extra");
        common.pause(1);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.pause(120);
        if (common.isElementDisplayed(policyEndorsementStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyEndorsementStatusOnThePolicyInformationPage);
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
        common.pause(2);
        switch (cover) {
            case "Vet fees" -> common.jsClick(coverOptionVeterinaryFees);
            case "Liability" -> common.jsClick(coverOptionThirdPartyLiability);
            case "Death" -> common.jsClick(coverOptionDeathFromIllness);
            case "Theft" -> common.jsClick(coverOptionLossFromTheft);
        }
        Log.info("Select claim cover from the cover dropdown");
    }

    public void enterClaimDetailsAndAddClaim(String claimAmount) {
        String treatmentDate = common.getCurrentDate("dd.MM.yyyy");
        common.sendKeys(treatmentDateInputField, treatmentDate);
        common.sendKeys(dateClaimFirstAdvisedInputField, treatmentDate);
        Log.info("Entered treatment and related dates: " + treatmentDate);
        common.pause(1);
        common.jsClick(notificationMethodDropdown);
        common.jsClick(notificationMethodEmailOption);
        common.jsClick(paymentToDropdown);
        common.jsClick(paymentToOptionInsured);
        common.jsClick(conditionTypeDropdown);
        common.jsClick(conditionTypeInjuryOption);
        Log.info("Entered notification method, Payment method, Condition type");
        claimAmountInputField.sendKeys(claimAmount);
        common.pause(2);
        claimPaymentSummaryHeader.click();
        Log.info("Entered claim amount");
    }

    public void selectLossCauseAndClickOnTheSaveClaimButton() {
        common.waitUntilElementToBeClickable(lossOfCauseDropdown);
        common.jsClick(lossOfCauseDropdown);
        common.pause(2);
        common.waitUntilElementToBeClickable(lossOfCauseOptionFirst);
        common.jsClick(lossOfCauseOptionFirst);
        Log.info("Selected loss cause: " + lossOfCauseOptionFirst.getText());
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilElementToBeClickable(claimSaveButton);
        common.jsClick(claimSaveButton);
        common.pause(2);
        if (common.isElementDisplayed(claimSaveButton)) {
            common.jsClick(claimSaveButton);
        }
        common.pause(2);
        Log.info("Click on the claim save button");
    }

    public void selectLossCauseThirdOptionAndClickOnTheSaveClaimButton() {
        common.waitUntilElementToBeClickable(lossOfCauseDropdown);
        common.jsClick(lossOfCauseDropdown);
        common.pause(2);
        common.waitUntilElementToBeClickable(lossOfCauseOptionThird);
        common.jsClick(lossOfCauseOptionThird);
        Log.info("Selected loss cause: " + lossOfCauseOptionThird.getText());
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilElementToBeClickable(claimSaveButton);
        common.jsClick(claimSaveButton);
        common.pause(2);
        if (common.isElementDisplayed(claimSaveButton)) {
            common.jsClick(claimSaveButton);
        }
        common.pause(2);
        Log.info("Click on the claim save button");
    }

    public void selectAddClaimOption() {
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addClaimOption);
        Log.info("Select add claim option from cog icon");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclined(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForExotic("Liability");
        enterClaimDetailsAndAddClaim("100");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "500.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnThePolicyAndDeclineTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForExotic("Vet fees");
        enterClaimDetailsAndAddClaim("100");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "30.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        common.pause(1);
        Assert.assertEquals(claimStatus, "Pending", "claim status is not marching");
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
        Assert.assertEquals(claimStatus1, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void processElectronicFundTransferFromAccountMenu(String claimNumber) {
        accountPage.clickOnAccountIcon();
        common.jsClick(claimPaymentEFTIconOnAccountPage);
        Log.info("Redirected to the account menu");

        common.waitUntilPresenceOfElement("(//table[@id='tblGrid']//tbody//tr//td[2])[1]");
        String firstClaimNumberONAccountPage = firstClaimOnClaimPaymentEFT.getText();
        Assert.assertEquals(firstClaimNumberONAccountPage, claimNumber);

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
        Assert.assertEquals(claimStatusSettled, "Settled", "claim status is not matching");
        common.pause(1);

        driver.close();
        common.switchToWindow(0);
    }

    public void approveTheClaimFromApproveClaimModule(String claimNumber) {
        approveClaimPage.clickOnApproveClaimButton();
        common.waitUntilPresenceOfElement("(//table[@id='tblGrid']//tbody//tr//td[2])[last()]");
        String lastClaimNumber = lastRowClaimInApproveClaim.getText();

        Assert.assertEquals(lastClaimNumber, claimNumber);

        lastRowClaimInApproveClaimCheckbox.click();
        common.jsClick(approveClaimButton);
        common.waitUntilVisibilityOfElement(authoriseCodeInputField);
        authoriseCodeInputField.sendKeys(authoriseCode);
        common.jsClick(authoriseCodeOkButton);
        common.pause(2);
        Log.info("Approve the claim from Approve claim page");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnThePolicyAndSettleTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForExotic("Theft");
        enterClaimDetailsAndAddClaim("200");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "122.40", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

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
        Assert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveTheClaimFromApproveClaimModule(claimNumber);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        Assert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);
        processElectronicFundTransferFromAccountMenu(claimNumber);
    }

    public void selectRenewPolicyOptionAndClickOnTheCalculateButton() {
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(renewPolicyOption);
        Log.info("Selected renew policy option from the policy information page");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);
        common.waitUntilElementToBeClickable(calculateButton);
        common.jsClick(calculateButton);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        Log.info("Click on the calculate button to select the plan");
    }

    public void saveRenewApplicationAndVerifyHistory(String expectedPremiumAfterRenewal) {
        common.jsClick(saveRenewApplicationButton);
        Log.info("Click on the save button");
        common.waitUntilElementToBeClickable(confirmRenewalButton);
        common.jsClick(confirmRenewalButton);
        Log.info("Click on confirm button on transaction tab");
        common.acceptAlert();
        common.pause(3);
        String policyStatusRenewal = common.getText(policyStatusOnThePolicyInformationPage);
        Assert.assertEquals(policyStatusRenewal, "Renewal Policy", "policy status is mismatched");
        Log.info("Verified the policy status after renewal: " + policyStatusRenewal);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, expectedPremiumAfterRenewal, "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);


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

    public void renewThePolicyOfExoticProduct(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectRenewPolicyOptionAndClickOnTheCalculateButton();
        common.waitUntilVisibilityOfElement(optionExtraDeathLow);
        common.jsClick(optionExtraDeathLow);
        Log.info("Added Death from illness optional extra");

        saveRenewApplicationAndVerifyHistory("372.40");
    }

    public void verifyTheCancelThePolicy(String policyNumber) {
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
        common.pause(7);
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

    public void selectCatProductAndEnterPetDetails() {
        policyCreationScenariosPage.selectProduct("Cat");
        policyCreationScenariosPage.enterPetInformationCat(7);
    }

    public String selectPlanAndSaveQuoteAndGetTheQuoteNumber() {
        common.waitUntilVisibilityOfElement(superiorPlanCheckbox);
        common.jsClick(superiorPlanCheckbox);
        Log.info("Selected Superior plan");
        common.jsClick(planPopupCloseButton);
        common.jsClick(saveQuoteButton);
        Log.info("Click on the save quote button");

        common.waitUntilVisibilityOfElement(quoteNumberOnTheQuoteInformationPage);
        common.pause(1);

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheQuoteAndSaveApplicationByEnteringUWQuestions(String catQuoteNumber) {
        common.pause(2);
        common.jsClick(quoteIcon);
        common.waitUntilVisibilityOfElement(quoteNumberInputField);

        quoteNumberInputField.sendKeys(catQuoteNumber);
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
        common.jsClick(planPopupCloseButton);

        common.waitUntilVisibilityOfElement(coverStartDateInput);
        coverStartDateInput.clear();
        String coverStartDate = common.getPastDate(355, "dd.MM.yyyy");
        coverStartDateInput.sendKeys(coverStartDate);
        Log.info("Enter the cover start date: " + coverStartDate);
        common.pause(2);
        common.jsClick(assumptionYesRadioButton);
        common.jsClick(assumptionRadioYes);
        common.jsClick(informationConfirmCheckbox);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
        common.jsClick(saveApplicationButton);
        Log.info("Click on the save application");
        common.acceptAlert();
    }

    public String createPolicyByEditingSameQuoteOfCatAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilElementToBeClickable(calculateButton);
        common.jsClick(calculateButton);
        common.pause(2);
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(coverStartDateInput);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Policy: " + policyNumber);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "221.60", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        verifyLettersTitleAndEmailSendStatus();
        return policyNumber;
    }

    public void payTheInstallmentsUsingPayNowButtonInInstallmentTab() {
        common.waitUntilVisibilityOfElement(instalmentTab);
        common.jsClick(instalmentTab);
        common.waitUntilElementToBeClickable(payNowButtonOfSecondInstalment);
        common.jsClick(payNowButtonOfSecondInstalment);
        Log.info("Go to instalment tab and click on the pay now button");
        common.waitUntilVisibilityOfElement(cardTypeDropdownInPopup);
        common.jsClick(cardTypeDropdownInPopup);
        common.pause(1);
        common.jsClick(cardTypeVisa);
        userNameOnCardInputField.sendKeys("Test User");
        creditCardNumberInputField.sendKeys("4929421234600821");
        common.jsClick(cardExpiryMonthDropdownInPopup);
        common.jsClick(cardExpiryMonthJanOption);
        common.jsClick(cardExpiryYearDropdownInPopup);
        common.jsClick(cardExpiryYear2025Option);
        cvvInputField.sendKeys("356");
        commentInputField.sendKeys("Testing");
        common.jsClick(saveButton);
        Log.info("Enter credit card details and click on the save button");
        common.pause(2);
        String secondInstalmentStatus = secondInstalmentPaymentStatus.getText();
        Assert.assertEquals(secondInstalmentStatus, "Paid", "Payment status is not matching");
        Log.info("Verified the payment status as paid");
        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddEndorsementOfCatPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectPolicyEndorsementAndClickOnCalculateButton();
        common.waitUntilVisibilityOfElement(midpointPlan);
        common.jsClick(midpointPlan);
        Log.info("Changes premium plan to midpoint plan");
        common.jsClick(planPopupCloseButton);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(10);
        if (common.isElementDisplayed(policyEndorsementStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyEndorsementStatusOnThePolicyInformationPage);
            Assert.assertEquals(policyStatus, "Endorsement", "policy status is mismatched");
            Log.info("Verified the policy status after endorsement: " + policyStatus);
            common.pause(1);
        }
        driver.close();
        common.switchToWindow(0);
    }

    public void selectClaimCoverForCat(String cover) {
        common.waitUntilElementToBeClickable(claimCoverDropdown);
        common.pause(1);
        common.jsClick(claimCoverDropdown);
        common.pause(2);
        switch (cover) {
            case "Vet fees" -> common.jsClick(coverOptionVeterinaryFees);
            case "Alternative  treatment" -> common.jsClick(coverOptionAlternativeTreatment);
            case "Saying goodbye" -> common.jsClick(coverOptionSayingGoodbye);
            case "Emergency Repatriation" -> common.jsClick(coverOptionEmergencyRepatriation);
        }
        Log.info("Select claim cover from the cover dropdown");
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfCatPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForCat("Emergency Repatriation");
        enterClaimDetailsAndAddClaim("80");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "90.00", "Excess values are incorrect");
        selectLossCauseThirdOptionAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnThePolicyAndDeclineTheClaimForCat(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForExotic("Vet fees");
        enterClaimDetailsAndAddClaim("1000");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "90.00", "Excess values are incorrect");
        selectLossCauseThirdOptionAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        common.pause(1);
        Assert.assertEquals(claimStatus, "Pending", "claim status is not marching");
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
        Assert.assertEquals(claimStatus1, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void processClaimPaymentThroughTheChequePayment(String claimNumber) {
        accountPage.clickOnAccountIcon();
        common.jsClick(claimPaymentPrintChequeIconOnAccountPage);
        Log.info("Redirected to the account menu and click on Print Cheque icon");

        common.sendKeys(fromDateInputInPrintChequePage, common.getPastDate(10, "dd.MM.yyyy"));
        common.sendKeys(toDateInputInPrintChequePage, common.getFutureDate(10, "dd.MM.yyyy"));
        searchButtonInPrintChequePage.click();

        common.waitUntilPresenceOfElement("(//table[@id='tblGrid']//tbody//tr//td[2])[1]");
        String firstClaimNumberOnAccountPage = firstClaimOnClaimPaymentPrintCheque.getText();
        Assert.assertEquals(firstClaimNumberOnAccountPage, claimNumber);
        common.pause(1);
        firstClaimCheckboxOnPaymentEFT.click();
        common.pause(1);
        common.scrollToElement(firstClaimOnClaimPaymentPrintChequeCommentInput);

        firstClaimOnClaimPaymentPrintChequeCommentInput.sendKeys("Testing");

        common.jsClick(printChequeButton);
        common.acceptAlert();
        Log.info("Selected claim and click on the print cheque button");
        common.pause(2);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusSettled = claimStatusOnTheClaimInformationPage.getText();
        Log.info("Verified the claim status is: " + claimStatusSettled);
        Assert.assertEquals(claimStatusSettled, "Settled", "claim status is not matching");
        common.pause(1);
        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnThePolicyAndSettleTheClaimWithChequePayment(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForCat("Alternative  treatment");
        enterClaimDetailsAndAddClaim("250");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "90.00", "Excess values are incorrect");
        selectLossCauseThirdOptionAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        common.pause(1);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

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
        Assert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveTheClaimFromApproveClaimModule(claimNumber);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        Assert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);
        processClaimPaymentThroughTheChequePayment(claimNumber);
    }

    public void renewTheCatPolicyAndVerifyStatus(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectRenewPolicyOptionAndClickOnTheCalculateButton();

        common.waitUntilVisibilityOfElement(entryPlan);
        common.jsClick(entryPlan);
        common.jsClick(planPopupCloseButton);
        Log.info("Selected entry plan");
        common.waitUntilVisibilityOfElement(cardHolderName);
        cardHolderName.sendKeys("Test User");
        policyCreditCardNumber.sendKeys("4929421234600821");
        common.jsClick(cardExpiryMonthDropdownInRenew);
        common.jsClick(cardExpiryMonthJanOptionInRenew);
        common.jsClick(cardExpiryYearDropdownInRenew);
        common.jsClick(cardExpiryYear2025OptionInRenew);
        policyCreditCardCVV.sendKeys("356");

        saveRenewApplicationAndVerifyHistory("143.20");
    }

//    Verify the end to end scenario of the Dog

    public void clickOnAddQuoteButtonAndEnterClientDetailsForDogQuote(int row, String product) {
        XSSFSheet sheet = common.readDataFromExcelSheet(product);
        policyCreationScenariosPage.clickOnAddQuoteButton();
        policyCreationScenariosPage.enterClientContactInformation(row, sheet);
    }

    public void selectDogProductAndEnterPetDetails() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Dog");
        policyCreationScenariosPage.selectProduct("Dog");
        policyCreationScenariosPage.enterPetInformationDog(11, sheet);
    }

    public String selectDogPlanAndSaveTheQuoteAndGetQuoteNumber() {
        common.waitUntilVisibilityOfElement(keyPlanCheckbox);
        common.jsClick(keyPlanCheckbox);
        Select keyDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_25']")));
        keyDrpDown.selectByVisibleText("90% + £120");
        common.jsClick(optionExtraDayToDayCareForDog);
        Log.info("Selected Key plan of 90% £12O excess and Day to dya care optional extra");
        common.pause(1);
        common.jsClick(planPopupCloseButton);
        common.jsClick(saveQuoteButton);
        Log.info("Click on the save quote button");

        common.waitUntilVisibilityOfElement(quoteNumberOnTheQuoteInformationPage);
        common.pause(2);

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheDogQuoteAndSaveApplicationByEnteringUWQuestions(String catQuoteNumber) {
        common.pause(2);
        common.jsClick(quoteIcon);
        common.waitUntilVisibilityOfElement(quoteNumberInputField);

        quoteNumberInputField.sendKeys(catQuoteNumber);
        searchButton.click();
        common.pause(2);
        firstRowQuoteNumber.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilInvisibilityOfElement(cogMenuOnQuoteInformationPage);
        common.switchToWindow(1);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(1);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");

        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(calculateButton);
        common.pause(1);
        common.jsClick(calculateButton);

        common.waitUntilVisibilityOfElement(keyPlanCheckbox);
        Assert.assertTrue(keyPlanCheckbox.isSelected());
        common.waitUntilVisibilityOfElement(planPopupCloseButton);
        common.jsClick(planPopupCloseButton);

        common.waitUntilVisibilityOfElement(coverStartDateInput);
        coverStartDateInput.clear();
        String coverStartDate = common.getPastDate(350, "dd.MM.yyyy");
        coverStartDateInput.sendKeys(coverStartDate);
        Log.info("Enter the cover start date: " + coverStartDate);

        String petMicrochipNumber = common.generateRandomNumber(5);
        petMicrochipNumberInput.sendKeys(petMicrochipNumber);
        Log.info("Enter the pet microchip number: " + petMicrochipNumber);

        common.jsClick(petAssumption1ForDog);
        common.jsClick(petAssumption2ForDog);
        common.jsClick(petAssumption3ForDog);

        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
        common.jsClick(saveApplicationButton);
        Log.info("Click on the save application");
        common.acceptAlert();
    }

    public String createPolicyByEditingTheDogQuoteNumberAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilElementToBeClickable(calculateButton);
        common.jsClick(calculateButton);
        common.pause(2);
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(coverStartDateInput);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Dog policy with the number : " + policyNumber);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "2,127.07", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        verifyLettersTitleAndEmailSendStatus();
        return policyNumber;
    }

    public void clickOnTheCogIconAndAddEndorsementOfDogPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectPolicyEndorsementAndClickOnCalculateButton();
        common.waitUntilVisibilityOfElement(vitalPlanCheckbox);
        common.jsClick(vitalPlanCheckbox);
        Select vitalDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_23']")));
        vitalDrpDown.selectByVisibleText("90% + £120");
        Log.info("Changes Key 90% 120 Excess plan to Vital 90% 120 Excess plan");
        common.waitUntilElementToBeClickable(planPopupCloseButton);
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(coverStartDateInput);
        common.waitUntilElementToBeClickable(endorsementSaveButton);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(10);
        if (common.isElementDisplayed(policyEndorsementStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyEndorsementStatusOnThePolicyInformationPage);
            Assert.assertEquals(policyStatus, "Endorsement", "policy status is mismatched");
            Log.info("Verified the policy status after endorsement: " + policyStatus);
            common.pause(1);
        }
        driver.close();
        common.switchToWindow(0);
    }

    public void selectClaimCoverForDog(String cover) {
        common.waitUntilElementToBeClickable(claimCoverDropdown);
        common.pause(1);
        common.jsClick(claimCoverDropdown);
        common.pause(3);
        switch (cover) {
            case "Vet fees" -> common.jsClick(coverOptionVeterinaryFees);
            case "Day to Day care" -> common.jsClick(coverOptionDayToDayCare);
            case "Saying goodbye" -> common.jsClick(coverOptionSayingGoodbye);
            case "Third party liability" -> common.jsClick(coverOptionThirdPartyLiability);
        }
        Log.info("Select claim cover from the cover dropdown: " + cover);
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfDogPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForDog("Vet fees");
        enterClaimDetailsAndAddClaim("80");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "124.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheDogPolicyAndDeclineTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForDog("Saying goodbye");
        enterClaimDetailsAndAddClaim("400");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "148.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        common.pause(1);
        Assert.assertEquals(claimStatus, "Pending", "claim status is not matching");
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
        Assert.assertEquals(claimStatus1, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheDogPolicyAndSettleTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForDog("Third party liability");
        enterClaimDetailsAndAddClaim("500");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "250", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

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
        Assert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveTheClaimFromApproveClaimModule(claimNumber);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        Assert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);

        processElectronicFundTransferFromAccountMenu(claimNumber);
    }

    public void renewTheDogPolicyAndVerifyTheStatus(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectRenewPolicyOptionAndClickOnTheCalculateButton();

        common.waitUntilVisibilityOfElement(corePlanCheckbox);
        common.jsClick(corePlanCheckbox);
        Select coreDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_22']")));
        coreDrpDown.selectByVisibleText("90% + £120");
        Log.info("Selected midrange core plan");

        saveRenewApplicationAndVerifyHistory("1,247.14");
    }


//    Verify the end to end scenario of the Horse

    public void clickOnAddQuoteButtonAndEnterClientDetailsForHorseQuote(int row, String product) {
        XSSFSheet sheet = common.readDataFromExcelSheet(product);
        policyCreationScenariosPage.clickOnAddQuoteButton();
        policyCreationScenariosPage.enterClientContactInformation(row, sheet);
    }

    public void selectHorseProductAndEnterPetInformation() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        policyCreationScenariosPage.selectProduct("Horse");
        policyCreationScenariosPage.selectHorsePolicyDetails(2, sheet);
    }

    public String selectHorseBasicInsurancePlanWithOptionalExtrasAndSaveQuote() {
        common.waitUntilVisibilityOfElement(horseInsuranceBasicPlanCheckbox);
        boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
        Assert.assertTrue(basicPlanIsDefaultSelected);
        common.jsClick(disposalOptionalExtraCheckbox);
        common.jsClick(veterinaryFeeOptionalExtraCheckbox);
        common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
        common.jsClick(personalAccidentOptionalExtraCheckbox);
        common.jsClick(permanentLossOfUseOptionalExtraCheckbox);
        common.acceptAlert();
        common.jsClick(permanentLossOfUseOkButton);

//        common.jsClick(saddleryAndTackOptionalExtraCheckbox);
//        common.pause(1);
//        String saddleryAndTackValue = "9000";
//        common.sendKeys(saddleryAndTackValueInputField, saddleryAndTackValue);
//        saveButtonSaddleryAndTack.click();
//        common.pause(1);
//
//        common.jsClick(horseTrailerAndDrawnVehiclesOptionalExtraCheckbox);
//        common.pause(1);
//        String horseTrailerAndDrownVehicleValue = "15000";
//        common.sendKeys(horseTrailersAndHorseDrawnVehicleValueInputField, horseTrailerAndDrownVehicleValue);
//        saveButtonHorseTrailersOrDrawnVehicles.click();
//        common.pause(1);

        common.jsClick(planPopupCloseButton);
        common.jsClick(saveQuoteButton);
        Log.info("Click on the save quote button");

        common.waitUntilVisibilityOfElement(quoteNumberOnTheQuoteInformationPage);
        common.pause(2);

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheHorseQuoteAndSaveApplicationByEnteringUWQuestions(String horseQuoteNumber) {
        common.pause(2);
        common.jsClick(quoteIcon);
        common.waitUntilVisibilityOfElement(quoteNumberInputField);

        quoteNumberInputField.sendKeys(horseQuoteNumber);
        searchButton.click();
        common.pause(2);
        firstRowQuoteNumber.click();
        common.pause(2);
        common.switchToWindow(1);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(1);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.pause(10);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(horseInsuranceBasicPlanCheckbox);
        Assert.assertTrue(horseInsuranceBasicPlanCheckbox.isSelected());
        common.waitUntilVisibilityOfElement(planPopupCloseButton);
        common.jsClick(planPopupCloseButton);

        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        coverStartDateOfHorse.clear();
        String coverStartDate = common.getPastDate(330, "dd.MM.yyyy");
        coverStartDateOfHorse.sendKeys(coverStartDate);
        Log.info("Enter the cover start date: " + coverStartDate);

        horseColourDropDown.click();
        common.pause(1);
        horseColourOption.click();
        Log.info("Select Horse colour from the dropdown");

        horseSexDropDown.click();
        common.pause(1);
        horseSexColtOption.click();
        Log.info("Select Horse Sex from the dropdown");

        common.pause(1);
        horseHeightDropDown.click();
        common.pause(1);
        horseHeightOption.click();
        Log.info("Select Horse Height from the dropdown");

//        common.jsClick(saddleryAndTackValuedOver200NoRadio);
//        common.jsClick(saddleryAndTackValuedUnder200NoRadio);
//        common.jsClick(saddleryAndTackHaveAnyDamageNoRadio);
//
//        String vehicleMake = "Test Manufacturer";
//        vehicleMakeInputField.sendKeys(vehicleMake);
//
//        String vehicleModel = "Test model";
//        vehicleModelInputField.sendKeys(vehicleModel);
//
//        String vehicleSerialOrVINOrChassisNumber = "Test chassis number";
//        vehicleSerialOrVINOrChassisNumberInputField.sendKeys(vehicleSerialOrVINOrChassisNumber);
//
//        String vehicleManufactureYear = "Test year";
//        vehicleManufacturerInputField.sendKeys(vehicleManufactureYear);
//
//        common.pause(1);
//        noOfHorseDropdown.click();
//        common.pause(1);
//        noOfHorseIs4Option.click();
//        common.pause(1);
//
//        common.jsClick(vehicleIsRoadWorthyYesRadio);
//        common.jsClick(vehicleHaveAnyDamageNoRadio);
//        common.jsClick(vehicleHaveAnyNonStandardModificationNoRadio);

        common.pause(1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton2);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton3);
        Log.info("Selected the horse assumptions UW questions");

        common.pause(2);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();

        common.jsClick(saveApplicationButton);
        Log.info("Click on the save application");
        common.acceptAlert();
    }

    public String createPolicyByEditingTheHorseQuoteNumberAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.pause(10);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Horse policy with the number : " + policyNumber);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "728.47", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        verifyLettersTitleAndEmailSendStatus();
        return policyNumber;
    }

    public void clickOnTheCogIconAndAddEndorsementOfHorsePolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectPolicyEndorsementAndClickOnCalculateButton();
        common.jsClick(disposalOptionalExtraCheckbox);
        Log.info("Removed disposal optional extra");
        common.jsClick(planPopupCloseButton);
        common.waitUntilElementToBeClickable(endorsementSaveButton);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(5);
        if (common.isElementDisplayed(policyEndorsementStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyEndorsementStatusOnThePolicyInformationPage);
            Assert.assertEquals(policyStatus, "Endorsement", "policy status is mismatched");
            Log.info("Verified the policy status after endorsement: " + policyStatus);
            common.pause(1);
        }
        driver.close();
        common.switchToWindow(0);
    }

    public void selectClaimCoverForHorse(String cover) {
        common.waitUntilElementToBeClickable(claimCoverDropdown);
        common.pause(1);
        common.jsClick(claimCoverDropdown);
        common.pause(3);
        switch (cover) {
            case "Death From Illness" -> common.jsClick(coverOptionDeathFromIllnessOfHorse);
            case "Death From Injury" -> common.jsClick(coverOptionDeathFromInjuryOfHorse);
            case "Veterinary fees" -> common.jsClick(coverOptionVeterinaryOfHorse);
            case "Personal Accident" -> common.jsClick(coverOptionPersonalAccidentOfHorse);
            case "Third party liability" -> common.jsClick(coverOptionThirdPartyLiabilityOfHorse);
            case "Loss from theft" -> common.jsClick(coverOptionLossFromTheftOfHorse);
            case "Saddlery and Tack" -> common.jsClick(coverOptionSaddleryAndTackOfHorse);
            case "Horse trailer" -> common.jsClick(coverOptionHorseTrailerAndDrownVehicle);
        }
        Log.info("Select claim cover from the cover dropdown: " + cover);
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfHorsePolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Third party liability");
        enterClaimDetailsAndAddClaim("100");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "250.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheHorsePolicyAndDeclineTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Death From Illness");
        enterClaimDetailsAndAddClaim("1400");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        common.pause(1);
        Assert.assertEquals(claimStatus, "Pending", "claim status is not marching");
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
        Assert.assertEquals(claimStatus1, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheHorsePolicyAndSettleTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Veterinary fees");
        enterClaimDetailsAndAddClaim("2000");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "500.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

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
        Assert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveTheClaimFromApproveClaimModule(claimNumber);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        Assert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);

        processElectronicFundTransferFromAccountMenu(claimNumber);
    }

    public void renewTheHorsePolicyAndVerifyTheStatus(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectRenewPolicyOptionAndClickOnTheCalculateButton();

        common.waitUntilElementToBeClickable(disposalOptionalExtraCheckboxOnRenewCoverTable);
        common.jsClick(disposalOptionalExtraCheckboxOnRenewCoverTable);
        Log.info("Added disposal optional extra");

        saveRenewApplicationAndVerifyHistory("728.47");
    }

//    Verify the end to end scenario of the Senior Horse

    public void clickOnAddQuoteButtonAndEnterClientDetailsForSeniorHorseQuote(int row, String product) {
        XSSFSheet sheet = common.readDataFromExcelSheet(product);
        policyCreationScenariosPage.clickOnAddQuoteButton();
        policyCreationScenariosPage.enterClientContactInformation(row, sheet);
    }

    public void selectHorseProductAndEnterPetInformationOfSeniorHorse() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        policyCreationScenariosPage.selectProduct("Horse");
        policyCreationScenariosPage.selectHorsePolicyDetails(22, sheet);
    }

    public String selectSeniorHorseBInsurancePlanWithOptionalExtrasAndSaveQuote() {
        common.waitUntilVisibilityOfElement(seniorHorseInsurancePlanBCheckbox);
        common.jsClick(seniorHorseInsurancePlanBCheckbox);
        boolean basicPlanIsDefaultSelected = seniorHorseInsurancePlanBCheckbox.isSelected();
        Assert.assertTrue(basicPlanIsDefaultSelected);
        common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
        common.jsClick(personalAccidentOptionalExtraCheckbox);

        common.jsClick(saddleryAndTackOptionalExtraCheckbox);
        common.pause(1);
        String saddleryAndTackValue = "9000";
        common.sendKeys(saddleryAndTackValueInputField, saddleryAndTackValue);
        saveButtonSaddleryAndTack.click();
        common.pause(1);

        common.jsClick(horseTrailerAndDrawnVehiclesOptionalExtraCheckbox);
        common.pause(1);
        String horseTrailerAndDrownVehicleValue = "15000";
        common.sendKeys(horseTrailersAndHorseDrawnVehicleValueInputField, horseTrailerAndDrownVehicleValue);
        saveButtonHorseTrailersOrDrawnVehicles.click();
        common.pause(1);

        common.jsClick(planPopupCloseButton);
        common.jsClick(saveQuoteButton);
        Log.info("Click on the save quote button");

        common.waitUntilVisibilityOfElement(quoteNumberOnTheQuoteInformationPage);
        common.pause(2);

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(String horseQuoteNumber) {
        common.pause(2);
        common.jsClick(quoteIcon);
        common.waitUntilVisibilityOfElement(quoteNumberInputField);

        quoteNumberInputField.sendKeys(horseQuoteNumber);
        searchButton.click();
        common.pause(2);
        firstRowQuoteNumber.click();
        common.pause(2);
        common.switchToWindow(1);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(1);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.pause(10);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(seniorHorseInsurancePlanBCheckbox);
        Assert.assertTrue(seniorHorseInsurancePlanBCheckbox.isSelected());
        common.waitUntilVisibilityOfElement(planPopupCloseButton);
        common.jsClick(planPopupCloseButton);

        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        coverStartDateOfHorse.clear();
        String coverStartDate = common.getPastDate(330, "dd.MM.yyyy");
        coverStartDateOfHorse.sendKeys(coverStartDate);
        Log.info("Enter the cover start date: " + coverStartDate);

        horseColourDropDown.click();
        common.pause(1);
        horseColourOption.click();
        Log.info("Select Horse colour from the dropdown");

        horseSexDropDown.click();
        common.pause(1);
        horseSexColtOption.click();
        Log.info("Select Horse Sex from the dropdown");

        common.pause(1);
        horseHeightDropDown.click();
        common.pause(1);
        horseHeightOption.click();
        Log.info("Select Horse Height from the dropdown");

        common.jsClick(saddleryAndTackValuedOver200NoRadio);
        common.jsClick(saddleryAndTackValuedUnder200NoRadio);
        common.jsClick(saddleryAndTackHaveAnyDamageNoRadio);

        String vehicleMake = "Test Manufacturer";
        vehicleMakeInputField.sendKeys(vehicleMake);

        String vehicleModel = "Test model";
        vehicleModelInputField.sendKeys(vehicleModel);

        String vehicleSerialOrVINOrChassisNumber = "Test chassis number";
        vehicleSerialOrVINOrChassisNumberInputField.sendKeys(vehicleSerialOrVINOrChassisNumber);

        String vehicleManufactureYear = "Test year";
        vehicleManufacturerInputField.sendKeys(vehicleManufactureYear);

        common.pause(1);
        noOfHorseDropdown.click();
        common.pause(1);
        noOfHorseIs4Option.click();
        common.pause(1);

        common.jsClick(vehicleIsRoadWorthyYesRadio);
        common.jsClick(vehicleHaveAnyDamageNoRadio);
        common.jsClick(vehicleHaveAnyNonStandardModificationNoRadio);

        common.pause(1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton2);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton3);
        Log.info("Selected the horse assumptions UW questions");

        common.pause(2);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();

        common.jsClick(saveApplicationButton);
        Log.info("Click on the save application");
        common.acceptAlert();
    }

    public String createPolicyByEditingTheSeniorHorseQuoteNumberAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.pause(10);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Senior Horse policy with the number : " + policyNumber);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "592.35", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        verifyLettersTitleAndEmailSendStatus();
        return policyNumber;
    }

    public void clickOnTheCogIconAndAddEndorsementOnSeniorHorsePolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectPolicyEndorsementAndClickOnCalculateButton();
        common.pause(5);
        common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
        Log.info("Removed third party liability optional extra");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(endorsementSaveButton);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(5);
        if (common.isElementDisplayed(policyEndorsementStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyEndorsementStatusOnThePolicyInformationPage);
            Assert.assertEquals(policyStatus, "Endorsement", "policy status is mismatched");
            Log.info("Verified the policy status after endorsement: " + policyStatus);
            common.pause(1);
        }
        driver.close();
        common.switchToWindow(0);
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfSeniorHorsePolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Death From Injury");
        enterClaimDetailsAndAddClaim("100");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheSeniorHorsePolicyAndDeclineTheClaimByAdminUser(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Veterinary fees");
        enterClaimDetailsAndAddClaim("1400");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "150.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatusPending = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatusPending);
        common.pause(1);
        Assert.assertEquals(claimStatusPending, "Pending", "claim status is not declined");
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
        String claimStatusDecline = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusDecline);
        Assert.assertEquals(claimStatusDecline, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheSeniorHorsePolicyAndSettleTheClaimWithChequePayment(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Loss from theft");
        enterClaimDetailsAndAddClaim("1500");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        common.pause(1);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

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
        Assert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveTheClaimFromApproveClaimModule(claimNumber);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        Assert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);

        processClaimPaymentThroughTheChequePayment(claimNumber);
    }

    public void renewTheSeniorHorsePolicyAndVerifyTheStatus(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectRenewPolicyOptionAndClickOnTheCalculateButton();
        common.pause(5);
        common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
        Log.info("Added third party liability optional extra");
        common.jsClick(planPopupCloseButton);
        Log.info("Selected entry plan");
        common.waitUntilVisibilityOfElement(cardHolderName);
        cardHolderName.sendKeys("Test User");
        policyCreditCardNumber.sendKeys("4929421234600821");
        common.jsClick(cardExpiryMonthDropdownInRenew);
        common.jsClick(cardExpiryMonthJanOptionInRenew);
        common.jsClick(cardExpiryYearDropdownInRenew);
        common.jsClick(cardExpiryYear2025OptionInRenew);
        policyCreditCardCVV.sendKeys("356");
        saveRenewApplicationAndVerifyHistory("592.35");
    }

//    Verify the end to end scenario of the Senior Horse

    public void clickOnAddQuoteButtonAndEnterClientDetailsOfHorseLiability(int row, String product) {
        XSSFSheet sheet = common.readDataFromExcelSheet(product);
        policyCreationScenariosPage.clickOnAddQuoteButton();
        policyCreationScenariosPage.enterClientContactInformation(row, sheet);
    }

    public void selectHorseProductAndEnterPetInformationOfHorseLiability() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        policyCreationScenariosPage.selectProduct("Horse");
        policyCreationScenariosPage.selectHorsePolicyDetails(28, sheet);
    }

    public String verifyTheHorseLiabilityPlanIsSelectedAndSaveQuoteAndGetQuoteNumber() {
        common.waitUntilVisibilityOfElement(horseLiabilityCoverPlanCheckbox);
        boolean basicPlanIsDefaultSelected = horseLiabilityCoverPlanCheckbox.isSelected();
        Assert.assertTrue(basicPlanIsDefaultSelected);
        Log.info("Verified the horse liability plan checkbox is selected");
        common.jsClick(horseLiabilityCover1MRadioButton);

        common.jsClick(planPopupCloseButton);
        common.jsClick(saveQuoteButton);
        Log.info("Click on the save quote button");

        common.waitUntilVisibilityOfElement(quoteNumberOnTheQuoteInformationPage);
        common.pause(2);

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheLiabilityQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(String liabilityQuoteNumber) {
        common.pause(2);
        common.jsClick(quoteIcon);
        common.waitUntilVisibilityOfElement(quoteNumberInputField);

        quoteNumberInputField.sendKeys(liabilityQuoteNumber);
        searchButton.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        firstRowQuoteNumber.click();
        common.switchToWindow(1);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(1);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(horseLiabilityCoverPlanCheckbox);
        Assert.assertTrue(horseLiabilityCoverPlanCheckbox.isSelected());
        common.waitUntilVisibilityOfElement(planPopupCloseButton);
        common.jsClick(planPopupCloseButton);

        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        coverStartDateOfHorse.clear();
        String coverStartDate = common.getPastDate(330, "dd.MM.yyyy");
        coverStartDateOfHorse.sendKeys(coverStartDate);
        Log.info("Enter the cover start date: " + coverStartDate);

        horseColourDropDownOfLiability.click();
        common.pause(1);
        horseColourOptionOfLiability.click();
        Log.info("Select Horse colour from the dropdown");

        horseSexDropDownOfLiability.click();
        common.pause(1);
        horseSexColtOptionOfLiability.click();
        Log.info("Select Horse Sex from the dropdown");

        common.pause(1);
        horseHeightDropDownOfLiability.click();
        common.pause(1);
        horseHeightOptionOfLiability.click();
        Log.info("Select Horse Height from the dropdown");

        common.pause(1);
        common.jsClick(horseLiabilityAssumptionRadioYesButton1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton2);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton3);
        Log.info("Selected the horse assumptions UW questions");

        common.pause(2);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();

        common.jsClick(saveApplicationButton);
        Log.info("Click on the save application");
        common.acceptAlert();
    }

    public String createPolicyByEditingTheHorseLiabilityQuoteNumberAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Horse liability policy with the number : " + policyNumber);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "54.60", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        verifyLettersTitleAndEmailSendStatus();
        return policyNumber;
    }

    public void clickOnTheCogIconAndAddEndorsementOnHorseLiabilityPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectPolicyEndorsementAndClickOnCalculateButton();
        common.pause(5);

        common.jsClick(horseLiabilityCover2MRadioButton);
        Log.info("Changed the Horse liability cover value to the 2M");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(endorsementSaveButton);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(5);
        if (common.isElementDisplayed(policyEndorsementStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyEndorsementStatusOnThePolicyInformationPage);
            Assert.assertEquals(policyStatus, "Endorsement", "policy status is mismatched");
            Log.info("Verified the policy status after endorsement: " + policyStatus);
            common.pause(1);
        }

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "74.20", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        driver.close();
        common.switchToWindow(0);
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfHorseLiabilityPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Third party liability");
        enterClaimDetailsAndAddClaim("100");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "250.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheHorseLiabilityPolicyAndDeclineTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Third party liability");
        enterClaimDetailsAndAddClaim("1400");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "250.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        common.pause(1);
        Assert.assertEquals(claimStatus, "Pending", "claim status is not marching");
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
        Assert.assertEquals(claimStatus1, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheHorseLiabilityPolicyAndSettleTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Third party liability");
        enterClaimDetailsAndAddClaim("2000");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "250.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

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
        Assert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveTheClaimFromApproveClaimModule(claimNumber);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        Assert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);

        processElectronicFundTransferFromAccountMenu(claimNumber);
    }

    public void renewTheHorseLiabilityPolicyAndVerifyTheStatus(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectRenewPolicyOptionAndClickOnTheCalculateButton();

        common.jsClick(horseLiabilityCover1MRadioButton);
        Log.info("Changed the Horse liability cover value to the 1M");
        common.jsClick(planPopupCloseButton);

        saveRenewApplicationAndVerifyHistory("54.60");
    }

    //    Verify the end to end scenario of the Horse Saddlery and Tack

    public void clickOnAddQuoteButtonAndEnterClientDetailsOfHorseSaddleryAndTack(int row, String product) {
        XSSFSheet sheet = common.readDataFromExcelSheet(product);
        policyCreationScenariosPage.clickOnAddQuoteButton();
        policyCreationScenariosPage.enterClientContactInformation(row, sheet);
    }

    public void selectHorseSaddleryAndTackProduct() {
        policyCreationScenariosPage.selectProduct("Horse");
        common.waitUntilVisibilityOfElement(horseSaddleryAndTrackRadioButton);
        horseSaddleryAndTrackRadioButton.click();
        Log.info("User selects Horse Saddlery and Tack option");
        common.pause(2);
    }

    public String enterHorseSaddleryCurrentMarketValueAndSaveQuote(int dataRow) {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        common.waitUntilVisibilityOfElement(horseSaddleryAndTrackValueInputField);
        XSSFRow row = sheet.getRow(dataRow);
        String saddleryCurrentMarketValue = row.getCell(18).getStringCellValue();
        horseSaddleryAndTrackValueInputField.sendKeys(saddleryCurrentMarketValue);
        common.jsClick(calculateButton);

        Assert.assertTrue(horseSaddleryAndTackPlanCheckbox.isSelected());
        common.jsClick(planPopupCloseButton);
        Log.info("Clicked on calculate button and verify horse saddlery plan is selected");
        common.waitUntilElementToBeClickable(saveQuoteButton);
        common.jsClick(saveQuoteButton);
        Log.info("Clicked on the save quote button");

        common.waitUntilVisibilityOfElement(quoteNumberOnTheQuoteInformationPage);
        common.pause(2);

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheSaddleryQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(String saddleryQuoteNumber) {
        common.pause(2);
        common.jsClick(quoteIcon);
        common.waitUntilVisibilityOfElement(quoteNumberInputField);

        quoteNumberInputField.sendKeys(saddleryQuoteNumber);
        searchButton.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        firstRowQuoteNumber.click();
        common.switchToWindow(1);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(1);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(horseSaddleryAndTackPlanCheckbox);
        Assert.assertTrue(horseSaddleryAndTackPlanCheckbox.isSelected());
        common.waitUntilVisibilityOfElement(planPopupCloseButton);
        common.jsClick(planPopupCloseButton);

        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        coverStartDateOfHorse.clear();
        String coverStartDate = common.getPastDate(330, "dd.MM.yyyy");
        coverStartDateOfHorse.sendKeys(coverStartDate);
        Log.info("Enter the cover start date: " + coverStartDate);

//        common.jsClick(saddleryAndTackValuedOver200NoRadio);
//        common.jsClick(saddleryAndTackValuedUnder200NoRadio);
//        common.jsClick(saddleryAndTackHaveAnyDamageNoRadio);

        common.pause(1);
        driver.findElement(By.cssSelector("input[id='Question_33442_45577']")).click();
//        common.jsClick(horseLiabilityAssumptionRadioYesButton1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton2);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton3);
        Log.info("Selected the Saddlery and tack assumptions UW questions");

        common.pause(2);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();

        common.jsClick(saveApplicationButton);
        Log.info("Click on the save application");
        common.acceptAlert();
    }

    public String createPolicyByEditingTheHorseSaddleryQuoteNumberAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Horse saddlery policy with the number : " + policyNumber);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "209.92", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        verifyLettersTitleAndEmailSendStatus();
        return policyNumber;
    }

    public void clickOnTheCogIconAndAddEndorsementOnHorseSaddleryAndTackPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addEndorsementOption);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        Log.info("Select add Endorsement from the cog dropdown");
        common.pause(5);

        common.waitUntilVisibilityOfElement(horseSaddleryAndTrackValueInputField);
        horseSaddleryAndTrackValueInputField.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
        common.pause(1);
        String saddleryCurrentMarketValue = "9000";
        horseSaddleryAndTrackValueInputFieldEndorsement.sendKeys(saddleryCurrentMarketValue);
        common.jsClick(calculateButton);

        common.pause(2);
        Assert.assertTrue(horseSaddleryAndTackPlanCheckbox.isSelected());
        Log.info("Changed the Horse saddlery market value and click on calculate button");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(endorsementSaveButton);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(5);
        if (common.isElementDisplayed(policyEndorsementStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyEndorsementStatusOnThePolicyInformationPage);
            Assert.assertEquals(policyStatus, "Endorsement", "policy status is mismatched");
            Log.info("Verified the policy status after endorsement: " + policyStatus);
            common.pause(1);
        }

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "182.93", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        driver.close();
        common.switchToWindow(0);
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfHorseSaddleryPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Saddlery and Tack");
        enterClaimDetailsAndAddClaim("100");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Declined", "claim status is not declined");
        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheHorseSaddleryPolicyAndDeclineTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Saddlery and Tack");
        enterClaimDetailsAndAddClaim("1400");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        common.pause(1);
        Assert.assertEquals(claimStatus, "Pending", "claim status is not marching");
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
        Assert.assertEquals(claimStatus1, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheHorseSaddleryPolicyAndSettleTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Saddlery and Tack");
        enterClaimDetailsAndAddClaim("2000");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

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
        Assert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveTheClaimFromApproveClaimModule(claimNumber);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        Assert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);

        processClaimPaymentThroughTheChequePayment(claimNumber);
    }

    public void renewTheHorseSaddleryPolicyAndVerifyTheStatus(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(renewPolicyOption);
        Log.info("Selected renew policy option from the policy information page");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);

        common.waitUntilVisibilityOfElement(horseSaddleryAndTrackValueInputField);
        horseSaddleryAndTrackValueInputField.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
        common.pause(1);
        String saddleryCurrentMarketValue = "12000";
        horseSaddleryAndTrackValueInputFieldEndorsement.sendKeys(saddleryCurrentMarketValue);
        common.pause(2);
        common.jsClick(calculateButton);
        Log.info("Entered saddlery market value and click on the calculate button");

        common.pause(2);
        Assert.assertTrue(horseSaddleryAndTackPlanCheckbox.isSelected());
        common.pause(3);
        Log.info("Changed the Horse saddlery market value and click on calculate button");
        common.jsClick(planPopupCloseButton);
        common.pause(3);
        common.waitUntilVisibilityOfElement(cardTypeDropDown);
        cardTypeDropDown.click();
        common.pause(1);
        common.jsClick(cardTypeVisaRenew);
        common.waitUntilVisibilityOfElement(cardHolderName);
        cardHolderName.sendKeys("Test User");
        policyCreditCardNumber.sendKeys("4929421234600821");
        common.jsClick(cardExpiryMonthDropdownInRenew);
        common.jsClick(cardExpiryMonthJanOptionInRenew);
        common.jsClick(cardExpiryYearDropdownInRenew);
        common.jsClick(cardExpiryYear2025OptionInRenew);
        policyCreditCardCVV.sendKeys("356");
        saveRenewApplicationAndVerifyHistory("222.10");
    }

    //    Verify the end to end scenario of the Horse Trailer and Drown vehicle

    public void clickOnAddQuoteButtonAndEnterClientDetailsForTheHorseTrailerAndDrownVehicle(int row, String product) {
        XSSFSheet sheet = common.readDataFromExcelSheet(product);
        policyCreationScenariosPage.clickOnAddQuoteButton();
        policyCreationScenariosPage.enterClientContactInformation(row, sheet);
    }

    public void selectHorseTrailerAndDrownVehicleProduct() {
        policyCreationScenariosPage.selectProduct("Horse");
        common.waitUntilVisibilityOfElement(horseTrailerAndDrownVehicleRadioButton);
        horseTrailerAndDrownVehicleRadioButton.click();
        Log.info("User selects Horse Trailer and Drown vehicle option");
        common.pause(2);
    }

    public String enterHorseTrailerCurrentMarketValueAndSaveQuote(int dataRow) {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        common.waitUntilVisibilityOfElement(horseTrailerValueInputField);
        XSSFRow row = sheet.getRow(dataRow);
        String trailerCurrentMarketValue = row.getCell(18).getStringCellValue();
        horseTrailerValueInputField.sendKeys(trailerCurrentMarketValue);
        common.jsClick(calculateButton);

        Assert.assertTrue(horseTrailerAndDrawnVehiclePlanCheckbox.isSelected());
        common.jsClick(planPopupCloseButton);
        Log.info("Clicked on calculate button and verify horse trailer plan is selected");
        common.waitUntilElementToBeClickable(saveQuoteButton);
        common.jsClick(saveQuoteButton);
        Log.info("Clicked on the save quote button");

        common.waitUntilVisibilityOfElement(quoteNumberOnTheQuoteInformationPage);
        common.pause(2);

        String quoteNumber = quoteNumberOnTheQuoteInformationPage.getText();
        Log.info("Saved quote number: " + quoteNumber);
        return quoteNumber;
    }

    public void editTheHorseTrailerQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(String horseTrailerQuoteNumber) {
        common.pause(2);
        common.jsClick(quoteIcon);
        common.waitUntilVisibilityOfElement(quoteNumberInputField);

        quoteNumberInputField.sendKeys(horseTrailerQuoteNumber);
        searchButton.click();
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        firstRowQuoteNumber.click();
        common.switchToWindow(1);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(1);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");

        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(horseTrailerAndDrawnVehiclePlanCheckbox);
        Assert.assertTrue(horseTrailerAndDrawnVehiclePlanCheckbox.isSelected());
        common.waitUntilVisibilityOfElement(planPopupCloseButton);
        common.jsClick(planPopupCloseButton);

        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        coverStartDateOfHorse.clear();
        String coverStartDate = common.getPastDate(330, "dd.MM.yyyy");
        coverStartDateOfHorse.sendKeys(coverStartDate);
        Log.info("Enter the cover start date: " + coverStartDate);

//        String vehicleMake = "Test Manufacturer";
//        vehicleMakeInputField.sendKeys(vehicleMake);
//
//        String vehicleModel = "Test model";
//        vehicleModelInputField.sendKeys(vehicleModel);
//
//        String vehicleSerialOrVINOrChassisNumber = "Test chassis number";
//        vehicleSerialOrVINOrChassisNumberInputField.sendKeys(vehicleSerialOrVINOrChassisNumber);
//
//        String vehicleManufactureYear = "Test year";
//        vehicleManufacturerInputField.sendKeys(vehicleManufactureYear);
//
//        common.pause(1);
//        noOfHorseDropdown.click();
//        common.pause(1);
//        noOfHorseIs4Option.click();
//        common.pause(1);
//
//        common.jsClick(vehicleIsRoadWorthyYesRadio);
//        common.jsClick(vehicleHaveAnyDamageNoRadio);
//        common.jsClick(vehicleHaveAnyNonStandardModificationNoRadio);
//
//        common.pause(1);
//        common.jsClick(horseStatementsTrueOrNotYesRadioButton2);
//        common.jsClick(horseStatementsTrueOrNotYesRadioButton3);

        common.pause(1);
        driver.findElement(By.cssSelector("input[id='Question_33442_45577']")).click();
        common.jsClick(horseStatementsTrueOrNotYesRadioButton2);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton3);
        Log.info("Selected the Horse Trailer and Drown vehicle assumptions UW questions");

        common.pause(2);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();

        common.jsClick(saveApplicationButton);
        Log.info("Click on the save application");
        common.acceptAlert();
    }

    public String createPolicyByEditingTheHorseTrailerQuoteNumberAndGetPolicyNumber() {
        common.waitUntilElementToBeClickable(cogMenuOnQuoteInformationPage);
        common.jsClick(cogMenuOnQuoteInformationPage);
        common.pause(2);
        common.jsClick(cogMenuEditOption);
        Log.info("Edit the quote");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(coverStartDateOfHorse);
        policyCreationScenariosPage.selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
        common.waitUntilElementToBeClickable(createPolicyButton);
        common.jsClick(createPolicyButton);
        common.pause(5);
        Log.info("Click on the Create policy button");
        common.waitUntilVisibilityOfElement(policyNumberElement);
        common.pause(1);
        String polyNumber = policyNumberElement.getText();
        String policyNumber = polyNumber.substring(1, polyNumber.length() - 1);
        Log.info("Created Horse Trailer policy with the number : " + policyNumber);

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "374.92", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        verifyLettersTitleAndEmailSendStatus();
        return policyNumber;
    }

    public void clickOnTheCogIconAndAddEndorsementOnHorseTrailerAndDrownVehiclePolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(addEndorsementOption);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        Log.info("Select add Endorsement from the cog dropdown");
        common.pause(5);

        common.waitUntilVisibilityOfElement(horseTrailerValueInputField);
        horseTrailerValueInputField.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
        common.pause(1);
        String saddleryCurrentMarketValue = "15000";
        horseTrailerValueInputField.sendKeys(saddleryCurrentMarketValue);
        common.pause(2);
        common.jsClick(calculateButton);

        common.pause(2);
        Assert.assertTrue(horseTrailerAndDrawnVehiclePlanCheckbox.isSelected());
        Log.info("Changed the Horse saddlery market value and click on calculate button");
        common.jsClick(planPopupCloseButton);
        common.waitUntilVisibilityOfElement(endorsementSaveButton);
        common.jsClick(endorsementSaveButton);
        Log.info("Click on the save button");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(5);
        if (common.isElementDisplayed(policyEndorsementStatusOnThePolicyInformationPage)) {
            String policyStatus = common.getText(policyEndorsementStatusOnThePolicyInformationPage);
            Assert.assertEquals(policyStatus, "Endorsement", "policy status is mismatched");
            Log.info("Verified the policy status after endorsement: " + policyStatus);
            common.pause(1);
        }

        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Assert.assertEquals(actualPremiumAmount, "286.44", "The policy premium amount is incorrect");
        Log.info("The total premium amount is: " + actualPremiumAmount);

        driver.close();
        common.switchToWindow(0);
    }

    public void addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfHorseTrailerPolicy(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Horse trailer");
        enterClaimDetailsAndAddClaim("100");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Declined", "claim status is not declined");
        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheHorseTrailerPolicyAndDeclineTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Horse trailer");
        enterClaimDetailsAndAddClaim("2500");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        String claimNumber = claimNumberOnTheClaimInformationPage.getText();
        Log.info("Claim is added with the claim number: " + claimNumber);
        Log.info("The claim status is: " + claimStatus);
        common.pause(1);
        Assert.assertEquals(claimStatus, "Pending", "claim status is not marching");
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
        Assert.assertEquals(claimStatus1, "Declined", "claim status is not declined");

        driver.close();
        common.switchToWindow(0);
    }

    public void clickOnTheCogIconAndAddClaimOnTheHorseTrailerPolicyAndSettleTheClaim(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        selectAddClaimOption();
        selectClaimCoverForHorse("Horse trailer");
        enterClaimDetailsAndAddClaim("3000");
        String actualExcessValue = accessDeductibleInputFieldOnClaimPage.getAttribute("value");
        Assert.assertEquals(actualExcessValue, "135.00", "Excess values are incorrect");
        selectLossCauseAndClickOnTheSaveClaimButton();
        common.waitUntilVisibilityOfElement(claimNumberOnTheClaimInformationPage);
        String claimStatus = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatus);
        Assert.assertEquals(claimStatus, "Pending", "Claim Status is not matching");

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
        Assert.assertEquals(claimStatusAuthorise, "Authorise", "claim status is matching");

        approveTheClaimFromApproveClaimModule(claimNumber);

        manageClaimPage.clickManageClaimIcon();
        common.pause(2);
        common.jsClick(firstClaimOnTheManageClaimPage);
        common.switchToWindow(1);
        String claimStatusApprove = claimStatusOnTheClaimInformationPage.getText();
        Log.info("The claim status is: " + claimStatusApprove);
        Assert.assertEquals(claimStatusApprove, "Approved", "claim status is not matching");
        driver.close();
        common.switchToWindow(0);

        processElectronicFundTransferFromAccountMenu(claimNumber);
    }

    public void renewTheHorseTrailerPolicyAndVerifyTheStatus(String policyNumber) {
        searchPolicyAndClick(policyNumber);
        common.waitUntilElementToBeClickable(cogMenuOnPolicyInformationPage);
        common.jsClick(cogMenuOnPolicyInformationPage);
        common.jsClick(renewPolicyOption);
        Log.info("Selected renew policy option from the policy information page");
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.pause(2);

        common.waitUntilVisibilityOfElement(horseTrailerValueInputField);
        horseTrailerValueInputField.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
        common.pause(1);
        String saddleryCurrentMarketValue = "12000";
        horseTrailerValueInputField.sendKeys(saddleryCurrentMarketValue);
        common.pause(2);
        common.jsClick(calculateButton);
        Log.info("Entered Horse trailer market value and click on the calculate button");

        common.pause(2);
        Assert.assertTrue(horseTrailerAndDrawnVehiclePlanCheckbox.isSelected());
        common.pause(3);
        common.jsClick(planPopupCloseButton);
        common.pause(3);

        saveRenewApplicationAndVerifyHistory("233.35");
    }
}
