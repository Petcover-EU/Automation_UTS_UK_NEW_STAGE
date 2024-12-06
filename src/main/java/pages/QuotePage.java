package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import utils.Common;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

public class QuotePage {

    private static final Logger log = LoggerFactory.getLogger(QuotePage.class);
    Common common = new Common(DriverFactory.getDriver());

    private WebDriver driver;

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
   // @FindBy(css = "button[class='btn boxcolor boxcolor-blue']")
////New
   @FindBy(xpath="//div[@class='col-md-8']//span[@class='k-input'][normalize-space()='Select']")
    private WebElement selectProductDropdownOption;
    @FindBy(xpath="//li[normalize-space()='CoverMy Pet']")
    private WebElement productCoverMypet;
    @FindBy(xpath="//span[@class='k-widget k-dropdown k-header cls_CMCD002']//span[@class='k-input'][normalize-space()='Select']")
    private WebElement CovermyPetTypeOption;
    @FindBy(xpath="(//li[@role='option'][normalize-space()='Cat'])[2]")
    private WebElement CovermyPetTypeOptionCat;
    @FindBy(xpath="//h4[normalize-space()='Cover MyPet Premium Calculation']")
    private WebElement planePOP;
    @FindBy(xpath="(//li[@role='option'][normalize-space()='Dog'])[2]")
    private WebElement CovermyPetTypeOptionDog;
    @FindBy(xpath="//input[@name='ClientId_input']")
    private WebElement ExistingClientCheckBox;
    @FindBy(xpath="/html[1]/body[1]/div[9]/div[1]/div[3]/ul[1]/li[1]/table[1]/tbody[1]/tr[1]/td[1]")
    private WebElement select_Clint;
    @FindBy(css ="div[id='divhear'] span[class='k-input']")
    private WebElement HearAboutOptionBOX;
    @FindBy(xpath ="//li[normalize-space()='Animal Club or Society']")
    private WebElement HearAboutOptionSelect;
    @FindBy(xpath="//li[normalize-space()='Exotic Direct']")
    private WebElement productExoticDirect;
    @FindBy(xpath="//input[@id='Question_50003']")
    private WebElement Exotic_DirectDOBTextBOX;
    @FindBy(xpath="(//span[@class='k-input'][normalize-space()='Select'])[6]")
    private WebElement Exotic_Direct_pet_currently_showing_signs;
    @FindBy(xpath="(//li[@role='option'][normalize-space()='Yes'])[8]")
    private WebElement Exotic_Direct_pet_currently_showing_signs_Option_YES;
    @FindBy(xpath="(//h3[normalize-space()='Unable to Offer Cover'])[1]")
    private WebElement Exotic_DirectWorningMessage;
    @FindBy(xpath="(//span[@aria-label='select'])[12]")
    private WebElement PetnumberBOX;
    @FindBy(xpath="//ul[@id='Question_33523_listbox']//li[@role='option'][normalize-space()='1']")
    private WebElement PetnumberBOXOption1;
    @FindBy(xpath="(//span[@aria-label='select'])[13]")
    private WebElement PetTypeBOX;
    @FindBy(xpath="(//li[@role='option'][normalize-space()='Cat'])[2]")
    private WebElement PetTypeBOXCAT;
    @FindBy(xpath="//ul[@id='Question_33524_listbox']//li[@role='option'][normalize-space()='Dog']")
    private WebElement PetTypeBOXDOG;

    @FindBy(xpath="(//input[@id='Question_33525'])[1]")
    private WebElement PetNameTExtBox;
    @FindBy(xpath="(//span[@aria-label='select'])[15]")
    private WebElement PetBreedBox;
    @FindBy(xpath="(//li[normalize-space()='Aladseer'])[1]")
    private WebElement PetBreedBox_Aladseer;
    @FindBy(xpath="(//li[normalize-space()='Afghan'])[1]")
    private WebElement PetBreedBox_Afghan;
    @FindBy(xpath="(//span[@aria-label='select'])[17]")
    private WebElement PetGenderBOX;
    @FindBy(xpath="(//span[@aria-label='select'])[18]")
    private WebElement PetGenderBOX_Dog;
    @FindBy(xpath="(//li[@role='option'][normalize-space()='Female'])[2]")
    private WebElement PetGenderBOX_Female;
    @FindBy(xpath="(//input[@class='k-formatted-value cls_CMCD33532 k-input'])[1]")
    private WebElement PetPerchasePrise;
    @FindBy(xpath="(//button[normalize-space()='Add Pet'])[1]")
    private WebElement AddPet;
    @FindBy(xpath="(//button[normalize-space()='Calculate'])[1]")
    private WebElement Calculate;
    @FindBy(xpath="(//button[@id='btnCalculate'])[1]")
    private WebElement Calculate2;
    @FindBy(xpath="(//input[@id='caty_44'])[1]")
    private WebElement Plane1;
    @FindBy(xpath="(//input[@id='dogy_53'])[1]")
    private WebElement Plane2;
    @FindBy(xpath= "(//input[@type='checkbox'])[82]")
    private WebElement Plane3;
    @FindBy(xpath="(//button[normalize-space()='Close'])[1]")
    private WebElement PlaneBOXClosed;
    @FindBy(xpath="(//button[@class='btn btn-primary savequote preventEnterSpacebar savequotefalse'])[1]")
    private WebElement saveQuoteOption;
    @FindBy(xpath="(//a[@id='dropdownMenu1'])[1]")
    private WebElement settingOption;
    @FindBy(xpath="(//a[@id='btnEdit'])[1]")
    private WebElement EditOption;
    @FindBy(xpath="(//span[@aria-label='select'])[3]")
    private WebElement productBOX;
    @FindBy(xpath="(//li[normalize-space()='CoverMy Pet'])[1]")
    private WebElement CoverMy_Pet;
    @FindBy(xpath="(//div[@class='form-group view-data'])[1]")
    private WebElement policyNumberValue1;
    @FindBy(xpath="//div[@class='col-md-2']//div[@class='form-group view-data']")
    private WebElement policyNumberValue2;

    @FindBy(xpath ="//div[@class='col-md-8']//span[@class='k-input'][normalize-space()='Select']")
    private WebElement petDropdownBOX;
    @FindBy(xpath ="//li[normalize-space()='Introductory Cover']")
    private WebElement petOptionIntroductory_Cover;
    @FindBy(xpath ="(//span[@aria-label='select'])[10]")
    private WebElement petOptionIntroductory_Cover_Pettype_BOX;
    @FindBy(xpath ="(//span[@aria-label='select'])[11]")
    private WebElement IntroducerregistrationnumbeBOX;
    @FindBy(xpath ="//body[1]/div[25]/div[1]/div[3]/ul[1]/li[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]")
    private WebElement IntroducerregistrationnumbeBOXOption;
    @FindBy(xpath ="(//input[@id='Question_11307'])[1]")
    private WebElement IntroducePetName;
    @FindBy(xpath ="(//span[@aria-label='select'])[16]")
    private WebElement IntroduceGenderBOX;
    @FindBy(xpath ="(//li[@role='option'][normalize-space()='Female'])[2]")
    private WebElement IntroduceGender_Option;
    @FindBy(xpath ="(//input[@id='Question_11313'])[1]")
    private WebElement IntroduceDOB;
    @FindBy(xpath ="(//input[@class='k-formatted-value cls_DOG00008 k-input'])[1]")
    private WebElement IntroducePerchaseAmount;
    @FindBy(xpath ="(//li[@role='option'][normalize-space()='Dog'])[2]")
    private WebElement petOptionIntroductory_Cover_Pettype_BOX_Dog;
    @FindBy(xpath ="(//span[@aria-label='select'])[12]")
    private WebElement IntroducePetBreedBOX;
    @FindBy(xpath ="(//li[normalize-space()='Pedigree'])[1]")
    private WebElement IntroducePetBreedOption;
    @FindBy(xpath ="(//span[@aria-label='select'])[15]")
    private WebElement IntroducePetDogBreedBOX;
    @FindBy(xpath ="(//li[@role='option'][normalize-space()='Fox Terrier Smooth'])[4]")
    private WebElement IntroducePetDogBreed_Fox;

    @FindBy(xpath ="(//li[normalize-space()='Old Horse'])[1]")
    private WebElement productOldHorse;
    @FindBy(xpath = "(//input[@id='Question_151'])[1]")
    private WebElement horseNameTextBox;
    @FindBy(xpath ="(//li[normalize-space()='Percheron'])[1]")
    private WebElement oldHorseBreed;
    @FindBy(xpath ="(//li[normalize-space()='Black'])[1]")
    private WebElement oldhorseColourOption;
    @FindBy(xpath = "(//span[contains(@aria-label,'select')])[12]")
    private WebElement oldHorseAgeBox;
    @FindBy(xpath ="(//li[normalize-space()='3 years'])[1]")
    private WebElement oldHorseAgeBox3Years;
    @FindBy(xpath ="(//li[normalize-space()='Colt'])[1]")
    private WebElement oldHorseSex;
    @FindBy(xpath = "(//span[@aria-label='select'])[14]")
    private WebElement oldHorseHightBox;
    @FindBy(xpath = "(//li[normalize-space()='7.3'])[1]")
    private WebElement oldHorseHightBoxOption;
    @FindBy(xpath =   "(//div[@class='k-multiselect-wrap k-floatwrap'])[1]")
    private WebElement oldHorseactivities;
    @FindBy(xpath =  "(//li[normalize-space()='Foals & Young Horses (Rearing & Breaking)-1'])[1]")
    private WebElement oldHorseactivitiesOption;
    @FindBy(xpath =  "(//li[normalize-space()='Homebred'])[1]")
    private WebElement oldHorse_Homebred;
    @FindBy(xpath = "(//input[@class='k-formatted-value cls_EM146V k-input'])[1]")
    private WebElement oldHorse_Studfee;
    @FindBy(xpath =  "(//input[@class='k-formatted-value cls_EM147V k-input'])[1]")
    private WebElement oldHorse_Marketvalue;
    @FindBy(xpath = "(//button[@class='swal-button swal-button--confirm'])[1]")
    private WebElement oldHorse_Homebred_Ok;

    @FindBy(xpath = "(//div[@class='well1'])[1]")
    private WebElement value1Element;

    @FindBy(xpath = "//body[1]/div[3]/div[3]/form[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
    private WebElement groundTotalElement;



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
        common.jsClick(addQuoteButton);
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

        StringBuilder verify = new StringBuilder();
        for (WebElement product : pList) {
            verify.append(product.getText()).append("\n");
        }
        return verify.toString();
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

//    public String verifyQuoteCode() {
//        return quoteStatusCode.getText();
//    }

    public void CoverMy_Pet_CatIconeSelectQuote(){
        common.pause(5);
        quoteIcon.click();

    }

    public void UserClicksOnAddQuoteOptionThenSelectProductCoverMyPetCat(){
        common.waitUntilVisibilityOfElement(addQuoteButton);
        common.pause(2);
        addQuoteButton.click();

        common.waitUntilVisibilityOfElement(selectProductDropdownOption);
        common.pause(2);
        selectProductDropdownOption.click();
        common.pause(3);
        productCoverMypet.click();
        common.pause(2);
        common.waitUntilVisibilityOfElement(CovermyPetTypeOption);
        common.pause(3);
        CovermyPetTypeOption.click();
        common.pause(2);
        CovermyPetTypeOptionCat.click();
        common.pause(2);
    }

    public void calculateforemptyfield() {
        calculateButton.click();
        common.pause(2);
        System.out.println("PASS: Premium Calculation heading is not displayed.");
    }

    public void UserClicksOnAddQuoteOptionThenSelectProductCoverMyPetDog(){
        common.waitUntilVisibilityOfElement(addQuoteButton);
        common.pause(2);
        addQuoteButton.click();

        common.waitUntilVisibilityOfElement(selectProductDropdownOption);
        common.pause(2);
        selectProductDropdownOption.click();
        common.pause(3);
        productCoverMypet.click();
        common.pause(2);
        common.waitUntilVisibilityOfElement(CovermyPetTypeOption);
        common.pause(3);
        CovermyPetTypeOption.click();
        common.pause(2);
        CovermyPetTypeOptionDog.click();
        common.pause(2);
    }

    public void AuttoselectUserDeatail(){
        common.waitUntilVisibilityOfElement(ExistingClientCheckBox);
        common.pause(2);
        ExistingClientCheckBox.click();
        common.pause(2);
        ExistingClientCheckBox.sendKeys("TEST-00065");
        common.pause(2);
        common.waitUntilVisibilityOfElement(select_Clint);
         select_Clint.click();
        common.pause(3);
        HearAboutOptionBOX.click();
        common.waitUntilVisibilityOfElement(HearAboutOptionSelect);
        HearAboutOptionSelect.click();


    }

    public void UserClicksOnAddQuoteOptionThenSelectProductExotic_Direct(){
        common.waitUntilVisibilityOfElement(addQuoteButton);
        common.pause(2);
        addQuoteButton.click();

        common.waitUntilVisibilityOfElement(selectProductDropdownOption);
        common.pause(2);
        selectProductDropdownOption.click();
        common.pause(3);
        productExoticDirect.click();
        common.pause(3);


    }
    public void userSelectPetBOBCurrectDate(){
        common.pause(3);
        Exotic_DirectDOBTextBOX.click();
        common.pause(3);
        String currentDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        driver.findElement(By.xpath("//input[@id='Question_50003']"))
                .sendKeys(currentDate);

        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs.click();
        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs.click();
        common.pause(3);
        common.waitUntilVisibilityOfElement(Exotic_Direct_pet_currently_showing_signs_Option_YES);
        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs_Option_YES.click();
        common.pause(3);
    }

    public void DOBWorningMessage(){
        common.pause(3);
        common.waitUntilVisibilityOfElement(Exotic_DirectWorningMessage);

        String actualText = driver.findElement(
                By.xpath("//h3[normalize-space()='Unable to Offer Cover']")
        ).getText();

        Assert.assertEquals(actualText, "Unable to Offer Cover",
                "Assertion Failed: Heading text does not match.");
    }

    public void userSelectPetBOBNEXTDayDate(){
        common.pause(3);
        Exotic_DirectDOBTextBOX.click();
        common.pause(3);

        String nextDayDate = LocalDate.now()
                .plusDays(1)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        driver.findElement(By.xpath("//input[@id='Question_50003']"))
                .sendKeys(nextDayDate);

        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs.click();
        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs.click();
        common.pause(3);
        common.waitUntilVisibilityOfElement(Exotic_Direct_pet_currently_showing_signs_Option_YES);
        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs_Option_YES.click();
        common.pause(3);
    }

    public void userSelectPetBOBNEXTMonth(){
        common.pause(3);
        Exotic_DirectDOBTextBOX.click();
        common.pause(3);

        String nextMonthDate = LocalDate.now()
                .plusMonths(1)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        driver.findElement(By.xpath("//input[@id='Question_50003']"))
                .sendKeys(nextMonthDate);

        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs.click();
        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs.click();
        common.pause(3);
        common.waitUntilVisibilityOfElement(Exotic_Direct_pet_currently_showing_signs_Option_YES);
        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs_Option_YES.click();
        common.pause(3);
    }

    public void userSelectPetBOBCurrectDate_invalid_date_formate(){
        common.pause(3);
        Exotic_DirectDOBTextBOX.click();
        common.pause(3);
        String currentDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        driver.findElement(By.xpath("//input[@id='Question_50003']"))
                .sendKeys(currentDate);

        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs.click();
//        common.pause(3);
//        Exotic_Direct_pet_currently_showing_signs.click();
        common.pause(3);
        common.waitUntilVisibilityOfElement(Exotic_Direct_pet_currently_showing_signs_Option_YES);
        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs_Option_YES.click();
        common.pause(3);
    }

    public void userSelectPetBOBCurrectDate_Blanck(){
        common.pause(3);
        Exotic_DirectDOBTextBOX.click();
        common.pause(3);


        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs.click();
//        common.pause(3);
//        Exotic_Direct_pet_currently_showing_signs.click();
        common.pause(3);
        common.waitUntilVisibilityOfElement(Exotic_Direct_pet_currently_showing_signs_Option_YES);
        common.pause(3);
        Exotic_Direct_pet_currently_showing_signs_Option_YES.click();
        common.pause(3);
    }

    public void userSelectProductAndFieldDetailCoverMyPetCat(){
        common.pause(3);
        productBOX.click();
        common.pause(3);
        CoverMy_Pet.click();

        common.waitUntilVisibilityOfElement(PetnumberBOX);
                PetnumberBOX.click();
        common.pause(3);
        PetnumberBOXOption1.click();
        common.pause(3);

        PetTypeBOX.click();
        common.pause(3);
        PetTypeBOXCAT.click();
        common.pause(3);

        PetNameTExtBox.sendKeys("Test");
        common.pause(3);
        PetBreedBox.click();
        common.pause(3);
        PetBreedBox_Aladseer.click();
        common.pause(3);
        PetGenderBOX.click();
        common.pause(3);
        PetGenderBOX_Female.click();
        common.pause(3);

        String oneYearAgo = LocalDate.now()
                .minusYears(1)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        WebElement dateField = driver.findElement(
                By.xpath("(//input[@id='Question_33531'])[1]")
        );
        dateField.clear();
        dateField.sendKeys(oneYearAgo);

        common.pause(3);
        PetPerchasePrise.sendKeys("500");
        common.pause(3);


    }

    public void userSelectPlaneAndCalculateOption(){

        AddPet.click();
        common.pause(3);
        Calculate.click();
        common.waitUntilVisibilityOfElement(Plane1);
        Plane1.click();
        common.pause(2);
        PlaneBOXClosed.click();
        common.pause(2);


    }

    private String value1;
    private String value2;

        public void userSaveAndReopendQuote() {
            saveQuoteOption.click();
            common.pause(2);

            common.waitUntilVisibilityOfElement(settingOption);
            settingOption.click();
            common.pause(2);
            EditOption.click();
        }

        public void userVerifyDetail() {
            String policyNumber1 = policyNumberValue1.getText().trim();
            System.out.println("Policy Number1: " + policyNumber1);
            common.pause(5);
            String policyNumber2 = policyNumberValue2.getText().trim();
            System.out.println("Policy Number2: " + policyNumber2);

            Assert.assertEquals(
                    policyNumber2,
                    policyNumber1,
                    "FAIL: Policy numbers are not matching!"
            );

            System.out.println("PASS: Both policy numbers are matching!");
        }

    public void userSelectProductAndFieldDetailCoverMyPetDog(){
        common.pause(3);
        productBOX.click();
        common.pause(3);
        CoverMy_Pet.click();

        common.waitUntilVisibilityOfElement(PetnumberBOX);
        PetnumberBOX.click();
        common.pause(3);
        PetnumberBOXOption1.click();
        common.pause(3);

        PetTypeBOX.click();
        common.pause(3);
        PetTypeBOXDOG.click();
        common.pause(3);

        PetNameTExtBox.sendKeys("Test");
        common.pause(3);
        PetBreedBox.click();
        common.pause(3);
        PetBreedBox_Afghan.click();
        common.pause(3);
        PetGenderBOX_Dog.click();
        common.pause(3);
        PetGenderBOX_Female.click();
        common.pause(3);

        String oneYearAgo = LocalDate.now()
                .minusYears(1)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        WebElement dateField = driver.findElement(
                By.xpath("(//input[@id='Question_33531'])[1]")
        );
        dateField.clear();
        dateField.sendKeys(oneYearAgo);

        common.pause(3);
        PetPerchasePrise.sendKeys("500");
        common.pause(3);


    }
    public void userSelectPlaneAndCalculateOptionCoverMyPetDog(){

        AddPet.click();
        common.pause(3);
        Calculate.click();
        common.waitUntilVisibilityOfElement(Plane2);
        Plane2.click();
        common.pause(2);
        PlaneBOXClosed.click();
        common.pause(2);

    }
    public void userSelectPlaneAndCalculateOptionIntroductoryCoverCat(){

        common.pause(2);
        Calculate2.click();
//        common.pause(2);
//        Calculate.click();
//        common.waitUntilVisibilityOfElement(Plane2);
//        Plane2.click();
//        common.pause(2);
//        PlaneBOXClosed.click();
        common.pause(2);

    }

    public void selectProductAndFieldPetDetailIntroductoryCoverDog(){

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
        common.waitUntilVisibilityOfElement(IntroducePetName);
        IntroducePetName.sendKeys("Test");

        common.pause(3);
        IntroducePetBreedBOX.click();
        common.pause(3);
        IntroducePetBreedOption.click();
        common.pause(3);
        IntroducePetDogBreedBOX.click();
        common.pause(3);
        IntroducePetDogBreed_Fox.click();
        IntroduceGenderBOX.click();
        common.pause(3);
        IntroduceGender_Option.click();
        common.pause(3);
        IntroduceDOB.click();
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
        IntroducePerchaseAmount.sendKeys("500");
        common.pause(3);
    }

    public void selectProductAndFieldPetDetailOldHorse(){
        petDropdownBOX.click();

        common.waitUntilVisibilityOfElement(productOldHorse);
        common.pause(2);
        productOldHorse.click();

        common.waitUntilVisibilityOfElement(horseNameTextBox);
        horseNameTextBox.sendKeys("Test");
        common.pause(3);
        petOptionIntroductory_Cover_Pettype_BOX.click();
        common.pause(3);
        oldHorseBreed.click();
        common.pause(3);
        IntroducerregistrationnumbeBOX.click();
        common.pause(3);
        oldhorseColourOption.click();
        common.pause(3);
        oldHorseAgeBox.click();
        common.pause(3);
        oldHorseAgeBox3Years.click();
        common.pause(3);
        PetTypeBOX.click();
        common.pause(3);
        oldHorseSex.click();
        common.pause(3);
        oldHorseHightBox.click();
        common.pause(3);
        oldHorseHightBoxOption.click();
        common.pause(3);
        oldHorseactivities.click();
        common.pause(3);
        oldHorseactivitiesOption.click();
        common.pause(3);
        PetBreedBox.click();
        common.pause(3);
        oldHorse_Homebred.click();
        common.pause(3);
        oldHorse_Homebred_Ok.click();
        common.pause(3);
        oldHorse_Studfee.sendKeys("25");
        common.pause(3);
        oldHorse_Marketvalue.sendKeys("500");
        common.pause(3);
    }
    public void userSelectPlaneAndCalculateOptionOldHorse(){

        common.pause(2);
        Calculate2.click();
//        common.pause(2);
//        Calculate.click();
        common.waitUntilVisibilityOfElement(Plane3);
        Plane3.click();
//        common.pause(2);
//        PlaneBOXClosed.click();
        common.pause(2);

    }

    public void userSaveOldHorseQuote() {
        saveQuoteOption.click();
        common.pause(2);


    }

    public void verifyOldHorsedatail(){
        common.pause(7);
        common.waitUntilVisibilityOfElement(value1Element);
        System.out.println(value1Element.getText().trim());
        common.waitUntilVisibilityOfElement(groundTotalElement);
        System.out.println(groundTotalElement.getText().trim());

        String value1 = value1Element.getText().trim();
        System.out.println("Old House information: " + value1);

        String groundTotal = groundTotalElement.getText().trim();
        System.out.println("Ground Total: " + groundTotal);

    }

}
