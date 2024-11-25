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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import utils.Common;
import utils.Log;

import java.util.List;

public class PolicyCreationScenariosPage {
    private static final Logger log = LoggerFactory.getLogger(QuotePage.class);
    Common common = new Common(DriverFactory.getDriver());

    private final WebDriver driver;

    public PolicyCreationScenariosPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(4)")
    private WebElement quoteIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessage;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/a[2]")
    private WebElement addQuoteButton;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div/div[4]/div/div/span")
    private WebElement productListDropDown;
    @FindBy(xpath = "//div[@id='divhear']//span[@class='k-select']")
    private WebElement hearAboutUsDropDown;
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
    @FindBy(css = "input[class='k-formatted-value cls_CAT00005 k-input']")
    private WebElement catPurchaseAmountField;
    @FindBy(xpath = "//div[@class='form-group']//input[@id='ClientTypeId_1']")
    private WebElement clientTypeIndividual;

    //Policy
    @FindBy(xpath = "(//div[@id='divfname']//span[@class='k-select'])[1]")
    private WebElement titleDropdown;
    @FindBy(xpath = "//ul[@id='Title_listbox']//li[2]")
    private WebElement titleOptionMr;
    @FindBy(xpath = "//ul[@id='Title_listbox']//li[3]")
    private WebElement titleOptionMrs;
    @FindBy(xpath = "//ul[@id='Title_listbox']//li[4]")
    private WebElement titleOptionMiss;
    @FindBy(xpath = "//ul[@id='Title_listbox']//li[5]")
    private WebElement titleOptionMs;
    @FindBy(xpath = "//ul[@id='Title_listbox']//li[6]")
    private WebElement titleOptionMx;
    @FindBy(xpath = "//ul[@id='Title_listbox']//li[7]")
    private WebElement titleOptionDr;
    @FindBy(css = "input[name='FirstName']")
    private WebElement firstNameInputField;
    @FindBy(css = "input[name='LastName']")
    private WebElement lastNameInputField;
    @FindBy(css = "input[id='BirthDate']")
    private WebElement clientBirthDateInput;
    @FindBy(css = "input[name='Email']")
    private WebElement emailInputField;
    @FindBy(css = "input[id='Address1']")
    private WebElement addressInputField;
    @FindBy(css = "input[id='PrimaryContactNumber']")
    private WebElement primaryContactNumberInputField;
    @FindBy(xpath = "//ul[@id='HearAboutUs_listbox']//li[2]")
    private WebElement animalClubDropdownOption;
    @FindBy(xpath = "//div[@id='Question_138-list']//input[@role='listbox'] | //div[@id='Question_11366-list']//input")
    private WebElement speciesDrpDownSearchInputField;
    @FindBy(xpath = "(//ul[@class='k-list k-reset']//li[contains(text(),'Male')])[2]")
    private WebElement genderMaleOption;
    @FindBy(xpath = "(//ul[@class='k-list k-reset']//li[contains(text(),'Female')])[2]")
    private WebElement genderFemaleOption;
    @FindBy(xpath = "(//input[@class='step-select chkHighPremier'])[1]")
    private WebElement premierPlanHigh;
    @FindBy(xpath = "(//input[@class='step-select chkHighStandard'])[1]")
    private WebElement plusPlanHigh;
    @FindBy(xpath = "(//input[@class='step-select chkHighValue'])[1]")
    private WebElement valuePlanHigh;
    @FindBy(xpath = "(//input[@class='step-select chkLowPremier'])[1]")
    private WebElement premierPlanLow;
    @FindBy(xpath = "(//input[@class='step-select chkLowStandard'])[1]")
    private WebElement plusPlanLow;
    @FindBy(xpath = "(//input[@class='step-select chkLowValue'])[1]")
    private WebElement valuePlanLow;
    @FindBy(xpath = "(//input[@class='select-input chkHighOptionalExtra1'])[1]")
    private WebElement optionExtraDeathHigh;
    @FindBy(xpath = "(//input[@class='select-input chkHighOptionalExtra2'])[1]")
    private WebElement optionExtraTheftHigh;
    @FindBy(xpath = "(//input[@class='select-input chkLowOptionalExtra1'])[1]")
    private WebElement optionExtraDeathLow;
    @FindBy(xpath = "(//input[@class='select-input chkLowOptionalExtra2'])[1]")
    private WebElement optionExtraTheftLow;
    @FindBy(xpath = "(//input[@class='select-input chkHighOptionalExtra3'])[1]")
    private WebElement optionExtraNotReturnFlyingHigh;
    @FindBy(xpath = "(//input[@class='select-input chkLowOptionalExtra3'])[1]")
    private WebElement optionExtraNotReturnFlyingLow;
    @FindBy(xpath = "//input[@class='cls_EMH66V k-input'] | //input[@class='cls_CAT11484 k-input'] | //input[@class='cls_DGSTCV k-input']")
    private WebElement coverStartDateInput;
    @FindBy(xpath = "//input[@id='Question_82_340'] | //input[@id='Question_11378_609']")
    private WebElement assumptionYesRadioButton;
    @FindBy(xpath = "//input[@id='Question_11385_720']")
    private WebElement assumptionRadioButtonCat;
    @FindBy(xpath = "//input[@id='Question_137'] | //input[@id='Question_11409_637']")
    private WebElement informationConfirmCheckbox;
    @FindBy(css = "button[id='BindButton']")
    private WebElement createPolicyButton;
    @FindBy(css = "input[id='PremiumFrequency_2']")
    private WebElement premiumFrequencyMonthly;
    @FindBy(css = "input[id='PremiumFrequency_1']")
    private WebElement premiumFrequencyYearly;
    @FindBy(xpath = "//div[@class='toast-message']")
    private WebElement toastMessage;
    @FindBy(xpath = "//span[normalize-space()='Policy -']//following-sibling::span")
    private WebElement policyNumber;
    @FindBy(xpath = "//input[@id='PaymentTenderId']//..//span[@class='k-select']")
    private WebElement paymentTenderDropdown;
    @FindBy(xpath = "//ul[@id='PaymentTenderId_listbox']//li[3]")
    private WebElement directDebitOption;
    @FindBy(xpath = "//ul[@id='PaymentTenderId_listbox']//li[2]")
    private WebElement creditOrDebitCardOption;
    @FindBy(xpath = "//ul[@id='PaymentTenderId_listbox']//li[4]")
    private WebElement otherPaymentOption;
    @FindBy(xpath = "//ul[@id='PaymentTenderId_listbox']//li[3]")
    private WebElement creditOrDebitCardOptionYearly;
    @FindBy(xpath = "//ul[@id='PaymentTenderId_listbox']//li[4]")
    private WebElement directDebitOptionYearly;
    @FindBy(xpath = "//label[contains(text(),' Card Type ')]//..//span[@class='k-select']")
    private WebElement cardTypeDropDown;
    @FindBy(xpath = "//ul[@id='CardType_listbox']//li[2]")
    private WebElement cardTypeVisa;
    @FindBy(id = "CardHolderName")
    private WebElement cardHolderNameInput;
    @FindBy(id = "CreditCardNumber")
    private WebElement creditCardNumberInput;
    @FindBy(id = "CreditCardCVV")
    private WebElement creditCardCvvInput;
    @FindBy(xpath = "(//label[contains(text(),' Credit Card Expiry ')]//..//div//span[@class='k-select'])[1]")
    private WebElement cardExpiryMonthDropdown;
    @FindBy(xpath = "(//label[contains(text(),' Credit Card Expiry ')]//..//div//span[@class='k-select'])[2]")
    private WebElement cardExpiryYearDropdown;
    @FindBy(xpath = "//ul[@id='CreditCardExpiryMonth_listbox']//li[13]")
    private WebElement decMonthOption;
    @FindBy(xpath = "//ul[@id='CreditCardExpiryYear_listbox']//li[2]")
    private WebElement expiryYear2024Option;
    @FindBy(xpath = "//input[@id='InstalmentDate']//..//span[@class='k-select']")
    private WebElement instalmentDateDropdown;
    @FindBy(xpath = "//ul[@id='InstalmentDate_listbox']//li[3]")
    private WebElement instalmentDate7Option;
    @FindBy(xpath = "//ul[@id='InstalmentDate_listbox']//li[4]")
    private WebElement instalmentDate14Option;
    @FindBy(css = "input[id='DirectDebitSortCode']")
    private WebElement sortCodeInput;
    @FindBy(css = "input[id='DirectDebitAccountNumber']")
    private WebElement accountNumberInput;
    @FindBy(css = "input[id='DirectDebitAccountName']")
    private WebElement accountHolderNameInput;
    @FindBy(css = "a[onclick='onValidateBankAccount();']")
    private WebElement accountVerificationLink;
    @FindBy(xpath = "//tbody[@role='rowgroup']//tr//td[10]")
    private WebElement totalPremiumAmount;
    @FindBy(xpath = "//label[contains(text(),'What breed is your Pet?')]//..//span[@class='k-select']")
    private WebElement petBreedDropdown;
    @FindBy(xpath = "(//span[contains(text(),'Economy (12 Months)')])[2]//..//input")
    private WebElement economyPlan;
    @FindBy(xpath = "(//span[contains(text(),'Superior (Lifetime)')])[2]//..//input")
    private WebElement superiorPlan;
    @FindBy(xpath = "(//span[contains(text(),'Mid Point (Lifetime)')])[2]//..//input")
    private WebElement midpointPlan;
    @FindBy(xpath = "(//span[contains(text(),'Entry (Lifetime)')])[2]//..//input")
    private WebElement entryPlan;
    @FindBy(xpath = "(//span[contains(text(),'Key (Lifetime)')])[2]//..//input")
    private WebElement keyPlan;
    @FindBy(xpath = "(//span[contains(text(),'Vital (Lifetime)')])[2]//..//input")
    private WebElement vitalPlan;
    @FindBy(xpath = "(//span[contains(text(),'Core (Lifetime)')])[2]//..//input")
    private WebElement corePlan;
    @FindBy(xpath = "(//span[contains(text(),'Catastrophe1 (Lifetime)')])[2]//..//input")
    private WebElement catastrophe1Plan;
    @FindBy(xpath = "(//span[contains(text(),'Catastrophe2 (Lifetime)')])[2]//..//input")
    private WebElement catastrophe2Plan;
    @FindBy(xpath = "(//input[@class='optionalextram1 optionalexm'])[1]")
    private WebElement optionExtraDeathForCat;
    @FindBy(xpath = "(//input[@class='optionalextram2 optionalexm'])[1]")
    private WebElement optionExtraDayToDayCareForCat;
    @FindBy(xpath = "(//input[@class='optionalextram3 optionalexm'])[1]")
    private WebElement optionExtraTheftOrStrayingForCat;
    @FindBy(xpath = "//button[text()='Close']")
    private WebElement planPopupCloseButton;
    @FindBy(xpath = "//div[@id='Div_11308']//span[@class='k-select']")
    private WebElement dogBreedTypeDropdown;
    @FindBy(xpath = "//li[text()='Pedigree']")
    private WebElement dogBreedPedigreeOption;
    @FindBy(xpath = "//li[text()='Mixed Breed']")
    private WebElement dogBreedMixedBreedOption;
    @FindBy(xpath = "(//div[@id='Question_11309-list']//input[@role=\"listbox\"])[2]")
    private WebElement dogBreedSearchInput;
    @FindBy(css = "input[class='k-formatted-value cls_DOG00008 k-input']")
    private WebElement dogPurchaseAmountField;
    @FindBy(xpath = "(//input[@class='optionalextram1'])[1]")
    private WebElement optionExtraDeathForDog;
    @FindBy(xpath = "(//input[@class='optionalextram2'])[1]")
    private WebElement optionExtraDayToDayCareForDog;
    @FindBy(xpath = "(//input[@class='optionalextram3'])[1]")
    private WebElement optionExtraThirdPartyLiabilityForDog;
    @FindBy(xpath = "(//input[@class='optionalextram4'])[1]")
    private WebElement optionExtraTheftOrStrayingForDog;
    @FindBy(xpath = "//input[@class='cls_DGSTCV k-input']")
    private WebElement coverStartDateInputForDog;
    @FindBy(css = "input[id='Question_11430_647']")
    private WebElement petAssumption1ForDog;
    @FindBy(css = "input[id='Question_11336_661']")
    private WebElement petAssumption2ForDog;
    @FindBy(css = "input[id='Question_11415_678']")
    private WebElement petAssumption3ForDog;
    @FindBy(css = "input[id='Question_11319']")
    private WebElement petMicrochipNumberInput;
    @FindBy(xpath = "//div[@id='Div_11433']//span[@class='k-select']")
    private WebElement petMixedBreedDrpDown1;
    @FindBy(xpath = "//div[@id='Div_11434']//span[@class='k-select']")
    private WebElement petMixedBreedDrpDown2;
    @FindBy(xpath = "//div[@id='Question_11433-list']//input[@role='listbox']")
    private WebElement petMixedBreedDrpDown1SearchInput;
    @FindBy(xpath = "//div[@id='Question_11434-list']//input[@role='listbox']")
    private WebElement petMixedBreedDrpDown2SearchInput;
    @FindBy(xpath = "//div[@id='Div_33401']//div//div//span//span//span[2]")
    private WebElement addAnAgentDropdown;
    @FindBy(xpath = "//ul[@id='HearAboutUs_listbox']//li[2]")
    private WebElement hearAboutUsOption;

    //Horse product locators
    @FindBy(css = "input[id='StreetNo']")
    private WebElement addressStreetNumberInputField;
    @FindBy(css = "ul[id='Question_33401_listbox']>li:nth-child(3)")
    private WebElement addAnAgentDropdownOptionNo;
    @FindBy(css = "div[id='Div_33405'] div div>input:nth-child(1)")
    private WebElement horseInsuranceRadioButton;
    @FindBy(css = "input[id='Question_33405_30101']")
    private WebElement horseLiabilityCoverRadioButton;
    @FindBy(css = "input[id='Question_33405_30102']")
    private WebElement horseSaddleryAndTrackRadioButton;
    @FindBy(css = "input[id='Question_33405_30103']")
    private WebElement horseTrailerAndDrawnVehiclesRadioButton;
    @FindBy(css = "input[id='Question_33411']")
    private WebElement horseNameInputField;
    @FindBy(xpath = "//div[@id='Div_33413']//div//div//span//span[2]")
    private WebElement horseBreedDropDown;
    @FindBy(xpath = "//div[@id='Question_33413-list']//input[@role='listbox']")
    private WebElement horseBreedSearchInputField;
    @FindBy(css = "input[id='Question_33412']")
    private WebElement horseBirthDateInputField;
    @FindBy(xpath = "//div[@id='Div_33414']//div//div//span//span[2]")
    private WebElement horseOwnedLoanOrHomeBredDropdown;
    @FindBy(css = "ul[id='Question_33414_listbox']>li:nth-child(2)")
    private WebElement horseHomeBredOption;
    @FindBy(css = "ul[id='Question_33414_listbox']>li:nth-child(4)")
    private WebElement horseOwnedOption;
    @FindBy(css = "ul[id='Question_33414_listbox']>li:nth-child(3)")
    private WebElement horseOnLoanOption;
    @FindBy(css = "input[class='k-formatted-value form-control col-sm-2 cls_HORSE0027 k-input']")
    private WebElement horseCurrentMarketValueInputField;
    @FindBy(css = "input[class='k-formatted-value form-control col-sm-2 cls_HORSE0025 k-input']")
    private WebElement horsePurchasePriceInputField;
    @FindBy(css = "input[id='Question_33419_45489']")
    private WebElement horseActivitiesGroup1;
    @FindBy(css = "input[id='Question_33419_45490']")
    private WebElement horseActivitiesGroup2;
    @FindBy(css = "input[id='Question_33419_45491']")
    private WebElement horseActivitiesGroup3;
    @FindBy(css = "input[id='Question_33419_45492']")
    private WebElement horseActivitiesGroup4;
    @FindBy(css = "input[id='Question_33417']")
    private WebElement studFeesInputField;
    @FindBy(css = "input[id='Question_33415']")
    private WebElement horsePurchasedDataInputField;
    @FindBy(xpath = "//div[@id='Div_33427']//div//div//span//span[2]")
    private WebElement horseColourDropDown;
    @FindBy(xpath = "//div[@id='Div_33428']//div//div//span//span[2]")
    private WebElement horseSexDropDown;
    @FindBy(xpath = "//ul[@id='Question_33428_listbox']//li[2]")
    private WebElement horseSexColtOption;
    @FindBy(xpath = "//ul[@id='Question_33428_listbox']//li[3]")
    private WebElement horseSexFillyOption;
    @FindBy(xpath = "//ul[@id='Question_33428_listbox']//li[4]")
    private WebElement horseSexGeldingOption;
    @FindBy(xpath = "//ul[@id='Question_33428_listbox']//li[5]")
    private WebElement horseSexMareOption;
    @FindBy(xpath = "//ul[@id='Question_33428_listbox']//li[6]")
    private WebElement horseSexStallionOption;
    @FindBy(xpath = "//div[@id='Div_33429']//div//div//span//span[2]")
    private WebElement horseHeightDropDown;
    @FindBy(css = "input[id='Question_33430']")
    private WebElement loanStartDateInputField;
    @FindBy(css = "input[id='Question_33442_45577']")
    private WebElement horseStatementsTrueOrNotYesRadioButton1;
    @FindBy(css = "input[id='Question_33462_45597']")
    private WebElement horseStatementsTrueOrNotYesRadioButton2;
    @FindBy(css = "input[id='Question_33409_45593']")
    private WebElement horseStatementsTrueOrNotYesRadioButton3;
    @FindBy(css = "input[id='Question_33408']")
    private WebElement coverStartDateInputField;
    @FindBy(xpath = "//input[@id='SaddleryandTackValue']//preceding-sibling::input")
    private WebElement saddleryAndTackValueInputField;
    @FindBy(xpath = "//input[@id='HorseTrailersorHorseDrawnVehiclesValue']//preceding-sibling::input")
    private WebElement horseTrailersAndHorseDrawnVehicleValueInputField;
    @FindBy(css = "button[id='btnSaveSaddleryandTackValue1']")
    private WebElement saveButtonSaddleryAndTack;
    @FindBy(css = "button[id='btnSaveHorseTrailersorHorseDrawnVehiclesValue']")
    private WebElement saveButtonHorseTrailersOrDrawnVehicles;
    @FindBy(css = "input[id='Question_33478_45623']")
    private WebElement saddleryAndTackValuedOver200NoRadio;
    @FindBy(css = "input[id='Question_33480_45625']")
    private WebElement saddleryAndTackValuedUnder200NoRadio;
    @FindBy(css = "input[id='Question_33482_45627']")
    private WebElement saddleryAndTackHaveAnyDamageNoRadio;
    @FindBy(xpath = "//ul[@id='Question_33427_listbox']//li[2]")
    private WebElement horseColourOption;
    @FindBy(xpath = "//ul[@id='Question_33429_listbox']//li[2]")
    private WebElement horseHeightOption;

    //Plan selection locators Optional Extras Checkbox
    @FindBy(css = "input[name='chkOptionalExtraDisposal']")
    private WebElement disposalOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraVetenaryFee']")
    private WebElement veterinaryFeeOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraLossOfUse']")
    private WebElement permanentLossOfUseOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraThirdPartyLiability']")
    private WebElement thirdPartyLiabilityOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraPersonalAccident']")
    private WebElement personalAccidentOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraSaddleryAndTack']")
    private WebElement saddleryAndTackOptionalExtraCheckbox;
    @FindBy(css = "input[name='chkOptionalExtraHorseTrailersNHorseDrawnVehicles']")
    private WebElement horseTrailerAndDrawnVehiclesOptionalExtraCheckbox;
    @FindBy(xpath = "//input[@name='VetinerayFeeExcessType_Monthly'][2]")
    private WebElement veterinaryFeesCoverLevelSuperiorRadio;
    @FindBy(xpath = "//input[@name='LossofuseExcessType_Monthly'][1]")
    private WebElement permanentLossOfUseCoverLevel60;
    @FindBy(xpath = "//input[@name='LossofuseExcessType_Monthly'][2]")
    private WebElement permanentLossOfUseCoverLevel100;
    @FindBy(css = "button[class='swal-button swal-button--confirm']")
    private WebElement permanentLossOfUseOkButton;
    @FindBy(css = "input[class='HorseThirdPartyLiability2MPerMonth']")
    private WebElement thirdPartyLiabilityCoverLevelOption2;
    @FindBy(xpath = "//input[@name='HorsePersonalAccidentAmmount_Yearly'][2]")
    private WebElement personalAccidentCoverLevelOption2;

    //Plan checkbox
    @FindBy(css = "input[id='chkBaicMonthly']")
    private WebElement horseInsuranceBasicPlanCheckbox;
    @FindBy(css = "input[id='chkPlanAMonthly']")
    private WebElement seniorHorseInsurancePlanACheckbox;
    @FindBy(css = "input[id='chkPlanBMonthly']")
    private WebElement seniorHorseInsurancePlanBCheckbox;
    @FindBy(css = "input[id='chkOptionalHorseLiabilityMonthly']")
    private WebElement horseLiabilityCoverPlanCheckbox;
    @FindBy(css = "input[id='chkOptionalExtraSaddleryMonthly']")
    private WebElement horseSaddleryAndTackPlanCheckbox;
    @FindBy(css = "input[id='chkOptionalExtraTrailorMonthly']")
    private WebElement horseTrailerAndDrawnVehiclePlanCheckbox;

    //
    @FindBy(css = "input[name='ClientId_input']")
    private WebElement clientIdInputField;
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
    @FindBy(css = "input[id='Question_33496']")
    private WebElement horseNameInputFieldForLiability;
    @FindBy(xpath = "//div[@id='Div_33497']//div//div//span//span[2]")
    private WebElement horseBreedDropDownForLiability;
    @FindBy(xpath = "//div[@id='Question_33497-list']//input[@role='listbox']")
    private WebElement horseBreedSearchInputFieldForLiability;
    @FindBy(css = "input[id='Question_33498']")
    private WebElement horseBirthDateInputFieldForLiability;
    @FindBy(xpath = "//div[@id='Div_33499']//div//div//span//span[2]")
    private WebElement horseColourDropDownForLiabilityPlan;
    @FindBy(xpath = "//ul[@id='Question_33499_listbox']//li[2]")
    private WebElement horseColourOptionForLiabilityPlan;
    @FindBy(xpath = "//div[@id='Div_33500']//div//div//span//span[2]")
    private WebElement horseSexDropDownForLiabilityPlan;
    @FindBy(xpath = "//ul[@id='Question_33500_listbox']//li[2]")
    private WebElement horseSexColtOptionForLiabilityPlan;
    @FindBy(xpath = "//div[@id='Div_33501']//div//div//span//span[2]")
    private WebElement horseHeightDropDownForLiabilityPlan;
    @FindBy(xpath = "//ul[@id='Question_33501_listbox']//li[2]")
    private WebElement horseHeightOptionForLiabilityPlan;
    @FindBy(css = "input[id='Question_33503_45652']")
    private WebElement horseStatementsTrueOrNotYesRadioButton1ForLiability;
    @FindBy(css = "input[id='Question_33462_45597']")
    private WebElement horseStatementsTrueOrNotYesRadioButton2ForLiability;
    @FindBy(css = "input[id='Question_33409_45593']")
    private WebElement horseStatementsTrueOrNotYesRadioButton3ForLiability;
    @FindBy(css = "input[class='HorseThirdPartyLiability2MYearly']")
    private WebElement horseLiabilityCoverLevel2MRadioButton;

    public String verifyManageQuotePage() {
        common.waitUntilElementToBeClickable(quoteIcon);
        quoteIcon.click();
        Log.info("Click on the quote icon on the left toolbar");
        common.pause(2);
        return displayedMessage.getText();
    }

    public void clickOnAddQuoteButton() {
        common.waitUntilVisibilityOfElement(addQuoteButton);
        common.pause(1);
        common.jsClick(addQuoteButton);
        Log.info("User click on the add quote button");
        common.pause(1);
    }

    public void enterClientContactInformation(int r, XSSFSheet sheet) {
        XSSFRow row = sheet.getRow(r);
        common.waitUntilVisibilityOfElement(clientTypeIndividual);
        if (!clientTypeIndividual.isSelected()) {
            clientTypeIndividual.click();
        }
        Log.info("Select client type individual");
        String title = row.getCell(1).getStringCellValue();
        titleDropdown.click();
        common.pause(1);
        switch (title) {
            case "Mr":
                titleOptionMr.click();
                break;
            case "Mrs":
                titleOptionMrs.click();
                break;
            case "Miss":
                titleOptionMiss.click();
                break;
            case "Ms":
                titleOptionMs.click();
                break;
            case "Mx":
                titleOptionMx.click();
                break;
            case "Dr":
                titleOptionDr.click();
                break;
        }
        Log.info("Salutation selected: " + title);

        String firstName = row.getCell(2).getStringCellValue() + common.getRandomString(4);
        firstNameInputField.sendKeys(firstName);
        Log.info("User entered first name: " + firstName);

        String lastName = row.getCell(3).getStringCellValue() + common.getRandomString(4);
        lastNameInputField.sendKeys(lastName);
        Log.info("User entered last name: " + lastName);

        String clientBirthDate = row.getCell(4).getStringCellValue();
        clientBirthDateInput.sendKeys(clientBirthDate);
        Log.info("User entered date of birth: " + clientBirthDate);

        String email = row.getCell(5).getStringCellValue();
//        String email = firstName.concat(lastName) + common.generateRandomNumber(3) + "@fakecorp.com".toLowerCase();
        emailInputField.sendKeys(email);
        Log.info("User entered email: " + email);

        String address = row.getCell(6).getStringCellValue();
        addressInputField.sendKeys(address);
        common.pause(2);
        addressInputField.sendKeys(Keys.DOWN);
        addressInputField.sendKeys(Keys.ENTER);
        common.pause(1);
        Log.info("Selected address by entering postcode: " + address);

//        String streetNumber = common.generateRandomNumber(2);
//        common.sendKeys(addressStreetNumberInputField, streetNumber);

        String primaryContactNumber = common.generateRandomNumber(10);
        primaryContactNumberInputField.sendKeys(primaryContactNumber);
        Log.info("User entered primary contact number: " + primaryContactNumber);

        common.jsClick(hearAboutUsDropDown);
        common.pause(1);
        if (r > 28) {
            driver.findElement(By.xpath("//ul[@id='HearAboutUs_listbox']//li[" + 2 + "]")).click();
        } else {
            driver.findElement(By.xpath("//ul[@id='HearAboutUs_listbox']//li[" + r + "]")).click();
        }
        Log.info("Selected hear about us");
    }

    public void createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForExoticProduct(String product) {
        XSSFSheet sheet = common.readDataFromExcelSheet("Exotic");

        for (int r = 2; r < 32; r++) {

            enterClientContactInformation(r, sheet);
            XSSFRow row = sheet.getRow(r);
            selectProduct(product);
            common.waitUntilVisibilityOfElement(petSpeciesDropDown);
            common.pause(2);
            petSpeciesDropDown.click();
            common.waitUntilVisibilityOfElement(speciesDrpDownSearchInputField);

            String species = row.getCell(10).getStringCellValue();
            speciesDrpDownSearchInputField.sendKeys(species);
            common.pause(2);
            speciesDrpDownSearchInputField.sendKeys(Keys.DOWN);
            speciesDrpDownSearchInputField.sendKeys(Keys.ENTER);
            common.pause(2);

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

            common.pause(1);
            String petBDate = row.getCell(13).getStringCellValue().replace("/", ".");
            petBirthDate.sendKeys(petBDate);

            common.pause(2);
            String price = row.getCell(15).getStringCellValue();
            petPurchaseAmount.sendKeys(price);

            calculateButton.click();
            common.waitUntilVisibilityOfElement(calculateButton);
            common.jsClick(calculateButton);

            common.pause(2);
            common.scroll_By_Pixel("0", "500");
            common.waitUntilVisibilityOfElement(premierPlanHigh);

            switch (r) {
                case 2:
                    common.jsClick(premierPlanHigh);
                    break;
                case 3:
                    common.jsClick(plusPlanHigh);
                    break;
                case 4:
                    common.jsClick(valuePlanHigh);
                    break;
                case 5:
                    premierPlanHigh.click();
                    optionExtraDeathHigh.click();
                    break;
                case 6:
                    plusPlanHigh.click();
                    optionExtraDeathHigh.click();
                    break;
                case 7:
                    premierPlanHigh.click();
                    optionExtraDeathHigh.click();
                    optionExtraTheftHigh.click();
                    break;
                case 8:
                    premierPlanHigh.click();
                    optionExtraTheftHigh.click();
                    break;
                case 9:
                    plusPlanHigh.click();
                    optionExtraTheftHigh.click();
                    break;
                case 10:
                    valuePlanHigh.click();
                    optionExtraTheftHigh.click();
                    break;
                case 11:
                    valuePlanHigh.click();
                    optionExtraDeathHigh.click();
                    break;
                case 12:
                    plusPlanHigh.click();
                    optionExtraDeathHigh.click();
                    optionExtraTheftHigh.click();
                    break;
                case 13:
                    valuePlanHigh.click();
                    optionExtraDeathHigh.click();
                    optionExtraTheftHigh.click();
                    break;
                case 14:
                    plusPlanLow.click();
                    break;
                case 15:
                    premierPlanLow.click();
                    break;
                case 16:
                    valuePlanLow.click();
                    break;
                case 17:
                    premierPlanLow.click();
                    optionExtraDeathLow.click();
                    break;
                case 18:
                    plusPlanLow.click();
                    optionExtraDeathLow.click();
                    break;
                case 19:
                    valuePlanLow.click();
                    optionExtraDeathLow.click();
                    break;
                case 20:
                    premierPlanLow.click();
                    optionExtraTheftLow.click();
                    break;
                case 21:
                    plusPlanLow.click();
                    optionExtraTheftLow.click();
                    break;
                case 22:
                    valuePlanLow.click();
                    optionExtraTheftLow.click();
                    break;
                case 23:
                    premierPlanLow.click();
                    optionExtraDeathLow.click();
                    optionExtraTheftLow.click();
                    break;
                case 24:
                    plusPlanLow.click();
                    optionExtraDeathLow.click();
                    optionExtraTheftLow.click();
                    break;
                case 25:
                    valuePlanLow.click();
                    optionExtraDeathLow.click();
                    optionExtraTheftLow.click();
                    break;
                case 26:
                    premierPlanHigh.click();
                    optionExtraNotReturnFlyingHigh.click();
                    break;
                case 27:
                    plusPlanHigh.click();
                    optionExtraNotReturnFlyingHigh.click();
                    break;
                case 28:
                    valuePlanHigh.click();
                    optionExtraNotReturnFlyingHigh.click();
                    break;
                case 29:
                    premierPlanLow.click();
                    optionExtraNotReturnFlyingLow.click();
                    break;
                case 30:
                    plusPlanLow.click();
                    optionExtraNotReturnFlyingLow.click();
                    break;
                case 31:
                    valuePlanLow.click();
                    optionExtraNotReturnFlyingLow.click();
                    break;
            }

            enterCoverStartDateAndAnswer();
            if (r % 2 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
            } else if (r % 5 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
            } else {
                selectPremiumMonthlyAndSelectOtherPaymentOption();
            }
            clickOnPolicyCreateButton();
            verifyPolicyDetailsOnPolicyInformationPage(r, sheet, 16);

            System.out.println("\nNumber of policies created: " + (r - 1));

            if (!String.valueOf(r).equals("32")) {
                verifyManageQuotePage();
                clickOnAddQuoteButton();
            }
        }

    }

    public void createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForCatProduct() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Cat");
        String productType = "Cat";
        for (int r = 2; r < 3; r++) {

            enterClientContactInformation(r, sheet);
            selectProduct(productType);
            enterPetInformationCat(r);
            selectPolicyPlanAndAnswerAssumptionsForCat(r);
            if (r % 2 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
            } else if (r % 5 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
            } else {
                selectPremiumMonthlyAndSelectOtherPaymentOption();
            }
            clickOnPolicyCreateButton();
            verifyPolicyDetailsOnPolicyInformationPage(r, sheet, 15);

            System.out.println("\nNumber of policies created: " + (r - 1));

            if (!String.valueOf(r).equals("73")) {
                verifyManageQuotePage();
                clickOnAddQuoteButton();
            }
        }

    }

    public void createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForDogProduct() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Dog");
        String productType = "Dog";

        for (int r = 2; r < 76; r++) {

            enterClientContactInformation(r, sheet);
            selectProduct(productType);
            enterPetInformationDog(r, sheet);
            selectPolicyPlanAndAnswerAssumptionsForDog(r);
            if (r % 2 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
            } else if (r % 5 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
            } else {
                selectPremiumMonthlyAndSelectOtherPaymentOption();
            }
            clickOnPolicyCreateButton();
            verifyPolicyDetailsOnPolicyInformationPage(r, sheet, 18);

            System.out.println("\nNumber of policies created: " + (r - 1));

            if (!String.valueOf(r).equals("76")) {
                verifyManageQuotePage();
                clickOnAddQuoteButton();
            }
        }

    }

    public void createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForHorseProduct() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        String productType = "Horse";

        for (int r = 2; r < 30; r++) {

            enterClientContactInformation(r, sheet);
            selectProduct(productType);
            selectHorsePolicyDetails(r, sheet);
            selectPolicyPlanForTheHorse(r);
            enterCoverStartDateAndQuestionary(r, sheet);

            if (r % 2 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
            } else if (r % 5 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
            } else {
                selectPremiumMonthlyAndSelectOtherPaymentOption();
            }

            clickOnPolicyCreateButton();
            common.pause(5);
            verifyPolicyDetailsOnPolicyInformationPage(r, sheet, 23);
            System.out.println("\nNumber of policies created: " + (r - 1));

            if (!String.valueOf(r).equals("76")) {
                verifyManageQuotePage();
                clickOnAddQuoteButton();
            }
        }

    }

    public void selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit() {
        common.jsClick(premiumFrequencyMonthly);
        Log.info("Select monthly premium radio button");
        common.scrollToElement(accountHolderNameInput);
        Log.info("Enter account holder name");
        common.pause(2);
        common.jsClick(paymentTenderDropdown);
        common.pause(2);
        directDebitOption.click();
        Log.info("Select payment tender Direct Debit payment");
        common.pause(2);
        instalmentDateDropdown.click();
        common.pause(2);
        instalmentDate7Option.click();
        common.pause(2);
        sortCodeInput.sendKeys("200000");
        accountNumberInput.sendKeys("55117799");
        accountHolderNameInput.sendKeys("Test");
        Log.info("Enter other payment details");
    }

    public void selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard() {
        common.pause(2);
        common.jsClick(premiumFrequencyMonthly);
        Log.info("Select monthly premium radio button");
        common.scrollToElement(accountHolderNameInput);
        Log.info("Enter account holder name");
        common.pause(1);
        common.jsClick(paymentTenderDropdown);
        common.pause(2);
        creditOrDebitCardOption.click();
        Log.info("Select payment tender Credit/Debit card payment");

        common.pause(1);
        common.jsClick(instalmentDateDropdown);
        common.pause(2);
        common.jsClick(instalmentDate14Option);
        common.pause(2);

        common.waitUntilVisibilityOfElement(cardTypeDropDown);
        common.jsClick(cardTypeDropDown);
        common.pause(1);
        common.jsClick(cardTypeVisa);
        cardHolderNameInput.sendKeys("Test Policy");
        creditCardNumberInput.sendKeys("4929421234600821");
        common.jsClick(cardExpiryMonthDropdown);
        common.pause(1);
        common.jsClick(decMonthOption);
        common.pause(1);

        common.jsClick(cardExpiryYearDropdown);
        common.pause(1);
        common.jsClick(expiryYear2024Option);
        creditCardCvvInput.sendKeys("356");
        Log.info("Enter credit card details");
    }

    public void selectPremiumYearlyAndEnterPaymentDetailsOfDirectDebit() {
        common.jsClick(premiumFrequencyYearly);
        common.jsClick(paymentTenderDropdown);
        common.pause(1);
        directDebitOptionYearly.click();
        common.pause(1);
        sortCodeInput.sendKeys("200000");
        accountNumberInput.sendKeys("55117799");
        accountHolderNameInput.sendKeys("Test User");
    }

    public void selectPremiumYearlyAndEnterPaymentDetailsOfCreditCard() {
        common.jsClick(premiumFrequencyYearly);
        common.pause(1);
        common.jsClick(paymentTenderDropdown);
        common.pause(1);
        creditOrDebitCardOptionYearly.click();
        Log.info("Select yearly payment");

        common.waitUntilVisibilityOfElement(cardTypeDropDown);
        common.jsClick(cardTypeDropDown);
        Log.info("Select Credit/Debit card payment option");
        common.jsClick(cardTypeVisa);
        cardHolderNameInput.sendKeys("Test Policy");
        creditCardNumberInput.sendKeys("4929421234600821");
        common.jsClick(cardExpiryMonthDropdown);
        common.pause(1);
        decMonthOption.click();
        common.pause(2);

        common.jsClick(cardExpiryYearDropdown);
        common.pause(1);
        expiryYear2024Option.click();
        creditCardCvvInput.sendKeys("356");
        Log.info("Enter Credit/Debit card details");
    }

    public void selectPremiumMonthlyAndSelectOtherPaymentOption() {
        common.jsClick(premiumFrequencyMonthly);
        common.pause(2);
        common.jsClick(paymentTenderDropdown);
        common.pause(1);
        common.jsClick(otherPaymentOption);
    }

    public void clickOnPolicyCreateButton() {
        common.waitUntilVisibilityOfElement(createPolicyButton);
        common.jsClick(createPolicyButton);
    }

    public void verifyPolicyDetailsOnPolicyInformationPage(int r, XSSFSheet sheet, int cell) {
        common.waitUntilVisibilityOfElement(policyNumber);
        String generatedPolicyNum = policyNumber.getText();
        Log.info("Created Policy Number: " + generatedPolicyNum);
        common.scroll_By_Pixel("0", "500");
        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Log.info("The actual total premium amount is: " + actualPremiumAmount);

        XSSFRow row = sheet.getRow(r);
        String expectedAmount = row.getCell(cell).getStringCellValue();
        Log.info("The expected total premium amount is: " + expectedAmount);
       // Assert.assertEquals(actualPremiumAmount, expectedAmount, "Total premium is mismatched");

        common.pause(1);
        List<WebElement> tableRow = driver.findElements(By.xpath("//tbody[@role='rowgroup']//tr//td"));
        Log.info("The policy details are: ");
        for (WebElement tableCol : tableRow) {
            System.out.print(tableCol.getText() + "  ");
        }
    }

    public void enterCoverStartDateAndAnswer() {
        common.waitUntilVisibilityOfElement(coverStartDateInput);
        coverStartDateInput.clear();
        coverStartDateInput.sendKeys(common.getFutureDate(5, "dd.MM.yyyy"));
        Log.info("Enter the cover start date");
        common.pause(3);
        common.jsClick(assumptionYesRadioButton);
        common.jsClick(informationConfirmCheckbox);
    }

    public void selectProduct(String product) {
        common.waitUntilVisibilityOfElement(productListDropDown);
        productListDropDown.click();
        common.pause(1);
        driver.findElement(By.xpath("//li[contains(text(),'" + product + "')]")).click();
        Log.info("User select: " + product + " product.");
    }


    public void enterPetInformationCat(int dataRow) {
        XSSFSheet sheet = common.readDataFromExcelSheet("Cat");
        XSSFRow row = sheet.getRow(dataRow);

        common.waitUntilVisibilityOfElement(petNameInputField);
        common.waitUntilElementToBeClickable(petNameInputField);
        String petName = row.getCell(9).getStringCellValue();
        petNameInputField.sendKeys(petName);
        Log.info("Entered pet name: " + petName);

        common.waitUntilVisibilityOfElement(petBreedDropdown);
        common.waitUntilElementToBeClickable(petBreedDropdown);
        common.pause(3);
        petBreedDropdown.click();
        common.waitUntilVisibilityOfElement(speciesDrpDownSearchInputField);

        String species = row.getCell(10).getStringCellValue();
        speciesDrpDownSearchInputField.sendKeys(species);
        common.pause(2);
        speciesDrpDownSearchInputField.sendKeys(Keys.DOWN);
        speciesDrpDownSearchInputField.sendKeys(Keys.ENTER);
        Log.info("User selected species: " + species);
        common.pause(2);

        String gender = row.getCell(11).getStringCellValue();
        petGenderDropDown.click();
        common.pause(1);
        if (gender.equalsIgnoreCase("Male")) {
            genderMaleOption.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            genderFemaleOption.click();
        }
        Log.info("Selected pet gender: " + gender);

        common.pause(1);
        String petBDate = row.getCell(12).getStringCellValue().replace("/", ".");
        petBirthDate.sendKeys(petBDate);
        Log.info("Selected pet birth date: " + petBDate);

        common.pause(2);
        String price = row.getCell(14).getStringCellValue();
        catPurchaseAmountField.sendKeys(price);
        Log.info("Entered pet purchase price: " + price);

        calculateButton.click();
        common.jsClick(calculateButton);
        Log.info("Click on the calculate button");
    }

    public void enterPetInformationDog(int r, XSSFSheet sheet) {
        XSSFRow row = sheet.getRow(r);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(petNameInputField);
        String petName = row.getCell(9).getStringCellValue();
        petNameInputField.sendKeys(petName);

        common.waitUntilVisibilityOfElement(dogBreedTypeDropdown);
        common.pause(1);
        dogBreedTypeDropdown.click();
        common.pause(1);
        String breedType = row.getCell(10).getStringCellValue();
        if (breedType.equalsIgnoreCase("Pedigree")) {
            dogBreedPedigreeOption.click();
            common.waitUntilVisibilityOfElement(petBreedDropdown);
            common.pause(1);
            petBreedDropdown.click();
            common.waitUntilVisibilityOfElement(dogBreedSearchInput);
            String species = row.getCell(13).getStringCellValue();
            dogBreedSearchInput.sendKeys(species);
            common.pause(2);
            dogBreedSearchInput.sendKeys(Keys.DOWN);
            dogBreedSearchInput.sendKeys(Keys.ENTER);
            common.pause(1);
            Log.info("Select pedigree and sub breed of dog: " + species);
        } else if (breedType.equalsIgnoreCase("Mixed Breed")) {
            dogBreedMixedBreedOption.click();
            common.waitUntilElementToBeClickable(petMixedBreedDrpDown1);
            common.pause(2);

            petMixedBreedDrpDown1.click();
            common.waitUntilVisibilityOfElement(petMixedBreedDrpDown1SearchInput);
            String species1 = row.getCell(11).getStringCellValue();
            petMixedBreedDrpDown1SearchInput.sendKeys(species1);
            common.pause(2);
            petMixedBreedDrpDown1SearchInput.sendKeys(Keys.DOWN);
            petMixedBreedDrpDown1SearchInput.sendKeys(Keys.ENTER);
            common.pause(1);

            common.waitUntilElementToBeClickable(petMixedBreedDrpDown2);
            common.pause(1);
            petMixedBreedDrpDown2.click();
            common.waitUntilVisibilityOfElement(petMixedBreedDrpDown2SearchInput);
            String species2 = row.getCell(12).getStringCellValue();
            petMixedBreedDrpDown2SearchInput.sendKeys(species2);
            common.pause(2);
            petMixedBreedDrpDown2SearchInput.sendKeys(Keys.DOWN);
            petMixedBreedDrpDown2SearchInput.sendKeys(Keys.ENTER);
            common.pause(1);
            Log.info("Select mixed and sub breed of dog");
        }

        String gender = row.getCell(14).getStringCellValue();
        petGenderDropDown.click();
        common.pause(1);
        if (gender.equalsIgnoreCase("Male")) {
            genderMaleOption.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            genderFemaleOption.click();
        }
        Log.info("Select pet gender: " + gender);

        common.pause(1);
        String petBDate = row.getCell(15).getStringCellValue().replace("/", ".");
        petBirthDate.sendKeys(petBDate);
        Log.info("Select pet birthdate: " + petBDate);

        common.pause(1);
        String price = row.getCell(17).getStringCellValue();
        dogPurchaseAmountField.sendKeys(price);
        Log.info("Select pet price: " + price);

        calculateButton.click();
        common.jsClick(calculateButton);
        Log.info("Click on the calculate button");
    }

    public void selectPolicyPlanAndAnswerAssumptionsForCat(int r) {
        common.waitUntilVisibilityOfElement(superiorPlan);

        Select keyDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_11']")));
        Select coreDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_9']")));
        Select vitalDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_10']")));
        Select catastrophe1Drp = new Select(driver.findElement(By.cssSelector("select[id='excessm_12']")));
        Select catastrophe2Drp = new Select(driver.findElement(By.cssSelector("select[id='excessm_13']")));

        switch (r) {
            case 2:
                common.jsClick(superiorPlan);
                break;
            case 3:
                common.jsClick(midpointPlan);
                break;
            case 4:
                common.jsClick(entryPlan);
                break;
            case 5:
                common.jsClick(midpointPlan);
                common.jsClick(optionExtraDeathForCat);
                break;
            case 6:
                common.jsClick(midpointPlan);
                common.jsClick(optionExtraTheftOrStrayingForCat);
                break;
            case 7:
                common.jsClick(midpointPlan);
                common.jsClick(optionExtraDeathForCat);
                common.jsClick(optionExtraTheftOrStrayingForCat);
                break;
            case 8:
                common.jsClick(entryPlan);
                common.jsClick(optionExtraDeathForCat);
                break;
            case 9:
                common.jsClick(entryPlan);
                common.jsClick(optionExtraTheftOrStrayingForCat);
                break;
            case 10:
                common.jsClick(entryPlan);
                common.jsClick(optionExtraDeathForCat);
                common.jsClick(optionExtraTheftOrStrayingForCat);
                break;
            case 11:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(0);
                break;
            case 12:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(1);
                break;
            case 13:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(2);
                break;
            case 14:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(3);
                break;
            case 15:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(4);
                break;
            case 16:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(5);
                break;
            case 17:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(6);
                break;
            case 18:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(7);
                break;
            case 19:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(8);
                break;
            case 20:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(0);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 21:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(1);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 22:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(2);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 23:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(3);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 24:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(4);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 25:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(5);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 26:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(6);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 27:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(7);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 28:
                common.jsClick(keyPlan);
                keyDrpDown.selectByIndex(8);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 29:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(0);
                break;
            case 30:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(1);
                break;
            case 31:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(2);
                break;
            case 32:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(3);
                break;
            case 33:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(4);
                break;
            case 34:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(5);
                break;
            case 35:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(6);
                break;
            case 36:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(7);
                break;
            case 37:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(8);
                break;
            case 38:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(0);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 39:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(1);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 40:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(2);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 41:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(3);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 42:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(4);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 43:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(5);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 44:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(6);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 45:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(7);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 46:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByIndex(8);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 47:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(0);
                break;
            case 48:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(1);
                break;
            case 49:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(2);
                break;
            case 50:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(3);
                break;
            case 51:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(4);
                break;
            case 52:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(5);
                break;
            case 53:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(6);
                break;
            case 54:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(7);
                break;
            case 55:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(8);
                break;
            case 56:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(0);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 57:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(1);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 58:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(2);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 59:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(3);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 60:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(4);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 61:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(5);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 62:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(6);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 63:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(7);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 64:
                common.jsClick(corePlan);
                coreDrpDown.selectByIndex(8);
                common.jsClick(optionExtraDayToDayCareForCat);
                break;
            case 65:
                common.jsClick(catastrophe1Plan);
                catastrophe1Drp.selectByIndex(0);
                break;
            case 66:
                common.jsClick(catastrophe1Plan);
                catastrophe1Drp.selectByIndex(1);
                break;
            case 67:
                common.jsClick(catastrophe2Plan);
                catastrophe2Drp.selectByIndex(0);
                break;
            case 68:
                common.jsClick(catastrophe2Plan);
                catastrophe2Drp.selectByIndex(1);
                break;
            case 69:
                common.jsClick(economyPlan);
                break;
            case 70:
                common.jsClick(economyPlan);
                common.jsClick(optionExtraDeathForCat);
                break;
            case 71:
                common.jsClick(economyPlan);
                common.jsClick(optionExtraTheftOrStrayingForCat);
                break;
            case 72:
                common.jsClick(economyPlan);
                common.jsClick(optionExtraDeathForCat);
                common.jsClick(optionExtraTheftOrStrayingForCat);
                break;
        }

        planPopupCloseButton.click();
        common.pause(1);
        coverStartDateInput.sendKeys(common.getFutureDate(15, "dd.MM.yyyy"));
        common.pause(2);
        common.jsClick(assumptionYesRadioButton);
        common.jsClick(assumptionRadioButtonCat);
        common.jsClick(informationConfirmCheckbox);
    }

    public void selectPolicyPlanAndAnswerAssumptionsForDog(int r) {
        common.waitUntilVisibilityOfElement(superiorPlan);

        Select keyDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_25']")));
        Select coreDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_22']")));
        Select vitalDrpDown = new Select(driver.findElement(By.cssSelector("select[id='excessm_23']")));
        Select catastrophe1Drp = new Select(driver.findElement(By.cssSelector("select[id='excessm_26']")));
        Select catastrophe2Drp = new Select(driver.findElement(By.cssSelector("select[id='excessm_28']")));

        switch (r) {
            case 2:
                common.jsClick(superiorPlan);
                break;
            case 3:
                common.jsClick(midpointPlan);
                break;
            case 4:
                common.jsClick(entryPlan);
                break;
            case 5:
                common.jsClick(midpointPlan);
                common.jsClick(optionExtraDeathForDog);
                break;
            case 6:
                common.jsClick(midpointPlan);
                common.jsClick(optionExtraTheftOrStrayingForDog);
                break;
            case 7:
                common.jsClick(midpointPlan);
                common.jsClick(optionExtraDeathForDog);
                common.jsClick(optionExtraTheftOrStrayingForDog);
                break;
            case 8:
                common.jsClick(entryPlan);
                common.jsClick(optionExtraDeathForDog);
                break;
            case 9:
                common.jsClick(entryPlan);
                common.jsClick(optionExtraTheftOrStrayingForDog);
                break;
            case 10:
                common.jsClick(entryPlan);
                common.jsClick(optionExtraDeathForDog);
                common.jsClick(optionExtraTheftOrStrayingForDog);
                break;
            case 11:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 70% + £0");
                common.pause(10);
                break;
            case 12:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 70% + £60");
                break;
            case 13:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 70% + £120");
                break;
            case 14:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 80% + £0");
                break;
            case 15:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 80% + £60");
                break;
            case 16:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 80% + £120");
                break;
            case 17:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 90% + £0");
                break;
            case 18:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 90% + £60");
                break;
            case 19:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 90% + £120");
                break;
            case 20:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 70% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 21:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 70% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 22:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 70% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 23:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 80% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 24:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 80% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 25:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 80% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 26:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 90% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 27:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 90% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 28:
                common.jsClick(keyPlan);
                keyDrpDown.selectByVisibleText(" 90% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 29:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 70% + £0");
                break;
            case 30:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 70% + £60");
                break;
            case 31:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 70% + £120");
                break;
            case 32:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 80% + £0");
                break;
            case 33:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 80% + £60");
                break;
            case 34:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 80% + £120");
                break;
            case 35:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 90% + £0");
                break;
            case 36:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 90% + £60");
                break;
            case 37:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 90% + £120");
                break;
            case 38:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 70% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 39:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 70% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 40:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 70% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 41:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 80% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 42:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 80% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 43:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 80% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 44:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 90% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 45:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 90% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 46:
                common.jsClick(vitalPlan);
                vitalDrpDown.selectByVisibleText(" 90% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 47:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 70% + £0");
                break;
            case 48:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 70% + £60");
                break;
            case 49:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 70% + £120");
                break;
            case 50:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 80% + £0");
                break;
            case 51:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 80% + £60");
                break;
            case 52:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 80% + £120");
                break;
            case 53:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 90% + £0");
                break;
            case 54:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 90% + £60");
                break;
            case 55:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 90% + £120");
                break;
            case 56:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 70% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 57:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 70% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 58:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 70% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 59:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 80% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 60:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 80% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 61:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 80% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 62:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 90% + £0");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 63:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 90% + £60");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 64:
                common.jsClick(corePlan);
                coreDrpDown.selectByVisibleText(" 90% + £120");
                common.jsClick(optionExtraDayToDayCareForDog);
                break;
            case 65:
                common.jsClick(catastrophe1Plan);
                catastrophe1Drp.selectByVisibleText(" Excess £450");
                break;
            case 66:
                common.jsClick(catastrophe1Plan);
                catastrophe1Drp.selectByVisibleText(" Excess £450");
                optionExtraThirdPartyLiabilityForDog.click();
                break;
            case 67:
                common.jsClick(catastrophe1Plan);
                catastrophe1Drp.selectByVisibleText(" Excess £900");
                break;
            case 68:
                common.jsClick(catastrophe1Plan);
                catastrophe1Drp.selectByVisibleText(" Excess £900");
                optionExtraThirdPartyLiabilityForDog.click();
                break;
            case 69:
                common.jsClick(catastrophe2Plan);
                catastrophe2Drp.selectByVisibleText(" Excess £450");
                break;
            case 70:
                common.jsClick(catastrophe2Plan);
                catastrophe2Drp.selectByVisibleText(" Excess £450");
                optionExtraThirdPartyLiabilityForDog.click();
                break;
            case 71:
                common.jsClick(catastrophe2Plan);
                catastrophe2Drp.selectByVisibleText(" Excess £900");
                break;
            case 72:
                common.jsClick(catastrophe2Plan);
                catastrophe2Drp.selectByVisibleText(" Excess £900");
                optionExtraThirdPartyLiabilityForDog.click();
                break;
            case 73:
                common.jsClick(economyPlan);
                break;
            case 74:
                common.jsClick(economyPlan);
                common.jsClick(optionExtraDeathForDog);
                break;
            case 75:
                common.jsClick(economyPlan);
                common.jsClick(optionExtraTheftOrStrayingForDog);
                break;
            case 76:
                common.jsClick(economyPlan);
                common.jsClick(optionExtraDeathForDog);
                common.jsClick(optionExtraTheftOrStrayingForDog);
                break;
        }

        planPopupCloseButton.click();
        common.pause(1);
        coverStartDateInputForDog.sendKeys(common.getFutureDate(10, "dd.MM.yyyy"));
        common.pause(1);
        petMicrochipNumberInput.sendKeys(common.generateRandomNumber(4));
        common.jsClick(petAssumption1ForDog);
        common.jsClick(petAssumption2ForDog);
        common.jsClick(petAssumption3ForDog);
    }

    public void selectProductAndEnterPetDetails(int r) {
        XSSFSheet sheet = common.readDataFromExcelSheet("Exotic");
        XSSFRow row = sheet.getRow(r);
        selectProduct("Exotic");
        common.waitUntilVisibilityOfElement(petSpeciesDropDown);
        common.pause(2);
        petSpeciesDropDown.click();
        common.waitUntilVisibilityOfElement(speciesDrpDownSearchInputField);

        String species = row.getCell(10).getStringCellValue();
        speciesDrpDownSearchInputField.sendKeys(species);
        common.pause(2);
        speciesDrpDownSearchInputField.sendKeys(Keys.DOWN);
        speciesDrpDownSearchInputField.sendKeys(Keys.ENTER);
        common.pause(2);

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

        common.pause(1);
        String petBDate = row.getCell(13).getStringCellValue().replace("/", ".");
        petBirthDate.sendKeys(petBDate);

        common.pause(2);
        int price = (int) row.getCell(15).getNumericCellValue();
        petPurchaseAmount.sendKeys(String.valueOf(price));

        calculateButton.click();
        common.waitUntilVisibilityOfElement(calculateButton);
        common.jsClick(calculateButton);

        common.pause(2);
        common.scroll_By_Pixel("0", "500");
        common.waitUntilVisibilityOfElement(premierPlanHigh);
    }

    public void selectHorsePolicyDetails(int r, XSSFSheet sheet) {
        XSSFRow row = sheet.getRow(r);
        common.waitUntilPresenceOfElement("//div[@id='loading' and @style='display: none;']");
        common.waitUntilVisibilityOfElement(addAnAgentDropdown);
        addAnAgentDropdown.click();
        common.pause(1);
        addAnAgentDropdownOptionNo.click();
        Log.info("User select no option in the Agent dropdown");
        common.pause(2);

        String insuranceOption = row.getCell(9).getStringCellValue();

        if (insuranceOption.equals("Horse Insurance")) {
            horseInsuranceRadioButton.click();
            Log.info("User selects Horse Insurance option");
            common.pause(2);

            String petName = row.getCell(10).getStringCellValue();
            horseNameInputField.sendKeys(petName);
            common.pause(1);
            Log.info("User select pet name: " + petName);

            horseBreedDropDown.click();
            common.pause(1);

            String horseBreed = row.getCell(11).getStringCellValue();
            horseBreedSearchInputField.sendKeys(horseBreed);
            common.pause(1);
            horseBreedSearchInputField.sendKeys(Keys.DOWN);
            horseBreedSearchInputField.sendKeys(Keys.ENTER);
            Log.info("User select horse breed: " + horseBreed);

            String horseBirthDate = row.getCell(13).getStringCellValue().replace("/", ".");
            horseBirthDateInputField.sendKeys(horseBirthDate);
            Log.info("User select horse birth date: " + horseBirthDate);

            String isHorseOwnedOrHomeBredOrOnLoan = row.getCell(15).getStringCellValue();
            horseOwnedLoanOrHomeBredDropdown.click();
            common.pause(1);

            switch (isHorseOwnedOrHomeBredOrOnLoan) {
                case "HomeBred" -> {
                    horseHomeBredOption.click();
                    common.pause(1);
                    String studFees = row.getCell(16).getStringCellValue();
                    studFeesInputField.sendKeys(studFees);
                }
                case "On Loan" -> horseOnLoanOption.click();
                case "Owned" -> {
                    horseOwnedOption.click();
                    common.pause(1);

                    String horsePurchasedDate = common.getPastDate(331, "dd.MM.yyyy");
                    horsePurchasedDataInputField.sendKeys(horsePurchasedDate);

                    String horsePurchasePrice = row.getCell(17).getStringCellValue();
                    horsePurchasePriceInputField.sendKeys(horsePurchasePrice);
                }
            }

            common.waitUntilVisibilityOfElement(horseCurrentMarketValueInputField);
            String horseCurrentMarketValue = row.getCell(18).getStringCellValue();
            horseCurrentMarketValueInputField.sendKeys(horseCurrentMarketValue);
            String horseActivityGroup = row.getCell(19).getStringCellValue();

            switch (horseActivityGroup) {
                case "Group 1" -> horseActivitiesGroup1.click();
                case "Group 2" -> horseActivitiesGroup2.click();
                case "Group 3" -> horseActivitiesGroup3.click();
                case "Group 4" -> horseActivitiesGroup4.click();
            }

            calculateButton.click();
            common.pause(1);
            if (common.isElementDisplayed(calculateButton)) {
                common.jsClick(calculateButton);
            }
        } else if (insuranceOption.equals("Horse Liability Cover")) {
            horseLiabilityCoverRadioButton.click();
            Log.info("User selects Horse Liability Cover option");
            common.pause(2);

            String petName = row.getCell(10).getStringCellValue();
            horseNameInputFieldForLiability.sendKeys(petName);
            common.pause(1);
            Log.info("User select pet name: " + petName);

            horseBreedDropDownForLiability.click();
            common.pause(1);

            String horseBreed = row.getCell(11).getStringCellValue();
            horseBreedSearchInputFieldForLiability.sendKeys(horseBreed);
            common.pause(1);
            horseBreedSearchInputFieldForLiability.sendKeys(Keys.DOWN);
            horseBreedSearchInputFieldForLiability.sendKeys(Keys.ENTER);
            Log.info("User select horse breed: " + horseBreed);

            String horseBirthDate = row.getCell(13).getStringCellValue().replace("/", ".");
            horseBirthDateInputFieldForLiability.sendKeys(horseBirthDate);
            Log.info("User select horse birth date: " + horseBirthDate);

            calculateButton.click();
            common.pause(1);
            if (common.isElementDisplayed(calculateButton)) {
                common.jsClick(calculateButton);
            }
        }
    }

    public void enterCoverStartDateAndQuestionary(int r, XSSFSheet sheet) {
        XSSFRow row = sheet.getRow(r);
        common.waitUntilVisibilityOfElement(coverStartDateInputField);
        String coverStartDate = common.getFutureDate(10, "dd.MM.yyyy");
        coverStartDateInputField.sendKeys(coverStartDate);
        common.pause(1);

        horseColourDropDown.click();
        common.pause(1);

        if (r > 37) {
            driver.findElement(By.xpath("//ul[@id='Question_33427_listbox']//li[2]")).click();
        } else {
            driver.findElement(By.xpath("//ul[@id='Question_33427_listbox']//li[" + r + "]")).click();
        }

        horseSexDropDown.click();
        common.pause(1);

        String horseSex = row.getCell(21).getStringCellValue();
        switch (horseSex) {
            case "Colt" -> horseSexColtOption.click();
            case "Filly" -> horseSexFillyOption.click();
            case "Gelding" -> horseSexGeldingOption.click();
            case "Mare" -> horseSexMareOption.click();
            case "Stallion" -> horseSexStallionOption.click();
        }

        common.pause(1);
        horseHeightDropDown.click();
        common.pause(1);
        if (r > 61) {
            driver.findElement(By.xpath("//ul[@id='Question_33429_listbox']//li[2]")).click();
        } else {
            driver.findElement(By.xpath("//ul[@id='Question_33429_listbox']//li[" + r + "]")).click();
        }

        common.pause(2);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton2);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton3);

    }

    public void selectPolicyPlanForTheHorse(int r) {
        common.waitUntilVisibilityOfElement(horseInsuranceBasicPlanCheckbox);

        switch (r) {
            case 2: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                Log.info("Basic Horse plan is not selected default");
                break;
            }
            case 3: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(disposalOptionalExtraCheckbox);
                break;
            }
            case 4: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(veterinaryFeeOptionalExtraCheckbox);
                break;
            }
            case 5: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(veterinaryFeeOptionalExtraCheckbox);
                common.jsClick(veterinaryFeesCoverLevelSuperiorRadio);
                break;
            }
            case 6: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(permanentLossOfUseOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseCoverLevel60);
                common.jsClick(permanentLossOfUseOkButton);
                break;
            }
            case 7: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(permanentLossOfUseOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseCoverLevel100);
                common.jsClick(permanentLossOfUseOkButton);
                break;
            }
            case 8: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                break;
            }
            case 9: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                common.jsClick(thirdPartyLiabilityCoverLevelOption2);
                break;
            }
            case 10: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                break;
            }
            case 11: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                common.jsClick(personalAccidentCoverLevelOption2);
                break;
            }
            case 12: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(disposalOptionalExtraCheckbox);
                common.jsClick(veterinaryFeeOptionalExtraCheckbox);
                break;
            }
            case 13: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(permanentLossOfUseOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseOkButton);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                break;
            }
            case 14: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(disposalOptionalExtraCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                break;
            }
            case 15: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(permanentLossOfUseOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseOkButton);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                break;
            }
            case 16: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(disposalOptionalExtraCheckbox);
                common.jsClick(veterinaryFeeOptionalExtraCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                break;
            }
            case 17: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(disposalOptionalExtraCheckbox);
                common.jsClick(veterinaryFeeOptionalExtraCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseOkButton);
                break;
            }
            case 18: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(disposalOptionalExtraCheckbox);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseOkButton);
                break;
            }
            case 19: {
                boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
                Assert.assertTrue(basicPlanIsDefaultSelected);
                common.jsClick(disposalOptionalExtraCheckbox);
                common.jsClick(veterinaryFeeOptionalExtraCheckbox);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseOptionalExtraCheckbox);
                common.jsClick(permanentLossOfUseOkButton);
                break;
            }
            case 20:
                common.jsClick(seniorHorseInsurancePlanACheckbox);
                break;

            case 21:
                common.jsClick(seniorHorseInsurancePlanACheckbox);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                break;

            case 22:
                common.jsClick(seniorHorseInsurancePlanACheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                break;

            case 23:
                common.jsClick(seniorHorseInsurancePlanACheckbox);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                break;
            case 24:
                common.jsClick(seniorHorseInsurancePlanBCheckbox);
                break;

            case 25:
                common.jsClick(seniorHorseInsurancePlanBCheckbox);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                break;

            case 26:
                common.jsClick(seniorHorseInsurancePlanBCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                break;

            case 27:
                common.jsClick(seniorHorseInsurancePlanBCheckbox);
                common.jsClick(thirdPartyLiabilityOptionalExtraCheckbox);
                common.jsClick(personalAccidentOptionalExtraCheckbox);
                break;

            case 28: {
                boolean horseLiabilityPlanIsSelected = horseLiabilityCoverPlanCheckbox.isSelected();
                Assert.assertTrue(horseLiabilityPlanIsSelected);
            }
        }
        common.jsClick(planPopupCloseButton);

    }

    // Create the Horse Policy with the Basic Horse plan and the Saddlery and Tack Optional Extra

    public void selectExistingClientFromTheDropdown() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        common.waitUntilVisibilityOfElement(clientIdInputField);
        String existingClientName = "TEST-00065";
        clientIdInputField.sendKeys(existingClientName);
        common.pause(10);
        clientIdInputField.sendKeys(Keys.DOWN);
        clientIdInputField.sendKeys(Keys.ENTER);

        common.jsClick(hearAboutUsDropDown);
        common.pause(1);
        hearAboutUsOption.click();
        selectProduct("Horse");
        selectHorsePolicyDetails(2, sheet);
    }

    public void selectHorseBasicPlanAndSaddleryAndTackOptionalExtra() {
        common.waitUntilVisibilityOfElement(horseInsuranceBasicPlanCheckbox);
        boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
        if (!basicPlanIsDefaultSelected) {
            Log.info("Basic Horse plan is not selected default");
            horseInsuranceBasicPlanCheckbox.click();
        }
        common.jsClick(saddleryAndTackOptionalExtraCheckbox);
        common.pause(1);
        String saddleryAndTackValue = "9000";
        common.sendKeys(saddleryAndTackValueInputField, saddleryAndTackValue);
        saveButtonSaddleryAndTack.click();
        common.pause(1);
        common.jsClick(planPopupCloseButton);
    }

    public void selectHorseBasicPlanAndHorseTrailersAndHorseDrawnVehiclesOptionalExtra() {
        common.waitUntilVisibilityOfElement(horseInsuranceBasicPlanCheckbox);
        boolean basicPlanIsDefaultSelected = horseInsuranceBasicPlanCheckbox.isSelected();
        if (!basicPlanIsDefaultSelected) {
            Log.info("Basic Horse plan is not selected default");
            horseInsuranceBasicPlanCheckbox.click();
        }
        common.jsClick(horseTrailerAndDrawnVehiclesOptionalExtraCheckbox);
        common.pause(1);
        String horseTrailerAndDrownVehicleValue = "15000";
        common.sendKeys(horseTrailersAndHorseDrawnVehicleValueInputField, horseTrailerAndDrownVehicleValue);
        saveButtonHorseTrailersOrDrawnVehicles.click();
        common.pause(1);
        common.jsClick(planPopupCloseButton);
    }

    public void enterCoverStartDateAndQuestionaryForTheSaddleryAndTackPlan() {
        common.waitUntilVisibilityOfElement(coverStartDateInputField);
        String coverStartDate = common.getFutureDate(10, "dd.MM.yyyy");
        coverStartDateInputField.sendKeys(coverStartDate);
        common.pause(1);

        horseColourDropDown.click();
        common.pause(1);
        horseColourOption.click();

        horseSexDropDown.click();
        common.pause(1);
        horseSexColtOption.click();

        common.pause(1);
        horseHeightDropDown.click();
        common.pause(1);
        horseHeightOption.click();

        common.jsClick(saddleryAndTackValuedOver200NoRadio);
        common.jsClick(saddleryAndTackValuedUnder200NoRadio);
        common.jsClick(saddleryAndTackHaveAnyDamageNoRadio);

        common.pause(1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton2);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton3);

        common.pause(2);
        selectPremiumYearlyAndEnterPaymentDetailsOfDirectDebit();
        clickOnPolicyCreateButton();
    }

    public void verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage(String expectedPolicyPremium) {
        common.waitUntilVisibilityOfElement(policyNumber);
        String generatedPolicyNum = policyNumber.getText();
        Log.info("Created Policy Number: " + generatedPolicyNum);
        common.scroll_By_Pixel("0", "500");
        common.waitUntilVisibilityOfElement(totalPremiumAmount);
        String actualPremiumAmount = totalPremiumAmount.getText().substring(2);
        Log.info("The actual total premium amount is: " + actualPremiumAmount);

        Log.info("The expected total premium amount is: " + expectedPolicyPremium);
       // Assert.assertEquals(actualPremiumAmount, expectedPolicyPremium, "Total premium is mismatched");

        common.pause(1);
        List<WebElement> tableRow = driver.findElements(By.xpath("//tbody[@role='rowgroup']//tr//td"));
        Log.info("The policy details are: ");
        for (WebElement tableCol : tableRow) {
            System.out.print(tableCol.getText() + "  ");
        }

    }

    public void enterCoverStartDateAndQuestionaryForTheHorseTrailersAndHorseDrawnVehiclePlan() {
        common.waitUntilVisibilityOfElement(coverStartDateInputField);
        String coverStartDate = common.getFutureDate(10, "dd.MM.yyyy");
        coverStartDateInputField.sendKeys(coverStartDate);
        common.pause(1);

        horseColourDropDown.click();
        common.pause(1);
        horseColourOption.click();

        horseSexDropDown.click();
        common.pause(1);
        horseSexColtOption.click();

        common.pause(1);
        horseHeightDropDown.click();
        common.pause(1);
        horseHeightOption.click();

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

        common.pause(2);
        selectPremiumYearlyAndEnterPaymentDetailsOfCreditCard();
        clickOnPolicyCreateButton();
    }

    public void selectExistingClientFromTheDropdownAndEnterDetailsForSeniorHorsePlan(String seniorHorse) {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        common.waitUntilVisibilityOfElement(clientIdInputField);
        String existingClientName = "TEST-00065";
        clientIdInputField.sendKeys(existingClientName);
        common.pause(10);
        clientIdInputField.sendKeys(Keys.DOWN);
        clientIdInputField.sendKeys(Keys.ENTER);

        common.jsClick(hearAboutUsDropDown);
        common.pause(1);
        hearAboutUsOption.click();
        selectProduct("Horse");
        if (seniorHorse.equals("A")) {
            selectHorsePolicyDetails(20, sheet);
        } else {
            selectHorsePolicyDetails(24, sheet);
        }
    }

    public void selectHorseSeniorPlanAndSaddleryAndTackOptionalExtra() {
        common.waitUntilVisibilityOfElement(seniorHorseInsurancePlanACheckbox);
        seniorHorseInsurancePlanACheckbox.click();
        common.pause(2);

        common.jsClick(saddleryAndTackOptionalExtraCheckbox);
        common.pause(1);
        String saddleryAndTackValue = "10000";
        common.sendKeys(saddleryAndTackValueInputField, saddleryAndTackValue);
        saveButtonSaddleryAndTack.click();
        common.pause(1);
        common.jsClick(planPopupCloseButton);
    }

    public void selectHorseSeniorPlanAndHorseTrailerAndDrownVehicleOptionalExtra() {
        common.waitUntilVisibilityOfElement(seniorHorseInsurancePlanACheckbox);
        seniorHorseInsurancePlanACheckbox.click();
        common.pause(2);

        common.jsClick(horseTrailerAndDrawnVehiclesOptionalExtraCheckbox);
        common.pause(1);
        String horseTrailerValue = "20000";
        common.sendKeys(horseTrailersAndHorseDrawnVehicleValueInputField, horseTrailerValue);
        saveButtonHorseTrailersOrDrawnVehicles.click();
        common.pause(1);
        common.jsClick(planPopupCloseButton);
    }

    public void selectHorseSeniorPlanBAndSaddleryAndTackOptionalExtra() {
        common.waitUntilVisibilityOfElement(seniorHorseInsurancePlanBCheckbox);
        seniorHorseInsurancePlanBCheckbox.click();
        common.pause(2);

        common.jsClick(saddleryAndTackOptionalExtraCheckbox);
        common.pause(1);
        String saddleryAndTackValue = "10000";
        common.sendKeys(saddleryAndTackValueInputField, saddleryAndTackValue);
        saveButtonSaddleryAndTack.click();
        common.pause(1);
        common.jsClick(planPopupCloseButton);
    }

    public void selectHorseSeniorPlanBAndHorseTrailerAndDrownVehicleOptionalExtra() {
        common.waitUntilVisibilityOfElement(seniorHorseInsurancePlanBCheckbox);
        seniorHorseInsurancePlanBCheckbox.click();
        common.pause(2);

        common.jsClick(horseTrailerAndDrawnVehiclesOptionalExtraCheckbox);
        common.pause(1);
        String horseTrailerValue = "20000";
        common.sendKeys(horseTrailersAndHorseDrawnVehicleValueInputField, horseTrailerValue);
        saveButtonHorseTrailersOrDrawnVehicles.click();
        common.pause(1);
        common.jsClick(planPopupCloseButton);
    }

    public void selectHorseLiabilityProduct() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Horse");
        common.waitUntilVisibilityOfElement(clientIdInputField);
        String existingClientName = "TEST-00065";
        clientIdInputField.sendKeys(existingClientName);
        common.pause(10);
        clientIdInputField.sendKeys(Keys.DOWN);
        clientIdInputField.sendKeys(Keys.ENTER);

        common.jsClick(hearAboutUsDropDown);
        common.pause(1);
        hearAboutUsOption.click();
        selectProduct("Horse");
        selectHorsePolicyDetails(28, sheet);
    }

    public void verifyTheHorseLiabilityPlanIsSelected(String cover) {
        common.waitUntilVisibilityOfElement(horseLiabilityCoverPlanCheckbox);
        boolean basicPlanIsDefaultSelected = horseLiabilityCoverPlanCheckbox.isSelected();
        if (!basicPlanIsDefaultSelected) {
            Log.info("Horse liability plan is not selected default");
            horseLiabilityCoverPlanCheckbox.click();
        }
        if (cover.equals("2M")) {
            common.jsClick(horseLiabilityCoverLevel2MRadioButton);
        }
        common.pause(1);
        common.jsClick(planPopupCloseButton);
    }

    public void selectCoverStartDateAndEnterUWQuestionsEnterPaymentDetailsAndClickOnCreatePolicy() {
        common.waitUntilVisibilityOfElement(coverStartDateInputField);
        String coverStartDate = common.getFutureDate(10, "dd.MM.yyyy");
        coverStartDateInputField.sendKeys(coverStartDate);
        common.pause(1);

        horseColourDropDownForLiabilityPlan.click();
        common.pause(1);
        horseColourOptionForLiabilityPlan.click();

        horseSexDropDownForLiabilityPlan.click();
        common.pause(1);
        horseSexColtOptionForLiabilityPlan.click();

        common.pause(1);
        horseHeightDropDownForLiabilityPlan.click();
        common.pause(1);
        horseHeightOptionForLiabilityPlan.click();

        common.pause(1);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton1ForLiability);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton2ForLiability);
        common.jsClick(horseStatementsTrueOrNotYesRadioButton3ForLiability);

        common.pause(2);
        selectPremiumYearlyAndEnterPaymentDetailsOfCreditCard();
        clickOnPolicyCreateButton();
    }

}
