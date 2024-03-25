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

public class SettingPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    //1.Create a class constructor
    public SettingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(11)")
    private WebElement lookUpIcon;

    //Manage Policy Type Page
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[1]/a/i")
    private WebElement policyTypeIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]")
    private WebElement editIconOnManageTypePage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditPolicyTypePage;
    @FindBy(css = "input[id='PolicyTypeName']")
    private WebElement inputTypePolicyType;
    @FindBy(css = "input[id='Period']")
    private WebElement inputTypePeriod;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfPolicyType;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addPolicyTypeIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddPolicyTypePage;

    //Manage client class Page
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[2]/a/i")
    private WebElement clientClassIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]")
    private WebElement editIconOnClientClassPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditClientClassPage;
    @FindBy(css = "input[id='ClientClassName']")
    private WebElement inputTypeClientClassName;
    @FindBy(css = "input[id='Code']")
    private WebElement inputTypeClientCode;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfClientClass;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addClientClassIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddClientClassPage;

    //Manage Insurer class Page
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[3]/a/i")
    private WebElement insurerClassIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]")
    private WebElement editIconOnManageInsurerClass;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditInsurerClassPage;
    @FindBy(css = "input[id='Code']")
    private WebElement inputTypeInsurerCode;
    @FindBy(css = "input[id='InsurerClassName']")
    private WebElement inputTypeInsurerClassName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditInsurerPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addInsurerClassIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddInsurerClassPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[4]/a/i")
    private WebElement divisionIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]")
    private WebElement editIconOnManageDivisionPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditDivisionPage;
    @FindBy(css = "input[id='DivisionName']")
    private WebElement inputTypeDivisionName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditDivisionPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addDivisionIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddDivisionPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[5]/a/i")
    private WebElement branchIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]")
    private WebElement editIconOnManageBranchPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditBranchPage;
    @FindBy(css = "input[id='Code']")
    private WebElement inputTypeBranchCode;
    @FindBy(css = "input[id='BranchName']")
    private WebElement inputTypeBranchName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditBranchPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addBranchIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddBranchPage;

    //Change Area Page

    @FindBy(xpath = "//div[@class='ibox-content']/div/div[6]/a/i")
    private WebElement changeAreaIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]")
    private WebElement editIconOnManageChangeAreaPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneEditChangeAreaPage;
    @FindBy(css = "input[id='ChangeAreaName']")
    private WebElement inputTypeChangeAreaName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditChangeAreaNamePage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addChangeAreaIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddChangeAreaPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[7]/a/i")
    private WebElement sexIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]")
    private WebElement editIconOnManageSexPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneEditSexPage;
    @FindBy(css = "input[id='SexName']")
    private WebElement inputTypeSexName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditSexPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addSexIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddSexPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[8]/a/i")
    private WebElement debtorCodeIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]")
    private WebElement editIconOnManageDebtorCodePage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneEditDebtorCodePage;
    @FindBy(css = "input[id='DebtorCodeName']")
    private WebElement inputTypeDebtorCodeName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditDebtorCodePage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addDebtorCodeIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddDebtorCodePage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[9]/a/i")
    private WebElement renewalTypeIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]")
    private WebElement editIconOnManageRenewalTypePage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneAddRenewalTypePage;
    @FindBy(css = "input[id='RenewalTypeName']")
    private WebElement inputTypeRenewTypeName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditRenewTypePage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addRenewalTypeIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditRenewalTypePage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[10]/a/i")
    private WebElement taskTypeIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]")
    private WebElement editIconOnManageTaskTypePage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneAddTaskTypePage;
    @FindBy(css = "input[id='TaskTypeName']")
    private WebElement inputTypeTasTypeName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditTaskTypePage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addTaskTypeIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditTaskTypePage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[11]/a/i")
    private WebElement taskStatusIcon;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addTaskStatusIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneAddTaskStatusPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[7]/div/a[1]")
    private WebElement editIconOnManageTaskStatusPage;
    @FindBy(css = "input[id='FITTaskStatusName']")
    private WebElement inputTypeTasStatus;
    @FindBy(xpath = "//div[@class='ibox-content']/div[2]/div/div/div/div/span")
    private WebElement colorNameDropDownOnEditTaskStatusPage;
    @FindBy(xpath = "//ul[@id='ColourName_listbox']/li[2]/span")
    private WebElement optionFromColorNameDropDownOnEditTaskStatusPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div[4]/div/div/div/span/span")
    private WebElement statusDropDownOnEditTaskStatusPage;
    @FindBy(xpath = "//ul[@id='MainStatus_listbox']/li[2]")
    private WebElement optionFromStatusDropDownOnEditTaskStatusPage;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOfEditTaskStatusPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditTaskStatusPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[12]/a/i")
    private WebElement petBreedIcon;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addPetBreedIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneAddPetBreedPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[9]/div/a[1]")
    private WebElement editIconOnManagePetBreedPage;
    @FindBy(css = "input[id='PetBreedName']")
    private WebElement inputTypPetBreedName;
    @FindBy(css = "input[id='BreedNumber']")
    private WebElement inputTypePetBreedNumber;
    @FindBy(css = "input[id='SelectBreed']")
    private WebElement inputTypeSelectBreed;
    @FindBy(css = "input[id='UnknownBreed']")
    private WebElement inputTypeUnknownBreed;
    @FindBy(css = "input[id='IsActive']")
    private WebElement inputTypeIsActive;
    @FindBy(xpath = "//label[text()='Rating Class ']//..//span[@class='k-select']")
    private WebElement ratingClassDropDownOnPetBreedPage;
    @FindBy(xpath = "//ul[@id='RatingClass_listbox']/li[2]")
    private WebElement optionFromRatingClassDropDownOnEditPetBreedPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditPetBreedPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[13]/a/i")
    private WebElement exclusionIcon;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addExclusionIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneAddExclusionPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]")
    private WebElement editIconOnManageExclusionPage;
    @FindBy(css = "input[id='Code']")
    private WebElement inputTypeExclusionCode;
    @FindBy(css = "input[id='ExclusionName']")
    private WebElement inputTypeExclusionName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescription;
    @FindBy(xpath = "//div[@class='ibox-content']/div[3]/div/div/div/span")
    private WebElement petClassDropDownOnExclusionPage;
    @FindBy(xpath = "//ul[@id='PetClass_listbox']/li[2]")
    private WebElement optionFromPetClassDropDownOnExclusionPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div[5]/div/div/div/span")
    private WebElement defaultDurationDropDownOnExclusionPage;
    @FindBy(xpath = "//ul[@id='DefaultDuration_listbox']/li[2]")
    private WebElement optionFromDefaultDurationDropDownOnExclusionPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditExclusionPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[14]/a/i")
    private WebElement regularVetIcon;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addRegularVetIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneAddRegularVetPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[15]/a/i")
    private WebElement hearAboutUsIcon;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addHearAboutUsIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOneAddHearAboutUsPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[7]/div/a[1]")
    private WebElement editIconOnManageHearAboutUsPage;
    @FindBy(css = "input[id='Name']")
    private WebElement inputTypeHearAboutUsName;
    @FindBy(css = "textarea[id='Description']")
    private WebElement inputTypeDescriptionOnEditHearAboutUsPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditHearAboutUsPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[4]")
    private WebElement petTypeInManagePetBreedPage;
    @FindBy(xpath = "//input[@id='SpeciesTypeId']//..//span[@class='k-select']")
    private WebElement speciesTypeDD;
    @FindBy(css = "ul[id='SpeciesTypeId_listbox'] li:nth-child(2)")
    private WebElement birdSpeciesOption;
    @FindBy(xpath = "//input[@id='SpeciesName']")
    private WebElement speciesName;

    public void clickIcon() {
        lookUpIcon.click();
        common.pause(3);
    }

    public void traversingThroughPages() {
        common.pause(2);
        for (int i = 1; i <= 15; i++) {
            if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).isEnabled()) {
                driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
            } else {
                common.pause(2);
                driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
            }
            common.pause(2);
            System.out.println(driver.getCurrentUrl());
            common.pause(1);
            lookUpIcon.click();
            common.pause(2);
        }
    }

    //To verify whether Manage Policy Type page displays with policy type details by clicking on policy type icon on setting page

    public void clickOnPolicyTypeIcon() {
        policyTypeIcon.click();
        common.pause(3);
    }

    public String verifyManagePolicyTypeIcon() {
        List<WebElement> policyTypeList = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : policyTypeList) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add policy type page  displays will all details when user clicks on add policy type icon on manage policy type page

    public void clickOnAddPolicyTypeIcon() {
        addPolicyTypeIcon.click();
        common.pause(3);
    }

    public String verifyAddPolicyTypeIconPage() {
        return displayedMessageOnAddPolicyTypePage.getText();
    }

    // Edit policy type page displays upon clicking on edit icon against policy type on manage policy type page

    public void clickOnEditIconOnManagePolicyPage() {
        editIconOnManageTypePage.click();
        common.pause(3);
    }

    public String verifyEditPolicyTypePage() {
        inputTypePolicyType.clear();
        common.pause(1);
        inputTypePolicyType.sendKeys("Test");
        //Use of JavaScript
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Period').style.display='block';");
        WebElement inputTypePeriod1 = driver.findElement(By.id("Period"));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        String order = "23";
        wait1.until(ExpectedConditions.visibilityOf(inputTypePeriod1)).sendKeys(order);
        common.pause(1);

        inputTypeDescriptionOfPolicyType.clear();
        common.pause(1);
        inputTypeDescriptionOfPolicyType.sendKeys("Test");

        return displayedMessageOnEditPolicyTypePage.getText();
    }

    // To verify whether Manage client class page displays with client class details by clicking on client lass icon on setting page

    public void clickOnClientClassIcon() {
        clientClassIcon.click();
        common.pause(3);
    }

    public String verifyManageClientClassPage() {
        List<WebElement> ClientClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : ClientClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add client class page  displays will all details when user clicks on add client class icon on manage class client page

    public void clickOnAddClientClassIcon() {
        addClientClassIcon.click();
        common.pause(3);
    }

    public String verifyAddClientClassIPage() {
        return displayedMessageOnAddClientClassPage.getText();
    }

    //Edit client class page displays upon clicking on edit icon against client class icon on manage client class page
    public void clickOnEditIconOnManageClientClassPage() {
        editIconOnManageTypePage.click();
        common.pause(3);
    }

    public String verifyEditClientClassPage() {
        inputTypeClientClassName.clear();
        common.pause(1);
        inputTypeClientClassName.sendKeys("Test");
        //Use of JavaScript
        inputTypeClientCode.clear();
        common.pause(1);
        inputTypeClientCode.sendKeys("Test");

        inputTypeDescriptionOfClientClass.clear();
        common.pause(1);
        inputTypeDescriptionOfClientClass.sendKeys("Test");

        return displayedMessageOnEditClientClassPage.getText();

    }

    //To verify whether Manage insurer class page displays with insurer class details by clicking on insurer lass icon on setting page

    public void clickOnInsurerClassIcon() {
        insurerClassIcon.click();
        common.pause(3);
    }

    public String verifyManageInsurerClassPage() {
        List<WebElement> InsurerClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : InsurerClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add Insurer class page displays will all details when user clicks on add insurer class icon on manage insurer class page

    public void clickOnAddInsurerClassIcon() {
        addInsurerClassIcon.click();
        common.pause(3);
    }

    public String verifyAddInsurerClassPage() {
        return displayedMessageOnAddInsurerClassPage.getText();
    }

    //Edit Insurer class page displays upon clicking on edit icon against insurer icon on manage insurer class page

    public void clickOnEditIconOnManageInsurerClassPage() {
        editIconOnManageInsurerClass.click();
        common.pause(3);
    }

    public String verifyEditInsurerClassPage() {
        inputTypeInsurerCode.clear();
        common.pause(1);
        inputTypeInsurerCode.sendKeys("Test");
        //Use of JavaScript
        inputTypeInsurerClassName.clear();
        common.pause(1);
        inputTypeInsurerClassName.sendKeys("Test");

        inputTypeDescriptionOfEditInsurerPage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditInsurerPage.sendKeys("Test");

        return displayedMessageOnEditInsurerClassPage.getText();
    }

    //To verify whether Manage division page displays with division details by clicking on division icon on setting page

    public void clickOnDivisionIcon() {
        divisionIcon.click();
        common.pause(3);

    }

    public String verifyManageDivisionPage() {
        List<WebElement> divisionClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : divisionClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add division page displays will all details when user clicks on add division icon on manage division page

    public void clickOnAddDivisionIcon() {
        addDivisionIcon.click();
        common.pause(3);
    }

    public String verifyAddDivisionPage() {
        return displayedMessageOnAddDivisionPage.getText();
    }

    //Edit division page displays upon clicking on edit icon against division name on manage division page

    public void clickOnEditIconOnManageDivisionPage() {
        editIconOnManageDivisionPage.click();
        common.pause(3);
    }

    public String verifyEditDivisionPage() {
        inputTypeDivisionName.clear();
        common.pause(1);
        inputTypeDivisionName.sendKeys("Test");
        //Use of JavaScript
        inputTypeDescriptionOfEditDivisionPage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditDivisionPage.sendKeys("Test");

        return displayedMessageOnEditDivisionPage.getText();

    }

    //To verify whether Manage branch page displays with branch details by clicking on branch icon on setting page

    public void clickOnBranchIcon() {
        branchIcon.click();
        common.pause(3);

    }

    public String verifyManageBranchPage() {
        List<WebElement> branchClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : branchClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add branch page displays will all details when user clicks on add branch icon on manage branch page

    public void clickOnAddBranchIcon() {
        addBranchIcon.click();
        common.pause(3);

    }

    public String verifyAddBranchPage() {
        return displayedMessageOnAddBranchPage.getText();
    }

    //Edit branch page displays upon clicking on edit icon against branch code on manage branch page

    public void clickOnEditIconOnManageBranchPage() {
        editIconOnManageBranchPage.click();
        common.pause(3);
    }

    public String verifyEditBranchPage() {
        inputTypeBranchCode.clear();
        common.pause(1);
        inputTypeBranchCode.sendKeys("Test");

        inputTypeBranchName.clear();
        common.pause(1);
        inputTypeBranchName.sendKeys("Test");

        inputTypeDescriptionOfEditBranchPage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditBranchPage.sendKeys("Test");

        return displayedMessageOnEditBranchPage.getText();

    }

    //To verify whether Manage change area page displays with area details by clicking on change area icon on setting page

    public void clickOnChangeAreaIcon() {
        changeAreaIcon.click();
        common.pause(3);

    }

    public String verifyManageChangeAreaPage() {
        List<WebElement> changeAreaClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : changeAreaClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add change area page displays will all details when user clicks on add change area icon on manage change area  page

    public void clickOnAddChangeAreaIcon() {
        addChangeAreaIcon.click();
        common.pause(3);
    }

    public String verifyAddChangeAreaPage() {
        return displayedMessageOnAddChangeAreaPage.getText();
    }

    //Edit change area page displays upon clicking on edit icon against change area name on manage change area page

    public void clickOnEditIconOnManageChangeAreaPage() {
        editIconOnManageChangeAreaPage.click();
        common.pause(3);
    }

    public String verifyEditChangeAreaPage() {
        inputTypeChangeAreaName.clear();
        common.pause(1);
        inputTypeChangeAreaName.sendKeys("Test");

        inputTypeDescriptionOfEditChangeAreaNamePage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditChangeAreaNamePage.sendKeys("Test");

        return displayedMessageOneEditChangeAreaPage.getText();
    }

    //To verify whether Manage sex page of pet displays with pet sex details by clicking on change sex icon on setting page

    public void clickOnSexIcon() {
        sexIcon.click();
        common.pause(3);
    }

    public String verifyManageSexPage() {
        List<WebElement> sexClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : sexClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add sex page of pet displays will all details when user clicks on add sex icon on manage sex page

    public void clickOnAddSexIcon() {
        addSexIcon.click();
        common.pause(3);
    }

    public String verifyAddSexPage() {
        return displayedMessageOnAddSexPage.getText();
    }

    //Edit sex page of pet displays upon clicking on edit icon against sex class on manage sex page of pet

    public void clickOnEditIconOnManageSexPage() {
        editIconOnManageSexPage.click();
        common.pause(3);
    }

    public String verifyEditSexPage() {
        inputTypeSexName.clear();
        common.pause(1);
        inputTypeSexName.sendKeys("Test");

        inputTypeDescriptionOfEditSexPage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditSexPage.sendKeys("Test");

        return displayedMessageOneEditSexPage.getText();

    }

    //To verify whether Manage Debtor Codes of pet displays with debtor code details by clicking on debtor code icon on setting page

    public void clickOnDebtorCodeIcon() {
        debtorCodeIcon.click();
        common.pause(3);
    }

    public String verifyManageBatorCodePage() {
        List<WebElement> debtorCodeClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : debtorCodeClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add sex page of pet displays will all details when user clicks on add sex icon on manage sex page

    public void clickOnAddDebtorCodeIcon() {
        addDebtorCodeIcon.click();
        common.pause(3);
    }

    public String verifyAddDebtorCodePage() {
        return displayedMessageOnAddDebtorCodePage.getText();
    }

    //Edit sex page of pet displays upon clicking on edit icon against sex class on manage sex page of pet

    public void clickOnEditIconOnManageDebtorCodePage() {
        editIconOnManageDebtorCodePage.click();
        common.pause(3);
    }

    public String verifyEditDebtorCodePage() {
        inputTypeDebtorCodeName.clear();
        common.pause(1);
        inputTypeDebtorCodeName.sendKeys("Test");

        inputTypeDescriptionOfEditDebtorCodePage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditDebtorCodePage.sendKeys("Test");

        return displayedMessageOneEditDebtorCodePage.getText();
    }

    //To verify whether Manage renewal type page displays with renewal type details by clicking on renewal type icon on setting page

    public void clickOnRenewalTypeIcon() {
        renewalTypeIcon.click();
        common.pause(3);
    }

    public String verifyManageRenewalTypePage() {
        List<WebElement> renewalTypeClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : renewalTypeClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add renewal type page displays will all details when user clicks on add renewal type icon on manage renewal type  page

    public void clickOnAddRenewalTypeIcon() {
        addRenewalTypeIcon.click();
        common.pause(3);
    }

    public String verifyAddRenewalTypePage() {
        return displayedMessageOneAddRenewalTypePage.getText();
    }

    //Edit renewal type  page displays upon clicking on edit icon against renewal type  name on manage renewal type  page

    public void clickOnEditIconOnManageRenewalTypePage() {
        editIconOnManageRenewalTypePage.click();
        common.pause(3);
    }

    public String verifyEditRenewalTypePage() {
        inputTypeRenewTypeName.clear();
        common.pause(1);
        inputTypeRenewTypeName.sendKeys("Test");

        inputTypeDescriptionOfEditRenewTypePage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditRenewTypePage.sendKeys("Test");

        return displayedMessageOnEditRenewalTypePage.getText();
    }

    //To verify whether Manage task type page displays with task type details by clicking on task type icon on setting page

    public void clickOnTaskTypeIcon() {
        taskTypeIcon.click();
        common.pause(3);
    }

    public String verifyManageTaskTypePage() {
        List<WebElement> taskTypeClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : taskTypeClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add task type page displays will all details when user clicks on add task type icon on manage task type  page

    public void clickOnAddTaskTypeIcon() {
        addTaskTypeIcon.click();
        common.pause(3);
    }

    public String verifyAddTaskTypePage() {
        return displayedMessageOneAddTaskTypePage.getText();
    }

    //Edit task type page displays upon clicking on edit icon against task type  name on manage task type  page

    public void clickOnEditIconOnManageTaskTypePage() {
        editIconOnManageTaskTypePage.click();
        common.pause(3);
    }

    public String verifyEditTaskTypePage() {
        inputTypeTasTypeName.clear();
        common.pause(1);
        inputTypeTasTypeName.sendKeys("Test");

        inputTypeDescriptionOfEditTaskTypePage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditTaskTypePage.sendKeys("Test");

        return displayedMessageOnEditTaskTypePage.getText();
    }

    //To verify whether Manage task status page displays with task status details by clicking on task status icon on setting page

    public void clickOnTaskStatusIcon() {
        taskStatusIcon.click();
        common.pause(3);
    }

    public String verifyManageTaskStatusPage() {
        List<WebElement> taskStatusClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : taskStatusClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add task status page displays will all details when user clicks on add task status icon on manage task status  page

    public void clickOnAddTaskStatusIcon() {
        addTaskStatusIcon.click();
        common.pause(3);
    }

    public String verifyAddTaskStatusPage() {
        return displayedMessageOneAddTaskStatusPage.getText();

    }

    //Edit task status page displays upon clicking on edit icon against task status  name on manage task status  page

    public void clickOnEditIconOnManageTaskStatusPage() {
        editIconOnManageTaskStatusPage.click();
        common.pause(3);
    }

    public String verifyEditTaskStatusPage() {
        inputTypeTasStatus.clear();
        common.pause(1);
        inputTypeTasStatus.sendKeys("Test");

        colorNameDropDownOnEditTaskStatusPage.click();
        common.pause(1);
        optionFromColorNameDropDownOnEditTaskStatusPage.click();

        inputTypeDescriptionOfEditTaskStatusPage.clear();
        common.pause(1);
        inputTypeDescriptionOfEditTaskStatusPage.sendKeys("Test");

        statusDropDownOnEditTaskStatusPage.click();
        common.pause(1);
        optionFromStatusDropDownOnEditTaskStatusPage.click();

        return displayedMessageOnEditTaskStatusPage.getText();

    }

    //To verify whether Manage Pet Breed page displays with Pet Breed details by clicking on Pet Breed icon on setting page

    public void clickOnPetBreedIcon() {
        petBreedIcon.click();
        common.pause(3);
    }

    public String verifyManagePetBreedPage() {
        List<WebElement> petBreedClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : petBreedClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add Pet Breed page displays will all details when user clicks on add pet breed icon on manage pet breed  page

    public void clickOnAddPetBreedIcon() {
        addPetBreedIcon.click();
        common.pause(3);
    }

    public String verifyAddPetBreedPage() {
        return displayedMessageOneAddPetBreedPage.getText();
    }

    //Edit Pet Breed page displays upon clicking on edit icon against pet breed name on manage pet breed page

    String petType;

    public void clickOnEditIconOnManagePetBreedPage() {
        petType = petTypeInManagePetBreedPage.getText();
        editIconOnManagePetBreedPage.click();
        common.pause(3);

    }

    public String verifyEditPetBreedPage() {
        if (petType.equalsIgnoreCase("Dog")) {
            inputTypPetBreedName.clear();
            common.pause(1);
            inputTypPetBreedName.sendKeys("Test");

            inputTypePetBreedNumber.clear();
            common.pause(1);
            inputTypePetBreedNumber.sendKeys("Test");

            ratingClassDropDownOnPetBreedPage.click();
            common.pause(1);
            optionFromRatingClassDropDownOnEditPetBreedPage.click();
            common.pause(1);
        } else if (petType.equalsIgnoreCase("Exotic")) {
            speciesTypeDD.click();
            common.pause(1);
            birdSpeciesOption.click();
            speciesName.clear();
            speciesName.sendKeys("TestEdit");
        }
        return displayedMessageOnEditPetBreedPage.getText();

    }

    //To verify whether Manage Exclusion page displays with exclusion details by clicking on exclusion icon on setting page

    public void clickOnExclusionIcon() {
        exclusionIcon.click();
        common.pause(3);
    }

    public String verifyManageExclusionPage() {
        List<WebElement> exclusionClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : exclusionClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add exclusion page displays will all details when user clicks on add exclusion icon on manage exclusion page

    public void clickOnAddExclusionIcon() {
        addExclusionIcon.click();
        common.pause(3);
    }

    public String verifyAddExclusionPage() {
        return displayedMessageOneAddExclusionPage.getText();
    }

    //Edit exclusion page displays upon clicking on edit icon against exclusion code on manage exclusion page

    public void clickOnEditIconOnManageExclusionPage() {
        editIconOnManageExclusionPage.click();
        common.pause(3);
    }

    public String verifyEditExclusionPage() {
        inputTypeExclusionCode.clear();
        common.pause(1);
        inputTypeExclusionCode.sendKeys("Test");

        inputTypeExclusionName.clear();
        common.pause(1);
        inputTypeExclusionName.sendKeys("Test");

        petClassDropDownOnExclusionPage.click();
        common.pause(1);
        optionFromPetClassDropDownOnExclusionPage.click();

        inputTypeDescription.clear();
        common.pause(1);
        inputTypeDescription.sendKeys("Test");

        defaultDurationDropDownOnExclusionPage.click();
        common.pause(1);
        optionFromDefaultDurationDropDownOnExclusionPage.click();

        return displayedMessageOnEditExclusionPage.getText();

    }

    //To verify whether Manage regular vet displays with vet details by clicking on regular vet icon on setting page

    public void clickOnRegularVetIcon() {
        regularVetIcon.click();
        common.pause(3);
    }

    public String verifyManageRegularVetPage() {
        List<WebElement> regularVetClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : regularVetClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add regular vet page displays will all details when user clicks on add regular vet icon on manage regular vet page

    public void clickOnAddRegularVetIcon() {
        addRegularVetIcon.click();
        common.pause(3);
    }

    public String verifyAddRegularVetPage() {
        return displayedMessageOneAddRegularVetPage.getText();
    }

    //To verify whether Manage hear about us page displays with  details by clicking on hear about us icon on setting page

    public void clickOnHearAboutUsIcon() {
        hearAboutUsIcon.click();
        common.pause(3);
    }

    public String verifyManageHearAboutUsPage() {
        List<WebElement> hearAboutUsClass = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder details = new StringBuilder();
        for (WebElement data : hearAboutUsClass) {
            details.append(data.getText());
        }
        return details.toString();
    }

    //Add hear about us page displays will all details when user clicks on add hear about us icon on manage hear about us page

    public void clickOnAddHearAboutUsIcon() {
        addHearAboutUsIcon.click();
        common.pause(3);
    }

    public String verifyAddHearAboutUsPage() {
        return displayedMessageOneAddHearAboutUsPage.getText();
    }

    //Edit hear about us page displays upon clicking on edit icon against hear about us name on manage hear about us page

    public void clickOnEditIconOnManageHearAboutUsPage() {
        editIconOnManageHearAboutUsPage.click();
        common.pause(3);

    }

    public String verifyEditHearAboutUsPage() {
        inputTypeHearAboutUsName.clear();
        common.pause(1);
        inputTypeHearAboutUsName.sendKeys("Test");


        inputTypeDescriptionOnEditHearAboutUsPage.clear();
        common.pause(1);
        inputTypeDescriptionOnEditHearAboutUsPage.sendKeys("Test");

        return displayedMessageOnEditHearAboutUsPage.getText();
    }
}
