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

public class AdminPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(10)")
    private WebElement adminIcon;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[5]/a/i")
    private WebElement letterIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr/td[5]/div/a[1]")
    private WebElement editLetterTemplateButton;
    @FindBy(xpath = "//*[text()='Edit Letter Template']")
    private WebElement displayMessage;
    @FindBy(css = "input[id='LetterTemplateName']")
    private WebElement nameField;
    @FindBy(css = "input[id='FromEmail']")
    private WebElement emailField;
    @FindBy(css = "input[id='DisplayOrder']")
    private WebElement orderField;
    @FindBy(css = "input[id='Subject']")
    private WebElement subjectField;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[1]/a/i")
    private WebElement productIcon;
    @FindBy(xpath = "//div[@class='ibox view']/div/div[2]/div/dl/dd[1]/h2")
    private WebElement productName;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr/td[5]/ul/li")
    private WebElement settingsIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr/td[5]/ul[1]/li/ul/li[1]/a[1]")
    private WebElement insurerConfigIcon;
    @FindBy(xpath = "//div[@id='gridInsurerConfiguration']/table/tbody/tr")
    private WebElement insurerDetail;
    @FindBy(xpath = "//div[@id='gridAgentConfiguration']/table/tbody/tr")
    private WebElement agentDetail;
    @FindBy(css = "input[id='SearchText']")
    private WebElement searchInput;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;

    //Department Page
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[2]/a/i")
    private WebElement departmentIcon;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/a[2]")
    private WebElement addDepartmentIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayMessageOnAddDepartmentPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]")
    private WebElement editDepartmentIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditDepartmentPage;

    //Staff Page
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[3]/a/i")
    private WebElement staffIcon;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span")
    private WebElement departmentDropDownOnStaffPage;
    @FindBy(xpath = "//ul[@id='DepartmentId_listbox']/li[2]")
    private WebElement optionOfDepartmentDropDownOnStaffPage;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[3]/div/span/span")
    private WebElement activeDropDownOnStaffPage;
    @FindBy(xpath = "//ul[@id='IsActive_listbox']/li[2]")
    private WebElement optionOfActiveDropDownOnStaffPage;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnStaffPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addStaffButton;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddStaffPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[7]/div/a[1]")
    private WebElement editStaffIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditStaffPage;

    //Bank Page
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[4]/a/i")
    private WebElement bankAccountIcon;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[1]/div/span/span")
    private WebElement bankAccountDropDown;
    @FindBy(xpath = "//ul[@id='BankAccount_listbox']/li[3]")
    private WebElement itemFromBADD;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span")
    private WebElement insurerDropDown;
    @FindBy(xpath = "//ul[@id='Insurer_listbox']/li[3]")
    private WebElement itemFromIDD;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOfManageBank;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addBankAccountIcon;
    @FindBy(xpath = "//form[@id='bankForm']/div/div/div/div/h5")
    private WebElement displayedMessageOnAddBankAccount;
    @FindBy(xpath = "//div[@id='gridBankAccount']/table/tbody/tr[1]/td[7]/div/a")
    private WebElement editIconAgainstInsurer;
    @FindBy(xpath = "//div[@class='ibox float-e-margins']/div[2]/div[1]/div/div/div/span")
    private WebElement insurerNameInput;
    @FindBy(xpath = "//ul[@id='Insurer_listbox']/li[3]")
    private WebElement insurerNameInputDD;
    @FindBy(xpath = "//div[@class='ibox float-e-margins']/div[2]/div[2]/div/div/div/input[2]")
    private WebElement accountTypeInput;
    @FindBy(xpath = "//div[@class='ibox float-e-margins']/div[2]/div[3]/div/div/div/input")
    private WebElement bankAccountNameInput;
    @FindBy(xpath = "//div[@class='ibox float-e-margins']/div[2]/div[4]/div/div/div/input")
    private WebElement bankAccountNumberInput;
    @FindBy(xpath = "//div[@class='ibox float-e-margins']/div[2]/div[5]/div/div/div/input")
    private WebElement bicNUmberInput;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[6]/a/i")
    private WebElement insurerIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr")
    private WebElement insurerPageDetails;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnManageInsurerPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[2]")
    private WebElement insurerCode;
    @FindBy(xpath = "//div[@class='row row0 views']/div[1]/div/div/div[2]/div[1]/dl/dd/h2")
    private WebElement displayMessageOfViewInsurerCode;
    @FindBy(xpath = "//div[@id='search']/div[2]/div/span/span")
    private WebElement typeDropDownOnManageInsurerPage;
    @FindBy(xpath = "//ul[@id='InsurerTypeId_listbox']/li[3]")
    private WebElement itemFromTypeDropDown;
    @FindBy(xpath = "//div[@id='search']/div[3]/div/span/span")
    private WebElement categoryDropDownOnManageInsurerPage;
    @FindBy(xpath = "//ul[@id='InsurerCategoryId_listbox']/li[2]")
    private WebElement itemFromCategoryDropDown;
    @FindBy(xpath = "//div[@id='search']/div[4]/div/span/span")
    private WebElement activeDropDownOnManageInsurerPage;
    @FindBy(xpath = "//ul[@id='IsActive_listbox']/li[2]")
    private WebElement itemFromActiveDropDown;
    @FindBy(xpath = "//button[@id='SearchGrid']")
    private WebElement searchButtonOnManageInsurerPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addInsurerIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddInsurerPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[14]/div/a[1]")
    private WebElement editIconOfInsurer;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditInsurerPage;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[7]/a/i")
    private WebElement agentIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr/td[2]")
    private WebElement agentReferenceNumber;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div[1]/h2")
    private WebElement displayedMessageOnViewAgentPage;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span")
    private WebElement categoryDropDownOnManageAgentPage;
    @FindBy(xpath = "//ul[@id='AgentCategoryId_listbox']/li[2]")
    private WebElement optionFromCategoryDropDownOnManageAgentPage;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[3]/div/span/span")
    private WebElement typeDropDownOnManageAgentPage;
    @FindBy(xpath = "//ul[@id='AgentTypeId_listbox']/li[2]")
    private WebElement optionFromTypeDropDownOnManageAgentPage;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[4]/div/span/span")
    private WebElement activeDropDownOnManageAgentPage;
    @FindBy(xpath = "//ul[@id='IsActive_listbox']/li[2]")
    private WebElement optionFromActiveDropDownOnManageAgentPage;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnManageAgentPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addAgentButtonOnManageAgentPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddAgentPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[2]/ul/li/a")
    private WebElement cogIconOnManageAgentPage;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[2]/ul/li/ul/li[2]/a")
    private WebElement editAgentOptionOfCogIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnEditAgentPage;

    //Company Page
    @FindBy(xpath = "//div[@class='ibox-content']/div/div[8]/a/i")
    private WebElement companyIcon;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span")
    private WebElement stateDropDownOnManageCompanyPage;
    @FindBy(xpath = "//ul[@id='StateId_listbox']/li[2]")
    private WebElement optionFromStateDropDownOnManageCompanyPage;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[3]/div/span/span")
    private WebElement countryDropDownOnManageCompanyPage;
    @FindBy(xpath = "//ul[@id='CountryId_listbox']/li[2]")
    private WebElement optionFromCountryDropDownOnManageCompanyPage;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButtonOnManageCompanyPage;
    @FindBy(xpath = "//div[@class='form-group pull-right']/div/a[2]")
    private WebElement addCompanyButtonOnManageCompanyPage;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayedMessageOnAddCompanyPage;

    public void clickAdminIcon() {
        adminIcon.click();
        common.pause(2);
    }

    public void clickOnLetterIcon() {
        letterIcon.click();
        common.pause(2);
    }

    public String fetchData() {
        List<WebElement> totalRow = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder data = new StringBuilder(" ");
        for (WebElement trRow : totalRow) {
            data.append(trRow.getText()).append("\n");
        }
        return data.toString();
    }

    public void clickOnAddLetterTemplateIcon() {
        List<WebElement> totalHead = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[5]/div/a[1]");
        for (WebElement thHead : totalHead) {
            thHead.click();
            break;
        }
        common.pause(2);
    }

    public String displayedMessage() {
        common.pause(1);
        return displayMessage.getText();
    }

    public void editData() {
        nameField.clear();
        nameField.sendKeys("Nitesh");
        emailField.clear();
        emailField.sendKeys("nitesh.barot@prowerse.com");

        ((JavascriptExecutor) driver).executeScript("document.getElementById('DisplayOrder').style.display='block';");
        WebElement element = driver.findElement(By.id("DisplayOrder"));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        String order = "23";
        wait1.until(ExpectedConditions.visibilityOf(element)).sendKeys(order);
        common.pause(1);

        common.waitUntilVisibilityOfElement(subjectField);
        subjectField.clear();
        subjectField.sendKeys("Testing Purpose");
        common.pause(1);
    }

    public void traversingThroughPages() {
        List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@class='ibox-content']/div/div/a");
        System.out.println("Total number of menu displayed in the admin menu: " + totalColumn);
        for (int i = 1; i <= 11; i++) {
            String menuTitle = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[" + i + "]/a")).getText();
            if (menuTitle.contains("Run Scheduler") || menuTitle.contains("Email Logs")) {
                System.out.println("Do Nothing");
            } else {
                driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
                common.pause(2);
                System.out.println(driver.getCurrentUrl());
                adminIcon.click();
                common.pause(2);
            }
        }
    }

    //To verify whether View Product page displays with product details with status after by clicking on product code on manage product page

    public void clickOnProductIcon() {
        productIcon.click();
        common.pause(2);
    }

    public void clickOnProductCode() {
        List<WebElement> productCode = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[2]");
        for (WebElement pCode : productCode) {
            pCode.click();
            common.pause(2);
            break;
        }
    }

    public String verifyProductDetails() {
        return productName.getText();
    }

    // To verify if insurer pop up windows displays by  clicking on insurer configuration pop up on setting icon on manage product page

    public void clickOnInsurerConfigIcon() {

        List<WebElement> settingIcon = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[5]/ul/li");
        for (WebElement stg : settingIcon) {
            common.moveToElement(stg);
            List<WebElement> insurerConfig = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[5]/ul[1]/li/ul/li[1]/a[1]");
            for (WebElement insurance : insurerConfig) {
                insurance.click();
                break;
            }
            break;
        }
        common.pause(2);
    }

    public String fetchInsurerPageData() {
        List<WebElement> insurerDetail = common.waitUntilPresenceOfAllElement("//div[@id='gridInsurerConfiguration']/table/tbody/tr");
        StringBuilder data = new StringBuilder();
        for (WebElement details : insurerDetail) {
            data.append(details.getText()).append("\n");
        }
        return data.toString();
    }

    //To verify if agent configuration pop up windows displays by  clicking on agent configuration on setting icon on manage product page

    public void clickOnAgentConfigIcon() {
        List<WebElement> settingIcon = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[5]/ul/li");
        for (WebElement stg : settingIcon) {
            common.moveToElement(stg);
            List<WebElement> agentConfig = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[5]/ul[1]/li/ul/li[2]/a[1]");
            for (WebElement agent : agentConfig) {
                agent.click();
                break;
            }
            break;
        }
        common.pause(2);
    }

    public String fetchAgentConfigData() {
        if (common.isElementDisplayed("//div[@id='gridAgentConfiguration']/table/tbody/tr")) {
            List<WebElement> insurerDetail = common.waitUntilPresenceOfAllElement("//div[@id='gridAgentConfiguration']/table/tbody/tr");
            StringBuilder data = new StringBuilder();
            for (WebElement details : insurerDetail) {
                data.append(details.getText()).append("\n");
            }
            return data.toString();
        }
        return null;
    }

//Department

    public void clickDepartmentIcon() {
        departmentIcon.click();
        common.pause(2);
    }

    public void enterDepartmentInSearch() {
        searchInput.sendKeys("Inbound");
    }

    public void clickSearchButton() {
        searchButton.click();
        common.pause(2);
    }

    public String verifyDepartmentName() {
        List<WebElement> department = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr[1]/td[2]");
        StringBuilder depart = new StringBuilder();
        for (WebElement dep : department) {
            depart.append(dep.getText()).append("\n");
        }
        return depart.toString();
    }

    //Add department page  displays will all details when user clicks on add department icon on manage department page

    public void clickOnAddDepartmentIcon() {
        addDepartmentIcon.click();
        common.pause(2);
    }

    public String verifyAddDepartmentPage() {
        return displayMessageOnAddDepartmentPage.getText();
    }

    //Edit department page displays upon clicking on edit icon against department name inside list of department on manage department page

    public void clickOnEditDepartmentIcon() {
        editDepartmentIcon.click();
        common.pause(2);
    }

    public String verifyEditDepartmentPage() {
        return displayedMessageOnEditDepartmentPage.getText();
    }

    //Filter data of staff details upon department and active drop down options on manage staff  page

    public void clickOnStaffIcon() {
        staffIcon.click();
        common.pause(2);
    }

    public void selectOptionFromDropDownOnStaffPage() {
        departmentDropDownOnStaffPage.click();
        common.pause(1);
        optionOfDepartmentDropDownOnStaffPage.click();
        activeDropDownOnStaffPage.click();
        common.pause(1);
        optionOfActiveDropDownOnStaffPage.click();
        searchButtonOnStaffPage.click();
        common.pause(3);
    }

    public String verifyDetailsOfStaffPage() {
        List<WebElement> staffDetails = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td");
        StringBuilder data = new StringBuilder();
        for (WebElement details : staffDetails) {
            data.append(details.getText()).append("\n");
        }
        return data.toString();
    }

    //Add staff page displays with all details upon clicking on add staff icon on manage staff page

    public void clickOnAddStaffButton() {
        addStaffButton.click();
        common.pause(2);
    }

    public String verifyAddStaffPage() {
        return displayedMessageOnAddStaffPage.getText();
    }

    //Edit staff page displays upon clicking on edit icon against staff name inside list of staff on manage staff page

    public void clickOnEditStaffIcon() {
        editStaffIcon.click();
        common.pause(3);
    }

    public String verifyEditStaffPage() {
        return displayedMessageOnEditStaffPage.getText();
    }

    //Manage Bank Account page displays with all details by clicking on bank account icon on administration page

    public void clickOnBankAccountIcon() {
        bankAccountIcon.click();
        common.pause(3);
    }

    public String fetchAndDisplayBankAccountData() {
        List<WebElement> bankDetails = common.waitUntilPresenceOfAllElement("//div[@id='gridBankAccount']/table/tbody/tr");
        StringBuilder bankDetail = new StringBuilder();
        for (WebElement bankD : bankDetails) {
            bankDetail.append(bankD.getText()).append("\n");
        }
        return bankDetail.toString();
    }

    //Filter data of bank details upon bank account and insurer drop down items on manage bank account page

    public void selectItemFromBankDropDown() {
        bankAccountDropDown.click();
        common.pause(1);
        itemFromBADD.click();
    }

    public void selectItemFromInsurerDropDown() {
        insurerDropDown.click();
        common.pause(1);
        itemFromIDD.click();
    }

    public void clickOnSearchButton() {
        searchButtonOfManageBank.click();
        common.pause(3);
    }

    public String verifyBankAccountDetails() {
        List<WebElement> insurerName = common.waitUntilPresenceOfAllElement("//div[@id='gridBankAccount']/table/tbody/tr");
        StringBuilder insurer = new StringBuilder();
        for (WebElement insure : insurerName) {
            insurer.append(insure.getText()).append("\n");
        }
        return insurer.toString();
    }

    //Add Bank account page displays with details after clicking on add bank account button on manage bank account page

    public void clickOnAddBankAccountIcon() {
        addBankAccountIcon.click();
        common.pause(3);
    }

    public String verifyAddBankAccountPage() {
        return displayedMessageOnAddBankAccount.getText();
    }

    // On the manage bank account page click the Edit icon against a insurer name. The Edit Bank Account page should open with the  data in editable format.

    public void clickOnEditIconOfInsurer() {
        common.pause(1);
        editIconAgainstInsurer.click();
        common.pause(3);
    }

    public void editDataOfEditBankAccountPage() {
        insurerNameInput.click();
        common.pause(1);
        insurerNameInputDD.click();
        common.pause(1);
        accountTypeInput.click();
        bankAccountNameInput.clear();
        bankAccountNameInput.sendKeys("Xys");
        bankAccountNumberInput.sendKeys("989");
        bicNUmberInput.sendKeys("989867");
        common.pause(1);
    }

    ////Manage insurer page will display with all details by clicking on insurer icon on Administrator page

    public void clickOnInsurerIcon() {
        insurerIcon.click();
        common.pause(3);
    }

    public String verifyManageInsurerPage() {
        List<WebElement> insurerDetails = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder insurerData = new StringBuilder();
        for (WebElement data : insurerDetails) {
            insurerData.append(data.getText()).append("\n");
        }
        return insurerData.toString();
    }

    //View Insurer page displays with all insurer details after clicking on insurer code link on manage insurer page

    public void clickOnInsurerCodeLink() {
        insurerCode.click();
        common.pause(3);
    }

    public String verifyViewInsurerPage() {
        return displayMessageOfViewInsurerCode.getText();
    }

    public void selectsOptionFromDropDownOnManageInsurerPage() {
        typeDropDownOnManageInsurerPage.click();
        common.pause(1);
        itemFromTypeDropDown.click();
        common.pause(1);
        categoryDropDownOnManageInsurerPage.click();
        common.pause(1);
        itemFromCategoryDropDown.click();
        common.pause(1);
        activeDropDownOnManageInsurerPage.click();
        common.pause(1);
        itemFromActiveDropDown.click();
        common.pause(1);
        searchButtonOnManageInsurerPage.click();
        common.pause(3);
    }

    public String verifyListOfManageInsurerPageUponDD() {
        List<WebElement> typeDD = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td");
        StringBuilder typeValue = new StringBuilder();
        for (WebElement type : typeDD) {
            typeValue.append(type.getText()).append("\n");
        }
        return typeValue.toString();
    }

    //Add insurer page displays with all fields by clicking on add insurer icon on manage insurer page

    public void clickOnAddInsurerIcon() {
        addInsurerIcon.click();
        common.pause(3);
    }

    public String verifyAddInsurerPage() {
        return displayedMessageOnAddInsurerPage.getText();
    }

    //Edit insurer page displays in editable format by clicking on edit icon against insurer code on manage insurer page

    public void clickOnEditInsurerIcon() {
        common.scrollToElement(editIconOfInsurer);
        common.pause(1);
        editIconOfInsurer.click();
        common.pause(2);
    }

    public String verifyEditInsurerPage() {
        return displayedMessageOnEditInsurerPage.getText();
    }

    //View Agent page displays with all details by clicking on agent reference number on Manage agent page

    public void clickOnAgentIcon() {
        agentIcon.click();
        common.pause(3);
    }

    public void clickOnAgentReferenceNumber() {
        List<WebElement> agentRef = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[2]");
        for (WebElement agent : agentRef) {
            agent.click();
            common.pause(2);
            break;
        }
    }

    public String verifyViewAgentPage() {
        return displayedMessageOnViewAgentPage.getText();
    }

    // Filter details on manage agent page upon option of category,type and active drop down

    public void selectOptionFromDropDownOnManageAgentPage() {
        categoryDropDownOnManageAgentPage.click();
        common.pause(1);
        optionFromCategoryDropDownOnManageAgentPage.click();

        typeDropDownOnManageAgentPage.click();
        common.pause(1);
        optionFromTypeDropDownOnManageAgentPage.click();

        activeDropDownOnManageAgentPage.click();
        common.pause(1);
        optionFromActiveDropDownOnManageAgentPage.click();
    }

    public void clickOnButtonOnManageAgentPage() {
        searchButtonOnManageAgentPage.click();
        common.pause(3);
    }

    public String verifyDetailsOfAgentList() {
        List<WebElement> agentDetails = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder data = new StringBuilder();
        for (WebElement details : agentDetails) {
            data.append(details.getText()).append("\n");
        }
        return data.toString();
    }

    //Add agent page displays with all details by clicking on add agent button on manage agent page

    public void clickOnAddAgentButton() {
        addAgentButtonOnManageAgentPage.click();
        common.pause(3);
    }

    public String verifyAddAgentPage() {
        return displayedMessageOnAddAgentPage.getText();
    }

    //Edit Agent page displays in editable format by selecting edit icon from cog icon dropdown against agent reference number on manage agent page

    public void clickOnEditAgentIcon() {
        common.pause(1);
        common.moveToElement(cogIconOnManageAgentPage);
        editAgentOptionOfCogIcon.click();
        common.pause(3);
    }

    public String verifyEditAgentPage() {
        return displayedMessageOnEditAgentPage.getText();
    }

    //Manage Company page displays with list of companies by clicking on company icon on administration page

    public void clickOnCompanyIcon() {
        companyIcon.click();
        common.pause(3);
    }

    public String fetchAndDisplaysManageCompanyDetails() {
        List<WebElement> companyDetails = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td");
        StringBuilder companyDetail = new StringBuilder();
        for (WebElement company : companyDetails) {
            companyDetail.append(company.getText()).append("\n");
        }
        return companyDetail.toString();
    }

    //Filter details on manage company page upon option of state and country drop down

    public void selectOptionsFromDropDownOnManageCompany() {
        stateDropDownOnManageCompanyPage.click();
        common.pause(1);
        optionFromStateDropDownOnManageCompanyPage.click();

        countryDropDownOnManageCompanyPage.click();
        common.pause(1);
        optionFromCountryDropDownOnManageCompanyPage.click();
        searchButtonOnManageCompanyPage.click();
        common.pause(3);
    }

    public String verifyDetailsOfCompany() {
        List<WebElement> companyList = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td");
        StringBuilder data = new StringBuilder();
        for (WebElement details : companyList) {
            data.append(details.getText()).append("\n");
        }
        return data.toString();
    }

    //Add company page displays with all details by clicking on add company button on manage company page

    public void clickOnAddCompanyButton() {
        addCompanyButtonOnManageCompanyPage.click();
        common.pause(3);
    }

    public String verifyAddCompanyPage() {
        return displayedMessageOnAddCompanyPage.getText();
    }
}