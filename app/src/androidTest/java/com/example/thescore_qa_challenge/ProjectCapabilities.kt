package com.example.thescore_qa_challenge

import org.openqa.selenium.remote.DesiredCapabilities

class ProjectCapabilities {
    companion object {
        fun AndroidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("autoAcceptAlerts", true)
            caps.setCapability("platformName", "Android")
            caps.setCapability("automationName", "UiAutomator2")
            caps.setCapability("deviceName", "emulator-5554")
            caps.setCapability("platformVersion","13")
            caps.setCapability("app","/resources/theScore.apk")
            return caps
        }
    }
}