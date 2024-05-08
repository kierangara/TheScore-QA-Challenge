package org.example.NavigationTools;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToolsBase {
    AndroidDriver driver;

    public ToolsBase(AndroidDriver driver) {
        this.driver = driver;
    }

    //Delay to allow elements time to load before searching for them
    public static void waitForElement(AndroidDriver driver, String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath(xpath)));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
