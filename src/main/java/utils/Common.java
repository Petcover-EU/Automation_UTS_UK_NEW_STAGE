package utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Common {
    private WebDriver driver;

    public Common(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * This method will pause the script execution for entered seconds
     */
    public void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Wait until visibility of element for 30 seconds
     */
    public void waitUntilVisibilityOfElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        pause(1);
    }

    public void waitUntilVisibilityOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(element));
        pause(1);
    }

    /**
     * Wait until element to be clickable for at least 30 sec before throwing exception
     */
    public void waitUntilElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        pause(1);
    }

    /**
     * Wait until element to be clickable for at least 30 sec before throwing exception
     */
    public void waitUntilElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        pause(1);
    }

    /**
     * @return current date in dd.MM.yyyy format
     */
    public String currentDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return formatter.format(date);
    }

    /**
     * @return current date in required format format
     */
    public String currentDate(String format) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    /**
     * This method gives the future date from today's date
     *
     * @return future date
     */
    public String getFutureDate(long daysToPlusWithCurrentDate, String format) {
        LocalDate todayDate = LocalDate.now();
        LocalDate futureDate = todayDate.plusDays(daysToPlusWithCurrentDate - 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return formatter.format(futureDate);
    }

    /**
     * This method gives the Past date from today's date
     *
     * @return past date
     */
    public String getPastDate(long daysToMinusWithCurrentDate, String format) {
        LocalDate todayDate = LocalDate.now();
        LocalDate pastDate = todayDate.minusDays(daysToMinusWithCurrentDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return formatter.format(pastDate);
    }

    /**
     * @return workbook sheet
     */
    public XSSFSheet readDataFromExcelSheet(String sheetName) {
        try {
            FileInputStream fis = new FileInputStream("Transactional_Scenarios_Dataset_UK.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            return workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Scroll page to given x and y pixels position.
     **/
    public void scroll_By_Pixel(String x_pixels, String y_pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x_pixels + "," + y_pixels + ")", "");
        pause(1);
    }

    /**
     * Scrolling down the page till the element is found
     */
    public void scrollToElement(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            pause(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Accept present alert.
     *
     * @return Text on alert
     */
    public String acceptAlert() {
        String alertText = null;
        Alert alert = driver.switchTo().alert();
        alertText = alert.getText();
        alert.accept();
        pause(2);
        return alertText;
    }

    public void waitForAlertPresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    /**
     * Clicks on visible or not visible element through javascript.
     *
     * @param element the element to be clicked.
     */
    public void jsClick(WebElement element) {
        highlightElement(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("return arguments[0].click();", element);
        pause(1);
    }

    /**
     * Wait until element to be clickable then highlight the element and then click on the element
     */
    public void click(WebElement element) {
        waitUntilElementToBeClickable(element);
        highlightElement(element);
        element.click();
        pause(2);

    }

    /**
     * Highlight the element under action
     */
    public void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','border:3px solid green')", element);
    }

    /**
     * wait until element to be visible then highlight the element and type the string given in parameter
     */
    public void sendKeys(WebElement element, String value) {
        waitUntilVisibilityOfElement(element);
        highlightElement(element);
        element.clear();
        pause(1);
        element.sendKeys(value);
        pause(1);
    }

    /**
     * wait until visibility of element then highlight the element and get text of web element
     */

    public String getText(WebElement element) {
        waitUntilVisibilityOfElement(element);
        highlightElement(element);

        return element.getText();
    }

    /**
     * Generate random number on given length
     */
    public String generateRandomNumber(int charLength) {
        return String.valueOf(charLength < 1 ? 0 : new Random().nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1) + (int) Math.pow(10, charLength - 1));
    }

    public void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        waitUntilVisibilityOfElement(element);
        actions.moveToElement(element).perform();
        pause(2);
    }

    public String getXPathFromWebElement(WebElement webElement) {
        String sourceElement = webElement.toString();
        String[] tempArr = sourceElement.split("-> ");
        String[] tempXPathArr = tempArr[1].split(": ");
        @SuppressWarnings("unused")
        String locatorName = tempXPathArr[0];
        return tempXPathArr[1].substring(0, tempXPathArr[1].length() - 1);
    }

    /**
     * Checks if given element is being displayed on page.
     *
     * @param elementName Locator of element. test the element present if mot
     *                    contains the elements is ok
     * @return true if displayed else false.
     */
    public boolean isElementDisplayed(WebElement elementName) {
        WebElement webElement;
        try {
            webElement = driver.findElement(By.xpath(getXPathFromWebElement(elementName)));
            return webElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Checks if given element is being displayed on page.
     *
     * @return true if displayed else false.
     */
    public boolean isElementDisplayed(String xpath) {
        WebElement webElement;
        try {
            webElement = driver.findElement(By.xpath(xpath));
            return webElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * wait until specified time to locate and return list web element
     *
     * @param xpath
     * @return
     */
    public List<WebElement> waitUntilPresenceOfAllElement(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public WebElement waitUntilPresenceOfElement(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public void waitUntilInvisibilityOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void switchToWindow(int windowIndex) {
        ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(windowIndex));
        pause(1);
        System.out.println("Page title: " + driver.getTitle());
    }

    public String getRandomString(int length) {
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }
}