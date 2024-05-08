package org.example.NavigationTools;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class SearchPageTools extends ToolsBase{
    private AndroidDriver driver;

    public SearchPageTools(AndroidDriver driver){
        super(driver);
        this.driver = driver;
    }

    //Search for a team, league or player
    public void search(String search_value){
        ToolsBase.waitForElement(driver, "//android.widget.AutoCompleteTextView[" +
                "@resource-id=\"com.fivemobile.thescore:id/search_src_text\"]");
        var search_field = driver.findElement(AppiumBy.id(
                "com.fivemobile.thescore:id/search_src_text"));
        search_field.sendKeys(search_value);
    }

    //Select the top result from the search
    public void selectSearchResult(){
        var top_result = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.LinearLayout\").instance(11)"));
        top_result.click();
    }

    //Verify back navigation successfully returned to search page with same search results
    public void verifyBackNavigation(String expected_result){
        //Verify on search page
        var search_field = driver.findElement(AppiumBy.id(
                "com.fivemobile.thescore:id/search_src_text"));
        Assert.assertTrue(search_field.isDisplayed());

        //Verify expected result still showing
        var main_search_result = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\"]"));
        Assert.assertEquals(main_search_result.getText(), expected_result);
    }
}
