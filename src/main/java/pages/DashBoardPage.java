package pages;

import factory.DriverFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Common;
import utils.Log;

import java.util.List;

public class DashBoardPage {
    public WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    //Elements

    @FindBy(xpath = "//div[@class='panel panel-primary']/div/div/div/div/a")
    private WebElement clientTag;
    @FindBy(xpath = "//div[@class='panel panel-primary']/div/div/div[2]/div/span")
    private WebElement totalClient;
    @FindBy(xpath = "//div[@class='panel panel-primary']/div/div/div[3]/div/span")
    private WebElement monthlyClient;
    @FindBy(xpath = "//div[@class='panel panel-green']/div/div/div/div/a")
    private WebElement quoteTag;
    @FindBy(xpath = "//div[@class='panel panel-green']/div/div/div[2]/div/span")
    private WebElement totalQuote;
    @FindBy(xpath = "//div[@class='panel panel-green']/div/div/div[3]/div/span")
    private WebElement monthlyQuote;
    @FindBy(xpath = "//div[@class='panel panel-yellow']/div/div/div/div/a")
    private WebElement policyTag;
    @FindBy(xpath = "//div[@class='panel panel-yellow']/div/div/div[2]/div/span")
    private WebElement totalPolicy;
    @FindBy(xpath = "//div[@class='panel panel-yellow']/div/div/div[3]/div/span")
    private WebElement monthlyPolicy;
    @FindBy(xpath = "//div[@class='panel panel-red']/div/div/div/div/a")
    private WebElement claimTag;
    @FindBy(xpath = "//div[@class='panel panel-red']/div/div/div[2]/div/span")
    private WebElement totalClaims;
    @FindBy(xpath = "//div[@class='panel panel-red']/div/div/div[3]/div/span")
    private WebElement monthlyClaims;
    @FindBy(css = "ul[id='side-menu']>li:nth-child(2)")
    private WebElement dashboardIcon;
    @FindBy(xpath = "//tbody//tr[8]//td[3]")
    private WebElement clientName8thRow;
    @FindBy(xpath = "//tbody//tr[8]//td[4]")
    private WebElement policyNumber8thRow;
    @FindBy(xpath = "//tbody//tr[8]//td[5]")
    private WebElement claimNumber8thRow;
    @FindBy(xpath = "//button[@class='btn btn-white dropdown-toggle']")
    private WebElement globalSearchDropdown;
    @FindBy(css = "a[data-val='Client']")
    private WebElement clientOption;
    @FindBy(css = "a[data-val='Policy']")
    private WebElement policyOption;
    @FindBy(css = "a[data-val='Claim']")
    private WebElement claimOption;
    @FindBy(xpath = "//input[@id='txtSearch']")
    private WebElement searchInputField;
    @FindBy(xpath = "//button[@id='btnSearch']")
    private WebElement searchButton;
    @FindBy(xpath = "//input[@id='txtSearch']")
    private WebElement txtBoxSearch;
    @FindBy(xpath = "//button[@id='btnSearch']")
    private WebElement goButton;
    @FindBy(xpath = "//a[normalize-space()='FRED-0005']")
    private WebElement userId;

    public String verifyClientDetails() {
        common.pause(3);
        String client = clientTag.getText();
        String total = totalClient.getText();
        String monthly = monthlyClient.getText();
        return client + " " + total + " " + monthly;
    }

    public String verifyQuote() {
        String quote = quoteTag.getText();
        String totalQ = totalQuote.getText();
        String monthQ = monthlyQuote.getText();
        return quote + " " + totalQ + " " + monthQ;
    }

    public String verifyPolicy() {
        String policy = policyTag.getText();
        String totalP = totalPolicy.getText();
        String monthP = monthlyPolicy.getText();
        return policy + " " + totalP + " " + monthP;
    }

    public String verifyClaims() {
        String claims = claimTag.getText();
        String totalC = totalClaims.getText();
        String monthC = monthlyClaims.getText();
        return claims + " " + totalC + " " + monthC;
    }

    public void clickOnTheDashboardIcon() {
        common.waitUntilVisibilityOfElement(dashboardIcon);
        dashboardIcon.click();

    }

    public String getTheClientNameFromList() {
        common.waitUntilVisibilityOfElement(clientName8thRow);
        return clientName8thRow.getText();
    }

    public String getThePolicyNumberFromManagePolicyPage() {
        common.waitUntilVisibilityOfElement(policyNumber8thRow);
        return policyNumber8thRow.getText();
    }

    public String getClaimNumberFromManageClaimPage() {
        common.waitUntilVisibilityOfElement(claimNumber8thRow);
        return claimNumber8thRow.getText();
    }

    public void searchTheClientNameInGlobalSearch(String clientName) {
        common.waitUntilVisibilityOfElement(globalSearchDropdown);
        globalSearchDropdown.click();
        clientOption.click();
        searchInputField.sendKeys(clientName);
        searchButton.click();
    }

    public void searchThePolicyNumberInGlobalSearch(String policyNumber) {
        common.waitUntilVisibilityOfElement(globalSearchDropdown);
        globalSearchDropdown.click();
        policyOption.click();
        searchInputField.sendKeys(policyNumber);
        searchButton.click();
    }

    public void searchTheClaimNumberInGlobalSearch(String claimNumber) {
        common.waitUntilVisibilityOfElement(globalSearchDropdown);
        globalSearchDropdown.click();
        claimOption.click();
        searchInputField.sendKeys(claimNumber);
        searchButton.click();
    }


    public String verifyTheSearchedResultOfClientGlobalSearch() {
        List<WebElement> totalList = common.waitUntilPresenceOfAllElement("//tbody//tr//td[3]");
        StringBuilder listOfClient = new StringBuilder();
        for (WebElement eachOne : totalList) {
            listOfClient.append(eachOne.getText()).append("\n");
        }
        return listOfClient.toString();
    }

    public String verifyTheSearchedResultOfPolicy() {
        List<WebElement> totalPolicyList = common.waitUntilPresenceOfAllElement("//tbody//tr//td[4]");
        StringBuilder listOfPolicies = new StringBuilder();
        for (WebElement eachOne : totalPolicyList) {
            listOfPolicies.append(eachOne.getText()).append("\n");
        }
        return listOfPolicies.toString();
    }

    public String verifyTheSearchedResultOfClaim() {
        List<WebElement> totalClaimList = common.waitUntilPresenceOfAllElement("//tbody//tr//td[5]");
        StringBuilder listOfClaims = new StringBuilder();
        for (WebElement eachOne : totalClaimList) {
            listOfClaims.append(eachOne.getText()).append("\n");
        }
        return listOfClaims.toString();
    }

    public void readExcel() {
        XSSFSheet sheet = common.readDataFromExcelSheet("Exotic");

        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print("Unknown\t");
                }
            }
            // Print a new line after each row
            System.out.println();
        }
    }

    public void clintCodeTakenAndEnterSearchBar() throws InterruptedException {
        txtBoxSearch.click();
        txtBoxSearch.sendKeys("FRED-0005");
        common.pause(3);
        goButton.click();

        common.waitUntilVisibilityOfElement(userId);
         Log.info(userId.getText());
        userId.click();
        common.pause(15);




    }
}



