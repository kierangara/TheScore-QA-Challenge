package com.example.thescore_qa_challenge;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ProjectCapabilities2 {
    public static DesiredCapabilities AndroidBaseCapabilities(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "Pixel_3a_API_34");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformVersion","13");
        caps.setCapability("app","/resources/theScore.apk");
        return caps;
    }
}
