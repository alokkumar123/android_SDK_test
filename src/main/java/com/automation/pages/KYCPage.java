package com.automation.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class KYCPage {

    AndroidDriver driver;

    @FindBy(xpath = "//*[@text='AUTHENTICATE']")
    WebElement authenticationButton;


    public KYCPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAuthenticationButton(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        authenticationButton.click();
    }

    public void clickOnStartButton(){
        driver.findElementByAccessibilityId("Start").click();
    }
    public void selectIdentityCardForKYCProcess(){
        driver.findElementByAccessibilityId("Identity Card").click();
    }

    public void selectCounty(){
        driver.findElement(By.xpath("//android.view.View[@content-desc='Afghanistan']")).click();
    }

    public void clickFrontPositionOfDocument(){
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Position the front of your document in the frame\"]/following-sibling::android.widget.Button")).click();
    }

    public void validatePicture(){
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Validate picture\"]")).click();
    }
    public void clickBackPositionOfDocument(){
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Position the back of your document in the frame\"]/following-sibling::android.widget.Button")).click();
    }
    public void sendDocuments(){
        driver.findElementByAccessibilityId("Send document").click();
    }
    public void takeSelfie(){
        driver.findElement(By.xpath("//android.view.View[@content-desc='Position your face in the sight']/following-sibling::android.widget.Button")).click();
    }

    public void sendPicture(){
        driver.findElementByAccessibilityId("Send Picture").click();
    }

    public boolean isCongratulationsMegDisplayed(){
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"Congratulation ! \"]")).isDisplayed();
    }
    public void clickOnExitButton(){
        driver.findElementByAccessibilityId("Exit !").click();
    }

    public void takeNewPicture(){
        driver.findElementByAccessibilityId("Take new picture").click();
    }

    public void navigateBack(){
        driver.findElementByAccessibilityId("Back").click();
    }

    public void discardAllSavedChanges(){
        driver.findElementByAccessibilityId("Yes").click();
    }

    public boolean isStartButtonDisplayed(){
       return driver.findElementByAccessibilityId("Start").isDisplayed();
    }
}
