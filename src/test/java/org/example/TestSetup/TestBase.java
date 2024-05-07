package org.example.TestSetup;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    protected AndroidDriver driver;
    protected DesiredCapabilities caps;

    @Before
    public void setUp() {
        caps = DriverOptions.AndroidBaseCapabilities();
        driver = new AndroidDriver(this.getUrl(), caps);
        String apk_path = System.getProperty("user.dir")+"\\src\\test\\resources\\theScore.apk";
        driver.installApp(apk_path);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public AndroidDriver getDriver() {
        return driver;
    }
}
