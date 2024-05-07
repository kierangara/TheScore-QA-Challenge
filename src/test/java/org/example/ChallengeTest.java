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
        //Open app
        var el1 = driver.findElement(AppiumBy.accessibilityId("Predicted app: theScore"));
        el1.click();
        //Search for team
        waitForElement(driver, "//android.widget.TextView[" +
                "@resource-id=" + "\"com.fivemobile.thescore:id/search_bar_text_view\"]");
        var el4 = driver.findElement(AppiumBy.id(
                "com.fivemobile.thescore:id/search_bar_text_view"));
        el4.click();
        waitForElement(driver, "//android.widget.AutoCompleteTextView[" +
                "@resource-id=\"com.fivemobile.thescore:id/search_src_text\"]");
        var el5 = driver.findElement(AppiumBy.id(
                "com.fivemobile.thescore:id/search_src_text"));
        el5.sendKeys("Toronto Maple Leafs");
        //Go to team page
        var el6 = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.LinearLayout\").instance(11)"));
        el6.click();
        waitForElement(driver, "//android.widget.TextView[" +
                "@text=\"TEAM STATS\"]");
        //Verify team page is correct
        var team_name = driver.findElement(AppiumBy.id(
                "com.fivemobile.thescore:id/team_name"));
        Assert.assertEquals(team_name.getText(),"Toronto Maple Leafs");
        //Go to team stats tab
        var el7 = driver.findElement(AppiumBy.accessibilityId("Team Stats"));
        el7.click();
        waitForElement(driver, "//android.widget.ImageButton[" +
                "@content-desc=\"Navigate up\"]");
        //Check stats tab properly displayed
        Assert.assertTrue(el7.isSelected());
        team_name = driver.findElement(AppiumBy.id(
                "com.fivemobile.thescore:id/team_name"));
        Assert.assertEquals(team_name.getText(),"Toronto Maple Leafs");
        var stats_header = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/header_text\"]"));
        Assert.assertTrue(stats_header.getText().contains("STATS"));
        //Use back functionality, returns to search page
        var el8 = driver.findElement(AppiumBy.accessibilityId("Navigate up"));
        el8.click();
        //Verify correctly returned to search page
        Assert.assertTrue(el6.isDisplayed());
        var main_search_result = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\"]"));
        System.out.println(main_search_result.getText());
        Assert.assertEquals(main_search_result.getText(), "Toronto Maple Leafs");
    }

    public void waitForElement(AndroidDriver driver, String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By
                .xpath(xpath)));
    }

}