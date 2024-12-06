package hook;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.Constant;
import utils.ConfigReader;

import java.util.Properties;


public class hooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties prop;
    public Constant constant;


    @Before(order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        prop = configReader.init_prop();
    }

    @Before(order = 2)
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        String browserMode = prop.getProperty("headless");
        driverFactory = new DriverFactory();
        driver = driverFactory.init_browser(browserName, browserMode);
        DriverFactory.getDriver().get(Constant.url);

    }

    @After(order = 0)
    public void quitBrowser() {

        driver.quit();
    }

    @After(order = 1)
    public void takeScreenShotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", " _");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }

    @After(order = 2)
    public void displayUrl(Scenario scenario) {
        String name = scenario.getName();
        scenario.log(Constant.url);
    }
}
