package pages;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Common;
import utils.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TaskPage {
    private WebDriver driver;
    Common common = new Common(DriverFactory.getDriver());

    public TaskPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[id='side-menu']>li:nth-child(7)")
    private WebElement taskIcon;
    @FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/h2")
    private WebElement displayedMessage;
    @FindBy(xpath = "//div[@class=' tooltip-demo pull-right']/a[2]")
    private WebElement addTaskButton;
    @FindBy(xpath = "//div[@class='ibox float-e-margins']/div[1]/div/div[6]/div/div/div/span/span/span[2]")
    private WebElement assignDropDown;
    @FindBy(xpath = "//input[@id='TaskStatusId']//..//span/span[2]")
    private WebElement statusDropDown;
    @FindBy(xpath = "//ul[@id='TaskStatusId_listbox']/li[2]")
    private WebElement openOptionFromStatusDropDown;
    @FindBy(css = "button[id='SearchGrid']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@id='search']/div[3]/div/span/span")
    private WebElement priorityDropDown;
    @FindBy(xpath = "//ul[@id='TaskPriorityId_listbox']/li[2]")
    private WebElement optionUnderPriorityDropdown;
    @FindBy(xpath = "//div[@id='search']/div[4]/div/span/span")
    private WebElement typeDropDown;
    @FindBy(xpath = "//ul[@id='TaskTypeId_listbox']/li[2]")
    private WebElement optionUnderTypeDropDown;
    @FindBy(xpath = "//div[@id='search']/div[5]/div/span/span")
    private WebElement clientDropDown;
    @FindBy(xpath = "//ul[@id='ClientId_listbox']/li[4]")
    private WebElement optionUnderClinetrDropDown;
    @FindBy(xpath = "//div[@id='gridName']/table/tbody/tr[1]/td[11]/div/a[1]")
    private WebElement editIconOnManageTaskPage;
    @FindBy(xpath = "//a[@title='Add User']")
    private WebElement addUserButton;
    @FindBy(xpath = "//input[@id='Title']")
    private WebElement taskTile;
    @FindBy(xpath = "//span[@class='k-widget k-dropdown k-header form-control']//span[@class='k-input']")
    private WebElement statusBar;
    @FindBy(xpath = "(//span[@class='boxcolor'])[5]")
    private WebElement statusBarColLer;
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='page-wrapper']/form[@id='form']/div[@class='row']/div[@class='col-lg-12']/div[@class='ibox float-e-margins']/div[@class='ibox-content']/div[@class='col-lg-6']/div[4]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]")
    private WebElement Priority;
    @FindBy(xpath = "//li[normalize-space()='High']")
    private WebElement PriorityStatus;
    @FindBy(xpath = "//span[@class='k-input'][normalize-space()='Select']")
    private WebElement type;
    @FindBy(xpath = " //*[@id=\"TaskTypeId_listbox\"]/li[2]\n")
    private WebElement typeStatus;
    @FindBy(xpath = "//input[@name='AssignedToId_input']")
    private WebElement assignedTO;
    @FindBy(xpath = "//div[6]//div[1]//div[1]//div[1]//span[1]//span[1]//span[2]//span[1]")
    private WebElement assignedTOStatus;
    @FindBy(xpath = "//span[normalize-space()='Scheduler']")
    private WebElement assignedTOStatusNew;
    @FindBy(xpath = "//textarea[@id='Description']")
    private WebElement Description;
    @FindBy(xpath = "//span[@aria-controls='EndDate_dateview']//span[@class='k-icon k-i-calendar']")
    private WebElement endDate;
    @FindBy(xpath = "//span[@class='k-icon k-i-arrow-60-right']")
    private WebElement endDateMonth;
    @FindBy(xpath = "//a[normalize-space()='29']")
    private WebElement endDateMonthDate;
    @FindBy(xpath = "//button[@title='Create']")
    private WebElement Create;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]")
    private WebElement smallWindow;
    @FindBy(xpath = "//div[@id='ViewTask']")
    private WebElement CreatePrint;




    public void clickOnTaskIcon() {
        taskIcon.click();
        common.pause(3);
    }

    public String verifyTaskPage() {
        return displayedMessage.getText();
    }

    public String fetchData() {
        List<WebElement> totalRow = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder data = new StringBuilder();
        for (WebElement rEle : totalRow) {
            data.append(rEle.getText());
        }
        return data.toString();
    }

    //To check whether Assign to dropdown on add task page appears with current user after clicking on add task button on add task page

    public void clickAddTaskButton() {
        addTaskButton.click();
        common.pause(3);
    }

    public String verifyAddTaskPage() {
        return displayedMessage.getText();
    }

    public String verifyDropDown() {
        assignDropDown.click();
        common.pause(2);
        List<WebElement> drop = common.waitUntilPresenceOfAllElement("//ul[@id='AssignedToId_listbox']/li[1]/table/tbody/tr/td");
        System.out.println(drop.size());
        StringBuilder rev = new StringBuilder();
        for (WebElement element : drop) {
            rev.append(element.getText()).append("\n");
            System.out.println(element.getText());
        }
        return rev.toString();
    }

    //Appropriate data should display upon selecting an option from the status drop down on managing task page

    public void selectOptionFromStatus() {
        common.waitUntilVisibilityOfElement(statusDropDown);
        statusDropDown.click();
        common.pause(1);
        openOptionFromStatusDropDown.click();
        common.pause(1);
        statusDropDown.click();
        common.pause(1);
        searchButton.click();
        common.pause(3);
    }

    public ArrayList<String> verifyStatusOfManageTaskData() {
        List<WebElement> statusValue = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[8]");
        ArrayList<String> statusArray=new ArrayList<>();
        for (WebElement element : statusValue) {
            statusArray.add(element.getText());
        }
        return statusArray;
    }

    //Appropriate data should display upon selecting an option from the priority drop down on managing task page
    public void selectOptionFromPriorityDropDown() {
        priorityDropDown.click();
        common.pause(2);
        optionUnderPriorityDropdown.click();
        searchButton.click();
        common.pause(3);
    }

    public String verifyPriorityDataOfTask() {
        List<WebElement> priorityValue = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder priority = new StringBuilder();
        for (WebElement element : priorityValue) {
            priority.append(element.getText()).append("\n");
        }
        System.out.println(priority);
        return priority.toString();
    }

    //Appropriate data should display upon selecting an option from the type drop down on managing task page

    public void selectOptionFromTypeDropDown() {
        typeDropDown.click();
        common.pause(2);

        /*((JavascriptExecutor) driver).executeScript("document.getElementById('TaskTypeId_listbox').aria-hidden='true';");
        WebElement element = driver.findElement(By.xpath("//ul[@id='TaskPriorityId_listbox']/li[2]"));
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.visibilityOf(element)).click();*/

        optionUnderTypeDropDown.click();
        searchButton.click();
        common.pause(3);
    }

    public String verifyTypeDataOfTask() {
        List<WebElement> typeValue = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder type = new StringBuilder();
        for (WebElement element : typeValue) {
            type.append(element.getText()).append("\n");
        }
        System.out.println(type);
        return type.toString();
    }

    // Appropriate data should display upon selecting an option from the client drop down on managing task page

    public void selectOptionFromClientDropDown() {
        common.waitUntilVisibilityOfElement(clientDropDown);
        clientDropDown.click();
        common.pause(1);
        optionUnderClinetrDropDown.click();
        common.pause(1);
        searchButton.click();
        common.pause(3);
    }

    public String verifyClientDataOfTask() {
        common.pause(2);
        List<WebElement> clientValue = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr");
        StringBuilder type = new StringBuilder();
        for (WebElement element : clientValue) {
            type.append(element.getText()).append("\n");
        }
        System.out.println(type);
        return type.toString();
    }

    //To check task details should open after clicking on task title on manage task page

    public void clickAndFetchDataOfTask() {
        List<WebElement> clientValue = common.waitUntilPresenceOfAllElement("//div[@id='gridName']/table/tbody/tr/td[3]");

        for (WebElement element : clientValue) {
            element.click();
            common.pause(3);
            String MainWindow = driver.getWindowHandle();
            System.out.println("Main window handle is " + MainWindow);

            // To handle all new opened window
            Set<String> s1 = driver.getWindowHandles();
            System.out.println("Child window handle is" + s1);

            // Here we will check if child window has other child windows and when child window
            //is the main window it will come out of loop.
            for (String ChildWindow : s1) {
                if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);
                    common.pause(4);
                    driver.close();
                    System.out.println("Child window closed");
                }
            }
            driver.switchTo().window(MainWindow);
            break;
        }
    }

    //To check add task page displays with all details  by clicking on add task button on manage task page

    public String verifyAddTaskPageOpen() {
        return displayedMessage.getText();
    }

    //Edit task page should open in editable format by clicking on edit icon on manage edit page

    public void clickOnEditIcon() {
        editIconOnManageTaskPage.click();
        common.pause(3);
    }

    public String verifyEditTaskPage() {
        return displayedMessage.getText();
    }

    public void userSelectTaskOption() {

        addUserButton.click();
        common.pause(2);
        taskTile.sendKeys("new04092024-3");
        statusBar.click();
        common.pause(2);
        statusBarColLer.click();
        common.pause(2);
        Priority.click();
        common.pause(2);
        PriorityStatus.click();
        common.pause(2);
        type.click();
        common.pause(2);
        typeStatus.click();
         common.pause(1);
        assignedTO.click();
        common.pause(2);
        assignedTOStatus.click();
         common.pause(2);
        Description.sendKeys("Hello today 04/09/024");
        common.pause(2);
        endDate.click();
        common.pause(2);
        endDateMonth.click();
        common.pause(2);
        endDateMonthDate.click();
        common.pause(5);
        Create.click();
        common.pause(5);
        smallWindow.click();
        common.pause(5);
        common.waitUntilVisibilityOfElement(CreatePrint);
        Log.info(CreatePrint.getText());
        common.pause(5);



    }

}
