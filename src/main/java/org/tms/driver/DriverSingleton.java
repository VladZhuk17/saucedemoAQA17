package org.tms.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

@Log4j2

public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton() {
    }

    public static WebDriver getDriver() {
        log.info("INFO: start Driver");
        if (null == driver) {
            switch (System.getProperty("browser", "chrome")) {
                case "opera": {
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                }
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                }
                default: {
                    try {
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    } catch (Exception e) {
                        log.fatal("FATAL: Driver didn't start");
                    }
                }
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver() {
        log.info("INFO: close Driver");
        driver.quit();
        driver = null;
    }
}
