package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverFactory {
    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlLocal = new ThreadLocal<>();

    /*This method is used to initialize the threadLocal driver on the basis of given browser*/
    public WebDriver init_browser(String browser,String headless) {

        System.out.println("The name of the browser is " + browser);

        switch (browser) {
            case "chrome" -> {
                if (headless.equalsIgnoreCase("true")) {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    WebDriver chromeDriver = new ChromeDriver(options);
                    tlLocal.set(chromeDriver);
                } else {
                    WebDriver chromeDriver = new ChromeDriver();
                    tlLocal.set(chromeDriver);
                }
            }
            case "microsoft edge" -> {
                if (headless.equalsIgnoreCase("true")) {
                    EdgeOptions options = new EdgeOptions();
                    options.addArguments("--headless");
                    WebDriver edgeDriver = new EdgeDriver(options);
                    tlLocal.set(edgeDriver);
                } else {
                    WebDriver edgeDriver = new EdgeDriver();
                    tlLocal.set(edgeDriver);
                }
            }
            case "firefox" -> {
                if (headless.equalsIgnoreCase("true")) {
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--headless");
                    WebDriver firefoxDriver = new FirefoxDriver(options);
                    tlLocal.set(firefoxDriver);
                } else {
                    WebDriver firefoxDriver = new FirefoxDriver();
                    tlLocal.set(firefoxDriver);
                }
            }
            case "safari" -> tlLocal.set(new SafariDriver());
            default -> System.out.println("Please pass the correct browser value: " + browser);
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        return getDriver();
    }


    /*This is to used to get the driver with ThreadLocal @return
    making it Synchronized just for parallel execution
    */
    public static synchronized WebDriver getDriver() {
        return tlLocal.get();
    }
}
