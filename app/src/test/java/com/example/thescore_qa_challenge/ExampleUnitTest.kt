package com.example.thescore_qa_challenge

import org.junit.Test

import org.junit.Assert.*

import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
//import org.junit.jupiter.api.Test
import org.openqa.selenium.*
import java.net.URL


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @BeforeEach
    fun setUp() {
        val options = UiAutomator2Options()
            .setUdid("123456")
            .setApp("/app/resources/theScore.apk")
        val driver = AndroidDriver( // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
            URL("http://127.0.0.1:4723"), options
        )
        //val el3 = driver.findElement(AppiumBy.accessibilityId("Predicted app: theScore"));
    }
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        /*val el3 = driver.findElement(AppiumBy.accessibilityId("Predicted app: theScore"));
        el3.click();
        val el4 = driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/search_bar_text_view"));
        el4.click();
        val el5 = driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/search_src_text"));
        el5.sendKeys("Bayern");
        val el6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(11)"));
        el6.click();
        val el7 = driver.findElement(AppiumBy.accessibilityId("Team Stats"));
        el7.click();
        val el8 = driver.findElement(AppiumBy.accessibilityId("Navigate up"));
        el8.click();*/
    }

    @AfterEach
    fun tearDown() {
        //driver.quit()
    }
}