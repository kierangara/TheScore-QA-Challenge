package org.example.TestCases;

import io.appium.java_client.android.AndroidDriver;

import org.example.TestSetup.TestBase;
import org.junit.Test;
import org.example.NavigationTools.*;

public class ChallengeTest extends TestBase {

    private AndroidDriver driver;
    public static final String TEAM_NAME = "Bayern Munich";

    @Test
    public void teamSearch() {
        driver = getDriver();

        //Open the app and search interface
        HomePageTools homePage = new HomePageTools(driver);
        homePage.openApp();
        homePage.clickSearchBar();

        //Navigate to a team page
        SearchPageTools searchPage = new SearchPageTools(driver);
        searchPage.search(TEAM_NAME);
        searchPage.selectSearchResult();

        TeamPageTools teamPage = new TeamPageTools(driver, TEAM_NAME);
        //Verify the expected page opens
        teamPage.verifyTeamName();
        //Go to the sub-tab Team Stats and verify the correct tab and team data are displayed
        teamPage.verifyTeamStats();

        //Verify the back navigation returns to the previous page correctly
        teamPage.goBack();
        searchPage.verifyBackNavigation(TEAM_NAME);
    }

}