package pages;

import factory.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Common;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ClientPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public ClientPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Elements

    @FindBy(css = "ul[id='side-menu']>li:nth-child(3)")
    private WebElement clientIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessage;
    @FindBy(css = "input[id='SearchText']")
    private WebElement searchBox;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span")
    private WebElement statusDropDown;
    @FindBy(xpath = "//ul[@id='IsActive_listbox']/li[2]")
    private WebElement clientStatus;
    @FindBy(xpath = "//div[@class='tooltip-demo pull-right']/div/button")
    private WebElement displayedStatus;
    @FindBy(css = "a[id='btnAddClientView']")
    private WebElement addQuoteForClient;
    @FindBy(xpath = "//div[@id='loadpartialview']/div/div/div[2]/div/div")
    private WebElement existingClientId;

    //Edit client page

    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div[2]/div/div/div/div/div/div/div/a")
    private WebElement cogIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div[2]/div/div/div/div/div/div/div/ul/li[1]/a")
    private WebElement editClientIcon;

    //Add quote on client

    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div[2]/div/div/div/div/div/div/div/ul/li[2]/a")
    private WebElement addQuoteIcon;
    @FindBy(xpath = "//div[@class='ibox-content']/div/div/div[4]/div/div/span")
    private WebElement productDropdown;
    @FindBy(xpath = "//ul[@id='PrimaryProductId_listbox']/li[2]")
    private WebElement optionOfProductDropDown;
    @FindBy(css = "input[id='Address1']")
    private WebElement AddressOfClient;
    @FindBy(xpath = "//div[@id='cc_c2a']/ul/li[3]")
    private WebElement optionOfAddress;
    @FindBy(css = "input[id='Question_234_278']")
    private WebElement radioButton;
    @FindBy(xpath = "//div[@id='Div_138']/div/div/span")
    private WebElement speciesDropDown;
    @FindBy(xpath = "//ul[@id='Question_138_listbox']/li[3]")
    private WebElement optionOfSpeciesDD;
    @FindBy(css = "input[id='Question_139']")
    private WebElement nameOfSpecies;
    @FindBy(xpath = "//div[@id='Div_140']/div/div/span")
    private WebElement genderDropDownAddQuote;
    @FindBy(xpath = "//ul[@id='Question_140_listbox']/li[3]")
    private WebElement optionOfGenderDD;
    @FindBy(css = "input[id='Question_141']")
    private WebElement dateOfBirth;
    @FindBy(css = "input[id='Question_142']")
    private WebElement priceOfSpecies;
    @FindBy(css = "ul[id='side-menu']>li:nth-child(5)")
    private WebElement policyIcon;
    @FindBy(xpath = "//div[@id='gridClientPolicyList']/table/tbody/tr")
    private WebElement policyDetails;
    @FindBy(xpath = "//div[@class='ibox-content project-content']/div/ul/li[2]/a")
    private WebElement claimIcon;
    @FindBy(xpath = "//div[@id='gridNameClientClaim']/table/tbody/tr")
    private WebElement claimDetails;
    @FindBy(xpath = "//div[@class='ibox-content project-content']/div/ul/li[3]/a")
    private WebElement contactIcon;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr")
    private WebElement contactDetails;
    @FindBy(xpath = "//div[@class='ibox-content project-content']/div/ul/li[4]/a")
    private WebElement noteIcon;
    @FindBy(xpath = "//div[@id='gridClientNoteName']/table/tbody/tr")
    private WebElement noteDetailsOnViewClient;
    @FindBy(xpath = "//div[@class='ibox-content project-content']/div/ul/li[5]/a")
    private WebElement taskIcon;
    @FindBy(xpath = "//div[@id='gridClientTaskName']/table/tbody/tr")
    private WebElement taskDetailsOnViewClient;
    @FindBy(xpath = "//div[@class='ibox-content project-content']/div/ul/li[6]/a")
    private WebElement historyIcon;
    @FindBy(xpath = "//div[@id='gridNameClientHistory']/table/tbody/tr")
    private WebElement historyDetailsOnViewClient;
    @FindBy(xpath = "//div[@class='ibox-content project-content']/div/ul/li[7]/a")
    private WebElement quoteIcon;
    @FindBy(xpath = "//div[@id='gridNameClientQuote']/table/tbody/tr")
    private WebElement quoteDetailsOnViewClient;
    @FindBy(xpath = "//div[@class='ibox-content project-content']/div/ul/li[8]/a")
    private WebElement policyStatementIcon;
    @FindBy(xpath = "//div[@id='gridNameClientPolicyStatement']/table/tbody/tr")
    private WebElement policyStatementDetailsOnViewClient;
    @FindBy(xpath = "//div[@class='form-group pull-right field-small']/div/span/span")
    private WebElement statusDropDownOnViewClientPage;
    @FindBy(xpath = "//ul[@id='ClientPolicyStatus_listbox']/li[2]")
    private WebElement optionFromStatusDropDown;
    @FindBy(xpath = "//div[@class='form-group pull-right field-small']/div/span")
    private WebElement statusDDOnViewClientPage;
    @FindBy(xpath = "//ul[@id='ClaimMainStatusSearch_listbox']/li[2]")
    private WebElement optionFromStatusDropDownForClaim;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/a[2]")
    private WebElement addClientButton;
    @FindBy(css = "input[id='ClientTypeId_1']")
    private WebElement clientTypeRadioButton;
    @FindBy(xpath = "//div[@id='dvClientName']/div/div/div/div/span/span")
    private WebElement genderDropDown;
    @FindBy(xpath = "//ul[@id='Title_listbox']/li[2]")
    private WebElement genderValue;
    @FindBy(css = "input[id='FirstName']")
    private WebElement firstName;
    @FindBy(css = "input[id='LastName']")
    private WebElement lastName;
    @FindBy(css = "input[id='BirthDate']")
    private WebElement birthDate;
    @FindBy(css = "input[id='Address1']")
    private WebElement Address;
    @FindBy(xpath = "//ul[@class='c2a_results']/li[2]")
    private WebElement postCodeOfAddress;
    @FindBy(css = "button[class='dismissButton']")
    private WebElement okButtonPopUp;
    @FindBy(css = "input[id='Email']")
    private WebElement emailId;
    @FindBy(css = "input[id='PrimaryContactNumber']")
    private WebElement primaryContact;
    @FindBy(css = "button[value='Create']")
    private WebElement createButton;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2")
    private WebElement displayMessageOfViewClientPage;

    //Add contact details of client

    @FindBy(css = "a[id='dropdownMenu1']")
    private WebElement settingDropDown;
    @FindBy(css = "//ul[@class='dropdown-menu']/li[5]")
    private WebElement addContactOptionOfDD;
    @FindBy(css = "input[id='Name']")
    private WebElement userName;
    @FindBy(css = "input[id='Email']")
    private WebElement userEmail;
    @FindBy(css = "input[id='JobTitle']")
    private WebElement userRelation;
    @FindBy(css = "input[id='Mobile']")
    private WebElement userMobile;
    @FindBy(xpath = "//button[@value='Create']")
    private WebElement Button;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[3]")
    private WebElement contactMenu;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr")
    private WebElement contactData;

    //Add notes details of client

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[6]/a")
    private WebElement addNotesOptionOfDD;
    @FindBy(css = "input[id='Title']")
    private WebElement titleOfNote;
    @FindBy(css = "textarea[id='Description']")
    private WebElement descriptionOFNote;
    @FindBy(xpath = "//button[@type='submit' and @title='Create']")
    private WebElement createButtonOfWindow;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[4]/a")
    private WebElement noteTabOFMenu;
    @FindBy(xpath = "//div[@id='gridClientNoteName']/table/tbody/tr[1]")
    private WebElement noteDetails;

    //Add task details of client

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[7]/a")
    private WebElement addTaskOptionOfDD;
    @FindBy(css = "input[id='Title']")
    private WebElement titleOfTask;
    @FindBy(xpath = "//div[@class='ibox-content']/div[1]/div[1]/div[3]/div/div/div/div/span")
    private WebElement statusDropDownOfTask;
    @FindBy(xpath = "//ul[@id='TaskStatusId_listbox']/li[2]/span/span")
    private WebElement optionFromStatusDD;
    @FindBy(xpath = "//div[@class='ibox-content']/div[1]/div[1]/div[4]/div/div/div/span")
    private WebElement priorityDropDown;
    @FindBy(xpath = "//ul[@id='TaskPriorityId_listbox']/li[4]")
    private WebElement optionFromPriority;
    @FindBy(xpath = "//div[@class='ibox-content']/div[1]/div[1]/div[5]/div/div/div/span")
    private WebElement typeDropDown;
    @FindBy(xpath = "//ul[@id='TaskTypeId_listbox']/li[2]")
    private WebElement optionFromTypeDD;
    @FindBy(xpath = "//input[@id='EndDate']")
    private WebElement endDate;
    @FindBy(xpath = "//button[@type='submit' and @value='Create']")
    private WebElement createButtonOfTask;
    @FindBy(xpath = "//div[@class='project-tabs user-profile dsh-tab']/ul/li[5]/a")
    private WebElement taskTabOFMenu;
    @FindBy(xpath = "//div[@id='gridClientTaskName']/table/tbody/tr[1]")
    private WebElement taskDetails;

    //Edit client test case

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[1]")
    private WebElement editClientOptionsFromDD;
    @FindBy(css = "input[id='FirstName']")
    private WebElement clientFirstName;
    @FindBy(css = "input[id='LastName']")
    private WebElement clientLastName;
    @FindBy(css = "input[id='BirthDate']")
    private WebElement clientBirthDate;
    @FindBy(css = "input[id='Address1']")
    private WebElement clientPostAddressCode;
    @FindBy(xpath = "//div[@id='cc_c2a']/ul/li[3]")
    private WebElement clientAddressFromDD;
    @FindBy(css = "input[id='Email']")
    private WebElement clientEmail;
    @FindBy(css = "input[id='PrimaryContactNumber']")
    private WebElement clientContact;
    @FindBy(xpath = "//button[@type='button' and @value='Create']")
    private WebElement saveButton;
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[3]/a")
    private WebElement addPolicyIcon;
    @FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div[2]/div/div/div/div/div/div/div/ul/li[4]/a")
    private WebElement addClaimIcon;
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[8]/a")
    private WebElement clientRefundUnallocatedBalanceOptionOfDD;
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[9]/a")
    private WebElement clientRefundCreditNoteOptionOfDD;
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[10]/a")
    private WebElement clientAllocatePaymentOfDD;
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[11]/a")
    private WebElement clientAccountMaintenanceOfDD;
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[12]/a")
    private WebElement debtorLedgerIconOfDD;
    @FindBy(css = "div[class='swal-text']")
    private WebElement message;
    @FindBy(css = "button[class='swal-button swal-button--confirm']")
    private WebElement okButton;

    public String verifyClientManage() {
        clientIcon.click();
        common.pause(3);
        return displayedMessage.getText();
    }

    public String fetchAndDisplayData() {
        List<WebElement> totalRow = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder array = new StringBuilder();
        for (WebElement rEle : totalRow) {
            array.append(rEle.getText()).append("\n");
        }
        return array.toString();
    }

    public void enterCodeDetails() {
        searchBox.sendKeys("RAOA-0001");
        common.pause(1);
    }

    public void clickOnButton() {
        searchButton.click();
        common.pause(3);
    }

    public String verifyClient() {
        List<WebElement> clientInfo = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[2]");
        String clientCode = "";
        for (WebElement client : clientInfo) {
            clientCode += client.getText() + "\n";
            break;
        }
        return clientCode;
    }

    public void selectClientStatus() {
        statusDropDown.click();
        common.pause(2);
        clientStatus.click();
    }

    public void clickClientCode() {
        List<WebElement> clientInfo = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr[1]/td[2]");
        for (WebElement client : clientInfo) {
            common.pause(3);
            client.click();
            common.pause(3);
            break;
        }
    }

    public String verifyClientStatus() {
        return displayedStatus.getText();
    }

    //To check whether add quote page is displays for same user by clicking on add button on view client page
    public String clickClientCodeToGetClientNumber() {
        WebElement clientInfo = common.waitUntilPresenceOfElement("//div[@id='gridName']/table/tbody/tr[1]/td[2]");
        String clientNumber = clientInfo.getText();
        System.out.println(clientNumber);
        clientInfo.click();
        common.pause(2);
        return clientNumber;
    }

    public void clickOnAddQuoteButton() {
        addQuoteForClient.click();
    }

    public String verifyExistingClientOnAddQuote() {
        return existingClientId.getText();
    }

    //view client page should displays with all details for each client code link on manage client page

    public String clickOnClientCodeOnManageClient() {
        List<WebElement> totalColumn = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[2]/a");

        StringBuilder displayMessage = new StringBuilder();
        for (WebElement cEle : totalColumn) {
            cEle.click();
            common.pause(2);
            common.switchToWindow(1);
            System.out.println(driver.getCurrentUrl());
            displayMessage.append(displayedMessage.getText()).append("\n");
            driver.close();
            common.switchToWindow(0);
        }
        return displayMessage.toString();
    }

    //Edit client page should display in editable format by clicking on edit client icon on cog dropdown menu on view client page

    public void clickOnEditClientIcon() {
        cogIcon.click();
        common.pause(3);
        editClientIcon.click();
    }

    public void verifyEditClientPage() {
        clientFirstName.clear();
        common.pause(1);
        clientFirstName.sendKeys("Nitesh");
        clientLastName.clear();
        common.pause(1);
        clientLastName.sendKeys("Barot");
        clientBirthDate.clear();
        common.pause(1);
        clientBirthDate.sendKeys("12.09.1980");

        clientPostAddressCode.clear();
        common.pause(1);
        clientPostAddressCode.sendKeys("RM8 2TE");
        common.pause(2);
        clientAddressFromDD.click();

        clientEmail.clear();
        common.pause(1);
        clientEmail.sendKeys("nik@gmail.com");

        clientContact.clear();
        common.pause(1);
        clientContact.sendKeys("07459170022");
    }

    //Add quote page should display in editable format by clicking on add quote icon on cog dropdown menu on view client page

    public void clickOnAddQuoteIcon() {
        common.pause(2);
        common.moveToElement(cogIcon);
        addQuoteIcon.click();
    }

    public void verifyAddQuotePage() {
        productDropdown.click();
        common.pause(1);
        optionOfProductDropDown.click();

       /* JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10)", "");
        driver.findElement(AddressOfClient).clear();
        driver.findElement(AddressOfClient).sendKeys("RM8 2TE");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(optionOfAddress).click();
        JavascriptExecutor js1=(JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,-150)", "");*/
        // driver.findElement(radioButton).click();

        common.pause(3);
        speciesDropDown.click();
        common.pause(1);
        optionOfSpeciesDD.click();
        common.pause(1);
        nameOfSpecies.sendKeys("Test Data");
        common.pause(1);
        genderDropDownAddQuote.click();
        common.pause(1);
        optionOfGenderDD.click();
        common.pause(1);
        dateOfBirth.sendKeys("12.09.2020");
        common.pause(1);
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");
        priceOfSpecies.sendKeys("1500");
    }

    //Add policy page should display in editable format by clicking on add policy icon on cog dropdown menu on view client page

    public void clickOnAddPolicyIcon() {
        common.pause(2);
        common.moveToElement(cogIcon);
        addPolicyIcon.click();
        common.pause(2);
    }

    public String verifyAddPolicyPage() {
        return displayedMessage.getText();
    }

    //Add claim page should display with all details by clicking on add claim icon on cog dropdown menu on view client page

    public void clickOnAddClaimIcon() {
        common.pause(2);
        common.moveToElement(cogIcon);
        addClaimIcon.click();
        common.pause(2);
    }

    public String verifyAddClaimPage() {
        return displayedMessage.getText();
    }

    //Client Refund Unallocated Balance page displays with all details by clicking on client refund unallocated balance icon on cog dropdown menu on view client page

    public void clickOnClientRefundUnallocatedBalanceIcon() {
        common.pause(2);
        common.moveToElement(cogIcon);
        clientRefundUnallocatedBalanceOptionOfDD.click();
        common.pause(2);
    }

    public String verifyClientRefundUnallocatedBalancePage() {
        return displayedMessage.getText();
    }

    //Client Refund Credit Note page displays with all details by clicking on client refund credit note icon on cog dropdown menu on view client page

    public void clickOnClientRefundCreditNoteIcon() {
        common.pause(2);
        common.moveToElement(cogIcon);
        clientRefundCreditNoteOptionOfDD.click();
        common.pause(2);
    }

    public String verifyClientRefundCreditNotePage() {
        return displayedMessage.getText();
    }

    //Client Allocate Payment page displays with all details by clicking on client allocate payment icon on cog dropdown menu on view client page

    public void clickOnClientAllocatePaymentIcon() {
        common.pause(2);
        common.moveToElement(cogIcon);
        clientAllocatePaymentOfDD.click();
        common.pause(2);
    }

    public String verifyAllocatePaymentPage() {
        return displayedMessage.getText();
    }

    //Client Account Maintenance page displays with all details by clicking on client account maintenance page icon on cog dropdown menu on view client page

    public void clickOnClientAccountMaintenanceIcon() {
        common.pause(2);
        common.moveToElement(cogIcon);
        clientAccountMaintenanceOfDD.click();
        common.pause(2);
    }

    public String verifyAccountMaintenancePage() {
        return displayedMessage.getText();
    }

    //Debtor ledger page should display in editable format by clicking on debtor ledger icon on cog dropdown menu on view client page

    public void clickOnDebtorLedgerIcon() {
        common.pause(2);
        common.moveToElement(cogIcon);
        debtorLedgerIconOfDD.click();
        common.pause(2);
    }

    public void verifyDebtorLedgerPage() {
        okButton.click();
    }

    //Policies details of client displays by clicking on policy tab on view client page

    public void clickOnPolicyIcon() {
        policyIcon.click();
        common.pause(2);
    }

    public String verifyPolicyDetails() {
        common.pause(2);
        if (common.isElementDisplayed(policyDetails)) {
            return policyDetails.getText();
        }
        return null;
    }

    //Claims details of client displays by clicking on policy tab on view client page

    public void clickOnClaimIcon() {
        claimIcon.click();
        common.pause(2);
    }

    public String verifyClaimDetails() {
        return claimDetails.getText();
    }

    //Contacts details of client displays by clicking on contact tab on view client page

    public void clickOnContactIcon() {
        contactIcon.click();
        common.pause(2);
    }

    public String verifyContactDetails() {
        return contactDetails.getText();
    }

    //Notes details of client displays by clicking on notes tab on view client page

    public void clickOnNotesIcon() {
        noteIcon.click();
        common.pause(2);
    }

    public String verifyNotesDetails() {
        return noteDetailsOnViewClient.getText();
    }

    //Task details of client displays by clicking on task tab on view client page

    public void clickOnTaskIcon() {
        taskIcon.click();
        common.pause(2);
    }

    public String verifyTaskDetails() {
        return taskDetailsOnViewClient.getText();
    }


    //History details of client displays by clicking on history tab on view client page

    public void clickOnHistoryIcon() {
        historyIcon.click();
        common.pause(2);
    }

    public String verifyHistoryDetails() {
        return historyDetailsOnViewClient.getText();
    }

    //Quotes details of client displays by clicking on quote tab on view client page

    public void clickOnQuoteIcon() {
        quoteIcon.click();
        common.pause(2);
    }

    public String verifyQuoteDetails() {
        return quoteDetailsOnViewClient.getText();
    }

    //Policies Statement details of client displays by clicking on policies statement tab on view client page

    public void clickOnPoliciesStatementIcon() {
        policyStatementIcon.click();
        common.pause(2);
    }

    public String verifyPoliciesStatementDetails() {
        common.pause(2);
        return policyStatementDetailsOnViewClient.getText();
    }

    //Filter the list of Policies details under policy tab on view client page by selecting appropriate option from status dropdown

    public void selectOptionFromStatusDropDown() {
        statusDropDownOnViewClientPage.click();
        common.pause(2);
        ((JavascriptExecutor) driver).executeScript("document.getElementById('ClientPolicyStatus').style.display='block';");
        optionFromStatusDropDown.click();
        common.pause(2);
    }

    public String verifyPolicyData() {
        return policyStatementDetailsOnViewClient.getText();
    }

    //Filter the list of Policies details under claim tab on view client page by selecting appropriate option from status dropdown

    public void selectOptionFromStatusDD() {
        statusDDOnViewClientPage.click();
        common.pause(2);
        optionFromStatusDropDownForClaim.click();
        common.pause(2);
    }

    public String verifyClaimData() {
        return claimDetails.getText();
    }

    //Add client scenario

    public void clickOnAddClientButton() {
        addClientButton.click();
        common.pause(3);
    }

    public void enterUserDetails() {
        String clientType = driver.findElement(By.xpath("//div[@class='ibox-content']/div[2]/div/div/div")).getText();
        String[] clientRadio = clientType.split(" ");
        if (clientRadio[0].equals("Individual")) {
            genderDropDown.click();
            common.pause(1);
            genderValue.click();
            firstName.sendKeys("Deep");
            lastName.sendKeys("Rao");
            birthDate.sendKeys("19.06.1987");
            Address.sendKeys("RM8 2TE");
            common.pause(2);
            postCodeOfAddress.click();
            common.pause(1);
            //Alert simpleAlert = driver.switchTo().alert();
            //simpleAlert.accept();
            emailId.sendKeys(Constant.getSaltString() + "@gmail.com");
            primaryContact.sendKeys(Constant.getAlphaNumericString());
            common.pause(1);
        }
    }

    public void clickOnCreateClientButton() {
        createButton.click();
        common.pause(3);
    }

    public String verifyCreatedClient() {
        return displayMessageOfViewClientPage.getText();
    }

    //Add contact details of client

    public void selectAddContactOfClient() {
        common.pause(3);
        common.moveToElement(settingDropDown);
        addContactOptionOfDD.click();
        common.pause(1);
    }

    public void enterContactDetails() {
        common.pause(2);
        userName.sendKeys("Maitry");
        userEmail.sendKeys("maitry@gmail.com");
        userRelation.sendKeys("Wife");
        userMobile.sendKeys("9898989898");
        Button.click();
    }

    public String verifyGeneratedContactDetails() {
        common.pause(4);
        contactMenu.click();
        return contactData.getText();
    }

    //Add note information of client

    public void selectAddNotesOfClient() {
        common.pause(3);
        common.moveToElement(settingDropDown);
        addNotesOptionOfDD.click();
        common.pause(1);
    }

    public void enterNotesDetails() {
        common.pause(2);
        titleOfNote.sendKeys("Test");
        descriptionOFNote.sendKeys("Test Test Test");
        createButtonOfWindow.click();
    }

    public String verifyGeneratedNotesDetails() {
        common.pause(2);
        noteTabOFMenu.click();
        common.pause(1);
        return noteDetails.getText();
    }

    //Add task details of client

    public void selectAddTaskOfClient() {
        common.pause(3);
        common.moveToElement(settingDropDown);
        addTaskOptionOfDD.click();
        common.pause(1);
    }

    public void enterTaskDetails() {
        common.pause(4);
        titleOfNote.sendKeys("Test");
        statusDropDownOfTask.click();
        common.pause(1);
        optionFromStatusDD.click();
        priorityDropDown.click();
        common.pause(1);
        optionFromPriority.click();
        typeDropDown.click();
        common.pause(1);
        optionFromTypeDD.click();
        endDate.sendKeys("12.06.2025");
        createButtonOfTask.click();
    }

    public String verifyGeneratedTaskDetails() {
        common.pause(4);
        taskTabOFMenu.click();
        common.pause(1);
        return taskDetails.getText();
    }

    //Edit client details

    public void selectEditClientDetails() {
        common.pause(3);
        common.moveToElement(settingDropDown);
        editClientOptionsFromDD.click();
        common.pause(1);
    }

    public void editClientData() {
        clientFirstName.clear();
        common.pause(1);
        clientFirstName.sendKeys("Nitesh");
        clientLastName.clear();
        common.pause(1);
        clientLastName.sendKeys("Barot");
        clientBirthDate.clear();
        common.pause(1);
        clientBirthDate.sendKeys("12.09.1980");

        clientPostAddressCode.clear();
        common.pause(1);
        clientPostAddressCode.sendKeys("RM8 2TE");
        common.pause(2);
        clientAddressFromDD.click();

        clientEmail.clear();
        common.pause(1);
        clientEmail.sendKeys("nik@gmail.com");

        clientContact.clear();
        common.pause(1);
        clientContact.sendKeys("07459170022");
        saveButton.click();
    }

    public String verifyUpdatedClient() {
        return driver.findElement(By.cssSelector("ul[class='iconlist']>li")).getText();
    }

    //Add notes for client on production

    public void enterClientCode() {
        searchBox.sendKeys("TEST-00065");
        common.pause(1);
    }

    public void clickOnSearchButton() {
        searchButton.click();
        common.pause(3);
    }

    public void clickONClientCode() {
        List<WebElement> clientInfo = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr[1]/td[2]");
        for (WebElement client : clientInfo) {
            client.click();
            break;
        }
        common.pause(3);
    }
}
