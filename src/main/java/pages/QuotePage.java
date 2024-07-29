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
import utils.Common;

import java.util.List;

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
    @FindBy(css = "button[class='btn boxcolor boxcolor-blue']")
    private WebElement quoteStatusCode;

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

    public String verifyQuoteCode() {
        return quoteStatusCode.getText();
    }
}
