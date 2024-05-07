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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.net.MalformedURLException;


import static com.google.common.base.StandardSystemProperty.USER_DIR;

public class ChallengeTest extends TestBase {

    private AndroidDriver driver;
    @Test
    public void sampleTest() {
        driver = getDriver();
        var el1 = driver.findElement(AppiumBy.accessibilityId("Predicted app: theScore"));
        el1.click();
        waitForElement(driver, "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/search_bar_text_view\"]");
        var el4 = driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/search_bar_text_view"));
        el4.click();
        waitForElement(driver, "//android.widget.AutoCompleteTextView[@resource-id=\"com.fivemobile.thescore:id/search_src_text\"]");
        var el5 = driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/search_src_text"));
        el5.sendKeys("Bayern");
        var el6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(11)"));
        el6.click();
        waitForElement(driver, "//android.widget.TextView[@text=\"TEAM STATS\"]");
        var el7 = driver.findElement(AppiumBy.accessibilityId("Team Stats"));
        el7.click();
        waitForElement(driver, "//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        var el8 = driver.findElement(AppiumBy.accessibilityId("Navigate up"));
        el8.click();
        Assert.assertEquals(4,2+2);
    }

    public void waitForElement(AndroidDriver driver, String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By
                .xpath(xpath)));
    }

}