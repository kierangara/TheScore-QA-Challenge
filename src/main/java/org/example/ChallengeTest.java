package org.example;

import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumBy;
import java.net.URL;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.*;
import java.net.MalformedURLException;


import static com.google.common.base.StandardSystemProperty.USER_DIR;

public class ChallengeTest {

    private AndroidDriver driver;

    @Before
    public void setUp() {
        var options = new BaseOptions()
                .amend("platformName", "Android")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);
        driver = new AndroidDriver(this.getUrl(), options);
    }

    @Test
    public void sampleTest() {
        var el1 = driver.findElement(AppiumBy.accessibilityId("Predicted app: theScore"));
        el1.click();
        Assert.assertEquals(4,2+2);
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}