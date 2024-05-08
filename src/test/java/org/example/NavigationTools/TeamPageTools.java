package org.example.NavigationTools;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class TeamPageTools extends ToolsBase{
    private AndroidDriver driver;
    private String team_name;

    public TeamPageTools(AndroidDriver driver, String team_name){
        super(driver);
        this.driver = driver;
        this.team_name = team_name;
    }

    //Check that the right team page has been reached
    public void verifyTeamName(){
        ToolsBase.waitForElement(driver, "//android.widget.TextView[" +
                "@text=\"TEAM STATS\"]");
        var team_name_value = driver.findElement(AppiumBy.id(
                "com.fivemobile.thescore:id/team_name"));
        Assert.assertEquals(team_name_value.getText(), team_name);
    }

    //Go to team stats tab and verify correct tab and data are displayed corresponding to the team
    public void verifyTeamStats(){
        //Navigate to the team stats page
        var team_stats_tab = driver.findElement(AppiumBy.accessibilityId("Team Stats"));
        team_stats_tab.click();
        ToolsBase.waitForElement(driver, "//android.widget.ImageButton[" +
                "@content-desc=\"Navigate up\"]");

        //Check that app is on stats page
        Assert.assertTrue(team_stats_tab.isSelected());

        //Check that the stats page belongs to the team
        verifyTeamName();

        //Check that the stats are being displayed
        var stats_header = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/header_text\"]"));
        Assert.assertTrue(stats_header.getText().contains("STATS"));
    }

    //Press back navigation button
    public void goBack(){
        var back_button = driver.findElement(AppiumBy.accessibilityId("Navigate up"));
        back_button.click();
    }
}
