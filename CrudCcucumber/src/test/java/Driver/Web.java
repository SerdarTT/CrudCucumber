package Driver;

import Report.ReportFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web extends ReportFactory {

    private static WebDriver driver = null;
    private String ACCESS_KEY = "450047b9-e5c0-4df9-9157-31f8af15a049";
    private String USER_NAME = "Serdar_Tests";
    private String SAUCE_URL = "https://"+USER_NAME+":"+ACCESS_KEY+"@ondemand.us-west-1.saucelabs.com:443/wd/hub";

    @Before
    public void initDriver(){
        String clientName = "chrome";
        switch (clientName.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./driverExecFiles/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./driverExecFiles/geckodriver");
                driver = new FirefoxDriver();
            case "sauce":
//                DesiredCapabilities caps = DesiredCapabilities.chrome();
//                caps.setCapability("platform", "windows 10");
//                caps.setCapability("version", "latest");
//                try {
//                    driver = new RemoteWebDriver(new URL(SAUCE_URL), caps);
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                }
                break;
            default:
                new Exception("Invalid client: " + clientName);


        }
        System.setProperty("webdriver.chrome.driver", "./driverExecFiles/chromedriver");
        //driver = new ChromeDriver();
        driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void quitDriver(){
        driver.quit();
    }
    public static WebDriver getDriver(){ return driver;}

    public byte[] attachScreenShot(){ return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);}
}
