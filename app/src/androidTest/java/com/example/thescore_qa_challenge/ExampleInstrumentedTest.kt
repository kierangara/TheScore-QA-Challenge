package com.example.thescore_qa_challenge

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
//import androidx.test.ext.junit.runners.AndroidJUnit4
import io.appium.java_client.android.AndroidDriver
//import io.appium.java_client.remote.MobileCapabilityType
import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
import java.net.URL
import org.openqa.selenium.MutableCapabilities
import org.openqa.selenium.remote.DesiredCapabilities

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest: TestBase() {
    override var caps: DesiredCapabilities? = ProjectCapabilities.AndroidBaseCapabilities()
    //private val capabilities = MutableCapabilities()
    //private lateinit var driver: AndroidDriver

    /*@Before
    fun setup() {
        /*// Set up Appium capabilities
        capabilities.setCapability("deviceName","emulator-5554")
        capabilities.setCapability("platformName","Android")
        capabilities.setCapability("platformVersion","13")
        capabilities.setCapability("app","/resources/theScore.apk")

        // Start the Appium server
        val serverUrl = URL("http://localhost:4723/wd/hub")
        driver = AndroidDriver(serverUrl, capabilities)*/
    }*/

    @Test
    fun openTheScoreApp() {
        // Launch the theScore app
        assertEquals(4,2+2)

        // Add assertions or other test steps here to verify the app is open and functioning correctly
    }
}
/*@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.thescore_qa_challenge", appContext.packageName)
    }
}*/