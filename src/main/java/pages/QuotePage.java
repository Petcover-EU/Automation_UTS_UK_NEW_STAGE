package pages;

import factory.DriverFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utils.Common;
import utils.Log;

import java.util.List;

public class QuotePage {

    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());
    SoftAssert softAssert = new SoftAssert();

    public QuotePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(4)")
    private WebElement quoteIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessage;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/a[2]")
    private WebElement addQuoteButton;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement messageOnAddQuotePage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody[1]/tr/td[16]")
    private WebElement monthlyPremiumColumn;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[3]")
    private WebElement microchipButton;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div/div[4]/div/div/span")
    private WebElement productListDropDown;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div/div[5]/div/div/div/button")
    private WebElement quoteStatusDropDown;
    @FindBy(xpath = "//div[@class='ms-drop']/ul/li[1]")
    private WebElement statusOpen;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div[1]/div[1]/div[2]/div/span")
    private WebElement productDropdown;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;
    @FindBy(xpath = "//ul[@id='ProductId_listbox']/li[3]")
    private WebElement optionsFromProductDD;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div[1]/div[1]/div[3]/div/span")
    private WebElement isReferredDropdown;
    @FindBy(xpath = "//ul[@id='IsReferRequired_listbox']/li[3]")
    private WebElement optionsFromIsReferredDD;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div[1]/div[2]/div[3]/div/span")
    private WebElement divisionDropdown;
    @FindBy(xpath = "//ul[@id='DivisionId_listbox']/li[2]")
    private WebElement optionsFromDivisionDD;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr")
    private WebElement detailsOfQuotes;

    //Fetch quote on manage quote page based on quote number
    @FindBy(css = "input[id='QuoteNumber']")
    private WebElement quoteSearchBox;
    //Verify include payment feature of quote module for Qa
    @FindBy(css = "div[id='search']>:nth-child(2)>:nth-child(4)>:nth-child(1)>div[class^='icheckbox_square-green']")
    private WebElement includePaymentCheckBox;
    @FindBy(css = "div[id='search']>:nth-child(2)>:nth-child(5)>:nth-child(1)>div")
    private WebElement petIdCheckBox;
    //Upload Microchip page
    @FindBy(xpath = "//div[@id='MicrochipFileUploadAuditGrid']/table/tbody/tr")
    private WebElement fileNameLinkOnUploadMicrochipPage;
    @FindBy(xpath = "//div[@class='k-widget k-window']/div/div/a/span")
    private WebElement cancelIconOnUploadWindow;
    @FindBy(css = "input[type='file']")
    private WebElement chooseFileButton;
    @FindBy(xpath = "//div[@class='row search-row']/div[2]/div/button")
    private WebElement uploadFileButton;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[4]")
    private WebElement pendingMicrochipButton;
    @FindBy(xpath = "//div[@id='PendingMicrochipFileUploadAuditGrid']/table/tbody/tr/td")
    private WebElement detailsOnPendingMicrochipPage;

    //Edit quote information and verifies the same
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[20]/ul/li/a")
    private WebElement selectCogIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[20]/ul/li/ul/li[1]/a")
    private WebElement selectEditQuoteIcon;
    @FindBy(css = "input[id='Address1']")
    private WebElement enterPostCodeInAddressDropDown;
    @FindBy(xpath = "//div[@id='cc_c2a']/ul/li[3]")
    private WebElement selectPostCodeFromDD;
    @FindBy(xpath = "//div[@id='divhear']//span[@class='k-select']")
    private WebElement hearAboutUsDropDown;
    @FindBy(xpath = "//ul[@id='HearAboutUs_listbox']/li[3]")
    private WebElement selectOptionFromHearAboutUsDD;
    @FindBy(xpath = "//div[@id='Div_138']/div/div/span")
    private WebElement petSpeciesDropDown;
    @FindBy(xpath = "//ul[@id='Question_138_listbox']/li[6]")
    private WebElement selectOptionFromPetSpeciesDD;
    @FindBy(xpath = "//div[@id='Div_139']/div/div/input | //div[@id='Div_11365']/div/div/input | //div[@id='Div_11307']/div/div/input")
    private WebElement petNameInputField;
    @FindBy(xpath = "//div[@id='Div_140']//span[@class='k-select'] | //div[@id='Div_11367']//span[@class='k-select'] | //div[@id='Div_11312']//span[@class='k-select']")
    private WebElement petGenderDropDown;
    @FindBy(xpath = "//ul[@id='Question_140_listbox']/li[2]")
    private WebElement selectOptionsFromPetGDD;
    @FindBy(xpath = "//input[@id='Question_141'] | //input[@id='Question_11368'] | //input[@id='Question_11313']")
    private WebElement petBirthDate;
    @FindBy(css = ".k-formatted-value.cls_EM127V.k-input")
    private WebElement petPurchaseAmount;
    @FindBy(css = "input[id='Question_231']")
    private WebElement petAdminFees;
    @FindBy(xpath = "//button[@id='btnCalculate']")
    private WebElement calculateButton;
    @FindBy(css = "input[class='k-formatted-value cls_CAT00005 k-input']")
    private WebElement catPurchaseAmountField;
    @FindBy(xpath = "//button[@class='btn btn-primary' and @data-dismiss='modal']")
    private WebElement closeButton;
    @FindBy(xpath = "//div[@id='divQuoteSavebutton']/div[2]/div/button[2]")
    private WebElement saveButton;
    @FindBy(xpath = "//div[@class='col-lg-4 view-column form-group ']/div[3] /div/label")
    private WebElement fetchPetBreed;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[2]/a")
    private WebElement quoteLinkOnManageQuotePage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[5]/div")
    private WebElement quoteCodeOnManageQuotePage;
    @FindBy(css = "button[class='btn boxcolor boxcolor-blue']")
    private WebElement quoteStatusCode;

    //Policy

    @FindBy(xpath = "//div[@class='form-group']//input[@id='ClientTypeId_1']")
    private WebElement clientTypeIndividual;
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
    @FindBy(xpath = "//tbody[@role='rowgroup']//tr//td[8]")
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

    public String verifyManageQuotePage() {
        common.waitUntilElementToBeClickable(quoteIcon);
        quoteIcon.click();
        common.pause(2);
        return displayedMessage.getText();
    }

    public String fetchAndDisplayedData() {
        List<WebElement> totalRow = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder array = new StringBuilder();
        for (WebElement rEle : totalRow) {
            array.append(rEle.getText()).append("\n");
        }
        return array.toString();
    }

    public String verifyQuoteDateColumnFormat() {
        List<WebElement> quoteDateColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[3]");
        StringBuilder date = new StringBuilder();
        for (WebElement quoteDate : quoteDateColumn) {
            date.append(quoteDate.getText()).append("\n");
        }
        return date.toString();
    }

    public String verifyExpireDateColumnFormat() {
        List<WebElement> expireDateColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[4]");
        StringBuilder date = new StringBuilder();
        for (WebElement expireDate : expireDateColumn) {
            date.append(expireDate.getText()).append("\n");
        }
        return date.toString();
    }

    public void clickOnAddQuoteButton() {
        common.waitUntilVisibilityOfElement(addQuoteButton);
        common.pause(1);
        addQuoteButton.click();
        common.pause(1);
    }

    public String verifyAddQuotePage() {
        return messageOnAddQuotePage.getText();
    }

    public String verifyTotalPremiumColumn() {
        common.pause(2);
        common.scrollToElement(monthlyPremiumColumn);
        common.pause(2);
        List<WebElement> yearlyPremiumColum = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[17]");
        StringBuilder yPremium = new StringBuilder();
        for (WebElement amountP : yearlyPremiumColum) {
            yPremium.append(amountP.getText()).append("\n");
        }
        return yPremium.toString();
    }

    public String verifyMonthlyPremiumColumn() {
        List<WebElement> monthlyPremiumColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[18]");
        StringBuilder yPremium = new StringBuilder();
        for (WebElement amountP : monthlyPremiumColumn) {
            yPremium.append(amountP.getText()).append("\n");
        }
        return yPremium.toString();
    }

    public String clickOnMicrochipButton() {
        microchipButton.click();
        common.pause(3);
        return displayedMessage.getText();
    }

    public String verifyDataOnMicrochipPage() {
        List<WebElement> totalRow = common.waitUntilPresenceOfAllElement("//div[@id='MicrochipFileUploadAuditGrid']/table/tbody/tr");
        StringBuilder data = new StringBuilder();
        for (WebElement rEle : totalRow) {
            data.append(rEle.getText()).append("\n");
        }
        return data.toString();
    }

    public String verifyProductList() {
        common.pause(2);
        productListDropDown.click();
        common.pause(2);
        List<WebElement> pList = common.waitUntilPresenceOfAllElement("//ul[@id='PrimaryProductId_listbox']//li");
        System.out.println(pList.size());

        StringBuilder verfiy = new StringBuilder();
        for (WebElement product : pList) {
            verfiy.append(product.getText()).append("\n");
        }
        return verfiy.toString();
    }

    public String fetchDataOfQuoteInformation() {
        List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody[1]/tr/td[2]/a");
        StringBuilder displayMessage = new StringBuilder();
        for (WebElement cEle : totalColumn) {
            System.out.println(cEle.getText());

            cEle.click();
            common.pause(3);
            common.switchToWindow(1);
            System.out.println(driver.getCurrentUrl());
            displayMessage.append(displayedMessage.getText()).append("\n");

            driver.close();
            common.switchToWindow(0);
        }
        return displayMessage.toString();
    }

    //Items on manage quote page displays upon option selects from quote status dropdown
    public void SelectItemFromDropDown() {
        quoteStatusDropDown.click();
        common.pause(3);
        statusOpen.click();
        searchButton.click();
        common.pause(3);
    }

    public String fetchAndVerifyDataAgainstDropDown() {

        List<WebElement> totalRow = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder array = new StringBuilder();
        for (WebElement rEle : totalRow) {
            array.append(rEle.getText()).append("\n");
        }
        return array.toString();
    }

    //Fetch list of quote based upon product drop down

    public void selectOptionFromProductDropDown() {
        common.waitUntilVisibilityOfElement(productDropdown);
        productDropdown.click();
        common.pause(2);
        optionsFromProductDD.click();
    }

    public void clickOnSearchButton() {
        searchButton.click();
        common.pause(3);
    }

    public List<WebElement> verifyListOfQuoteBasedOnProductDD() {
        return common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
    }

    //Fetch list of quote based on option from Is referred dropdown on manage quote page

    public void selectOptionFromIsReferredDropDown() {
        isReferredDropdown.click();
        common.pause(1);
        optionsFromIsReferredDD.click();
    }

    public List<WebElement> verifyListOfQuoteBasedOnIsReferredDD() {
        return common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr//td[20]");
    }

    //Fetch list of quote based on option from division dropdown on manage quote page

    public void selectOptionFromDivisionDropDown() {

        divisionDropdown.click();
        common.pause(1);
        optionsFromDivisionDD.click();
    }

    public String verifyListOfQuoteBasedOnDivisionDD() {
        return detailsOfQuotes.getText();
    }

    //Verify include payment feature of quote module for Qa

    public void selectPetIdCheckBox() {
        common.pause(1);
        petIdCheckBox.click();
    }

    public String verifyPetIdDetailsOfQuote() {
        return detailsOfQuotes.getText();
    }

    //Upload details window should open by clicking on file name link on microchip file upload page

    public void clickOnFileNameLink() {
        List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@id='MicrochipFileUploadAuditGrid']/table/tbody/tr");

        for (WebElement cEle : totalColumn) {
            cEle.click();
            common.pause(2);
            break;
        }

    }

    public void clickOnCancelButtonOnUploadWindow() {
        //WebDriverWait wait=new WebDriverWait(driver,10);
        // WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
        //element.click();

        WebElement m = driver.findElement(By.xpath("//div[@class='k-window-titlebar k-header']/div/a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", m);
    }

    //verify functionality of upload file feature  on microchip upload file page

    public String uploadFile() {
        chooseFileButton.sendKeys("C:\\Users\\prowe\\Desktop\\bug.PNG");
        common.pause(1);
        uploadFileButton.submit();
        /*if(driver.getPageSource().contains("File Uploaded!")) {
            System.out.println("file uploaded");
        }
        else{
            System.out.println("file not uploaded");
        }*/
        return driver.getPageSource();
    }

    //Pending Microchip displays with details by clicking on pending microchip button on manage quote page
    public void clickOnPendingMicrochipButton() {
        pendingMicrochipButton.click();
        common.pause(2);
    }

    public String verifyPendingMicrochipPage() {
        return detailsOnPendingMicrochipPage.getText();
    }


    //Fetch quote on manage quote page based on quote number for UK2 Qa

    public void enterQuoteNumberInsideSearchBox() {
        quoteSearchBox.sendKeys("Q0042274");
    }

    public String verifyQuoteDetails() {
        WebElement quoteInfo = common.waitUntilPresenceOfElement("//div[@id='gridName']/table/tbody/tr[1]");
        return quoteInfo.getText();
    }


    //Fetch quote on manage quote page based on quote number for stage

    public void enterQuoteNumberInsideSearchBoxStage() {
        quoteSearchBox.sendKeys("Q0064379");
    }


    //Verify include payment feature of quote module for Qa

    public void selectIncludePaymentCheckBox() {
        common.pause(1);
        includePaymentCheckBox.click();
    }

    public String verifyIncludePaymentDetailsOfQuote() {
        common.pause(3);
        WebElement quoteInfoIncludePayment = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", quoteInfoIncludePayment);
        //WebDriverWait wait=new WebDriverWait(driver,10);
        // WebElement quoteInfoIncludePayment=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

        common.pause(1);
        return quoteInfoIncludePayment.getText();
    }

    //Edit quote information and verifies the same

    public void clickOnQuoteNumber() {
        WebElement quoteNumber = common.waitUntilPresenceOfElement("//div[@id='gridName']/table/tbody/tr[1]/td[2]/a");
        quoteNumber.click();
        common.pause(5);
    }

    public void selectEditQuoteOption() {
        common.scrollToElement(selectCogIcon);
        common.pause(1);

        common.moveToElement(selectCogIcon);
        selectEditQuoteIcon.click();
        common.pause(5);
    }

    public void editQuoteDetails() {
        //Scroll up
        common.scroll_By_Pixel("0", "250");
        enterPostCodeInAddressDropDown.clear();
        enterPostCodeInAddressDropDown.sendKeys("RM8 2TE");
        common.pause(2);
        selectPostCodeFromDD.click();
        common.pause(1);
        hearAboutUsDropDown.click();
        common.pause(1);
        selectOptionFromHearAboutUsDD.click();
        common.pause(2);

        //Scroll up
        common.scroll_By_Pixel("0", "-150");
        petSpeciesDropDown.click();
        common.pause(1);
        selectOptionFromPetSpeciesDD.click();
        common.pause(2);

        petNameInputField.clear();
        common.pause(1);
        petNameInputField.sendKeys("TestEditQuote");
        common.pause(5);

        petGenderDropDown.click();
        common.pause(1);
        selectOptionsFromPetGDD.click();
        common.pause(1);

        petBirthDate.clear();
        common.pause(1);
        petBirthDate.sendKeys("02.08.2020");
        common.pause(2);

        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");
        petPurchaseAmount.clear();
        common.pause(1);
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");
        petPurchaseAmount.sendKeys("500");
        common.pause(1);

        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_231').style.display='block';");
        petAdminFees.clear();
        common.pause(1);
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_231').style.display='block';");
        petAdminFees.sendKeys("20");
        common.pause(2);

        //driver.findElement(calculateButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", calculateButton);
        common.pause(2);

       /* common.pause(3);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,150)", "");

        //driver.findElement(closeButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(closeButton));
       common.pause(1);*/
    }

    //Verify that quote information page displays with sane status code on by clicking on quote code on manage quote page

    public void clickOnQuoteCodeLink() {
        //String code=driver.findElement(quoteCodeOnManageQuotePage).getText();
        common.pause(3);
        quoteLinkOnManageQuotePage.click();
        //return code;
    }

    public String verifyQuoteCode() {
        return quoteStatusCode.getText();
    }

    public void enterClientContactInformation(int r, XSSFSheet sheet) {
        XSSFRow row = sheet.getRow(r);
        common.waitUntilVisibilityOfElement(clientTypeIndividual);
        if (!clientTypeIndividual.isSelected()) {
            clientTypeIndividual.click();
        }

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

        String firstName = row.getCell(2).getStringCellValue();
        firstNameInputField.sendKeys(firstName);

        String lastName = row.getCell(3).getStringCellValue();
        lastNameInputField.sendKeys(lastName);

        String clientBirthDate = row.getCell(4).getStringCellValue();
        clientBirthDateInput.sendKeys(clientBirthDate);

        String email = row.getCell(5).getStringCellValue();
        emailInputField.sendKeys(email);

        String address = row.getCell(6).getStringCellValue();
        addressInputField.sendKeys(address);
        common.pause(2);
        addressInputField.sendKeys(Keys.DOWN);
        addressInputField.sendKeys(Keys.ENTER);

        String primaryContactNumber = row.getCell(7).getStringCellValue();
        primaryContactNumberInputField.sendKeys(primaryContactNumber);

        common.scrollToElement(hearAboutUsDropDown);
        common.jsClick(hearAboutUsDropDown);
        common.pause(1);
        if (r > 28) {
            driver.findElement(By.xpath("//ul[@id='HearAboutUs_listbox']//li[" + 2 + "]")).click();
        } else {
            driver.findElement(By.xpath("//ul[@id='HearAboutUs_listbox']//li[" + r + "]")).click();
        }
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
            } else {
                selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
            }
            clickOnPolicyCreateButton();
            verifyPolicyDetailsOnPolicyInformationPage(r, sheet, 16);

            System.out.println("\nNumber of policies created: " + (r - 1));

            if (!String.valueOf(r).equals("32")) {
                verifyManageQuotePage();
                clickOnAddQuoteButton();
            }
        }
        softAssert.assertAll();
    }

    public void createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForCatProduct() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Cat");
        String productType = "Cat";
        for (int r = 2; r < 73; r++) {

            enterClientContactInformation(r, sheet);
            selectProduct(productType);
            enterPetInformationCat(r);
            selectPolicyPlanAndAnswerAssumptionsForCat(r);
            if (r % 2 == 0) {
                selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit();
            } else {
                selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
            }
            clickOnPolicyCreateButton();
            verifyPolicyDetailsOnPolicyInformationPage(r, sheet, 15);

            System.out.println("\nNumber of policies created: " + (r - 1));

            if (!String.valueOf(r).equals("73")) {
                verifyManageQuotePage();
                clickOnAddQuoteButton();
            }
        }
        softAssert.assertAll();
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
            } else {
                selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard();
            }
            clickOnPolicyCreateButton();
            verifyPolicyDetailsOnPolicyInformationPage(r, sheet, 18);

            System.out.println("\nNumber of policies created: " + (r - 1));

            if (!String.valueOf(r).equals("76")) {
                verifyManageQuotePage();
                clickOnAddQuoteButton();
            }
        }
        softAssert.assertAll();
    }

    public void selectPremiumMonthlyAndEnterPaymentDetailsOfDirectDebit() {
        common.jsClick(premiumFrequencyMonthly);
        common.scrollToElement(accountHolderNameInput);
        common.pause(2);
        common.jsClick(paymentTenderDropdown);
        common.pause(2);
        directDebitOption.click();
        common.pause(2);
        instalmentDateDropdown.click();
        common.pause(2);
        instalmentDate7Option.click();
        common.pause(2);
        sortCodeInput.sendKeys("200000");
        accountNumberInput.sendKeys("55117799");
        accountHolderNameInput.sendKeys("Test");
    }

    public void selectPremiumMonthlyAndEnterPaymentDetailsOfCreditCard() {
        common.jsClick(premiumFrequencyMonthly);
        common.scrollToElement(accountHolderNameInput);
        common.pause(1);
        common.jsClick(paymentTenderDropdown);
        common.pause(2);
        creditOrDebitCardOption.click();

        instalmentDateDropdown.click();
        common.pause(2);
        instalmentDate14Option.click();
        common.pause(2);

        common.waitUntilVisibilityOfElement(cardTypeDropDown);
        cardTypeDropDown.click();
        common.pause(1);
        cardTypeVisa.click();

        cardHolderNameInput.sendKeys("Test Policy");

        creditCardNumberInput.sendKeys("4929421234600821");

        cardExpiryMonthDropdown.click();
        common.pause(1);
        decMonthOption.click();
        common.pause(2);

        cardExpiryYearDropdown.click();
        common.pause(1);
        expiryYear2024Option.click();

        creditCardCvvInput.sendKeys("356");

        accountHolderNameInput.sendKeys("Test Policy");
    }

    public void clickOnPolicyCreateButton() {
        common.waitUntilVisibilityOfElement(createPolicyButton);
        createPolicyButton.click();
        if (common.isElementDisplayed(createPolicyButton)) {
            common.jsClick(createPolicyButton);
        }
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
        softAssert.assertEquals(actualPremiumAmount, expectedAmount, "Total premium is mismatched");

        common.pause(1);
        List<WebElement> tableRow = driver.findElements(By.xpath("//tbody[@role='rowgroup']//tr//td"));
        Log.info("The policy details are: ");
        for (WebElement tableCol : tableRow) {
            System.out.print(tableCol.getText() + "  ");
        }
    }

    public void enterCoverStartDateAndAnswer() {
        common.pause(2);
        coverStartDateInput.sendKeys(common.getFutureDate(15, "dd/MM/yyyy"));
        common.pause(3);
        common.jsClick(assumptionYesRadioButton);
        common.jsClick(informationConfirmCheckbox);
    }

    public void selectProduct(String product) {
        common.waitUntilVisibilityOfElement(productListDropDown);
        productListDropDown.click();
        common.pause(1);
        driver.findElement(By.xpath("//li[contains(text(),'" + product + "')]")).click();
    }


    public void enterPetInformationCat(int r) {
        XSSFSheet sheet = common.readDataFromExcelSheet("Cat");
        XSSFRow row = sheet.getRow(r);

        common.waitUntilVisibilityOfElement(petNameInputField);
        common.waitUntilElementToBeClickable(petNameInputField);
        String petName = row.getCell(9).getStringCellValue();
        petNameInputField.sendKeys(petName);
        common.pause(2);

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
        common.pause(2);

        String gender = row.getCell(11).getStringCellValue();
        petGenderDropDown.click();
        common.pause(1);
        if (gender.equalsIgnoreCase("Male")) {
            genderMaleOption.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            genderFemaleOption.click();
        }

        common.pause(1);
        String petBDate = row.getCell(12).getStringCellValue().replace("/", ".");
        petBirthDate.sendKeys(petBDate);

        common.pause(2);
        String price = row.getCell(14).getStringCellValue();
        catPurchaseAmountField.sendKeys(price);

        calculateButton.click();
        common.jsClick(calculateButton);
    }

    public void enterPetInformationDog(int r, XSSFSheet sheet) {
        XSSFRow row = sheet.getRow(r);

        common.waitUntilVisibilityOfElement(petNameInputField);
        String petName = row.getCell(9).getStringCellValue();
        petNameInputField.sendKeys(petName);

        common.waitUntilVisibilityOfElement(dogBreedTypeDropdown);
        common.pause(3);
        dogBreedTypeDropdown.click();
        common.pause(1);
        String breedType = row.getCell(10).getStringCellValue();
        if (breedType.equalsIgnoreCase("Pedigree")) {
            dogBreedPedigreeOption.click();
            common.waitUntilVisibilityOfElement(petBreedDropdown);
            common.pause(3);
            petBreedDropdown.click();
            common.waitUntilVisibilityOfElement(dogBreedSearchInput);
            String species = row.getCell(13).getStringCellValue();
            dogBreedSearchInput.sendKeys(species);
            common.pause(2);
            dogBreedSearchInput.sendKeys(Keys.DOWN);
            dogBreedSearchInput.sendKeys(Keys.ENTER);
            common.pause(1);
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
        }

        String gender = row.getCell(14).getStringCellValue();
        petGenderDropDown.click();
        common.pause(1);
        if (gender.equalsIgnoreCase("Male")) {
            genderMaleOption.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            genderFemaleOption.click();
        }

        common.pause(1);
        String petBDate = row.getCell(15).getStringCellValue().replace("/", ".");
        petBirthDate.sendKeys(petBDate);

        common.pause(1);
        String price = row.getCell(17).getStringCellValue();
        dogPurchaseAmountField.sendKeys(price);

        calculateButton.click();
        common.jsClick(calculateButton);
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
        coverStartDateInput.sendKeys(common.getFutureDate(15, "dd/MM/yyyy"));
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
        coverStartDateInputForDog.sendKeys(common.getFutureDate(15, "dd/MM/yyyy"));
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
}
