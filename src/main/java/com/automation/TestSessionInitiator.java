package com.automation;

import com.automation.pages.KYCPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSessionInitiator {

    public KYCPage kycPage;
    AndroidDriver driver;
    public WebDriverWait wait;

    private void initPage(){
        kycPage = new KYCPage(driver);
    }

    public void launchApplication(String deviceName,String udid) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceName); // device Name
        caps.setCapability("udid", udid); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("app", "/Users/olx/Desktop/Android Project/src/main/resources/apk/cleardil_sdk_android_example_1.0.0.apk");
        caps.setCapability("noReset", "false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
        this.initPage();
    }

    public void closeApplication(){
        driver.closeApp();
    }
}
