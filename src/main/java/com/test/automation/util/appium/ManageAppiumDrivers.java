package com.test.automation.util.appium;

import com.test.automation.util.EnvironmentConfig;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import net.thucydides.core.webdriver.WebDriverFacade;

import static net.serenitybdd.core.Serenity.getDriver;

public class ManageAppiumDrivers {

    private ManageAppiumDrivers() {
    }

    private static final EnvironmentConfig environmentConfig = new EnvironmentConfig();
    public static final String PLATFORM_NAME = environmentConfig.getVariable("appium.platformName");
    public static final String PLATFORM_VERSION = environmentConfig.getVariable("appium.platformVersion");
    public static final String IOS = "iOS";

    private static IOSDriver getIosDriver() {
        return ((IOSDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
    }

    private static AppiumDriver getAppiumDriver() {
        return ((AppiumDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
    }

    public static void iosDriverHideKeyboard() {
        if (PLATFORM_VERSION.equals("16.1.2")) {
            getAppiumDriver().findElement(AppiumBy.accessibilityId("Done")).click();
        } else {
            getIosDriver().hideKeyboard();
        }
    }
}