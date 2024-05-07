package org.example.TestSetup;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverOptions {
    public static DesiredCapabilities AndroidBaseCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        //caps.setCapability("deviceName", "BackupAVD");
        //caps.setCapability("udid", "emulator-5554");
        //caps.setCapability("platformVersion", "14");
        caps.setCapability("ensureWebviewsHavePages", true);
        caps.setCapability("nativeWebScreenshot", true);
        caps.setCapability("newCommandTimeout", 3600);
        caps.setCapability("connectHardwareKeyboard", true);
        return caps;
    }

}
