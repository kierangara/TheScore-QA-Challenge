package org.example.NavigationTools;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePageTools extends ToolsBase{
    private AndroidDriver driver;

    public HomePageTools(AndroidDriver driver){
        super(driver);
        this.driver = driver;
    }

    //Open the app
    public void openApp(){
        //Open app
        var app_icon = driver.findElement(AppiumBy.accessibilityId("theScore"));
        app_icon.click();
    }

    //Opens search interface
    public void clickSearchBar(){
        ToolsBase.waitForElement(driver, "//android.widget.TextView[" +
                "@resource-id=" + "\"com.fivemobile.thescore:id/search_bar_text_view\"]");
        var search_bar = driver.findElement(AppiumBy.id(
                "com.fivemobile.thescore:id/search_bar_text_view"));
        search_bar.click();
    }
}
