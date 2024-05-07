package com.example.thescore_qa_challenge;

import java.net.URL;
import java.net.URI;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.lang.Exception;

public class TestBase2 {
    protected AndroidDriver driver;
    protected DesiredCapabilities caps;

    @Before
    public void setUp() throws MalformedURLException {
        caps = ProjectCapabilities2.AndroidBaseCapabilities();
        URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
        AndroidDriver driver = new AndroidDriver(url, caps);
        //driver = new AndroidDriver(url, caps);
    }
}
