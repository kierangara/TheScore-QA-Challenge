package org.example;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverOptions {
    private static final String USER_DIR = "user.dir";

    public static DesiredCapabilities AndroidBaseCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "Pixel_3a_API_34");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformVersion", "13");
        //caps.setCapability("app", "C:\\Users\\Kieran\\AndroidStudioProjects\\TheScoreQAChallenge\\src\\test\\resources");
        caps.setCapability("ensureWebviewsHavePages", true);
        caps.setCapability("nativeWebScreenshot", true);
        caps.setCapability("newCommandTimeout", 3600);
        caps.setCapability("connectHardwareKeyboard", true);
        return caps;
    }
}
